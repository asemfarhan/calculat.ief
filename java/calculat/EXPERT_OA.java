package calculat;
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
//
//                    Source Code Generated by
//                           CA Gen 8.6
//
//    Copyright (c) 2017 CA Technologies. All rights reserved.
//
//    Name: EXPERT_OA                        Date: 2017/04/09
//    User: mansour                          Time: 22:59:14
//
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
// Import Statements
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;
import java.sql.*;
import com.ca.gen.vwrt.*;
import com.ca.gen.vwrt.types.*;
import com.ca.gen.vwrt.vdf.*;
import com.ca.gen.csu.exception.*;

// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
// START OF EXPORT VIEW
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
/**
 * Internal data view storage for: EXPERT_OA
 **/
public class EXPERT_OA extends ViewBase implements IExportView, Serializable
{
  static VDF localVdf = null;
  
  // Entity View: EXPORT_AMATY
  //        Type: AMATY
  /**
   * Attribute missing flag for: ExportAmatyAmatyDropList1
   **/
  public char ExportAmatyAmatyDropList1_AS;
  /**
   * Dynamic attribute for: ExportAmatyAmatyDropList1
   **/
  public DynamicAttr ExportAmatyAmatyDropList1_AT;
  /**
   * Attribute for: ExportAmatyAmatyDropList1
   * Domain: Text
   * Length: 1
   * Varying Length: N
   **/
  public String ExportAmatyAmatyDropList1;
  // Entity View: OUT_DEMO_TEXT
  //        Type: DEMO_TEXT_1111
  /**
   * Attribute missing flag for: OutDemoTextDemoText1111Text1111
   **/
  public char OutDemoTextDemoText1111Text1111_AS;
  /**
   * Dynamic attribute for: OutDemoTextDemoText1111Text1111
   **/
  public DynamicAttr OutDemoTextDemoText1111Text1111_AT;
  /**
   * Attribute for: OutDemoTextDemoText1111Text1111
   * Domain: Text
   * Length: 100
   * Varying Length: N
   **/
  public String OutDemoTextDemoText1111Text1111;
  // Entity View: OUT_RESULT
  //        Type: IEF_SUPPLIED
  /**
   * Attribute missing flag for: OutResultIefSuppliedResult
   **/
  public char OutResultIefSuppliedResult_AS;
  /**
   * Dynamic attribute for: OutResultIefSuppliedResult
   **/
  public DynamicAttr OutResultIefSuppliedResult_AT;
  /**
   * Attribute for: OutResultIefSuppliedResult
   * Domain: Number
   * Length: 8
   * Decimal Places: 0
   * Decimal Precision: N
   **/
  public int OutResultIefSuppliedResult;
  // Entity View: OUT_N1
  //        Type: IEF_SUPPLIED
  /**
   * Attribute missing flag for: OutN1IefSuppliedTotalReal
   **/
  public char OutN1IefSuppliedTotalReal_AS;
  /**
   * Dynamic attribute for: OutN1IefSuppliedTotalReal
   **/
  public DynamicAttr OutN1IefSuppliedTotalReal_AT;
  /**
   * Attribute for: OutN1IefSuppliedTotalReal
   * Domain: Number
   * Length: 17
   * Decimal Places: 0
   * Decimal Precision: N
   **/
  public double OutN1IefSuppliedTotalReal;
  // Entity View: OUT_TITLE_ALL
  //        Type: CALCULAT_NAME
  /**
   * Attribute missing flag for: OutTitleAllCalculatNameAlllllll
   **/
  public char OutTitleAllCalculatNameAlllllll_AS;
  /**
   * Dynamic attribute for: OutTitleAllCalculatNameAlllllll
   **/
  public DynamicAttr OutTitleAllCalculatNameAlllllll_AT;
  /**
   * Attribute for: OutTitleAllCalculatNameAlllllll
   * Domain: Text
   * Length: 200
   * Varying Length: N
   **/
  public String OutTitleAllCalculatNameAlllllll;
  /**
   * Default Constructor
   **/
  
