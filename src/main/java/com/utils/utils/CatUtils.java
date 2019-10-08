package com.utils.utils;

import java.io.IOException;

public class CatUtils extends BaseUtils {

    public void selectMenuItem() {
        String  pathToFile;
        do {
            System.out.println("Select a number with command from the menu \n" +
                    "\t  Usage: cat [OPTION]... [FILE]...\n" +
                    "\t    Concatenate FILE(s) to standard output.\n" +
                    " 1  \tcat  fileName  - \tOutput file \n" +
                    " 2  \tcat -A fileName  - \ttOutput file ,equivalent to -vET  \n");

            System.out.println("exit -  \tfor stop execution in this section");
            System.out.println("Enter number of command");

           choiceOf = reader.scanOption();

            switch (choiceOf) {
                case "1":
                    System.out.println("Enter path to file  ");
                    pathToFile = reader.scanOption();
                    try {
                        utils.fileReader(pathToFile);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "2":
                    System.out.println("Enter full path to folder  ");
                    pathToFile = reader.scanOption();
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
