# quick
$LyoDesignerRepoRoot = "$PSScriptRoot\.."

Push-Location $LyoDesignerRepoRoot
try {

    #    Set-Location $LyoDesignerRepoRoot\org.eclipse.lyo.oslc4j.codegenerator
    mvn install -pl org.eclipse.lyo.oslc4j.codegenerator -am; if($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }

    Set-Location $LyoDesignerRepoRoot\org.eclipse.lyo.tools.codegenerator.feature
    mvn install; if($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }

    Set-Location $LyoDesignerRepoRoot\org.eclipse.lyo.tools.designer.product
    mvn install; if($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }

    Set-Location $LyoDesignerRepoRoot\org.eclipse.lyo.tools.designer.product\target\products
    & "$LyoDesignerRepoRoot\org.eclipse.lyo.tools.designer.product\target\products\lyo-designer\win32\win32\x86_64\lyodesigner.exe"; if($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }
} catch {
    exit 1
} finally {
    Pop-Location
}
