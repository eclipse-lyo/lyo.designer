# quick
$LyoDesignerRepoRoot = "$PSScriptRoot\.."

Push-Location $LyoDesignerRepoRoot
try {
    mvn clean install -pl org.eclipse.lyo.tools.codegenerator.feature -am; if($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }

    Set-Location $LyoDesignerRepoRoot\org.eclipse.lyo.tools.designer.product
    mvn clean install; if($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }

    Set-Location $LyoDesignerRepoRoot\org.eclipse.lyo.tools.designer.product\target\products
    & "$LyoDesignerRepoRoot\org.eclipse.lyo.tools.designer.product\org.eclipse.lyo.tools.designer.product\target\products\lyo-designer\win32\win32\x86_64\lyodesigner.exe"; if($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }
} catch {
    exit 1
} finally {
    Pop-Location
}
