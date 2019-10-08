package com.utils.utils;

import java.io.File;

public class FindUtils extends BaseUtils {

    public void selectMenuItem() {
        do {
            System.out.println("Select a number with command from the menu\n" +
                    "\t  Usage: find [-H] [-L] [-P] [-Olevel] [-D debugopts] [path...] [expression]\n" +
                    "\t    default path is the current directory; default expression is -print\n" +
                    "\t    expression may consist of: operators, options, tests, and actions:\n" +
                    " 1  find  fileName  - \tFind file \n" );


            System.out.println("exit -  \tfor stop execution in this section");
            System.out.println("Enter number of command");

            choiceOf = reader.scanOption();

            switch (choiceOf) {

                case "1":
                    System.out.println("Enter the file to be searched.. ");
                    String name = reader.scanOption();
                    System.out.println("Enter the directory where to search ");
                    String directory = reader.scanOption();
                    utils.findFile(name, new File(directory));
                    break;
            }

        } while (!choiceOf.equals("exit"));
        System.out.println("You return to main menu");
    }
}
