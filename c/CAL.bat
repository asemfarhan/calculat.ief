@echo off
setlocal
REM
REM  Copyright (C) 2016 CA. All rights reserved.
REM
set COPYCMD=/Y
C:
CD "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\."
if EXIST "C:\Program Files (x86)\Microsoft Visual Studio 14.0\Common7\Tools\vsvars32.bat" call "C:\Program Files (x86)\Microsoft Visual Studio 14.0\Common7\Tools\vsvars32.bat"
set iefbind=
set PATH=;%PATH%
set btx=NMAKE.EXE
PATH=%PATH%;%ProgramFiles%\HTML Help Workshop
set btx=%btx%, HHC.EXE
set tuxbtx=
set btx=%btx%%tuxbtx%
set btx=%btx%, CL.EXE, LINK.EXE, RC.EXE
if exist CAL.EXE copy CAL.EXE CAL.BAK > NUL
if exist CAL.EXE del CAL.EXE > NUL
if exist CAL.EXE del CAL.BAK > NUL
if exist CAL.EXE goto IN_TEST
if not exist CAL.EXE if exist CAL.BAK ren CAL.BAK CAL.EXE
echo Initial search for build executables
set bt0error=
echo   %btx%
echo.
for %%n in (%btx%) do call "C:\Program Files (x86)\CA\Gen86Free\gen\bt0.bat" %%n
if "%bt0error%" == "Error" goto Failed
echo.
set IEF_BITMAP=C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\
if "%IEF_BITMAP:~-1%"=="\" set IEF_BITMAP=%IEF_BITMAP:~0,-1%
   if exist "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\..\bitmap" set IEF_BITMAP=C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\..\bitmap
CD "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\."
if not exist *.BMT goto dont_decode_bmt
for %%n in (*.BMT) do RFGDCODE %%n
echo set bmp_filename=%%1> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\temp_bmp_file.bat"
echo set bmp_location=%%2>> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\temp_bmp_file.bat"
echo set bmp_filename=%%bmp_filename:~0,-1%%p>> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\temp_bmp_file.bat"
echo set bmp_location=%%bmp_location:~1,-1%%>> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\temp_bmp_file.bat"
echo move %%bmp_filename%% "%%bmp_location%%\%%bmp_filename%%">> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\temp_bmp_file.bat"
for %%n in (*.BMT) do call "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\temp_bmp_file.bat" %%n "%IEF_BITMAP%"
if exist *.BMT del *.BMT > NUL
:dont_decode_bmt
if exist *.OLT for %%n in (*.OLT) do RFGDCODE %%n
if exist *.OLT del *.OLT > NUL
CD "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\."
if NOT exist defaultw.ico if exist "C:\Program Files (x86)\CA\Gen86Free\gen\defaultw.ico" echo ...Copying C:\Program Files (x86)\CA\Gen86Free\gen\defaultw.ico to defaultw.ico
if NOT exist defaultw.ico if exist "C:\Program Files (x86)\CA\Gen86Free\gen\defaultw.ico" copy "C:\Program Files (x86)\CA\Gen86Free\gen\defaultw.ico" defaultw.ico> NUL
echo ...Copying C:\Program Files (x86)\CA\Gen86Free\gen\.\STUBN.OBJ to C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\STUB.OBJ
copy "C:\Program Files (x86)\CA\Gen86Free\gen\.\STUBN.OBJ" "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\STUB.OBJ"> NUL
copy "C:\Program Files (x86)\CA\Gen86Free\gen\.\STUBMAIN.OBJ" "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\STUBMAIN.OBJ"> NUL
echo.
echo =====================Load Module Script Environment=================
echo Operating System: WINDOWS
echo "Database Manager: <NONE>"
echo Environment:      WINDOWS
echo Language:         C
echo Codepage:         1252
echo Model:            CALCULAT
echo Subset:           ALL
echo Level:            9.2.A6.01
echo.
echo ==============================SUMMARY===============================
echo Summary of Load Module Script Results for Load Module CAL:
echo ==============================LEGEND================================
echo Legend: ... precedes information about an operation to be performed.
echo         --- precedes results from an operation which just completed.
echo         *** precedes error info from an operation which just failed.
echo         (Symbols preceding info are indented to convey step levels.)
echo.
echo ==============================DETAILS===============================
echo Details of CAL Load Module Script Results:
nmake %iefmake% -f "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.MAK"
if not errorlevel 1 goto OK
if not exist "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT" goto FAILED
CALL "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
DEL "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"> NUL
for /F %%n in ('dir /B "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\WROCFLOG.BAT"') do if %%~zn EQU 0 del "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\WROCFLOG.BAT" > NUL
if not exist "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\WROCFLOG.BAT" goto FAILED
CALL "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\WROCFLOG.BAT"
DEL "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\WROCFLOG.BAT"> NUL
:FAILED
"C:\Program Files (x86)\CA\Gen86Free\gen\instmsgj" CAL IEFSIGNAL:FAIL
echo.
if NOT "%IEFITER1%" == "" echo %iefiter1%
if NOT "%IEFITER2%" == "" echo %iefiter2%
echo *** Build for Load Module CAL Failed. ***
goto EXIT
:OK
if exist "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT" DEL "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"> NUL
if exist "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\WROCFLOG.BAT" DEL "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\WROCFLOG.BAT"> NUL
"C:\Program Files (x86)\CA\Gen86Free\gen\instmsgj" CAL IEFSIGNAL:OK
echo Build for Load Module CAL Completed.
echo.
goto EXIT
:IN_TEST
"C:\Program Files (x86)\CA\Gen86Free\gen\instmsgj" CAL IEFSIGNAL:IN_TEST
echo.
echo *** Load Module CAL.EXE is currently being accessed. ***
echo *** Build for Load Module CAL Stopped. ***
echo *** Please exit all tests and Rebuild. ***
echo.
:EXIT
echo Important!  Review above for any errors.
endlocal
