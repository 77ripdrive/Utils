package com.utils.utils;


public class MvUtils extends BaseUtils{

  private String pathToFile,oldFileName,newFileName;

    public void selectMenuItem() {
        do {
            System.out.println("Select a number with command from the menu\n" +
                    "\t   Usage: mv [OPTION]... [-T] SOURCE DEST\n" +
                    "\t    or:  mv [OPTION]... SOURCE... DIRECTORY\n" +
                    "\t    or:  mv [OPTION]... -t DIRECTORY SOURCE... " +
                    "\t Rename SOURCE to DEST, or move SOURCE(s) to DIRECTORY.\n"+
                    " 1  \t mv myfile mynewfilename - \tRenames 'myfile' to 'mynewfilename'. \n"+
                    "    \t mv myfile subdir/myfile – \tmoves 'myfile' to 'subdir/myfile' relative to the current directory. \n "+
                    "   exit -  \tfor stop execution in this section");

            choiceOf =reader.scanOption();

            switch ( choiceOf ){

                case "1":
                    System.out.println("Enter path to Folder with old File ");
                     pathToFile=reader.scanOption();
                    System.out.println("Enter  old file name ");
                     oldFileName=reader.scanOption();
                    System.out.println("Enter  new file name ");
                    newFileName=reader.scanOption();
                    utils.renameExistingFile(pathToFile,oldFileName,newFileName);
                    break;
            }
        } while (!choiceOf.equals("exit"));
        System.out.println("You return to main menu");
    }
}
