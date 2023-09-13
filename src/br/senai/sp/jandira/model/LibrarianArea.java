package br.senai.sp.jandira.model;

import java.util.Scanner;

public class LibrarianArea {

    Scanner keyboard = new Scanner(System.in);
    Register register = new Register();
    public void librarianArea(){

        String librarianchoice;

        System.out.println("============================================================");
        System.out.println("                     LIBRARIAN AREA                         ");
        System.out.println("============================================================");
        System.out.println("1 - CLIENT REGISTER");
        System.out.println("2 - BOOK BORROWING");
        System.out.println("3 - BOOK CATALOG");
        System.out.println("4 - BOOK REGISTER");
        System.out.println("============================================================");

        librarianchoice = keyboard.nextLine();

        switch (librarianchoice){

            case "1":
                register.clientRegister();
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
        }
    }
}
