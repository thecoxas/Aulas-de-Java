/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

/**
 *
 * @author Welton
 */
public class AulaString {

    public static void main(String[] args) {
        // String não é um tipo primitivo e sim uma Wrapper Class, usada para cadeias de caractéres.
        String name = "Welton Dias da Silva";
        String address = "Rua 13 setor Vila Maria";
        float wage = 2200.00f;
        String date = "23/07/2024";
        String output = "Eu "+name+", morando no endereço "+address+", confirmo que recebi o sálario de "+wage+ ", na data de "+date;
        System.out.println(output);

    }

}