  public EXPERT_OA()
  {
    reset();
  }
  /**
   * Copy Constructor
   **/
  
  public EXPERT_OA(EXPERT_OA orig)
  {
    copyFrom(orig);
  }
  /**
   * Static instance creator function
   **/
  
  public static EXPERT_OA getInstance()
  {
    return new EXPERT_OA();
  }
  /**
   * Static free instance method
   **/
  
  public void freeInstance()
  {
  }
  /**
   * clone constructor
   **/
  
  @Override public Object clone()
  	throws CloneNotSupportedException
  {
    return(new EXPERT_OA(this));
  }
  /**
   * Resets all properties to the defaults.
   **/
  
  public void reset()
  {
    ExportAmatyAmatyDropList1_AT = null;
    ExportAmatyAmatyDropList1_AS = ' ';
    ExportAmatyAmatyDropList1 = " ";
    OutDemoTextDemoText1111Text1111_AT = null;
    OutDemoTextDemoText1111Text1111_AS = ' ';
    OutDemoTextDemoText1111Text1111 = 
      "                                                                                                    ";
    OutResultIefSuppliedResult_AT = null;
    OutResultIefSuppliedResult_AS = ' ';
    OutResultIefSuppliedResult = 0;
    OutN1IefSuppliedTotalReal_AT = null;
    OutN1IefSuppliedTotalReal_AS = ' ';
    OutN1IefSuppliedTotalReal = 0.0;
    OutTitleAllCalculatNameAlllllll_AT = null;
    OutTitleAllCalculatNameAlllllll_AS = ' ';
    OutTitleAllCalculatNameAlllllll = 
"                                                                                                                                                                                                        "
      ;
  }
  /**
   * Gets the VDF array for the instance, initialized.
   **/
  
  public static VDF getViewDefinition()
  {
    if ( localVdf == null )
    {
      VDFEntry [] vdfEntries = {
        new VDFEntry((int)1, "", "ExportAmatyAmaty", "Amaty", "DropList1", VDFEntry.TYPE_STRING, (short)1, (short)0, 1, (short)0, 
          null), 
        new VDFEntry((int)2, "", "OutDemoTextDemoText1111", "DemoText1111", "Text1111", VDFEntry.TYPE_STRING, (short)1, (short)0, 
          100, (short)0, null), 
        new VDFEntry((int)3, "", "OutResultIefSupplied", "IefSupplied", "Result", VDFEntry.TYPE_INT, (short)1, (short)0, 8, (short)0,
           null), 
        new VDFEntry((int)4, "", "OutN1IefSupplied", "IefSupplied", "TotalReal", VDFEntry.TYPE_DOUBLE, (short)1, (short)0, 17, (
          short)0, null), 
        new VDFEntry((int)5, "", "OutTitleAllCalculatName", "CalculatName", "Alllllll", VDFEntry.TYPE_STRING, (short)1, (short)0, 
          200, (short)0, null), 
      };
      localVdf = new VDF(vdfEntries);
    }
    try {
      VDF result = (VDF)localVdf.clone();
      result.initViewData();
      return result;
    } catch( CloneNotSupportedException e ) {
      return null;
    }
  }
  
