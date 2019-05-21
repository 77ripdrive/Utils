package com.epam.utils.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class TestCreateFolderMethod extends CommonCondition {

    @Test
    public void testIsFileCreated()  {
        realValueString =utils.createFolder(New_DIR_NAME);
        Assert.assertEquals(realValueString,"Folder has been created");
        new File(New_DIR_NAME).delete();
    }
}
