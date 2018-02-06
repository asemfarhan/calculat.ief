package calculat;
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
//
//                    Source Code Generated by
//                           CA Gen 8.6
//
//    Copyright (c) 2017 CA Technologies. All rights reserved.
//
//    Name: HOME_OA                          Date: 2017/04/09
//    User: mansour                          Time: 22:59:15
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
 * Internal data view storage for: HOME_OA
 **/
public class HOME_OA extends ViewBase implements IExportView, Serializable
{
  static VDF localVdf = null;
  
  // Entity View: IMPORT_AMATY_LIST
  //        Type: AMATY
  /**
   * Attribute missing flag for: ImportAmatyListAmatyDropList1
   **/
  public char ImportAmatyListAmatyDropList1_AS;
  /**
   * Dynamic attribute for: ImportAmatyListAmatyDropList1
   **/
  public DynamicAttr ImportAmatyListAmatyDropList1_AT;
  /**
   * Attribute for: ImportAmatyListAmatyDropList1
   * Domain: Text
   * Length: 1
   * Varying Length: N
   **/
  public String ImportAmatyListAmatyDropList1;
  // Entity View: EXPORT_RESULT
  //        Type: IEF_SUPPLIED
  /**
   * Attribute missing flag for: ExportResultIefSuppliedResult
   **/
  public char ExportResultIefSuppliedResult_AS;
  /**
   * Dynamic attribute for: ExportResultIefSuppliedResult
   **/
  public DynamicAttr ExportResultIefSuppliedResult_AT;
  /**
   * Attribute for: ExportResultIefSuppliedResult
   * Domain: Number
   * Length: 8
   * Decimal Places: 0
   * Decimal Precision: N
   **/
  public int ExportResultIefSuppliedResult;
  // Entity View: EXPORT_N2ND
  //        Type: IEF_SUPPLIED
  /**
   * Attribute missing flag for: ExportN2ndIefSuppliedNumber2
   **/
  public char ExportN2ndIefSuppliedNumber2_AS;
  /**
   * Dynamic attribute for: ExportN2ndIefSuppliedNumber2
   **/
  public DynamicAttr ExportN2ndIefSuppliedNumber2_AT;
  /**
   * Attribute for: ExportN2ndIefSuppliedNumber2
   * Domain: Number
   * Length: 5
   * Decimal Places: 0
   * Decimal Precision: N
   **/
  public int ExportN2ndIefSuppliedNumber2;
  // Entity View: EXPORT_N1
  //        Type: IEF_SUPPLIED
  /**
   * Attribute missing flag for: ExportN1IefSuppliedNumber1st
   **/
  public char ExportN1IefSuppliedNumber1st_AS;
  /**
   * Dynamic attribute for: ExportN1IefSuppliedNumber1st
   **/
  public DynamicAttr ExportN1IefSuppliedNumber1st_AT;
  /**
   * Attribute for: ExportN1IefSuppliedNumber1st
   * Domain: Number
   * Length: 8
   * Decimal Places: 0
   * Decimal Precision: N
   **/
  public int ExportN1IefSuppliedNumber1st;
  /**
   * Default Constructor
   **/
  
  public HOME_OA()
  {
    reset();
  }
  /**
   * Copy Constructor
   **/
  
  public HOME_OA(HOME_OA orig)
  {
    copyFrom(orig);
  }
  /**
   * Static instance creator function
   **/
  
  public static HOME_OA getInstance()
  {
    return new HOME_OA();
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
    return(new HOME_OA(this));
  }
  /**
   * Resets all properties to the defaults.
   **/
  
  public void reset()
  {
    ImportAmatyListAmatyDropList1_AT = null;
    ImportAmatyListAmatyDropList1_AS = ' ';
    ImportAmatyListAmatyDropList1 = " ";
    ExportResultIefSuppliedResult_AT = null;
    ExportResultIefSuppliedResult_AS = ' ';
    ExportResultIefSuppliedResult = 0;
    ExportN2ndIefSuppliedNumber2_AT = null;
    ExportN2ndIefSuppliedNumber2_AS = ' ';
    ExportN2ndIefSuppliedNumber2 = 0;
    ExportN1IefSuppliedNumber1st_AT = null;
    ExportN1IefSuppliedNumber1st_AS = ' ';
    ExportN1IefSuppliedNumber1st = 0;
  }
  /**
   * Gets the VDF array for the instance, initialized.
   **/
  
