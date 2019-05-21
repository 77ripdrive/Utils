package com.epam.utils.utils;

import java.io.File;

public class FindUtils extends BaseUtils {

    private String choiceOf;


    public void setChoiceOfCommand() {
        do {
            System.out.println("Selection of available flags or commands \n" +
                    "\t  Usage: find [-H] [-L] [-P] [-Olevel] [-D debugopts] [path...] [expression]\n" +
                    "\t    default path is the current directory; default expression is -print\n" +
                    "\t    expression may consist of: operators, options, tests, and actions:\n" +
                    " 1  find  fileName  - \tFind file \n" +
                    " 2  _____TODO____________________________________ \n" );

            System.out.println("exit -  \tfor stop execution in this section");
            System.out.println("Enter number of command");

            choiceOf = utils.scanOption();

            switch (choiceOf) {

                case "1":
                    System.out.println("Enter the file to be searched.. " );
                    String name = utils.scanOption();
                    System.out.println("Enter the directory where to search ");
                    String directory =utils.scanOption();
                    utils.findFile(name,new File(directory));
                    break;
                case "2":

                    break;
            }

        } while (!choiceOf.equals("exit"));
        System.out.println("You return to main menu");
    }
    //    Usage: find [-H] [-L] [-P] [-Olevel] [-D debugopts] [path...] [expression]
//
//    default path is the current directory; default expression is -print
//    expression may consist of: operators, options, tests, and actions:
//    operators (decreasing precedence; -and is implicit where no others are given):
//            ( EXPR )   ! EXPR   -not EXPR   EXPR1 -a EXPR2   EXPR1 -and EXPR2
//    EXPR1 -o EXPR2   EXPR1 -or EXPR2   EXPR1 , EXPR2
//    positional options (always true): -daystart -follow -regextype
//
//    normal options (always true, specified before other expressions):
//            -depth --help -maxdepth LEVELS -mindepth LEVELS -mount -noleaf
//      --version -xdev -ignore_readdir_race -noignore_readdir_race
//    tests (N can be +N or -N or N): -amin N -anewer FILE -atime N -cmin N
//      -cnewer FILE -ctime N -empty -false -fstype TYPE -gid N -group NAME
//      -ilname PATTERN -iname PATTERN -inum N -iwholename PATTERN -iregex PATTERN
//      -links N -lname PATTERN -mmin N -mtime N -name PATTERN -newer FILE
//      -nouser -nogroup -path PATTERN -perm [-/]MODE -regex PATTERN
//      -readable -writable -executable
//      -wholename PATTERN -size N[bcwkMG] -true -type [bcdpflsD] -uid N
//      -used N -user NAME -xtype [bcdpfls]      -context CONTEXT
//
//    actions: -delete -print0 -printf FORMAT -fprintf FILE FORMAT -print
//      -fprint0 FILE -fprint FILE -ls -fls FILE -prune -quit
//      -exec COMMAND ; -exec COMMAND {} + -ok COMMAND ;
//      -execdir COMMAND ; -execdir COMMAND {} + -okdir COMMAND ;
//
//    Valid arguments for -D:
//    exec, help, opt, rates, search, stat, time, tree
//    Use '-D help' for a description of the options, or see find(1)

}
