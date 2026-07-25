<#
.SYNOPSIS
Runs Lyo Designer code generation without starting Eclipse.

.DESCRIPTION
Builds Lyo Designer when -Build is supplied, copies the domainmodels project
next to the input model project as required for relative-reference resolution,
assembles the standalone classpath, and invokes HeadlessGenerator. Compatible
with Windows PowerShell 5.1 and PowerShell 7.

.EXAMPLE
.\scripts\Invoke-LyoDesignerCodeGenerator.ps1 `
    -ModelPath C:\src\oslc\refimpl\model\toolchain.xml `
    -OutputDirectory C:\src\oslc\refimpl\model `
    -DomainModelsSource C:\src\oslc\lyo\domains\org.eclipse.lyo.tools.domainmodels `
    -JavaHome C:\Java\jdk-17 `
    -Build
#>
[CmdletBinding()]
param(
    [Parameter(Mandatory = $true)]
    [string] $ModelPath,

    [Parameter(Mandatory = $true)]
    [string] $OutputDirectory,

    [Parameter(Mandatory = $false)]
    [string] $DomainModelsSource,

    [Parameter(Mandatory = $false)]
    [string] $DesignerInstallRoot,

    [Parameter(Mandatory = $false)]
    [string] $JavaHome,

    [Parameter(Mandatory = $false)]
    [string] $CodegenVersion,

    [Parameter(Mandatory = $false)]
    [string[]] $PropertiesFile,

    [Parameter(Mandatory = $false)]
    [switch] $Build
)

$ErrorActionPreference = 'Stop'
$LyoDesignerRoot = (Resolve-Path -LiteralPath (Join-Path $PSScriptRoot '..')).Path
$ModelPath = (Resolve-Path -LiteralPath $ModelPath).Path

if (!(Test-Path -LiteralPath $OutputDirectory)) {
    $null = New-Item -ItemType Directory -Path $OutputDirectory
}
$OutputDirectory = (Resolve-Path -LiteralPath $OutputDirectory).Path

if ($JavaHome) {
    $JavaExecutable = Join-Path $JavaHome 'bin\java.exe'
} elseif ($env:JAVA_HOME) {
    $JavaHome = $env:JAVA_HOME
    $JavaExecutable = Join-Path $JavaHome 'bin\java.exe'
} else {
    $JavaCommand = Get-Command java -ErrorAction Stop
    $JavaExecutable = $JavaCommand.Source
}
if (!(Test-Path -LiteralPath $JavaExecutable)) {
    throw "Java executable not found: $JavaExecutable"
}

$JavaVersionOutput = (& $JavaExecutable -version 2>&1 | Out-String)
if ($LASTEXITCODE -ne 0 -or $JavaVersionOutput -notmatch 'version "17(?:\.|")') {
    throw "Lyo Designer CLI generation requires JDK 17. Selected Java reported: $JavaVersionOutput"
}

if ($Build) {
    $PreviousJavaHome = $env:JAVA_HOME
    $PreviousPath = $env:PATH
    try {
        if (!$JavaHome) {
            $JavaHome = Split-Path -Parent (Split-Path -Parent $JavaExecutable)
        }
        $env:JAVA_HOME = $JavaHome
        $env:PATH = "$(Join-Path $JavaHome 'bin');$env:PATH"

        Push-Location $LyoDesignerRoot
        try {
            & (Join-Path $LyoDesignerRoot 'mvnw.cmd') -DskipTests package
            if ($LASTEXITCODE -ne 0) {
                throw "The Lyo Designer build failed with exit code $LASTEXITCODE."
            }
        } finally {
            Pop-Location
        }
    } finally {
        $env:JAVA_HOME = $PreviousJavaHome
        $env:PATH = $PreviousPath
    }
}

if (!$DesignerInstallRoot) {
    $DesignerInstallRoot = Join-Path $LyoDesignerRoot `
        'org.eclipse.lyo.tools.designer.product\target\products\lyo-designer\win32\win32\x86_64'
}
if (!(Test-Path -LiteralPath (Join-Path $DesignerInstallRoot 'plugins'))) {
    throw "Designer product plugins not found below '$DesignerInstallRoot'. Run with -Build or pass -DesignerInstallRoot."
}
$DesignerInstallRoot = (Resolve-Path -LiteralPath $DesignerInstallRoot).Path

