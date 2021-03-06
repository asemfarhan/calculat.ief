package calculat;
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
//
//                    Source Code Generated by
//                           CA Gen 8.6
//
//    Copyright (c) 2017 CA Technologies. All rights reserved.
//
//    Name: HOME_IA                          Date: 2017/04/09
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
// START OF IMPORT VIEW
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
/**
 * Internal data view storage for: HOME_IA
 **/
public class HOME_IA extends ViewBase implements IImportView, Serializable
{
  static VDF localVdf = null;
  
  // Entity View: IMPORT_RESULT
  //        Type: IEF_SUPPLIED
  /**
   * Attribute missing flag for: ImportResultIefSuppliedResult
   **/
  public char ImportResultIefSuppliedResult_AS;
  /**
   * Attribute for: ImportResultIefSuppliedResult
   * Domain: Number
   * Length: 8
   * Decimal Places: 0
   * Decimal Precision: N
   **/
  public int ImportResultIefSuppliedResult;
  // Entity View: IMPORT_N2ND
  //        Type: IEF_SUPPLIED
  /**
   * Attribute missing flag for: ImportN2ndIefSuppliedNumber2
   **/
  public char ImportN2ndIefSuppliedNumber2_AS;
  /**
   * Attribute for: ImportN2ndIefSuppliedNumber2
   * Domain: Number
   * Length: 5
   * Decimal Places: 0
   * Decimal Precision: N
   **/
  public int ImportN2ndIefSuppliedNumber2;
  // Entity View: IMPORT_N1
  //        Type: IEF_SUPPLIED
  /**
   * Attribute missing flag for: ImportN1IefSuppliedNumber1st
   **/
  public char ImportN1IefSuppliedNumber1st_AS;
  /**
   * Attribute for: ImportN1IefSuppliedNumber1st
   * Domain: Number
   * Length: 8
   * Decimal Places: 0
   * Decimal Precision: N
   **/
  public int ImportN1IefSuppliedNumber1st;
  /**
   * Default Constructor
   **/
  
  public HOME_IA()
  {
    reset();
  }
  /**
   * Copy Constructor
   **/
  
  public HOME_IA(HOME_IA orig)
  {
    copyFrom(orig);
  }
  /**
   * Static instance creator function
   **/
  
  public static HOME_IA getInstance()
  {
    return new HOME_IA();
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
    return(new HOME_IA(this));
  }
  /**
   * Resets all properties to the defaults.
   **/
  
  public void reset()
  {
    ImportResultIefSuppliedResult_AS = ' ';
    ImportResultIefSuppliedResult = 0;
    ImportN2ndIefSuppliedNumber2_AS = ' ';
    ImportN2ndIefSuppliedNumber2 = 0;
    ImportN1IefSuppliedNumber1st_AS = ' ';
    ImportN1IefSuppliedNumber1st = 0;
  }
  /**
   * Gets the VDF array for the instance, initialized.
   **/
  
  public static VDF getViewDefinition()
  {
    if ( localVdf == null )
    {
      VDFEntry [] vdfEntries = {
        new VDFEntry((int)1, "", "ImportResultIefSupplied", "IefSupplied", "Result", VDFEntry.TYPE_INT, (short)1, (short)0, 8, (
          short)0, null), 
        new VDFEntry((int)2, "", "ImportN2ndIefSupplied", "IefSupplied", "Number2", VDFEntry.TYPE_INT, (short)1, (short)0, 8, (short)
          0, null), 
        new VDFEntry((int)3, "", "ImportN1IefSupplied", "IefSupplied", "Number1st", VDFEntry.TYPE_INT, (short)1, (short)0, 8, (short)
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
   * Gets the VDF version of the current state of the instance.
   **/
  public VDF getVDF()
  {
    VDF vdf = getViewDefinition();
    // predicate view item
    vdf.getEntries()[0].getDataValue().setObject(new Integer(ImportResultIefSuppliedResult));
    // predicate view item
    vdf.getEntries()[1].getDataValue().setObject(new Integer(ImportN2ndIefSuppliedNumber2));
    // predicate view item
    vdf.getEntries()[2].getDataValue().setObject(new Integer(ImportN1IefSuppliedNumber1st));
    return(vdf);
  }
  
  /**
   * Sets the current state of the instance to the VDF version.
   **/
  public void setFromVDF(VDF vdf)
  {
    // predicate view item
    if ( vdf.getEntries()[0].getDataValue().getObject() != null )
    {
      ImportResultIefSuppliedResult = ((Integer)vdf.getEntries()[0].getDataValue().getObject()).intValue();
    }
    else 
    {
      ImportResultIefSuppliedResult = 0;
    }
    // predicate view item
    if ( vdf.getEntries()[1].getDataValue().getObject() != null )
    {
      ImportN2ndIefSuppliedNumber2 = ((Integer)vdf.getEntries()[1].getDataValue().getObject()).intValue();
    }
    else 
    {
      ImportN2ndIefSuppliedNumber2 = 0;
    }
    // predicate view item
    if ( vdf.getEntries()[2].getDataValue().getObject() != null )
    {
      ImportN1IefSuppliedNumber1st = ((Integer)vdf.getEntries()[2].getDataValue().getObject()).intValue();
    }
    else 
    {
      ImportN1IefSuppliedNumber1st = 0;
    }
  }
  
  /**
   * Sets the current instance based on the passed view.
   **/
  public void copyFrom(IImportView orig)
  {
    this.copyFrom((HOME_IA) orig);
  }
  
  /**
   * Sets the current instance based on the passed view.
   **/
  public void copyFrom(HOME_IA orig)
  {
    ImportResultIefSuppliedResult_AS = orig.ImportResultIefSuppliedResult_AS;
    ImportResultIefSuppliedResult = orig.ImportResultIefSuppliedResult;
    ImportN2ndIefSuppliedNumber2_AS = orig.ImportN2ndIefSuppliedNumber2_AS;
    ImportN2ndIefSuppliedNumber2 = orig.ImportN2ndIefSuppliedNumber2;
    ImportN1IefSuppliedNumber1st_AS = orig.ImportN1IefSuppliedNumber1st_AS;
    ImportN1IefSuppliedNumber1st = orig.ImportN1IefSuppliedNumber1st;
  }
}
