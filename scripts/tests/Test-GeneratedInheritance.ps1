<# Runs generation, regeneration, Java compilation, and runtime assertions. #>
[CmdletBinding()]
param(
    [Parameter(Mandatory=$true)][string]$JavaHome,
    [Parameter(Mandatory=$true)][string]$DomainModelsSource,
    [string]$OutputDirectory,
    [string]$DesignerInstallRoot
)
$ErrorActionPreference='Stop'
$designerRoot=(Resolve-Path (Join-Path $PSScriptRoot '..\..')).Path
if (!$OutputDirectory) {
    $OutputDirectory=Join-Path ([IO.Path]::GetTempPath()) ('lyod-inheritance-' + [Guid]::NewGuid().ToString('N'))
}
if (Test-Path -LiteralPath $OutputDirectory) {
    throw "Use a new output directory for the fixture: $OutputDirectory"
}
$modelDirectory=Join-Path $OutputDirectory 'model'
$null=New-Item -ItemType Directory -Path $modelDirectory -Force
Copy-Item -LiteralPath (Join-Path $PSScriptRoot 'models\inheritance\specification.xml') -Destination $modelDirectory
Copy-Item -LiteralPath (Join-Path $PSScriptRoot 'models\inheritance\vocabulary.xml') -Destination $modelDirectory
$generationArguments=@{
    ModelPath=Join-Path $modelDirectory 'specification.xml'
    OutputDirectory=$modelDirectory
    DomainModelsSource=$DomainModelsSource
    JavaHome=$JavaHome
    CodegenVersion='7.0.0.dev+inheritance-regression'
    Specification=$true
}
if ($DesignerInstallRoot) {$generationArguments.DesignerInstallRoot=$DesignerInstallRoot}
& (Join-Path $designerRoot 'scripts\Invoke-LyoDesignerCodeGenerator.ps1') @generationArguments

$generated=Join-Path $OutputDirectory 'generated'
$diamond=Join-Path $generated 'src\main\java\example\generated\Diamond.java'
$content=Get-Content -Raw -LiteralPath $diamond
$marker='// Start of user code classMethods'
if (!$content.Contains($marker)) {throw 'Missing protected classMethods block'}
$content=$content.Replace($marker,$marker + [Environment]::NewLine + '    public String protectedProbe() { return "kept"; }')
[IO.File]::WriteAllText($diamond,$content,[Text.UTF8Encoding]::new($false))
& (Join-Path $designerRoot 'scripts\Invoke-LyoDesignerCodeGenerator.ps1') @generationArguments
if (@(Get-ChildItem -LiteralPath $OutputDirectory -Recurse -Filter '*.lost' -File).Count) {
    throw 'Fixture generation lost protected code'
}
$testDirectory=Join-Path $generated 'src\test\java\example'
$null=New-Item -ItemType Directory -Path $testDirectory -Force
Copy-Item -LiteralPath (Join-Path $PSScriptRoot 'VerifyGeneratedInheritance.java') -Destination $testDirectory

$previousJavaHome=$env:JAVA_HOME
$previousPath=$env:PATH
Push-Location $designerRoot
try {
    $env:JAVA_HOME=$JavaHome
    $env:PATH="$(Join-Path $JavaHome 'bin');$env:PATH"
    $classpathFile=Join-Path $generated 'target\regression-classpath.txt'
    & (Join-Path $designerRoot 'mvnw.cmd') -B -f (Join-Path $generated 'pom.xml') test-compile dependency:build-classpath "-Dmdep.outputFile=$classpathFile"
    if ($LASTEXITCODE -ne 0) {throw 'Generated fixture Java compilation failed'}
    $classpath=@(
        (Join-Path $generated 'target\classes'),
        (Join-Path $generated 'target\test-classes'),
        (Get-Content -Raw -LiteralPath $classpathFile).Trim()
    ) -join [IO.Path]::PathSeparator
    & (Join-Path $JavaHome 'bin\java.exe') -cp $classpath example.VerifyGeneratedInheritance
    if ($LASTEXITCODE -ne 0) {throw 'Generated fixture runtime assertions failed'}
} finally {
    Pop-Location
    $env:JAVA_HOME=$previousJavaHome
    $env:PATH=$previousPath
}
Write-Host "Regression artifacts: $OutputDirectory"
