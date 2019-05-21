package com.epam.utils.utils;

import com.epam.utils.services.Reader;

public abstract class BaseUtils {

    Utils utils = new Utils();
    Reader reader=new Reader();
    protected String choiceOf,introduction;

    public void selectMenuItem() {

        do {
            System.out.println(introduction);
            System.out.println("exit -  \tfor stop execution in this section");
            System.out.println("Enter number of command");

            choiceOf=reader.scanOption();

            switch (choiceOf) {
                case "1":

                 break;
            }
        } while (!choiceOf.equals("exit"));
    }
}
