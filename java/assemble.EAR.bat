@echo off
setlocal
REM
REM  Copyright (C) 2016 CA. All rights reserved.
REM
set COPYCMD=/Y
C:
CD "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\java\\."
echo.
echo =====================EARFILE Assemble Information============
echo EAR File: CAL.ear
echo    WAR Modules:
echo       CALCULAT
echo    Additional Files:
echo       - EAR file:
echo         - WAR () file:
echo.
echo ===========================================================
set CLASSPATH=C:\Program Files (x86)\CA\Gen86Free\gen\classes\csu.jar;C:\Program Files (x86)\CA\Gen86Free\gen\classes\vwrt.jar;C:\Program Files (x86)\CA\Gen86Free\gen\classes\abrt.jar;C:\Program Files (x86)\CA\Gen86Free\gen\bt\bt.jar;C:\Program Files\Java\jdk1.6.0_45\lib\tools.jar
@echo %CLASSPATH%
"C:\Program Files\Java\jdk1.6.0_45\bin\java.exe" -version
"C:\Program Files\Java\jdk1.6.0_45\bin\java.exe" -Xmx256m org.apache.tools.ant.Main -buildfile "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\java\\assemble.EAR.XML"
if errorlevel 1 goto FAILED
goto OK
:FAILED
@echo "C:\Program Files (x86)\CA\Gen86Free\gen\instmsgj" assemble.EAR IEFSIGNAL:FAIL
echo.
if NOT "%IEFITER1%" == "" echo %iefiter1%
if NOT "%IEFITER2%" == "" echo %iefiter2%
echo *** Ear File Assemble for assemble.EAR Failed. ***
goto EXIT
:OK
@echo "C:\Program Files (x86)\CA\Gen86Free\gen\instmsgj" assemble.EAR IEFSIGNAL:OK
echo.
echo Ear File Assemble for assemble.EAR Completed.
goto EXIT
:EXIT
echo Important!  Review above for any errors.
endlocal
