package com.utils.utils;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
  private    String pathToFile,realStringInFile;
  private boolean deleted;
   private File file,newFile;

    public    String scanOption(){
        Scanner scanner = new Scanner(System.in);
        String choiceOf=scanner.nextLine();
       return choiceOf;

    }

   public List<String> fileReader (String fileName)  throws java.lang.OutOfMemoryError, IOException  {
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
        if (list != null) {
            for (File nextFile : list) {
                if (nextFile.isDirectory()) {
                    findFile(fileName, nextFile);
                } else if (fileName.equalsIgnoreCase(nextFile.getName())) {
                    pathToFile=nextFile.getAbsolutePath();
                    System.out.println("Found");
                    System.out.println("File found at : " + nextFile.getParentFile());
                    System.out.println("Path diectory: " + nextFile.getAbsolutePath());

                }
            }
        }
        return pathToFile;
    }

    public boolean createFolder(String pathnameWithDirName) {
        File dir = new File(pathnameWithDirName);
        boolean created = dir.mkdir();
        if (created)
            System.out.println("Folder has been created");
        return created;
    }

    public boolean renameFile (String pathToFile,String newPathToFile) {
        file = new File(pathToFile);
        newFile = new File(newPathToFile);
        boolean fileIsRanamed=file.renameTo(newFile);
        if (fileIsRanamed) {
            System.out.println("File successfully renamed :" + newFile);
        } else {
            System.out.println("File not renamed ");
        }
        return fileIsRanamed;
    }

    public   String currentPath(){
        String current = null;
        try {
            current = new java.io.File( "." ).getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Current dir:"+current);
     return current;
    }

    public boolean deleteFile(String path) {
            file = new File(path);
            deleted = file.delete();
        System.out.println("Item   :" + path +  deleted +" - deleted");

        return deleted;
    }

    public boolean createFile(String fileName){
        File newFile = new File(fileName);
        boolean created=true;
        try
        {
             created = newFile.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return created;
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
