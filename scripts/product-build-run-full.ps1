# full
$LyoDesignerRepoRoot = "$PSScriptRoot\.."

Push-Location $LyoDesignerRepoRoot
try {
    mvn clean install; if($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }
    Remove-Item -LiteralPath "$LyoDesignerRepoRoot\org.eclipse.lyo.tools.designer.product\target\products\lyo-designer-win32.win32.x86_64" -Force -Recurse -ErrorAction SilentlyContinue
    Expand-Archive .\lyo-designer-win32.win32.x86_64.zip
    & "$LyoDesignerRepoRoot\org.eclipse.lyo.tools.designer.product\target\products\lyo-designer-win32.win32.x86_64\lyodesigner.exe" ; if($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }
} catch {
    exit 1
} finally {
    Pop-Location
}
