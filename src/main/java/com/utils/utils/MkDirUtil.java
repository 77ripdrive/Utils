package com.utils.utils;

public class MkDirUtil extends BaseUtils{

    private String   pathToFolder;

    public void selectMenuItem() {

        do {
            System.out.println("Select a number with command from the menu\n" +
                    "\t  Usage: mkdir [OPTION]... DIRECTORY...\n" +
                    "\t   Create the DIRECTORY(ies), if they do not already exist. \n" +
                    " 1 \tmkdir  path  - \tCreate directory  \n" +
                    "   \t mkdir -p path      \tCreate directory and make parent directories as needed \n " +
                    "   exit -  \tfor stop execution in this section");

            System.out.println("Enter number of command");

            choiceOf = reader.scanOption();

            switch (choiceOf) {
                case "1":
                    System.out.println("Enter directory name  ");
                    pathToFolder = reader.scanOption();
                    utils.createFolder(pathToFolder);
                    break;
            }
        } while (!choiceOf.equals("exit"));
        System.out.println("You return to main menu");
    }
}
