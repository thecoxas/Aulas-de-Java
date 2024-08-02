/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.estatico;

import java.util.Scanner;

/**
 *
 * @author Welton
 */
public class FatorialTest {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        do {
            System.out.println("Digite com um numero positivo");
            num = teclado.nextInt();

            if (num < 0) {
                System.out.println("numero invalido, precisa ser positivo");
            }

        } while (num < 0);
        System.out.println(Fatorial.fatorial(num));
    }

}
