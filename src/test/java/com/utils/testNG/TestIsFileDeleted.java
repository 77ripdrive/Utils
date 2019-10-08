package com.utils.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIsFileDeleted extends CommonCondition {

    private String pathToNewFile ="D:\\Utils\\src\\main\\java\\com\\epam\\utils\\sandBox\\ex1.txt";

    @Test
    public void testIsFileDeleted(){
       boolean actualValue=utils.deleteFile(pathToNewFile);
        Assert.assertFalse(actualValue);
    }
}
