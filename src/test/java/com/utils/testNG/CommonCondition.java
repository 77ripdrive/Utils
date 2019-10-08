package com.utils.testNG;

import com.utils.utils.Utils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CommonCondition {

  protected Utils utils;
  protected boolean expectedValue;
  protected String expectedValueSrting;

    @BeforeClass(alwaysRun = true)
    public  void setUp(){
        utils=new Utils();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){utils=null;
    }
}
