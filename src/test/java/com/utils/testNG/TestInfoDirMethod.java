package com.utils.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInfoDirMethod extends CommonCondition {

    private String pathToNewFolder ="D:\\Utils\\src\\main\\java\\com\\epam\\utils\\sandBox";
    private boolean expectedValue;

    @Test
    public void testInfoDirMethodWithFolder(){
         expectedValue=utils.infoDir(pathToNewFolder);
        Assert.assertTrue(expectedValue);
    }
}
