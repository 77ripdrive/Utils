package com.utils.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestIsFileDeleted extends CommonCondition {

    private static final String OLD_Path_To_File="src\\main\\java\\com\\epam\\utils\\sandBox\\neFile.txt";

    @Test
    public void testIsFileDeleted() throws IOException {
        new File(OLD_Path_To_File).createNewFile();
       boolean actualValue=utils.deleteFile(OLD_Path_To_File);
        Assert.assertTrue(actualValue);
    }
}
