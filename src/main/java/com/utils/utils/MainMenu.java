package com.utils.utils;

public class MainMenu extends BaseUtils {

    private String choiceOf;

    public void setChoiceOfCommand(){

     do {
          System.out.println("Selection of available commands \n" +
                "man - \tпечатает мануал по пользовнию утилитой https://en.wikipedia.org/wiki/Man_page \n"+
                "cd – \tизменение рабочей директории https://en.wikipedia.org/wiki/Cd_(command) \n "+
                "pwd – \tвывод рабочей директории https://en.wikipedia.org/wiki/Pwd \n "+
                "ls – \tвыводит информацию о файлах-папках рабочей директории https://en.wikipedia.org/wiki/Ls \n"+
                "mv –  \tпереименование/перемещение файлов https://en.wikipedia.org/wiki/Mv \n"+
                "rm –  \tудаление файлов/директорий https://en.wikipedia.org/wiki/Rm_(Unix) \n"+
                "mkdir –  \tсоздание директории https://en.wikipedia.org/wiki/Mkdir \n"+
                "cat -  \tвыводит содержимое файла https://en.wikipedia.org/wiki/Cat_(Unix) \n"+
                "find –  \tпоиск файлов https://ru.wikipedia.org/wiki/Find  \n"+
                "touch –  \tсоздание пустого файла https://en.wikipedia.org/wiki/Touch_(command) \n");


        choiceOf=utils.scanOption();

        switch (choiceOf){

            case "man":
                ManUtils manUtils=new ManUtils();
                manUtils.setChoiceOfCommand();
                break;
            case "cd":
                CdUtils cdUtils=new CdUtils();
                cdUtils.setChoiceOfCommand();
                break;
            case "pwd":
                PwdUtils pwdUtils=new PwdUtils();
                pwdUtils.setChoiceOfCommand();
                break;
            case "ls":
                LsUtils lsUtils=new LsUtils();
                lsUtils.setChoiceOfCommand();
                break;
            case "mv":
                MvUtils mvUtils=new MvUtils();
                mvUtils.setChoiceOfCommand();
                break;
            case "rm":
                RmUtils rmUtils=new RmUtils();
                rmUtils.setChoiceOfCommand();
                break;
            case "mkdir":
                MkDirUtil mkDirUtil=new MkDirUtil();
                mkDirUtil.setChoiceOfCommand();
                break;
            case "cat":
                CatUtils catUtils=new CatUtils();
                catUtils.setChoiceOfCommand();
                break;
            case "find":
                FindUtils findUtils=new FindUtils();
                findUtils.setChoiceOfCommand();
                break;
            case "touch":
                TouchUtils touchUtils=new TouchUtils();
                touchUtils.setChoiceOfCommand();
                break;



        }

      } while (!choiceOf.equals("exit"));
        System.out.println("For more information about redirection https://www.guru99.com/linux-redirection.html ");
 }
}
