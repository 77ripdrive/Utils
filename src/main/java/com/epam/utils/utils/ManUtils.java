package com.epam.utils.utils;

import java.io.IOException;

public class ManUtils extends BaseUtils {

    String choiceOf,pathToFolder;

   public void setChoiceOfCommand(){
       do {
        System.out.println("Selection of available flags or commands \n" +
                "\t  man <command_name>  \n"+
                "ls - \tDisplay the manual page for the item (program) ls. \n"+
                "man.7 – \tDisplay the manual page for macro package man from section 7. \n "+
                "-a intro – \tDisplay, in succession, all of the available intro manual pages contained within the manual. \n" +
                        " \tIt is possible to quit between successive displays or skip any of them. \n "+
                "for example more info you can see here https://www.mankier.com/1/man  \n"+

                "   exit -  \tfor stop execution in this section");

        choiceOf=utils.scanOption();

        switch (choiceOf){

            case "man ls":
                pathToFolder = "src\\main\\java\\com\\epam\\utils\\sandBox\\Help.txt";
                try {
                    utils.fileReader(pathToFolder);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            case "man man.7":
            case "man -a intro":
        }

    } while (!choiceOf.equals("exit"));
       System.out.println("You return to main menu");
}

}