  /**
   * Sets the current state of the instance to the VDF version.
   **/
  public void setFromVDF(VDF vdf)
  {
    // predicate view item
    if ( vdf.getEntries()[0].getDataValue().getObject() != null )
    {
      ExportAmatyAmatyDropList1 = ((String)vdf.getEntries()[0].getDataValue().getObject());
    }
    else 
    {
      ExportAmatyAmatyDropList1 = " ";
    }
    // predicate view item
    if ( vdf.getEntries()[1].getDataValue().getObject() != null )
    {
      OutDemoTextDemoText1111Text1111 = ((String)vdf.getEntries()[1].getDataValue().getObject());
    }
    else 
    {
      OutDemoTextDemoText1111Text1111 = 
        "                                                                                                    ";
    }
    // predicate view item
    if ( vdf.getEntries()[2].getDataValue().getObject() != null )
    {
      OutResultIefSuppliedResult = ((Integer)vdf.getEntries()[2].getDataValue().getObject()).intValue();
    }
    else 
    {
      OutResultIefSuppliedResult = 0;
    }
    // predicate view item
    if ( vdf.getEntries()[3].getDataValue().getObject() != null )
    {
      OutN1IefSuppliedTotalReal = ((Double)vdf.getEntries()[3].getDataValue().getObject()).doubleValue();
    }
    else 
    {
      OutN1IefSuppliedTotalReal = 0.0;
    }
    // predicate view item
    if ( vdf.getEntries()[4].getDataValue().getObject() != null )
    {
      OutTitleAllCalculatNameAlllllll = ((String)vdf.getEntries()[4].getDataValue().getObject());
    }
    else 
    {
      OutTitleAllCalculatNameAlllllll = 
"                                                                                                                                                                                                        "
        ;
    }
  }
  
  /**
   * Gets the VDF version of the current state of the instance.
   **/
  public VDF getVDF()
  {
    VDF vdf = getViewDefinition();
    // predicate view item
    vdf.getEntries()[0].getDataValue().setObject(ExportAmatyAmatyDropList1);
    // predicate view item
    vdf.getEntries()[1].getDataValue().setObject(OutDemoTextDemoText1111Text1111);
    // predicate view item
    vdf.getEntries()[2].getDataValue().setObject(new Integer(OutResultIefSuppliedResult));
    // predicate view item
    vdf.getEntries()[3].getDataValue().setObject(new Double(OutN1IefSuppliedTotalReal));
    // predicate view item
    vdf.getEntries()[4].getDataValue().setObject(OutTitleAllCalculatNameAlllllll);
    return(vdf);
  }
  
  /**
   * Sets the current instance based on the passed view.
   **/
  public void copyFrom(IExportView orig)
  {
    this.copyFrom((EXPERT_OA) orig);
  }
  
  /**
   * Sets the current instance based on the passed view.
   **/
  public void copyFrom(EXPERT_OA orig)
  {
    ExportAmatyAmatyDropList1_AT = orig.ExportAmatyAmatyDropList1_AT;
    ExportAmatyAmatyDropList1_AS = orig.ExportAmatyAmatyDropList1_AS;
    ExportAmatyAmatyDropList1 = orig.ExportAmatyAmatyDropList1;
    OutDemoTextDemoText1111Text1111_AT = orig.OutDemoTextDemoText1111Text1111_AT;
    OutDemoTextDemoText1111Text1111_AS = orig.OutDemoTextDemoText1111Text1111_AS;
    OutDemoTextDemoText1111Text1111 = orig.OutDemoTextDemoText1111Text1111;
    OutResultIefSuppliedResult_AT = orig.OutResultIefSuppliedResult_AT;
    OutResultIefSuppliedResult_AS = orig.OutResultIefSuppliedResult_AS;
    OutResultIefSuppliedResult = orig.OutResultIefSuppliedResult;
    OutN1IefSuppliedTotalReal_AT = orig.OutN1IefSuppliedTotalReal_AT;
    OutN1IefSuppliedTotalReal_AS = orig.OutN1IefSuppliedTotalReal_AS;
    OutN1IefSuppliedTotalReal = orig.OutN1IefSuppliedTotalReal;
    OutTitleAllCalculatNameAlllllll_AT = orig.OutTitleAllCalculatNameAlllllll_AT;
    OutTitleAllCalculatNameAlllllll_AS = orig.OutTitleAllCalculatNameAlllllll_AS;
    OutTitleAllCalculatNameAlllllll = orig.OutTitleAllCalculatNameAlllllll;
  }
}