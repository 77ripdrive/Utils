package com.utils.utils;

public class TouchUtils extends BaseUtils{

    public void selectMenuItem() {
        do {
            System.out.println("Select an item from the menu \n" +
                    "\t   Usage: touch [OPTION]... FILE...\n" +
                    "\t    Update the access and modification times of each FILE to the current time.\n" +
                    " 1   touch  fileName  - \tCreate file \n" +
                    "     exit -  \tfor stop execution in this section");

            System.out.println("Enter number of command");

            choiceOf = reader.scanOption();

            switch (choiceOf) {
                case "1":
                    System.out.println("Enter the full file name" );
                    String name = reader.scanOption();
                    utils.createFile(name);
                    break;
            }
        } while (!choiceOf.equals("exit"));
        System.out.println("You return to main menu");
    }
}
