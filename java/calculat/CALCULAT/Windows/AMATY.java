package calculat.CALCULAT.Windows;

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

public class AMATY extends ServletWindow implements Serializable
{
  private static final int windowResourceId = calculat.CALCULAT.LoadModule.RCID_12700001_AMATY;
  
  public final static int getWindowResourceId()
  {
    return(windowResourceId);
  }
  
                     /**************************************/
                     /*  Button lists and Fldgroup tables  */
                     /**************************************/
  
   public final static Domain UID_11F00013_ALLLLLLL = Domain.getInstance(
      200,
      Domain.BT_STRING,
      200,
      (short)0,
      null,
      null,
      false,
      true,     // domain= 'T' case sensitive ='N' translate ='N'
      null
      );
  
   public final static Domain UID_11F00017_RESULT = Domain.getInstance(
      8,
      Domain.BT_LONG,
      8,
      (short)0,
      null,
      null,
      false,
      false,    // domain= 'N' case sensitive ='N' translate ='N'
      null
      );
  
   public final static Domain UID_11F00015_TOTAL_REAL = Domain.getInstance(
      8,
      Domain.BT_DOUBLE,
      17,
      (short)0,
      "ZZZZZZZZ",
      null,
      false,
      false,    // domain= 'N' case sensitive ='N' translate ='N'
      null
      );
  
  public final static Button PSB_F700016_DROP_LIST1[] = {
    new Button(calculat.CALCULAT.LoadModule.RCID_F600006_DROP_LIST1,(short)1,(short)1,null),
    new Button(calculat.CALCULAT.LoadModule.RCID_F600002_DROP_LIST1,(short)2,(short)0,null),
    new Button(calculat.CALCULAT.LoadModule.RCID_F600005_DROP_LIST1,(short)3,(short)0,null),
  };
  
  public final static String VALS_F700016_DROP_LIST1[] = {
        "E",
        "+",
        "-",
        "D",
  };
  
   public final static ButtonEdit WIED_F700016_DROP_LIST1 = new ButtonEdit(
      VALS_F700016_DROP_LIST1, Domain.BT_STRING, 1, 0, "", true
      );     
  
   public final static Domain UID_11F00008_TEXT1111 = Domain.getInstance(
      100,
      Domain.BT_STRING,
      100,
      (short)0,
      null,
      null,
      false,
      true,     // domain= 'T' case sensitive ='N' translate ='N'
      null
      );
  
  
                          /******************************/
                         /*  Command Table for Window  */
                         /******************************/
  
