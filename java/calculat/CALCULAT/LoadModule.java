package calculat.CALCULAT;

// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
//
//             Servlet Manager Source Code Generated by
//                            CA Gen 8.6
//
//     Copyright (c) 2017 CA Technologies. All rights reserved.
//
//    Model Name:  CALCULAT
//
//    Load Mod:    CALCULAT                  Date: 17/04/09
//    Target OS:   JVM                       Time: 22:59:12
//    Target DBMS: JDBC                      User: mansour
//    Target GUI:  INTERNET                 
//    Dialect:     Default                  
//
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
// Import Statements
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
import java.lang.reflect.*;
import java.util.*;
import java.io.*;
import java.math.*;
import com.ca.gen.smrt.*;
import com.ca.gen.smrt.controls.*;
import com.ca.gen.smrt.events.*;
import com.ca.gen.fmrt.*;
import com.ca.gen.wmrt.*;
import com.ca.gen.wmrt.controls.*;
import com.ca.gen.wmrt.controls.listboxsupport.*;
import com.ca.gen.wmrt.commands.*;
import com.ca.gen.wmrt.events.*;
import com.ca.gen.wmrt.editpatterns.*;
import com.ca.gen.abrt.*;
import com.ca.gen.vwrt.*;
import com.ca.gen.vwrt.types.*;
import com.ca.gen.odc.*;

import calculat.CALCULAT.Windows.*;
import calculat.CALCULAT.Windows.*;

public class LoadModule extends WindowLoadModule
{
  private TranData [] commif = {
  }
  ;
  // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
  // Variable Declarations
  // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
  public final static int RCID_13300002_CALCULAT = 100;
  public final static int PID_3C00001_CALCULAT_WIN = 101;
  public final static int RCID_3C00001_CALCULAT_WIN = 102;
  
  public final static int RCTL_12700000_CALCULAT_WIN = 103;
  public final static int RCID_12700000_CALCULAT_WIN = 104;
  public final static int RCHLP_12700000_CALCULAT_WIN = 105;
  public final static int RCID_11F00005_NUMBER1ST = 107;
  public final static int RCLT_11F00005_NUMBER1ST = 108;
  public final static int RCMD_11000000_PLUS = 109;
  public final static int RCMD_11000002_MINS = 110;
  public final static int RCID_11F00003_NUMBER2 = 111;
  public final static int RCLT_11F00003_NUMBER2 = 112;
  public final static int RCMD_11000006_NO_COMMAND = 113;
  public final static int RCID_11F00007_RESULT = 114;
  public final static int RCLT_11F00007_RESULT = 115;
  public final static int RCMD_1100000A_NO_COMMAND = 116;
  public final static int RCMD_11000009_CLEAR = 117;
  public final static int PID_3C00000_AMATY = 118;
  public final static int RCID_3C00000_AMATY = 119;
  
  public final static int RCTL_12700001_AMATY = 120;
  public final static int RCID_12700001_AMATY = 121;
  public final static int RCHLP_12700001_AMATY = 122;
  public final static int RCID_F600006_DROP_LIST1 = 123;
  public final static int RCID_F600005_DROP_LIST1 = 124;
  public final static int RCID_F600002_DROP_LIST1 = 125;
  public final static int RCID_11F00013_ALLLLLLL = 127;
  public final static int RCLT_11F00013_ALLLLLLL = 128;
  public final static int RCID_11F00017_RESULT = 129;
  public final static int RCLT_11F00017_RESULT = 130;
  public final static int RCID_11F00015_TOTAL_REAL = 131;
  public final static int RCLT_11F00015_TOTAL_REAL = 132;
  public final static int RCMD_1100000F_NO_COMMAND = 133;
  public final static int RCMD_1100000E_NO_COMMAND = 134;
  public final static int RCMD_11000012_NO_COMMAND = 135;
  public final static int RCID_F700016_DROP_LIST1 = 136;
  public final static int RCLT_F700016_DROP_LIST1 = 137;
  public final static int RCMD_1100001E_ENTER = 138;
  public final static int RCMD_11000011_NO_COMMAND = 139;
  public final static int RCMD_11000010_NO_COMMAND = 140;
  public final static int RCMD_11000014_NO_COMMAND = 141;
  public final static int RCMD_11000019_NO_COMMAND = 142;
  public final static int RCMD_1100001A_NO_COMMAND = 143;
  public final static int RCMD_1100001B_NO_COMMAND = 144;
  public final static int RCMD_1100001D_NO_COMMAND = 145;
  public final static int RCMD_1100000B_PLUS = 146;
  public final static int RCMD_1100001F_MINS = 147;
  public final static int RCMD_1100000D_RETURN = 148;
  public final static int RCMD_1100000C_NO_COMMAND = 149;
  public final static int RCID_11F00008_TEXT1111 = 150;
  public final static int RCLT_11F00008_TEXT1111 = 151;
  public final static int RCMD_E100011_MULTIPLY = 152;
  public final static int RCMD_E100010_MINS = 153;
  public final static int RCMD_E10000F_PLUS = 154;
  public final static int RCMD_E10000E_LIST = 155;
  public final static int RCMD_E10000D_ENTER = 156;
  public final static int RCMD_E10000C_PROTECT = 157;
  public final static int RCMD_E10000B_RETURN = 158;
  public final static int RCMD_E10000A_MENU = 159;
  public final static int RCMD_E100009_CONFIRM = 160;
  public final static int RCMD_E100008_CANCEL = 161;
  public final static int RCMD_E100007_PREV = 162;
  public final static int RCMD_E100006_NEXT = 163;
  public final static int RCMD_E100005_BYPASS = 164;
  public final static int RCMD_E100004_CLEAR = 165;
  public final static int RCMD_E100003_DELETE = 166;
  public final static int RCMD_E100002_UPDATE = 167;
  public final static int RCMD_E100001_CREATE = 168;
  public final static int RCMD_E100000_DISPLAY = 169;
  
