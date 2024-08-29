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
        
        int option = getOptionMenu(scan);
        
        if(option == 1){
            String nameContato = readInformation(scan, "Enter with name contact");
        }

    }
    
    public static String readInformation(Scanner scan, String msg){
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
