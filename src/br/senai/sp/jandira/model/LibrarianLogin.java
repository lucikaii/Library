package br.senai.sp.jandira.model;

import java.util.Scanner;

public class LibrarianLogin {

    Scanner keyboard = new Scanner(System.in);
    Register registro = new Register();
    public void librarianLogin(){

        String loginEmail;
        String loginPassword;

        System.out.println("============================================================");
        System.out.println("                     LIBRARIAN LOGIN                        ");
        System.out.println("============================================================");
        System.out.print(" ENTER YOUR EMAIL: ");
        loginEmail = keyboard.next();
        System.out.print(" ENTER THE PASSWORD: ");
        loginPassword = keyboard.next();

        registro.choice();


    }
}
