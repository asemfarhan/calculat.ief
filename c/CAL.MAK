# CA Gen Generated makefile for CAL
#
#  Copyright (C) 2016 CA. All rights reserved.
#
.SUFFIXES:
ENTRYMAINCRTSTARTUP=/entry:_DllMainCRTStartup@12
X86DEF=-D_X86_
STUBLINK=/NOLOGO /SUBSYSTEM:WINDOWS -entry:WinMainCRTStartup -out:"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.EXE"  /DELAYLOAD:WRGN.DLL
DLLLINK= /NOLOGO \
/DLL /SUBSYSTEM:WINDOWS \
$(ENTRYMAINCRTSTARTUP) /OUT:"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.DLL" \
/implib:"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.LIB" \
/def:"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.DEF"
#
DBMS=UNKNOWN
PATH=$(PATH)
LIB=C:\Program Files (x86)\CA\Gen86Free\gen\.\;C:\Program Files (x86)\CA\Gen86Free\gen\;$(LIB)
INCLUDE=C:\Program Files (x86)\CA\Gen86Free\gen\.\;C:\Program Files (x86)\CA\Gen86Free\gen\;$(INCLUDE)
PCC=XX
TUXEDO_IDLFLAGS= -n
TUXEDO_DEFS=-DWIN32 -MD -D_AFXDLL  -DWIN32_LEAN_AND_MEAN -D_STDC__=1 -O2 -DWIN
ALL_DEFS=-Dtry=cktry -Dexcept=__except -Dleave=__leave -Dfinally=__finally -D_CRT_SECURE_NO_DEPRECATE
ALL_DEF1=-DCRTAPI1=_cdecl -DCRTAPI2=_cdecl -DMSC -DNONTTRACE -DWIN_NT -DREENTRANT
CFLAGS=-c -EHsc -Zc:forScope- -W3 -Od -nologo -DCGGUI -DNDEBUG -D_WINDOWS -D_MBCS -MD -D_AFXDLL  -DWIN32 -DWIN $(X86DEF) $(ALL_DEFS) $(ALL_DEF1)
STUBCFLAGS=-c -EHsc -Zc:forScope- -W3 -Od -nologo -DCGGUI -DNDEBUG -D_WINDOWS -D_MBCS -MD -D_AFXDLL  -DWIN32 -DWIN $(X86DEF) $(ALL_DEFS) $(ALL_DEF1)
STUBCPPFLAGS=-c -EHsc -Zc:forScope- -W3 -Od -nologo -DCGGUI -DNDEBUG -D_WINDOWS -D_MBCS -MD -D_AFXDLL -DWIN32 -FD

all: \
 "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.EXE" \
  "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.CHM" \
 "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.DLL" \
 "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.HRC"

# Execunit Module Dependency
"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\CAL.OBJ": \
	"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.C" \
	"C:\Program Files (x86)\CA\Gen86Free\gen\wgr.h"
	@"C:\Program Files (x86)\CA\Gen86Free\gen\instmsgj" CAL "Compiling CAL"
	@echo.
	@echo ...Compiling CAL - CAL
	@echo echo **************************** > "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo Compile step for C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.C failed with errors. >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo @if exist $@ del $@ >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo **************************** >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	cl $(CFLAGS) -Fo"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\CAL.OBJ" "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.C"
	@if NOT exist $@ exit 1
	@del "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"

# Source Module Dependency
"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\HOME.OBJ": "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\HOME.C"
	@"C:\Program Files (x86)\CA\Gen86Free\gen\instmsgj" CAL "Compiling HOME"
	@echo.
	@echo ...Compiling CAL - HOME
	@echo echo **************************** > "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo Compile step for C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\HOME.C failed with errors. >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo @if exist $@ del $@ >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo **************************** >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	cl $(CFLAGS) -Fo"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\HOME.OBJ" "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\HOME.C"
	@if NOT exist $@ exit 1
	@del "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"

# Source Module Dependency
"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\EXPERT.OBJ": "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\EXPERT.C"
	@"C:\Program Files (x86)\CA\Gen86Free\gen\instmsgj" CAL "Compiling EXPERT"
	@echo.
	@echo ...Compiling CAL - EXPERT
	@echo echo **************************** > "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo Compile step for C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\EXPERT.C failed with errors. >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo @if exist $@ del $@ >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo **************************** >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	cl $(CFLAGS) -Fo"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\EXPERT.OBJ" "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\EXPERT.C"
	@if NOT exist $@ exit 1
	@del "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"

