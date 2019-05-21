package com.epam.utils.utils;

import java.io.IOException;

public class CatUtils extends BaseUtils {

    private String choiceOf, pathToFile;

    public void setChoiceOfCommand() {
        do {
            System.out.println("Selection of available flags or commands \n" +
                    "\t  Usage: cat [OPTION]... [FILE]...\n" +
                    "\t    Concatenate FILE(s) to standard output.\n" +
                    " 1  cat  fileName  - \tOutput file \n" +
                    " 2  cat -A fileName  - \ttOutput file ,equivalent to -vET  \n");

            System.out.println("exit -  \tfor stop execution in this section");
            System.out.println("Enter number of command");

           choiceOf=utils.scanOption();

            switch (choiceOf) {

                case "1":
                    System.out.println("Enter path to file  ");
                    pathToFile = utils.scanOption();
                    try {
                        utils.fileReader(pathToFile);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "2":
                    System.out.println("Enter full path to folder  ");
                    pathToFile = utils.scanOption();
                    try {
                        utils.fileReader(pathToFile);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }

        } while (!choiceOf.equals("exit"));
        System.out.println("You return to main menu");
    }


}
