package com.utils.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;


public class TestIsFileCreated extends CommonCondition {

    @Test
    public void testIsFileCreated()  {
        expectedBooluneValue =utils.createFile(OLD_Path_To_File);
        Assert.assertTrue(expectedBooluneValue);
        new File(OLD_Path_To_File).delete();
    }
}
