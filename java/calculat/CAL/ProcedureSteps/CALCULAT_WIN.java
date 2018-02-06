package calculat.CAL.ProcedureSteps;

// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
//
//             Servlet Manager Source Code Generated by
//                            CA Gen 8.6
//
//     Copyright (c) 2016 CA Technologies. All rights reserved.
//
//    Model Name:  CALCULAT
//
//    Load Mod:    CAL                       Date: 16/11/25
//    Target OS:   JVM                       Time: 02:44:24
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

public class CALCULAT_WIN extends ServletProcedureStep
{
  private static Boolean isFirstProcedureStep = Boolean.FALSE;
  private static String clearScreenTranCode = "CALCULAT";
  private static List supportedNames = new ArrayList();
  private static List sAvailableWindows = new ArrayList();
  
  static {
    sAvailableWindows.add("CALCULAT_WIN");
  }
  
  public static List getAvailableWindows() { 
      return sAvailableWindows; 
  } 
  
  @Override public void initAvailableWindows()
  {
      availableWindows.addAll(sAvailableWindows); 
  }
  
  static {
    supportedNames.add("CALCULAT_WIN");
    supportedNames.add("CALCULAT_WIN");
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
    return("CALCULAT_WIN");
  }
  
  @Override protected final void initName()
  {
    name = "CALCULAT_WIN";
  }
  
  @Override public final String getActionBlockName()
  {
    return("calculat.HOME");
  }
  
  @Override public final void initActionBlockName()
  {
    actionBlockName = "calculat.HOME";
  }
  
  @Override protected final void initImportView()
  {
    importView = new calculat.HOME_IA();
  }
  
  public final IImportView getNewImportView()
  {
    return(new calculat.HOME_IA());
  }
  
  @Override protected final void initExportView()
  {
    exportView = new calculat.HOME_OA();
  }
  
  public final IExportView getNewExportView()
  {
    return(new calculat.HOME_OA());
  }
  
  @Override protected final String getFlowDefinitionsClassName(String lowerDialectNameDot)
  {
    return("calculat."+lowerDialectNameDot+"CAL.FlowTables.CALCULAT_WIN");
  }
  
  @Override public final void inout_viewmap(IImportView ia, IExportView oa)
  {
    // Input to output View Mapping function
    INOUT_3C00001_CALCULAT_WIN((calculat.HOME_IA)ia,
          (calculat.HOME_OA)oa);
  }
  
  @Override public final void outin_viewmap(IImportView ia, IExportView oa)
  {
    // Output to input View Mapping function
    OUTIN_3C00001_CALCULAT_WIN((calculat.HOME_IA)ia,
          (calculat.HOME_OA)oa);
  }
  
  
  public final static void INOUT_3C00001_CALCULAT_WIN(calculat.HOME_IA ia, calculat.HOME_OA oa)
  {
    // copy mapped fields from w-ia to w-oa for display 1st
    // dialog flows either display 1st flows on or display 1st
    // returns on
    
    oa.ExportResultIefSuppliedResult = DoubleAttr.valueOf(ia.ImportResultIefSuppliedResult);
    oa.ExportN1IefSuppliedNumber1st = DoubleAttr.valueOf(ia.ImportN1IefSuppliedNumber1st);
    oa.ExportN2ndIefSuppliedNumber2 = DoubleAttr.valueOf(ia.ImportN2ndIefSuppliedNumber2);
  }
  
  public final static void OUTIN_3C00001_CALCULAT_WIN(calculat.HOME_IA ia, calculat.HOME_OA oa)
  {
    // copy mapped fields from w-oa to w-ia.  Called by
    // win_in & dlg_in functions to populate import view
    // before accepting window's fields
    
    ia.ImportResultIefSuppliedResult = DoubleAttr.valueOf(oa.ExportResultIefSuppliedResult);
    ia.ImportN1IefSuppliedNumber1st = DoubleAttr.valueOf(oa.ExportN1IefSuppliedNumber1st);
    ia.ImportN2ndIefSuppliedNumber2 = DoubleAttr.valueOf(oa.ExportN2ndIefSuppliedNumber2);
  }
}