/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

import java.util.Scanner;

/**
 *
 * @author Welton
 */
public class EstruturaCondicionalSwitch {

    public static void main(String[] args) {
        // A estrutura condicional switch permite executar um bloco de código diferente de acordo com cada opção 
        // (cada case) especificada.

        Scanner scan = new Scanner(System.in);

        System.out.println("##################Dia, Meio ou Fim de Semana#################");
        System.out.println("Escolha entre 1 a 7 para saber o dia e se é meio ou fim de semana!");
        int day = scan.nextInt();

        String dayWeek;
        // char, int, byte, String, enum
        switch (day) {
            case 1:
                dayWeek = "Sunday weekend";
                break;
            case 2:
                dayWeek = "Monday middle of the week";
                break;
            case 3:
                dayWeek = "Tuesday middle of the week";
                break;
            case 4:
                dayWeek = "Wenesday middle of the week";
                break;
            case 5:
                dayWeek = "thursday middle of the week";
                break;
            case 6:
                dayWeek = "Friday middle of the week";
                break;
            case 7:
                dayWeek = "saturday Weekend";
                break;
            default:
                dayWeek = "Error";
        }
        System.out.println(dayWeek);
    }

}