  private final static Command UIC_12700001_AMATY[] = 
      {
    new ServletCommand(calculat.CALCULAT.LoadModule.RCMD_1100000F_NO_COMMAND,"",Command.CM_OTHER,
    0,
    null,
    0,
    State.ST_PUSHBUTTON,
     "Button3",""),
    
    new ServletCommand(calculat.CALCULAT.LoadModule.RCMD_1100000E_NO_COMMAND,"",Command.CM_OTHER,
    0,
    null,
    0,
    State.ST_PUSHBUTTON,
     "Button4",""),
    
    new ServletCommand(calculat.CALCULAT.LoadModule.RCMD_11000012_NO_COMMAND,"",Command.CM_OTHER,
    0,
    null,
    0,
    State.ST_PUSHBUTTON,
     "Button5",""),
    
    new ServletCommand(calculat.CALCULAT.LoadModule.RCMD_1100001E_ENTER,"ENTER",Command.CM_OTHER,
    0,
    null,
    calculat.CALCULAT.LoadModule.RCMD_E10000D_ENTER,
    State.ST_PUSHBUTTON,
     "Button14",""),
    
    new ServletCommand(calculat.CALCULAT.LoadModule.RCMD_11000011_NO_COMMAND,"",Command.CM_OTHER,
    0,
    null,
    0,
    State.ST_PUSHBUTTON,
     "Button6",""),
    
    new ServletCommand(calculat.CALCULAT.LoadModule.RCMD_11000010_NO_COMMAND,"",Command.CM_OTHER,
    0,
    null,
    0,
    State.ST_PUSHBUTTON,
     "Button7",""),
    
    new ServletCommand(calculat.CALCULAT.LoadModule.RCMD_11000014_NO_COMMAND,"",Command.CM_OTHER,
    0,
    null,
    0,
    State.ST_PUSHBUTTON,
     "Button8",""),
    
    new ServletCommand(calculat.CALCULAT.LoadModule.RCMD_11000019_NO_COMMAND,"",Command.CM_OTHER,
    0,
    null,
    0,
    State.ST_PUSHBUTTON,
     "Button9",""),
    
    new ServletCommand(calculat.CALCULAT.LoadModule.RCMD_1100001A_NO_COMMAND,"",Command.CM_OTHER,
    0,
    null,
    0,
    State.ST_PUSHBUTTON,
     "Button10",""),
    
    new ServletCommand(calculat.CALCULAT.LoadModule.RCMD_1100001B_NO_COMMAND,"",Command.CM_OTHER,
    0,
    null,
    0,
    State.ST_PUSHBUTTON,
     "Button11",""),
    
    new ServletCommand(calculat.CALCULAT.LoadModule.RCMD_1100001D_NO_COMMAND,"",Command.CM_OTHER,
    0,
    null,
    0,
    State.ST_PUSHBUTTON,
     "Button12",""),
    
    new ServletCommand(calculat.CALCULAT.LoadModule.RCMD_1100000B_PLUS,"PLUS",Command.CM_OTHER,
    0,
    null,
    calculat.CALCULAT.LoadModule.RCMD_E10000F_PLUS,
    State.ST_PUSHBUTTON,
     "plus",""),
    
    new ServletCommand(calculat.CALCULAT.LoadModule.RCMD_1100001F_MINS,"MINS",Command.CM_OTHER,
    0,
    null,
    calculat.CALCULAT.LoadModule.RCMD_E100010_MINS,
    State.ST_PUSHBUTTON,
     "Button13",""),
    
    new ServletCommand(calculat.CALCULAT.LoadModule.RCMD_1100000D_RETURN,"RETURN",Command.CM_OTHER,
    0,
    null,
    calculat.CALCULAT.LoadModule.RCMD_E10000B_RETURN,
    State.ST_PUSHBUTTON,
     "backamaty",""),
    
    new ServletCommand(calculat.CALCULAT.LoadModule.RCMD_1100000C_NO_COMMAND,"",Command.CM_OTHER,
    0,
    null,
    0,
    State.ST_PUSHBUTTON,
     "clear_amaty",""),
    
  }
  ;
  
                           /****************************/
                          /*  Event Table for Window  */
                          /****************************/
  
