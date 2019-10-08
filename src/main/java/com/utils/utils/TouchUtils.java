package com.utils.utils;

public class TouchUtils extends BaseUtils{

    private String choiceOf;

    public void setChoiceOfCommand() {
        do {
            System.out.println("Selection of available flags or commands \n" +
                    "\t   Usage: touch [OPTION]... FILE...\n" +
                    "\t    Update the access and modification times of each FILE to the current time.\n" +
                    " 1  touch  fileName  - \tCreate file \n" +
                    " 2  _____TODO____________________________________ \n" +
                    "   exit -  \tfor stop execution in this section");

            System.out.println("Enter number of command");

            choiceOf = utils.scanOption();
            switch (choiceOf) {

                case "1":
                    System.out.println("Enter the full file name" );
                    String name = utils.scanOption();
                    utils.createFile(name);
                    break;
                case "2":

                    break;
            }

        } while (!choiceOf.equals("exit"));
        System.out.println("You return to main menu");
    }

    //    Usage: touch [OPTION]... FILE...
//    Update the access and modification times of each FILE to the current time.
//
//    A FILE argument that does not exist is created empty, unless -c or -h
//    is supplied.
//
//    A FILE argument string of - is handled specially and causes touch to
//    change the times of the file associated with standard output.
//
//    Mandatory arguments to long options are mandatory for short options too.
//  -a                     change only the access time
//  -c, --no-create        do not create any files
//  -d, --date=STRING      parse STRING and use it instead of current time
//  -f                     (ignored)
//  -h, --no-dereference   affect each symbolic link instead of any referenced
//    file (useful only on systems that can change the
//                    timestamps of a symlink)
//  -m                     change only the modification time
//  -r, --reference=FILE   use this file's times instead of current time
//            -t STAMP               use [[CC]YY]MMDDhhmm[.ss] instead of current time
//      --time=WORD        change the specified time:
//    WORD is access, atime, or use: equivalent to -a
//    WORD is modify or mtime: equivalent to -m
//      --help     display this help and exit
//      --version  output version information and exit
//
//    Note that the -d and -t options accept different time-date formats.
}
