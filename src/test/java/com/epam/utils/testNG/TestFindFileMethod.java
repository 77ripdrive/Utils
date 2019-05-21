package com.epam.utils.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;


public class TestFindFileMethod extends CommonCondition {


    private String dataForSerch="src";
    private String fileName="Help.txt";

    @Test
    public void testIsFileFind(){
        String realPath=utils.findFile(fileName,new File(dataForSerch));
        System.out.println(realPath);
        Assert.assertEquals(realPath,"Directory");
    }
}
