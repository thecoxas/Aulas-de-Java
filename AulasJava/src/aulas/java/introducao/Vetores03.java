/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

/**
 *
 * @author Welton
 */
public class Vetores03 {

    public static void main(String[] args) {
        String month[] = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november",
            "december"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Podemos iterar sobre os elementos de um array usando loops. O for loop é comumente usado para isso
        for (int i = 0; i < month.length; i++) {
            System.out.println("The month " + month[i] + " have " + tot[i] + " days");

        }
    }
}
