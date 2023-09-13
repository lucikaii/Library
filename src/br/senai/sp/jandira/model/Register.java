package br.senai.sp.jandira.model;

import java.util.Date;
import java.util.Scanner;

public class Register {

    Librarian librarian = new Librarian();
    Client client = new Client();
    Scanner keyboard = new Scanner(System.in);

    public void choice(){

        String registerchoice;
        System.out.println("1 - LIBRARIAN REGISTER");
        System.out.println("2 - LIBRARIAN AREA");
        registerchoice = keyboard.next();

        switch (registerchoice){

            case "1":
                librarianRegister();
                break;
            case "2":
                break;
        }
    }
    public Librarian librarianRegister(){

        String sBirthday;


        System.out.println(" TYPE YOUR USER NAME: ");
        librarian.name = keyboard.nextLine();
        //System.out.println(" TYPE YOUR BIRTHDAY (dd/MM/yyyy): ");
        //sBirthday = keyboard.nextLine();
        //Date formatedDate = librarian.birthday.parse(sBirthday);
        System.out.println(" EMAIL: ");
        librarian.email = keyboard.nextLine();
        System.out.println(" PASSWORD: ");
        librarian.password = keyboard.nextLine();


        return librarian;
    }
    public Client clientRegister(){

        System.out.println(" TYPE THE CLIENT NAME: ");
        client.name = keyboard.nextLine();
        System.out.println(" TYPE THE CLIENT EMAIL: ");
        client.email = keyboard.nextLine();
        System.out.println(" TELEPHONE NUMBER: ");
        client.telephone = keyboard.next();
        System.out.println(" CLIENT ADDRESS: ");
        client.address = keyboard.nextLine();
        // System.out.println(" CLIENT BIRTHDAY");
        
        return client;
    }
}
