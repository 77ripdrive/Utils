package com.epam.utils.utils;

public class RmUtils extends BaseUtils {

   private String pathToFile,pathToFolder;

    public void selectMenuItem() {
        do {
            System.out.println("Select a number with command from the menu \n" +
                    "\t  Usage: rm [OPTION]... [FILE]...- Flag  \n"+
                    " 1   \trm  myfile  - \tRemove 'myfile'  \n"+
                    " 2   \trm -d, --dir      \tRemove empty directories \n "+
                    "   exit -  \tfor stop execution in this section");

            choiceOf = reader.scanOption();

            switch ( choiceOf ){
                case "1":
                    System.out.println("Enter path to file  ");
                    pathToFile = reader.scanOption();
                   utils.deleteFile(pathToFile);
                   break;
                case "2":
                    System.out.println("Enter path to folder  ");
                    pathToFolder = reader.scanOption();
                   utils.deleteFile(pathToFolder);
                   break;
            }
        } while (!choiceOf.equals("exit"));
        System.out.println("You return to main menu");
    }
}
