package com.epam.utils.utils;


public class PwdUtils extends BaseUtils {

    private String choiceOf;

    public void setChoiceOfCommand() {

        do {
            System.out.println("Selection of available flags or commands \n" +
                    "\t  pwd <flag>  \n"+
                    "pwd - \tDisplay the current working directory. Example: /home/foobar\n"+
                    "pwd -P – \t Display the current working directory physical path - without symbolic link name, if any. \n+" +
                    "pwd -L  - Display the current working directory logical path - with symbolic link name, if any.  \n "+
                    "for  more info you can see here https://en.wikipedia.org/wiki/Pwd  \n"+

                    "   exit -  \tfor stop execution in this section");


            choiceOf=utils.scanOption();
            switch (choiceOf){

                case "pwd":
                    utils.currentPath();
                    break;
                case "pwd -P":
                    break;
          }

        } while (!choiceOf.equals("exit"));
        System.out.println("You return to main menu");
    }

}