  // * * * * * * * * * * * * * * * * * * *
  // PERMITTED VALUE TABLES
  // * * * * * * * * * * * * * * * * * * *
  public final static PermittedValue PVAL_3600074_FLAG[] =
      {
        new PermittedValue("N", null),
        new PermittedValue("Y", null),
      };
  
  public final static PermittedValue PVAL_360009F_DROP_LIST1[] =
      {
        new PermittedValue("+", null),
        new PermittedValue("-", null),
        new PermittedValue("E", null),
        new PermittedValue("D", null),
      };
  
  // Cross-Domain helper method readViewObjects
  @Override public Object[] readViewObjects( InputStream is )
                    throws Exception
  {
        ObjectInputStream ois = new ObjectInputStream(is);
        int  count = ois.readUnsignedByte();
        Object[] o = new Object[count];
        for (int i=0; i<count; i++)
            o[i] = ois.readObject();
        return o;
  }
  
  // Initilize the list of owned procedure steps
  @Override public void loadProcedureStepList()
  {
    procedureStepNames.add("calculat.CALCULAT.ProcedureSteps.CALCULAT_WIN");
    procedureStepNames.add("calculat.CALCULAT.ProcedureSteps.AMATY");
  }
  
  // Referenced Procedure Step --> Load Module Name Table
  public static Hashtable referencedPSteps = new Hashtable();
  static {
  }
  
  // Business information used for displaying Message Box.
  private final static String [] messageBox_cssClasses=
      {null,null,null,null,null,null,null,null,null };
  @Override public final void loadBusinessSystemInfo()
  {
    bussysName          = "CALCULAT";
    userCssFileName     = "";
    messageBoxWidth     = 0;
    messageBoxHeight    = 0;
    cssClasses          = messageBox_cssClasses;
  }
  // Extension Table
  @Override public final void loadExtensionValues()
  {
    // Load the extension tables values into LoadModule variables.
    modelName          = "CALCULAT";
    databaseName       = "NONE";
    dbmsType           = "JDBC";
    decimalSeperator   = '.';
    thousandsSeperator = ',';
    dialect            = "DEFAULT";
    isDefaultDialect   = true;
    iefVersion         = "8600333";
    messageFile        = "wr";
    codePage           = "1252";
    tranData          = commif;
  }
  
  // Exit State Names
  @Override public final void loadExitStateNamesMap()
  {
    exitStateNamesMap.put(new Integer(238026767), "SUBJECT_LIST");
    exitStateNamesMap.put(new Integer(238026766), "FLOW_TO_MENU");
    exitStateNamesMap.put(new Integer(238026765), "RETURN");
    exitStateNamesMap.put(new Integer(238026764), "ACTION_BAR_IS_INVALID");
    exitStateNamesMap.put(new Integer(238026763), "INVALID_COMMAND");
    exitStateNamesMap.put(new Integer(238026762), "VALID_DELETE");
    exitStateNamesMap.put(new Integer(238026761), "VALID_UPDATE");
    exitStateNamesMap.put(new Integer(238026760), "VALID_CREATE");
    exitStateNamesMap.put(new Integer(238026759), "DELETE_OK");
    exitStateNamesMap.put(new Integer(238026758), "UPDATE_OK");
    exitStateNamesMap.put(new Integer(238026757), "CREATE_OK");
    exitStateNamesMap.put(new Integer(238026756), "DISPLAY_OK");
    exitStateNamesMap.put(new Integer(238026755), "KEY_FIELD_IS_BLANK");
    exitStateNamesMap.put(new Integer(238026754), "KEY_CHANGE_NOT_ALLOWED");
    exitStateNamesMap.put(new Integer(238026753), "PROCESSING_OK");
    exitStateNamesMap.put(new Integer(238026752), "PROCESSING_STARTED");
    exitStateNamesMap.put(new Integer(238026769), "RETURN_BACK_TO_EXPERT_AMATY");
    exitStateNamesMap.put(new Integer(238026768), "RETURN_BACK_TO_MAIN");
  }
  
  public LoadModule()
  {
    super();
  }
  
  
} // end of CALCULAT_winhead class 
