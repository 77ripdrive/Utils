package com.utils.utils;

public class RmUtils extends BaseUtils {

   private String choiceOf,pathToFile,pathToFolder;

    public void setChoiceOfCommand(){
        do {
            System.out.println("Selection of available flags or commands \n" +
                    "\t  Usage: rm [OPTION]... [FILE]...- Flag  \n"+
                    " 1 - rm  myfile  - \tRemove 'myfile'  \n"+
                    " 2 - -d, --dir      \tRemove empty directories \n "+
                    "   exit -  \tfor stop execution in this section");



            choiceOf=utils.scanOption();
            switch (choiceOf){

                case "1":
                    System.out.println("Enter path to file  ");
                    pathToFile=utils.scanOption();
                   utils.deleteFile(pathToFile);
                   break;
                case "2":
                    System.out.println("Enter path to folder  ");
                    pathToFolder=utils.scanOption();
                   utils.deleteFile(pathToFolder);
                   break;
            }

        } while (!choiceOf.equals("exit"));
        System.out.println("You return to main menu");
    }


}