  private final static Event EVT_12700001_AMATY[] =
      {
    new Event( 
    calculat.CALCULAT.LoadModule.RCMD_1100000F_NO_COMMAND, // resource id of the control
    "Click", // event type
    "expert_amaty_pb_1_click05", // event handler
    null,// command
    ' ', // map flag
    false, // OLE event flag
    (short)0, // offset of return attribute
    (short)0, // length of return attribute
    ' ',// datatype of return attribute
    (short)0// decimals for return value
    ),
    
    new Event( 
    calculat.CALCULAT.LoadModule.RCMD_1100000E_NO_COMMAND, // resource id of the control
    "Click", // event type
    "expert_amaty_pb_2_click06", // event handler
    null,// command
    ' ', // map flag
    false, // OLE event flag
    (short)0, // offset of return attribute
    (short)0, // length of return attribute
    ' ',// datatype of return attribute
    (short)0// decimals for return value
    ),
    
    new Event( 
    calculat.CALCULAT.LoadModule.RCMD_11000012_NO_COMMAND, // resource id of the control
    "Click", // event type
    "expert_amaty_pb_3_click07", // event handler
    null,// command
    ' ', // map flag
    false, // OLE event flag
    (short)0, // offset of return attribute
    (short)0, // length of return attribute
    ' ',// datatype of return attribute
    (short)0// decimals for return value
    ),
    
    new Event( 
    calculat.CALCULAT.LoadModule.RCID_F700016_DROP_LIST1, // resource id of the control
    "Changed", // event type
    "expert_amaty_dl_drop_list1_ch17", // event handler
    null,// command
    'Y', // map flag
    false, // OLE event flag
    (short)0, // offset of return attribute
    (short)0, // length of return attribute
    ' ',// datatype of return attribute
    (short)0// decimals for return value
    ),
    
    new Event( 
    calculat.CALCULAT.LoadModule.RCMD_1100001E_ENTER, // resource id of the control
    "Click", // event type
    "expert_amaty_pb_ok_click15", // event handler
    "ENTER", // command
    ' ', // map flag
    false, // OLE event flag
    (short)0, // offset of return attribute
    (short)0, // length of return attribute
    ' ',// datatype of return attribute
    (short)0// decimals for return value
    ),
    
    new Event( 
    calculat.CALCULAT.LoadModule.RCMD_11000011_NO_COMMAND, // resource id of the control
    "Click", // event type
    "expert_amaty_pb_4_click08", // event handler
    null,// command
    ' ', // map flag
    false, // OLE event flag
    (short)0, // offset of return attribute
    (short)0, // length of return attribute
    ' ',// datatype of return attribute
    (short)0// decimals for return value
    ),
    
    new Event( 
    calculat.CALCULAT.LoadModule.RCMD_11000010_NO_COMMAND, // resource id of the control
    "Click", // event type
    "expert_amaty_pb_5_click09", // event handler
    null,// command
    ' ', // map flag
    false, // OLE event flag
    (short)0, // offset of return attribute
    (short)0, // length of return attribute
    ' ',// datatype of return attribute
    (short)0// decimals for return value
    ),
    
    new Event( 
    calculat.CALCULAT.LoadModule.RCMD_11000014_NO_COMMAND, // resource id of the control
    "Click", // event type
    "expert_amaty_pb_6_click10", // event handler
    null,// command
    ' ', // map flag
    false, // OLE event flag
    (short)0, // offset of return attribute
    (short)0, // length of return attribute
    ' ',// datatype of return attribute
    (short)0// decimals for return value
    ),
    
    new Event( 
    calculat.CALCULAT.LoadModule.RCMD_11000019_NO_COMMAND, // resource id of the control
    "Click", // event type
    "expert_amaty_pb_7_click11", // event handler
    null,// command
    ' ', // map flag
    false, // OLE event flag
    (short)0, // offset of return attribute
    (short)0, // length of return attribute
    ' ',// datatype of return attribute
    (short)0// decimals for return value
    ),
    
    new Event( 
    calculat.CALCULAT.LoadModule.RCMD_1100001A_NO_COMMAND, // resource id of the control
    "Click", // event type
    "expert_amaty_pb_8_click12", // event handler
    null,// command
    ' ', // map flag
    false, // OLE event flag
    (short)0, // offset of return attribute
    (short)0, // length of return attribute
    ' ',// datatype of return attribute
    (short)0// decimals for return value
    ),
    
    new Event( 
    calculat.CALCULAT.LoadModule.RCMD_1100001B_NO_COMMAND, // resource id of the control
    "Click", // event type
    "expert_amaty_pb_9_click13", // event handler
    null,// command
    ' ', // map flag
    false, // OLE event flag
    (short)0, // offset of return attribute
    (short)0, // length of return attribute
    ' ',// datatype of return attribute
    (short)0// decimals for return value
    ),
    
    new Event( 
    calculat.CALCULAT.LoadModule.RCMD_1100001D_NO_COMMAND, // resource id of the control
    "Click", // event type
    "expert_amaty_pb_0_click14", // event handler
    null,// command
    ' ', // map flag
    false, // OLE event flag
    (short)0, // offset of return attribute
    (short)0, // length of return attribute
    ' ',// datatype of return attribute
    (short)0// decimals for return value
    ),
    
    new Event( 
    calculat.CALCULAT.LoadModule.RCMD_1100000B_PLUS, // resource id of the control
    "Click", // event type
    "expert_amaty_pb_plus_click01", // event handler
    "PLUS", // command
    ' ', // map flag
    false, // OLE event flag
    (short)0, // offset of return attribute
    (short)0, // length of return attribute
    ' ',// datatype of return attribute
    (short)0// decimals for return value
    ),
    
    new Event( 
    calculat.CALCULAT.LoadModule.RCMD_1100001F_MINS, // resource id of the control
    "Click", // event type
    "expert_amaty_pb_mine_click02", // event handler
    "MINS", // command
    ' ', // map flag
    false, // OLE event flag
    (short)0, // offset of return attribute
    (short)0, // length of return attribute
    ' ',// datatype of return attribute
    (short)0// decimals for return value
    ),
    
    new Event( 
    calculat.CALCULAT.LoadModule.RCMD_1100000D_RETURN, // resource id of the control
    "Click", // event type
    "expert_amaty_pb_back_click04", // event handler
    null,// command
    ' ', // map flag
    false, // OLE event flag
    (short)0, // offset of return attribute
    (short)0, // length of return attribute
    ' ',// datatype of return attribute
    (short)0// decimals for return value
    ),
    
    new Event( 
    calculat.CALCULAT.LoadModule.RCMD_1100000C_NO_COMMAND, // resource id of the control
    "Click", // event type
    "expert_amaty_pb_clear_click03", // event handler
    null,// command
    ' ', // map flag
    false, // OLE event flag
    (short)0, // offset of return attribute
    (short)0, // length of return attribute
    ' ',// datatype of return attribute
    (short)0// decimals for return value
    ),
    
  }
  ;
  public static Event [] events = EVT_12700001_AMATY;    /* event table */
  
