package com.utils.utils;


public class MvUtils extends BaseUtils{


     private String choiceOf,pathToFile,newPathToFile,oldPathToFile,newPath;

    public void setChoiceOfCommand(){
        do {
            System.out.println("Selection of available flags or commands \n" +
                    "\t   Usage: mv [OPTION]... [-T] SOURCE DEST\n" +
                    "\t    or:  mv [OPTION]... SOURCE... DIRECTORY\n" +
                    "\t    or:  mv [OPTION]... -t DIRECTORY SOURCE... " +
                    "\t Rename SOURCE to DEST, or move SOURCE(s) to DIRECTORY.\n"+
                    " 1 - mv myfile mynewfilename - \tRenames 'myfile' to 'mynewfilename'. \n"+
                    " 2 - mv myfile subdir/myfile – \tmoves 'myfile' to 'subdir/myfile' relative to the current directory. \n "+
                    "   exit -  \tfor stop execution in this section");

            choiceOf=utils.scanOption();

            switch (choiceOf){

                case "1":
                    System.out.println("Enter path to file  ");
                     pathToFile=utils.scanOption();
                    System.out.println("Enter  path to file with new Name ");
                     newPathToFile=utils.scanOption();
                    utils.renameFile(pathToFile,newPathToFile);
                    break;
                case "2":
                    System.out.println("Enter path to file  ");
                     oldPathToFile=utils.scanOption();
                    System.out.println("Enter  new path to file  ");
                     newPath=utils.scanOption();
                    utils.renameFile(oldPathToFile,newPath);
                    break;
            }

        } while (!choiceOf.equals("exit"));
        System.out.println("You return to main menu");
    }


//    Usage: mv [OPTION]... [-T] SOURCE DEST
//    or:  mv [OPTION]... SOURCE... DIRECTORY
//    or:  mv [OPTION]... -t DIRECTORY SOURCE...
//    Rename SOURCE to DEST, or move SOURCE(s) to DIRECTORY.
//
//    Mandatory arguments to long options are mandatory for short options too.
//      --backup[=CONTROL]       make a backup of each existing destination file
//  -b                           like --backup but does not accept an argument
//  -f, --force                  do not prompt before overwriting
//  -i, --interactive            prompt before overwrite
//  -n, --no-clobber             do not overwrite an existing file
//    If you specify more than one of -i, -f, -n, only the final one takes effect.
//      --strip-trailing-slashes  remove any trailing slashes from each SOURCE
//    argument
//  -S, --suffix=SUFFIX          override the usual backup suffix
//  -t, --target-directory=DIRECTORY  move all SOURCE arguments into DIRECTORY
//  -T, --no-target-directory    treat DEST as a normal file
//  -u, --update                 move only when the SOURCE file is newer
//    than the destination file or when the
//    destination file is missing
//  -v, --verbose                explain what is being done
//  -Z, --context                set SELinux security context of destination
//    file to default type
//      --help     display this help and exit
//      --version  output version information and exit
//
//    The backup suffix is '~', unless set with --suffix or SIMPLE_BACKUP_SUFFIX.
//    The version control method may be selected via the --backup option or through
//    the VERSION_CONTROL environment variable.  Here are the values:
//
//    none, off       never make backups (even if --backup is given)
//    numbered, t     make numbered backups
//    existing, nil   numbered if numbered backups exist, simple otherwise
//    simple, never   always make simple backups

}
