package com.epam.utils.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Utils {
  private    String pathToFile,realStringInFile;
  private boolean  newFileIsCreated,deleted,newFolderIsCreated;
   private File file;

   public List<String> fileReader (String fileName)  throws  IOException  {
       BufferedReader reader = new BufferedReader(new FileReader(fileName));
       List<String> list = new ArrayList<>();
       while (( realStringInFile = reader.readLine()) != null) {
           list.add(realStringInFile);
           System.out.println("String in file --->"+realStringInFile);
       }
       return list;
   }

    public String findFile(String fileName,File file) {
        File[] list = file.listFiles();
        for (File nextFile : list) {
                if (nextFile.isDirectory()) {
                    findFile(fileName, nextFile);
                } else if (fileName.equalsIgnoreCase(nextFile.getName())) {
                     pathToFile=nextFile.getAbsolutePath();

                    System.out.println("File found at : " + nextFile.getParentFile());
                    System.out.println("Path diectory: " + pathToFile);
                    return pathToFile;
                }
            }return "Directory";


    }

    public String createFolder(String pathnameWithDirName) {
        File dir = new File(pathnameWithDirName);
        newFolderIsCreated = dir.mkdir();
        if (newFolderIsCreated) {
            System.out.println("Folder has been created" + dir.getAbsolutePath());
            return "Folder has been created";
        }else {return "Folder has not been created";}
    }


       public boolean renameExistingFile(String dirName, String oldFileName, String newFileName){

            final File oldFile = new File(dirName,oldFileName);
            final File newFile = new File(dirName, newFileName);
            if(oldFile.exists() && !newFile.exists()) {
                newFileIsCreated=oldFile.renameTo(newFile);
                if(newFileIsCreated) {
                    System.out.println("Fail is renamed");
                } else {
                    System.out.println("Fail is not renamed");
                }
            }return newFileIsCreated;
       }


    public   String currentPath(){
        try {
            pathToFile = new File( "." ).getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Current dir:"+pathToFile);
     return pathToFile;
    }

    public boolean deleteFile(final String path) {
            file = new File(path);
        if (file.exists()) {
            deleted = file.delete();
            if (deleted) {
                System.out.println("Item is deleted");
                return deleted;
            } else
                System.out.println("Item is not deleted");
            return deleted;
        }else
            System.out.println("Item is not exist");
        return file.exists();
    }

    public boolean createFile(String path) {
        file = new File(path);
        try {
            newFileIsCreated = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (newFileIsCreated) {
                System.out.println("Item is created");
                return newFileIsCreated;
            } else
                System.out.println("Item is not created");
            return newFileIsCreated;

    }

    public   boolean infoDir(String path){
        boolean infoIs;
        File dir = new File(path);
        infoIs=dir.isDirectory();
        if(infoIs)
        {
            for(File item : dir.listFiles()){
                if(infoIs){
                    System.out.println(item.getName() + "  \t folder");
                }
                else{
                    System.out.println(item.getName() + "\t file");

                }
            }
        }
        return infoIs;
    }

}
