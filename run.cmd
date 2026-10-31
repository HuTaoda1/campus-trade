@echo off
rem Run campus-trade with UTF-8 console so Chinese output displays correctly.
chcp 65001 >nul
setlocal

set "JAR=target\campus-trade-0.1.0-SNAPSHOT.jar"

if not exist "%JAR%" (
    echo [build] jar not found, running: mvn package
    call mvn -q package
    if errorlevel 1 exit /b 1
)

java -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8 -jar "%JAR%"

endlocal