  public final static Event [] getEvents()
  {
    return(events);
  }
  
  private static int pStepId = calculat.CALCULAT.LoadModule.PID_3C00000_AMATY;
  private static Command [] commands = UIC_12700001_AMATY;
  private static char windowClass     = PR_SUBWINDOW;    /* subwindow box */
  private static char modality = PR_MODAL;    /* modal window */
  private static String windowName = "AMATY";  /* window name */
  private static String htmlfileName    = "AMATY";  /* htmlfile name */
  private static String _bitmapName = null; /* No background bitmap */
  private static char _bitmapUsage  = ' ';  /* no bitmap usage(Center/Scale/Tile) */
  private static String execUnit    = "CALCULAT";
  private static String title       = "amaty";
  private static int _height        = 342;
  private static int _width         = 812;
  public int getPstepId() { return pStepId; }         
  @Override public Command[] getCommands() { return commands; } 
  
  public AMATY()
  {
    setCssClass("DFGUIWIN AMATY");
        setWindowClass(windowClass);
        setModality( modality );
        setWindowName(windowName);
        setHtmlFileName(htmlfileName);
        setBitmapName(_bitmapName);
        setBitmapUsage(_bitmapUsage);
        setExecUnit(execUnit);
        setTitle(title);
        setHeight(_height);
        setWidth(_width);
    
    // Control management is internal to the Control
    new ServletSingleLineTextField(calculat.CALCULAT.LoadModule.RCID_11F00013_ALLLLLLL,
                     0,
                     this,
                     "Field1",
                     UID_11F00013_ALLLLLLL,
                     true,                 "DFGUISLE Field1",
               "DFGUIPRM Field1LblSpan");
    new ServletSingleLineTextField(calculat.CALCULAT.LoadModule.RCID_11F00017_RESULT,
                     1,
                     this,
                     "Field3",
                     UID_11F00017_RESULT,
                     true,                 "DFGUISLE Field3",
               "DFGUIPRM Field3LblSpan");
    new ServletSingleLineEdit(calculat.CALCULAT.LoadModule.RCID_11F00015_TOTAL_REAL,
                     2,
                     this,
                     "Field2",
                     UID_11F00015_TOTAL_REAL,
                     "DFGUISLE Field2",
               "DFGUIPRM Field2LblSpan");
    new ServletCommandButton(calculat.CALCULAT.LoadModule.RCMD_1100000F_NO_COMMAND,
                      3,
                     this,
                      "Button3","DFGUIPSB Button3");
    new ServletCommandButton(calculat.CALCULAT.LoadModule.RCMD_1100000E_NO_COMMAND,
                      4,
                     this,
                      "Button4","DFGUIPSB Button4");
    new ServletCommandButton(calculat.CALCULAT.LoadModule.RCMD_11000012_NO_COMMAND,
                      5,
                     this,
                      "Button5","DFGUIPSB Button5");
    new ServletComboBox(calculat.CALCULAT.LoadModule.RCID_F700016_DROP_LIST1,
                 6,
                 this,
                 "DropDownList1",
                 PSB_F700016_DROP_LIST1,
                 WIED_F700016_DROP_LIST1,
                     "DFGUICMG DropDownList1",
               "DFGUIPRM DropDownList1LblSpan");
    new ServletCommandButton(calculat.CALCULAT.LoadModule.RCMD_1100001E_ENTER,
                      7,
                     this,
                      "Button14","DFGUIPSB Button14");
    new ServletCommandButton(calculat.CALCULAT.LoadModule.RCMD_11000011_NO_COMMAND,
                      8,
                     this,
                      "Button6","DFGUIPSB Button6");
    new ServletCommandButton(calculat.CALCULAT.LoadModule.RCMD_11000010_NO_COMMAND,
                      9,
                     this,
                      "Button7","DFGUIPSB Button7");
    new ServletCommandButton(calculat.CALCULAT.LoadModule.RCMD_11000014_NO_COMMAND,
                      10,
                     this,
                      "Button8","DFGUIPSB Button8");
    new ServletCommandButton(calculat.CALCULAT.LoadModule.RCMD_11000019_NO_COMMAND,
                      11,
                     this,
                      "Button9","DFGUIPSB Button9");
    new ServletCommandButton(calculat.CALCULAT.LoadModule.RCMD_1100001A_NO_COMMAND,
                      12,
                     this,
                      "Button10","DFGUIPSB Button10");
    new ServletCommandButton(calculat.CALCULAT.LoadModule.RCMD_1100001B_NO_COMMAND,
                      13,
                     this,
                      "Button11","DFGUIPSB Button11");
    new ServletCommandButton(calculat.CALCULAT.LoadModule.RCMD_1100001D_NO_COMMAND,
                      14,
                     this,
                      "Button12","DFGUIPSB Button12");
    new ServletCommandButton(calculat.CALCULAT.LoadModule.RCMD_1100000B_PLUS,
                      15,
                     this,
                      "plus","DFGUIPSB plus");
    new ServletCommandButton(calculat.CALCULAT.LoadModule.RCMD_1100001F_MINS,
                      16,
                     this,
                      "Button13","DFGUIPSB Button13");
    new ServletCommandButton(calculat.CALCULAT.LoadModule.RCMD_1100000D_RETURN,
                      17,
                     this,
                      "backamaty","DFGUIPSB backamaty");
    new ServletCommandButton(calculat.CALCULAT.LoadModule.RCMD_1100000C_NO_COMMAND,
                      18,
                     this,
                      "clear_amaty","DFGUIPSB clear_amaty");
    new ServletSingleLineEdit(calculat.CALCULAT.LoadModule.RCID_11F00008_TEXT1111,
                     19,
                     this,
                     "demo_text",
                     UID_11F00008_TEXT1111,
                     "DFGUISLE demo_text",
               "DFGUIPRM demo_textLblSpan");
    
    for (int i = 0; i < LiteralArray.length; i++) { 
         this.addObject(LiteralArray[i]); 
    } 
  }
  
