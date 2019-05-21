package com.epam.utils.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestForCurrentPathMetod extends CommonCondition{


    @Test
    public void testIsCurrentPathMetod() throws IOException {
        realValueString=utils.currentPath();
        expectedValueSrting=new File( "." ).getCanonicalPath();
        Assert.assertEquals(realValueString,expectedValueSrting);
    }
}
