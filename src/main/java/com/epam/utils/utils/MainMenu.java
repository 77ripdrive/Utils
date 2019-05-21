package com.epam.utils.utils;

public class MainMenu extends BaseUtils {

    private String choiceOf;

    public void selectMenuItem() {
      do {
          System.out.println("Select an item from the menu \n" +
                "\tman - \tпечатает мануал по пользовнию утилитой https://en.wikipedia.org/wiki/Man_page \n"+
                "\tcd – \tизменение рабочей директории https://en.wikipedia.org/wiki/Cd_(command) \n "+
                "\tpwd – \tвывод рабочей директории https://en.wikipedia.org/wiki/Pwd \n "+
                "\tls – \tвыводит информацию о файлах-папках рабочей директории https://en.wikipedia.org/wiki/Ls \n"+
                "\tmv –  \tпереименование/перемещение файлов https://en.wikipedia.org/wiki/Mv \n"+
                "\trm –  \tудаление файлов/директорий https://en.wikipedia.org/wiki/Rm_(Unix) \n"+
                "\tmkdir –  \tсоздание директории https://en.wikipedia.org/wiki/Mkdir \n"+
                "\tcat -  \tвыводит содержимое файла https://en.wikipedia.org/wiki/Cat_(Unix) \n"+
                "\tfind –  \tпоиск файлов https://ru.wikipedia.org/wiki/Find  \n"+
                "\ttouch –  \tсоздание пустого файла https://en.wikipedia.org/wiki/Touch_(command) \n");

        choiceOf = reader.scanOption();

        switch ( choiceOf ){

            case "man":
                ManUtils manUtils = new ManUtils();
                manUtils.selectMenuItem();
                break;
            case "cd":
                CdUtils cdUtils = new CdUtils();
                cdUtils.selectMenuItem();
                break;
            case "pwd":
                PwdUtils pwdUtils = new PwdUtils();
                pwdUtils.selectMenuItem();
                break;
            case "ls":
                LsUtils lsUtils = new LsUtils();
                lsUtils.selectMenuItem();
                break;
            case "mv":
                MvUtils mvUtils = new MvUtils();
                mvUtils.selectMenuItem();
                break;
            case "rm":
                RmUtils rmUtils = new RmUtils();
                rmUtils.selectMenuItem();
                break;
            case "mkdir":
                MkDirUtil mkDirUtil = new MkDirUtil();
                mkDirUtil.selectMenuItem();
                break;
            case "cat":
                CatUtils catUtils = new CatUtils();
                catUtils.selectMenuItem();
                break;
            case "find":
                FindUtils findUtils = new FindUtils();
                findUtils.selectMenuItem();
                break;
            case "touch":
                TouchUtils touchUtils = new TouchUtils();
                touchUtils.selectMenuItem();
                break;

        }

      } while (!choiceOf.equals("exit"));
        System.out.println("For more information about redirection https://www.guru99.com/linux-redirection.html ");
    }
}
