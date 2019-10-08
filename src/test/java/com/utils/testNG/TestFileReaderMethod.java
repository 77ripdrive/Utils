package com.utils.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.*;

public class TestFileReaderMethod extends CommonCondition {

    private String expectedValueSrting="Usage: touch [OPTION]... FILE...";
    private List<String> realValuelist,expectedValuelist;

    @Test
    public void testIsCurrentStringIsSameFromFileReaderMethod(){
        expectedValuelist=new ArrayList<>();
        expectedValuelist.add(expectedValueSrting);
        try {
            realValuelist=utils.fileReader(Path_To_File_Help);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(expectedValuelist,realValuelist);
    }
}
