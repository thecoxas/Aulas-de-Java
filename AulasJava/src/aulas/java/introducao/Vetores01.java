/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

/**
 *
 * @author Welton
 */
public class Vetores01 {

    public static void main(String[] args) {

        /*
        Em Java, Vector é uma classe que implementa uma lista dinâmica de objetos. Semelhante a um array,
        pode armazenar elementos de qualquer tipo, incluindo instâncias de classes definidas pelo usuário. 
        A principal vantagem dos vetores sobre os arrays tradicionais é sua capacidade de ajustar seu tamanho 
        automaticamente quando elementos são adicionados ou removidos, oferecendo assim uma flexibilidade consideravelmente maior.
         */
        int phone[] = new int[9];
        phone[0] = 9;
        phone[1] = 9;
        phone[2] = 1;
        phone[3] = 9;
        phone[4] = 0;
        phone[5] = 2;
        phone[6] = 6;
        phone[7] = 1;
        phone[8] = 1;

        System.out.print("My phone number is: ");
        for (int i = 0; i <= 8; i++) {
            System.out.print(phone[i] + "-");

        }

    }
}
