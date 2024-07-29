/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

/**
 *
 * @author Welton
 */
public class EstruturaRepeticaoContinue {
    public static void main(String[] args) {
        /* O comando continue em estruturas de repetição é utilizado para pular a iteração atual 
        e continuar com a próxima. Ao contrário do break, que interrompe completamente o loop, 
        o continue faz com que o loop avance para a próxima iteração.
        
         for (int i = 0; i < 25; i++) {
            if (i == 5 || i == 10 || i == 15 || i == 20) {
                continue; // pula a iteração quando i é igual a 5, 10, 15, 20
            }
            System.out.println("i: " + i);
        }
        System.out.println("Loop encerrado.");
        
        int i = 0;
        while (i < 25) {
            i++;
            if (i == 5 || i == 10 || i == 15 || i == 20) {
                continue; // pula a iteração quando i é igual a 5, 10, 15, 20
            }
            System.out.println("i: " + i);
        }
        System.out.println("Loop encerrado.");*/
        
          int i = 0;
        do {
            i++;
            if (i == 5 || i == 10 || i == 15 || i == 20) {
                continue; // pula a iteração quando i é igual a 5, 10, 15, 20,
            }
            System.out.println("i: " + i);
        } while (i < 25);
        System.out.println("Loop encerrado.");
    }
    
}
