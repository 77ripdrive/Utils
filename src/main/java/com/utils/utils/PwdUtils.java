package com.utils.utils;


public class PwdUtils extends BaseUtils {

    public void selectMenuItem() {

        do {
            System.out.println("Select a number with command from the menu \n" +
                    "\t  pwd <flag>  \n"+
                    " 1  pwd - \tDisplay the current working directory. Example: /home/foobar\n"+
                    "    pwd -P – \t Display the current working directory physical path - without symbolic link name, if any. \n+" +
                    "    pwd -L  - Display the current working directory logical path - with symbolic link name, if any.  \n "+
                    "for  more info you can see here https://en.wikipedia.org/wiki/Pwd  \n"+

                    "   exit -  \tfor stop execution in this section");

            choiceOf = reader.scanOption();

            switch ( choiceOf ){
                case "1":
                    utils.currentPath();
                    break;
            }
        } while (!choiceOf.equals("exit"));
        System.out.println("You return to main menu");
    }
}