# Stub Resource File Dependency
"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\STUB.RES"::
	@"C:\Program Files (x86)\CA\Gen86Free\gen\instmsgj" CAL "Compiling Stub resource file"
	@echo.
	@echo ...Compiling Stub resources
	@echo echo **************************** > "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo Resource compile for Stub failed with errors. >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo @if exist $@ del $@ >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo **************************** >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	copy "C:\Program Files (x86)\CA\Gen86Free\gen\version\applno.bat" "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\applno.bat"
	@if NOT exist "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\application.h" copy "C:\Program Files (x86)\CA\Gen86Free\gen\version\application.h" "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\application.h"
	call "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\applno.bat" YES "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\" CAL "C:\Program Files (x86)\CA\Gen86Free\gen\" GUI
	@"C:\Program Files (x86)\CA\Gen86Free\gen\stub_icon.exe" "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\\" CAL.RC
	rc -r -DWIN -D_AFXDLL -DIEF_BITMAP=. -I"%IEF_BITMAP%" -I"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\." -I"C:\Program Files (x86)\CA\Gen86Free\gen\version" -DCUSTOMER_APPL -fo"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\STUB.RES" "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\stub.rc"
	@if not exist $@ exit 1
	@del "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"

# CAL.HRC Structured Storage Dependency
"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.HRC"::
	@"C:\Program Files (x86)\CA\Gen86Free\gen\instmsgj" CAL "Creating/Updating CAL Structured Storage"
	@echo.
	@echo ...Creating/Updating CAL Structured Storage
	@echo echo **************************** > "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
        @echo echo Creating/Updating CAL Structured Storage failed with errors. >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo **************************** >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	CD "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\."
	"C:\Program Files (x86)\CA\Gen86Free\gen\\wrocfcw" "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL"
	CD "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\."
	@if not exist $@ exit 1
	@del "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"

# Resource File Dependency
"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.RES": "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.RC" "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.HRC"
	@"C:\Program Files (x86)\CA\Gen86Free\gen\instmsgj" CAL "Compiling resource file"
	@echo.
	@echo ...Compiling GUI resources
	@echo echo **************************** > "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo Resource compile for load module CAL failed with errors. >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo @if exist $@ del $@ >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo **************************** >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	rc -r -DWIN -DIEF_BITMAP=. -I"%IEF_BITMAP%" -I"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\." -I"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\." -I"C:\Program Files (x86)\CA\Gen86Free\gen\version" -I"C:\Program Files (x86)\CA\Gen86Free\gen\." -DCUSTOMER_APPL -fo"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.RES" "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.RC"
	@if not exist $@ exit 1
	@del "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"

# CAL.DLL Dependency
"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.DLL":: \
 "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\HOME.OBJ" \
 "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\EXPERT.OBJ" \
 "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\CAL.OBJ" \
 "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.RES" \

	@echo.
	@echo ---Compiles for CAL.DLL Dependencies done

"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.DLL"::
	@"C:\Program Files (x86)\CA\Gen86Free\gen\instmsgj" CAL "Linking Load Module DLL CAL"
	@echo.
	@echo ...Linking Load Module DLL CAL
	@echo echo **************************** > "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo Link step for CAL.DLL using C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.LNK failed with errors. >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo @if exist $@ del $@ >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo **************************** >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	link $(DLLLINK) /OUT:"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.DLL" @"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.RSP" @"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.LNK"
	@if NOT exist $@ exit 1
	@del "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"

# CAL.EXE Dependency
"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.EXE": \
 "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\STUB.OBJ" \
 "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\STUBMAIN.OBJ" \
 "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\STUB.RES"
	@"C:\Program Files (x86)\CA\Gen86Free\gen\instmsgj" CAL "Linking Load Module stub CAL"
	@echo.
	@echo ...Linking Load Module stub CAL
	@echo echo **************************** > "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo Link step for STUB.EXE using C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\STUB.LNK failed with errors. >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo @if exist $@ del $@ >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo **************************** >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	link $(STUBLINK) "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\STUB.OBJ" "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\STUBMAIN.OBJ" "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\STUB.RES" @"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\STUB.LNK"
	@if NOT exist $@ exit 1
	@del "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@if exist "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\STUB.OBJ" del "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\OBJC\STUB.OBJ"

# CAL.CHM Dependency
"C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.CHM": "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.HHK" "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.H"
	@"C:\Program Files (x86)\CA\Gen86Free\gen\instmsgj" CAL "Compiling GUI Help file for CAL"
	@echo.
	@echo ...Compiling GUI Help file for CAL
	@echo echo **************************** > "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo Help compile using C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.HHP failed with errors. >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo @if exist $@ del $@ >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	@echo echo **************************** >> "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"
	 -hhc "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\CAL.HHP"
	@if not exist $@ exit 1
	@del "C:\Users\mansour\Documents\CA\Gen 8.6\Models\calculat.ief\c\ON_ERROR.BAT"

