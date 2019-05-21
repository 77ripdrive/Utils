package com.epam.utils.utils;

import java.io.IOException;

public class ManUtils extends BaseUtils {

    String pathToFolder;

   public void selectMenuItem(){
       do {
         System.out.println("Select a number with command from the menu\n" +
                "\t  man <command_name>  \n"+
                " 1   \tman ls - \tman ls  just to call man ls type  the info from Help.txt \n" +
                     "\tman.7 – \tDisplay the manual page for macro package man from section 7. \n "+
                     "\tman -a intro – \tDisplay, in succession, all of the available intro manual pages contained within the manual. \n" +
                        " \tIt is possible to quit between successive displays or skip any of them. \n "+
                "for example more info you can see here https://www.mankier.com/1/man  \n"+

                "   exit -  \tfor stop execution in this section");

          choiceOf = reader.scanOption();

           switch ( choiceOf ){

             case "1":
                pathToFolder = ".\\src\\main\\java\\com\\epam\\utils\\sandBox\\Help.txt";
                try {
                    utils.fileReader( pathToFolder );
                } catch (IOException e) {
                    e.printStackTrace();
                }
             }

        } while (!choiceOf.equals("exit"));
           System.out.println("You return to main menu");
       }
   }