  public final Object LiteralArray[] = {
  };
  
  @Override public final void in_windowmap(Window win, IImportView ia, IExportView oa)
  {
    // input windowmap function
    win_IN_12700001_AMATY(win,
          (calculat.EXPERT_IA)ia, (calculat.EXPERT_OA)oa);
  }
  
  @Override public final void out_windowmap(Window win, IExportView oa)
  {
    // output windowmap function
    win_OUT_12700001_AMATY(win,
          (calculat.EXPERT_OA)oa);
  }
  
  
  public void win_IN_12700001_AMATY(Window win, calculat.EXPERT_IA ia, calculat.EXPERT_OA oa)
  {
    // Copy all window views from the window
    // to the import view.  If the current
    // predicate view is in a repeating group
    // view and is a list box field, copy it
    // to the group view backing structure to
    // update the window list.  Copy all
    // procedure step export views to the 
    // import views. 
    
    int gv_X1 = 0;
    ia.InResultIefSuppliedResult = IntAttr.valueOf(((Control) getControlMap().get(new Integer(1))).getVPA());
    ia.InN1IefSuppliedTotalReal = DoubleAttr.valueOf(((Control) getControlMap().get(new Integer(2))).getVPA());
    ia.ImportAmatyListAmatyDropList1 = FixedStringAttr.valueOf(((Control) getControlMap().get(new Integer(6))).getVPA(), (short)1);
    ia.InDemoTextDemoText1111Text1111 = FixedStringAttr.valueOf(((Control) getControlMap().get(new Integer(19))).getVPA(), (short)
      100);
  }
  
  public void win_OUT_12700001_AMATY(Window win, calculat.EXPERT_OA oa)
  {
    // copy w-oa fields to window fields
    
    int gv_X1 = 0;
    ((Control) getControlMap().get(new Integer(0))).setVPA(FixedStringAttr.toString(oa.OutTitleAllCalculatNameAlllllll, (short)200),
      oa.OutTitleAllCalculatNameAlllllll_AT);
    ((Control) getControlMap().get(new Integer(1))).setVPA(IntAttr.toString(oa.OutResultIefSuppliedResult),
      oa.OutResultIefSuppliedResult_AT);
    ((Control) getControlMap().get(new Integer(2))).setVPA(DoubleAttr.toString(oa.OutN1IefSuppliedTotalReal),
      oa.OutN1IefSuppliedTotalReal_AT);
    ((Control) getControlMap().get(new Integer(6))).setVPA(FixedStringAttr.toString(oa.ExportAmatyAmatyDropList1, (short)1),
      oa.ExportAmatyAmatyDropList1_AT);
    ((Control) getControlMap().get(new Integer(19))).setVPA(FixedStringAttr.toString(oa.OutDemoTextDemoText1111Text1111, (short)100),
      oa.OutDemoTextDemoText1111Text1111_AT);
  }
  
} // end of AMATY class 
