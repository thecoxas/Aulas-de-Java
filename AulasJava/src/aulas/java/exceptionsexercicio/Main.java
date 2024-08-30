/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.exceptionsexercicio;

import java.util.Scanner;

/**
 *
 * @author Welton
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int option = 1;

        while (option != 3) {
            option = getOptionMenu(scan);

            if (option == 1) {
                addContact(scan, agenda);

            } else if (option == 2) {
                queryContact(scan, agenda);

            } else if (option == 3) {
                System.exit(0);
            }

        }

    }

    public static void queryContact(Scanner scan, Agenda agenda) {
        String nameContatc = readInformation(scan, "Search contact");
        try {
            if (agenda.queryByName(nameContatc) >= 0) {
                System.out.println("Contact exists");

            }
        } catch (ContactNotExistException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void addContact(Scanner scan, Agenda agenda) {
        try {
            System.out.println("Creating contact, Enter the information");
            String name = readInformation(scan, "Enter the name");
            String email = readInformation(scan, "Enter the email");
            String phoneNumber = readInformation(scan, "Enter the phone number");

            Contact contact = new Contact();
            contact.setName(name);
            contact.setEmail(email);
            contact.setPhoneNumber(phoneNumber);

            System.out.println("contact to be created");
            System.out.println(contact);
            
            agenda.addContactAgenda(contact);
        } catch (AgendaFullException e) {
            System.out.println(e.getMessage());
            
            System.out.println("phonebook contacts");
            System.out.println(agenda);
        }
    }

    public static String readInformation(Scanner scan, String msg) {
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int getOptionMenu(Scanner scan) {
        boolean validEntry = false;
        int option = 3;

        while (!validEntry) {
            System.out.println("Enter the desired option");
            System.out.println("Option 1 = Add Contact");
            System.out.println("Option 2 = Query contact");
            System.out.println("option 3 = Exit");

            try {
                String input = scan.nextLine();
                option = Integer.parseInt(input);
                if (option == 1 || option == 2 || option == 3) {
                    validEntry = true;

                } else {
                    throw new Exception("Inválid entry");
                }

            } catch (Exception e) {
                System.out.println("Inválid entry, Type it again");
            }

        }
        return option;

    }
}
