package com.epam.utils.testNG;

import com.epam.utils.utils.Utils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CommonCondition {

  protected   Utils utils;
  protected boolean expectedBooluneValue;
  protected String expectedValueSrting,realValueString;
  protected static final String OLD_Path_To_File="src\\main\\java\\com\\epam\\utils\\sandBox\\neFile.txt";
  protected static final String DIR_NAME = "src\\main\\java\\com\\epam\\utils\\sandBox";
  protected static final String New_DIR_NAME = "src\\main\\java\\com\\epam\\utils\\sandBox1";
  protected static final String OLD_FILENAME = "neFile.txt";
  protected static final String NEW_FILENAME = "newFile.txt";
  protected static final String New_Path_To_File="src\\main\\java\\com\\epam\\utils\\sandBox\\newFile.txt";
  protected static final String Path_To_File_Help="src\\main\\java\\com\\epam\\utils\\sandBox\\Help.txt";

    @BeforeClass(alwaysRun = true)
    public  void setUp(){
        utils=new Utils();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){utils=null;
    }
}
