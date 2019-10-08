package com.utils.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForCurrentPathMetod extends CommonCondition{

   private String expectedPathValue="D:\\Utils";

    @Test
    public void testIsCurrentPathMetod(){
        expectedValueSrting=utils.currentPath();
        expectedValue=expectedValueSrting.contains(expectedPathValue);
        Assert.assertTrue(expectedValue);
    }
}
