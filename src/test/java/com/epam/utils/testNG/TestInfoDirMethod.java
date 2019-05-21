package com.epam.utils.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInfoDirMethod extends CommonCondition {


    private boolean expectedValue;

    @Test
    public void testInfoDirMethodWithFolder(){
         expectedValue=utils.infoDir(DIR_NAME);
        Assert.assertTrue(expectedValue);
    }
}
