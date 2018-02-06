@echo off
setlocal
REM
REM  Copyright (C) 2016 CA. All rights reserved.
REM
set COPYCMD=/Y
set COPYERR=false
set FINDERR=false
C:
CD "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\java\."
echo.
echo =====================Load Module Script Environment=================
echo Operating System: JVM
echo Database Manager: "JDBC"
echo Environment:      Web View
echo Language:         java
echo Codepage:         1252
echo ISOEncoding:      UTF-8
echo Module Type:      COOP
echo.
echo ==============================SUMMARY===============================
echo Summary of Load Module Script Results for Load Module CALCULAT_WebView:
echo ==============================LEGEND================================
echo Legend: ... precedes information about an operation to be performed.
echo         --- precedes results from an operation which just completed.
echo         *** precedes error info from an operation which just failed.
echo         (Symbols preceding info are indented to convey step levels.)
echo.
echo ==============================DETAILS===============================
echo Details of CALCULAT_WebView Load Module Script Results:
set MYCP=.;C:\Program Files (x86)\CA\Gen86Free\gen\bt\bt.jar;C:\Program Files\Java\jdk1.8.0_111\lib\tools.jar
@echo %MYCP%
"C:\Program Files\Java\jdk1.8.0_111\bin\java.exe" -Xmx256m -cp "%MYCP%" org.apache.tools.ant.Main -buildfile "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\java\CALCULAT_WebView.XML"
if not errorlevel 1 goto OK
:FAILED
"C:\Program Files (x86)\CA\Gen86Free\gen\instmsgj" CALCULAT_WebView IEFSIGNAL:FAIL
echo.
if NOT "%IEFITER1%" == "" echo %iefiter1%
if NOT "%IEFITER2%" == "" echo %iefiter2%
echo *** Build for Load Module CALCULAT_WebView Failed. ***
goto EXIT
:OK
if NOT "Web View" == "INTERNET" goto done
if "COOP" == "OPLIB" goto done
:done
"C:\Program Files (x86)\CA\Gen86Free\gen\instmsgj" CALCULAT_WebView IEFSIGNAL:OK
echo.
echo Build for Load Module CALCULAT_WebView Completed.
goto EXIT
:EXIT
echo Important!  Review above for any errors.
endlocal