$ModelDirectory = Split-Path -Parent $ModelPath
$TargetProjectRoot = Split-Path -Parent $ModelDirectory
$DomainModelsTarget = Join-Path $TargetProjectRoot 'org.eclipse.lyo.tools.domainmodels'
$DomainSpecificationsModel = Join-Path $DomainModelsTarget 'oslcDomainSpecifications.xml'
if (!(Test-Path -LiteralPath $DomainSpecificationsModel -PathType Leaf)) {
    if (!$DomainModelsSource) {
        throw "Domain models required for relative-reference resolution are missing or incomplete at '$DomainModelsTarget'. Pass -DomainModelsSource to populate them."
    }
    $DomainModelsSource = (Resolve-Path -LiteralPath $DomainModelsSource).Path
    $DomainModelsSourceFile = Join-Path $DomainModelsSource 'oslcDomainSpecifications.xml'
    if (!(Test-Path -LiteralPath $DomainModelsSourceFile -PathType Leaf)) {
        throw "Domain model source is incomplete; file not found: $DomainModelsSourceFile"
    }
    if (!(Test-Path -LiteralPath $DomainModelsTarget)) {
        $null = New-Item -ItemType Directory -Path $DomainModelsTarget
    }
    Get-ChildItem -Force -LiteralPath $DomainModelsSource |
        Copy-Item -Destination $DomainModelsTarget -Recurse -Force
    Write-Host "Copied domain models to '$DomainModelsTarget'."
}

$LocalClassDirectories = @(
    'org.eclipse.lyo.oslc4j.codegenerator\target\classes',
    'org.eclipse.lyo.tools.common\target\classes',
    'org.eclipse.lyo.tools.toolchain.model\target\classes',
    'org.eclipse.lyo.tools.adaptormodel.model\target\classes',
    'org.eclipse.lyo.tools.vocabulary.model\target\classes'
) | ForEach-Object { Join-Path $LyoDesignerRoot $_ }

$MissingClassDirectories = @($LocalClassDirectories | Where-Object { !(Test-Path -LiteralPath $_) })
if ($MissingClassDirectories.Count -gt 0) {
    throw "Built class directories are missing: $($MissingClassDirectories -join ', '). Run with -Build."
}

$HeadlessGeneratorClass = Join-Path $LocalClassDirectories[0] `
    'org\eclipse\lyo\oslc4j\codegenerator\main\HeadlessGenerator.class'
if (!(Test-Path -LiteralPath $HeadlessGeneratorClass)) {
    throw "HeadlessGenerator.class is missing. Run with -Build on a branch containing the CLI generator."
}

if (!$CodegenVersion) {
    [xml] $CodegeneratorPom = Get-Content -Raw -LiteralPath `
        (Join-Path $LyoDesignerRoot 'org.eclipse.lyo.oslc4j.codegenerator\pom.xml')
    $CodegenVersion = [string] $CodegeneratorPom.project.parent.version
}

$ClasspathEntries = @($LocalClassDirectories)
$ClasspathEntries += Join-Path $DesignerInstallRoot 'plugins\*'
$Classpath = $ClasspathEntries -join [System.IO.Path]::PathSeparator
$GeneratorArguments = @(
    "-Dlyod.codegen.version=$CodegenVersion",
    '-cp',
    $Classpath,
    'org.eclipse.lyo.oslc4j.codegenerator.main.HeadlessGenerator',
    $ModelPath,
    $OutputDirectory
)
if ($PropertiesFile) {
    $GeneratorArguments += $PropertiesFile | ForEach-Object {
        (Resolve-Path -LiteralPath $_).Path
    }
}

$LostFilesBefore = @(Get-ChildItem -LiteralPath $TargetProjectRoot -Recurse -File -Filter '*.lost' |
    ForEach-Object { $_.FullName })

& $JavaExecutable $GeneratorArguments
if ($LASTEXITCODE -ne 0) {
    throw "Lyo Designer code generation failed with exit code $LASTEXITCODE."
}

$NewLostFiles = @(Get-ChildItem -LiteralPath $TargetProjectRoot -Recurse -File -Filter '*.lost' |
    Where-Object { $_.FullName -notin $LostFilesBefore })
if ($NewLostFiles.Count -gt 0) {
    Write-Warning "Generation created $($NewLostFiles.Count) .lost file(s). Inspect them before accepting generated changes:"
    $NewLostFiles | ForEach-Object { Write-Warning "  $($_.FullName)" }
}
