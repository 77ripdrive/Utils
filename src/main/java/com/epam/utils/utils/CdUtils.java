package com.epam.utils.utils;

public class CdUtils extends BaseUtils {

    public void selectMenuItem() {

        do {
            System.out.println("Select a number with command from the menu\n" +
                    "\t  cd [-L|[-P [-e]] [-@]] [dir] \n" +
                    " \t Change the shell working directory.\n"+
                    "1  \tcd - \tby itself or cd ~ will always put you in your home directory \n"+
                    "   \tcd. – \t will leave you in the same directory you are currently in \n+" +
                    "\t(i.e. your current directory won't change). \n "+
                    "cd ~username  - will put you in username's home directory. \n "+
                    "for example more info you can see here https://en.wikipedia.org/wiki/Cd_(command)  \n");

            System.out.println("exit -  \tfor stop execution in this section");
            System.out.println("Enter number of command");

            choiceOf = reader.scanOption();

            switch (choiceOf){

                 case "1":
                    System.out.println(" Your home directory is  ");
                    utils.currentPath();
                    break;

            }

        } while (!choiceOf.equals("exit"));
        System.out.println("You return to main menu");
    }
}
