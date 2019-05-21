package com.epam.utils.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestRenameFileMethod extends CommonCondition {

    @Test
    public void testIsFileRenamed() throws IOException {
        new File(OLD_Path_To_File).createNewFile();
        boolean actualValue=utils.renameExistingFile(DIR_NAME,OLD_FILENAME,NEW_FILENAME);
        Assert.assertTrue(actualValue);
        new File(New_Path_To_File).delete();

    }
}
