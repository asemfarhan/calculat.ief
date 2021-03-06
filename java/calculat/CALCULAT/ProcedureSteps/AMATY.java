package calculat.CALCULAT.ProcedureSteps;

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

import com.ca.gen.csu.exception.*;

public class AMATY extends ServletProcedureStep
{
  private static Boolean isFirstProcedureStep = Boolean.FALSE;
  private static String clearScreenTranCode = "AMATY1";
  private static List supportedNames = new ArrayList();
  private static List sAvailableWindows = new ArrayList();
  
  static {
    sAvailableWindows.add("AMATY");
  }
  
  public static List getAvailableWindows() { 
      return sAvailableWindows; 
  } 
  
  @Override public void initAvailableWindows()
  {
      availableWindows.addAll(sAvailableWindows); 
  }
  
  static {
    supportedNames.add("AMATY");
    supportedNames.add("AMATY");
  }
  
  public static List getSupportedNames()
  {
    return(supportedNames);
  }
  
  public static String getClearScreenTranCode()
  {
    return(clearScreenTranCode);
  }
  
  @Override public final void initProximity()
  {
    proximity = DialogFlowDefinition.INTERNAL;
  }
  
  public final int getProximity()
  {
     return DialogFlowDefinition.INTERNAL;
  }
  
  public static Boolean isFirstProcedureStep()
  	throws CSUException
  {
    return(Boolean.FALSE);
  }
  
  @Override public final String getName()
  {
    return("AMATY");
  }
  
  @Override protected final void initName()
  {
    name = "AMATY";
  }
  
  @Override public final String getActionBlockName()
  {
    return("calculat.EXPERT");
  }
  
  @Override public final void initActionBlockName()
  {
    actionBlockName = "calculat.EXPERT";
  }
  
  @Override protected final void initImportView()
  {
    importView = new calculat.EXPERT_IA();
  }
  
  public final IImportView getNewImportView()
  {
    return(new calculat.EXPERT_IA());
  }
  
  @Override protected final void initExportView()
  {
    exportView = new calculat.EXPERT_OA();
  }
  
  public final IExportView getNewExportView()
  {
    return(new calculat.EXPERT_OA());
  }
  
  @Override protected final String getFlowDefinitionsClassName(String lowerDialectNameDot)
  {
    return("calculat."+lowerDialectNameDot+"CALCULAT.FlowTables.AMATY");
  }
  
  @Override public final void inout_viewmap(IImportView ia, IExportView oa)
  {
    // Input to output View Mapping function
    INOUT_3C00000_AMATY((calculat.EXPERT_IA)ia,
          (calculat.EXPERT_OA)oa);
  }
  
  @Override public final void outin_viewmap(IImportView ia, IExportView oa)
  {
    // Output to input View Mapping function
    OUTIN_3C00000_AMATY((calculat.EXPERT_IA)ia,
          (calculat.EXPERT_OA)oa);
  }
  
  
  public final static void INOUT_3C00000_AMATY(calculat.EXPERT_IA ia, calculat.EXPERT_OA oa)
  {
    // copy mapped fields from w-ia to w-oa for display 1st
    // dialog flows either display 1st flows on or display 1st
    // returns on
    
    oa.ExportAmatyAmatyDropList1 = FixedStringAttr.valueOf(ia.ImportAmatyListAmatyDropList1, (short)1);
    oa.OutDemoTextDemoText1111Text1111 = FixedStringAttr.valueOf(ia.InDemoTextDemoText1111Text1111, (short)100);
    oa.OutResultIefSuppliedResult = IntAttr.valueOf(ia.InResultIefSuppliedResult);
    oa.OutN1IefSuppliedTotalReal = DoubleAttr.valueOf(ia.InN1IefSuppliedTotalReal);
  }
  
  public final static void OUTIN_3C00000_AMATY(calculat.EXPERT_IA ia, calculat.EXPERT_OA oa)
  {
    // copy mapped fields from w-oa to w-ia.  Called by
    // win_in & dlg_in functions to populate import view
    // before accepting window's fields
    
    ia.ImportAmatyListAmatyDropList1 = FixedStringAttr.valueOf(oa.ExportAmatyAmatyDropList1, (short)1);
    ia.InDemoTextDemoText1111Text1111 = FixedStringAttr.valueOf(oa.OutDemoTextDemoText1111Text1111, (short)100);
    ia.InResultIefSuppliedResult = IntAttr.valueOf(oa.OutResultIefSuppliedResult);
    ia.InN1IefSuppliedTotalReal = DoubleAttr.valueOf(oa.OutN1IefSuppliedTotalReal);
  }
}
