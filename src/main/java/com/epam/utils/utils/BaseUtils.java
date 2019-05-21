package com.epam.utils.utils;

public abstract class BaseUtils {
    Utils utils=new Utils();
    private String choiceOf,introdaction;

    public void setChoiceOfCommand() {
        do {
            System.out.println(introdaction);
            System.out.println("exit -  \tfor stop execution in this section");
            System.out.println("Enter number of command");

            choiceOf=utils.scanOption();
            switch (choiceOf) {

                case "1":

                    break;
                case "2":

                    break;
            }

        } while (!choiceOf.equals("exit"));

    }

}