  public static VDF getViewDefinition()
  {
    if ( localVdf == null )
    {
      VDFEntry [] vdfEntries = {
        new VDFEntry((int)1, "", "ImportAmatyListAmaty", "Amaty", "DropList1", VDFEntry.TYPE_STRING, (short)1, (short)0, 1, (short)0,
           null), 
        new VDFEntry((int)2, "", "ExportResultIefSupplied", "IefSupplied", "Result", VDFEntry.TYPE_INT, (short)1, (short)0, 8, (
          short)0, null), 
        new VDFEntry((int)3, "", "ExportN2ndIefSupplied", "IefSupplied", "Number2", VDFEntry.TYPE_INT, (short)1, (short)0, 8, (short)
          0, null), 
        new VDFEntry((int)4, "", "ExportN1IefSupplied", "IefSupplied", "Number1st", VDFEntry.TYPE_INT, (short)1, (short)0, 8, (short)
          0, null), 
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
      ImportAmatyListAmatyDropList1 = ((String)vdf.getEntries()[0].getDataValue().getObject());
    }
    else 
    {
      ImportAmatyListAmatyDropList1 = " ";
    }
    // predicate view item
    if ( vdf.getEntries()[1].getDataValue().getObject() != null )
    {
      ExportResultIefSuppliedResult = ((Integer)vdf.getEntries()[1].getDataValue().getObject()).intValue();
    }
    else 
    {
      ExportResultIefSuppliedResult = 0;
    }
    // predicate view item
    if ( vdf.getEntries()[2].getDataValue().getObject() != null )
    {
      ExportN2ndIefSuppliedNumber2 = ((Integer)vdf.getEntries()[2].getDataValue().getObject()).intValue();
    }
    else 
    {
      ExportN2ndIefSuppliedNumber2 = 0;
    }
    // predicate view item
    if ( vdf.getEntries()[3].getDataValue().getObject() != null )
    {
      ExportN1IefSuppliedNumber1st = ((Integer)vdf.getEntries()[3].getDataValue().getObject()).intValue();
    }
    else 
    {
      ExportN1IefSuppliedNumber1st = 0;
    }
  }
  
  /**
   * Gets the VDF version of the current state of the instance.
   **/
  public VDF getVDF()
  {
    VDF vdf = getViewDefinition();
    // predicate view item
    vdf.getEntries()[0].getDataValue().setObject(ImportAmatyListAmatyDropList1);
    // predicate view item
    vdf.getEntries()[1].getDataValue().setObject(new Integer(ExportResultIefSuppliedResult));
    // predicate view item
    vdf.getEntries()[2].getDataValue().setObject(new Integer(ExportN2ndIefSuppliedNumber2));
    // predicate view item
    vdf.getEntries()[3].getDataValue().setObject(new Integer(ExportN1IefSuppliedNumber1st));
    return(vdf);
  }
  
  /**
   * Sets the current instance based on the passed view.
   **/
  public void copyFrom(IExportView orig)
  {
    this.copyFrom((HOME_OA) orig);
  }
  
  /**
   * Sets the current instance based on the passed view.
   **/
  public void copyFrom(HOME_OA orig)
  {
    ImportAmatyListAmatyDropList1_AT = orig.ImportAmatyListAmatyDropList1_AT;
    ImportAmatyListAmatyDropList1_AS = orig.ImportAmatyListAmatyDropList1_AS;
    ImportAmatyListAmatyDropList1 = orig.ImportAmatyListAmatyDropList1;
    ExportResultIefSuppliedResult_AT = orig.ExportResultIefSuppliedResult_AT;
    ExportResultIefSuppliedResult_AS = orig.ExportResultIefSuppliedResult_AS;
    ExportResultIefSuppliedResult = orig.ExportResultIefSuppliedResult;
    ExportN2ndIefSuppliedNumber2_AT = orig.ExportN2ndIefSuppliedNumber2_AT;
    ExportN2ndIefSuppliedNumber2_AS = orig.ExportN2ndIefSuppliedNumber2_AS;
    ExportN2ndIefSuppliedNumber2 = orig.ExportN2ndIefSuppliedNumber2;
    ExportN1IefSuppliedNumber1st_AT = orig.ExportN1IefSuppliedNumber1st_AT;
    ExportN1IefSuppliedNumber1st_AS = orig.ExportN1IefSuppliedNumber1st_AS;
    ExportN1IefSuppliedNumber1st = orig.ExportN1IefSuppliedNumber1st;
  }
}
