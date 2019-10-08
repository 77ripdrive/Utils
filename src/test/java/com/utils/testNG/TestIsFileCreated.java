package com.utils.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIsFileCreated extends CommonCondition {

    private String pathToNewFile ="com/epam/utils/sandBox/ex1.txt";

    @Test
    public void testIsFileCreated(){
        expectedValue=utils.createFile(pathToNewFile);
        Assert.assertTrue(expectedValue);
    }
}
