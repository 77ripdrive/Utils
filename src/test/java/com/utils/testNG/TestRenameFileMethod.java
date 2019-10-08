package com.utils.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRenameFileMethod extends CommonCondition {

    private String pathToFile ="D:\\Utils\\src\\main\\java\\com\\epam\\utils\\sandBox\\ex1.txt";
    private String pathToNewFile ="D:\\Utils\\src\\main\\java\\com\\epam\\utils\\sandBox\\ex2.txt";

    @Test
    public void testIsFileRenamed(){
        boolean actualValue=utils.renameFile(pathToFile,pathToNewFile);
        Assert.assertTrue(actualValue);
    }
}
