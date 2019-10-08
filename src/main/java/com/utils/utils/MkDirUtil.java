package com.utils.utils;

public class MkDirUtil extends BaseUtils{

    private String choiceOf,  pathToFolder;

    public void setChoiceOfCommand() {

        do {
            System.out.println("Selection of available flags or commands \n" +
                    "\t  Usage: mkdir [OPTION]... DIRECTORY...\n" +
                    "\t   Create the DIRECTORY(ies), if they do not already exist. \n" +
                    " 1 - mkdir  path  - \tCreate directory  \n" +
                    " 2 - mkdir -p path      \tCreate directory and make parent directories as needed \n " +
                    "   exit -  \tfor stop execution in this section");

            System.out.println("Enter number of command");

            choiceOf = utils.scanOption();
            switch (choiceOf) {

                case "1":
                    System.out.println("Enter path to file  ");
                    pathToFolder = utils.scanOption();
                    utils.createFolder(pathToFolder);
                    break;
                case "2":
                    System.out.println("Enter full path to folder  ");
                    pathToFolder = utils.scanOption();
                    utils.createFolder(pathToFolder);
                    break;
            }

        } while (!choiceOf.equals("exit"));
        System.out.println("You return to main menu");
    }


//    Usage: mkdir [OPTION]... DIRECTORY...
//    Create the DIRECTORY(ies), if they do not already exist.
//
//    Mandatory arguments to long options are mandatory for short options too.
//  -m, --mode=MODE   set file mode (as in chmod), not a=rwx - umask
//  -p, --parents     no error if existing, make parent directories as needed
//  -v, --verbose     print a message for each created directory
//  -Z                   set SELinux security context of each created directory
//    to the default type
//      --context[=CTX]  like -Z, or if CTX is specified then set the SELinux
//    or SMACK security context to CTX
//      --help     display this help and exit
//      --version  output version information and exit
}
