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
public class EstruturasCondicionaisSwitch2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7,");
        byte day = scan.nextByte();
        String week;
        switch (day) {
            case 1:
            case 7:
                week = "Weekend";                
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                week = "Middle of the week";
                break;
            default:
                week = "Error";
        }
        System.out.println(week);
    }
    
}
