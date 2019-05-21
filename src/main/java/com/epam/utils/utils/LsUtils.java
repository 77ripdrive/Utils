package com.epam.utils.utils;

public class LsUtils extends BaseUtils{

    public void selectMenuItem() {
        do {
            System.out.println("Select a number with command from the menu\n" +
                    "\t   Usage: ls [OPTION]... [FILE]...\n" +
                    "\t    List information about the FILEs (the current directory by default).\n" +
                    " 1   ls name  - \tList information about the FILEs \n" +
                    "     exit -  \tfor stop execution in this section");

            System.out.println("Enter number of command");

            choiceOf = reader.scanOption();

            switch (choiceOf) {

                case "1":
                    System.out.println("Enter the directory name" );
                    String name = reader.scanOption();
                    utils.infoDir(name);
                    break;
            }
        } while (!choiceOf.equals("exit"));
        System.out.println("You return to main menu");
    }
}
