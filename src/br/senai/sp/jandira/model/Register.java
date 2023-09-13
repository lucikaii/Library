package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Register {

    Librarian librarian = new Librarian();
    Client client = new Client();
    Books book = new Books();

    LibrarianLogin libLogin = new LibrarianLogin();
    Scanner keyboard = new Scanner(System.in);

    public void choice(){

        String registerchoice;
        System.out.println("1 - LIBRARIAN REGISTER");
        System.out.println("2 - LIBRARIAN AREA");
        registerchoice = keyboard.nextLine();

        switch (registerchoice){

            case "1":
                librarianRegister();
                System.out.println("Teste");
                break;
            case "2":
                libLogin.librarianLogin();

                break;
        }
    }
    public Librarian librarianRegister(){




        System.out.println("============================================================");
        System.out.println("                   LIBRARIAN REGISTER                       ");
        System.out.println("============================================================");
        System.out.print(" TYPE YOUR USER NAME: ");
        librarian.name = keyboard.next();
        System.out.print(" EMAIL: ");
        librarian.email = keyboard.nextLine();
        System.out.print(" PASSWORD: ");
        librarian.password = keyboard.nextLine();
        System.out.println("============================================================");

        return librarian;
    }
    public Client clientRegister(){

        System.out.println("============================================================");
        System.out.println("                     CLIENT REGISTER                        ");
        System.out.println("============================================================");
        System.out.print(" TYPE THE CLIENT NAME: ");
        client.name = keyboard.nextLine();
        System.out.print(" TYPE THE CLIENT EMAIL: ");
        client.email = keyboard.nextLine();
        System.out.print(" TELEPHONE NUMBER: ");
        client.telephone = keyboard.nextLine();
        System.out.print(" CLIENT ADDRESS: ");
        client.address = keyboard.nextLine();
        System.out.println("============================================================");

        return client;
    }

    public Books bookRegister(){

        System.out.println("============================================================");
        System.out.println("                      BOOK REGISTER                         ");
        System.out.println("============================================================");
        System.out.print(" BOOK NAME: ");
        book.name = keyboard.nextLine();
        System.out.print(" BOOK ISBN: ");
        book.isbn = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print(" AUTHOR: ");
        book.author = keyboard.nextLine();
        System.out.print(" GENRE: ");
        book.genre = keyboard.nextLine();

        return book;
    }
}
