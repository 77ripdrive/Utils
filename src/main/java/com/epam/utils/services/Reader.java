package com.epam.utils.services;

import java.util.Scanner;

public class Reader {

    public    String scanOption(){
        Scanner scanner = new Scanner(System.in);
        String choiceOf=scanner.nextLine();
        return choiceOf;
    }
}
