@echo off
setlocal
cd /d "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\."
PATH=C:\Program Files (x86)\CA\Gen86Free\gen\.\;%PATH%
set TRACE_OVERRIDE=1
cmd.exe /c "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.exe" AMATY
endlocal
