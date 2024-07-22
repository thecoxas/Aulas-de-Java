/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

/**
 *
 * @author Welton
 */
public class TiposPrimitivos02 {

    public static void main(String[] args) {
        // tipos numéricos inteiros = byte, short, int, long
        byte numero1 = 127;
        short numero2 = 32_767;
        int numero3 = 214_748_600;
        long numero4 = 1_000_000_000_000_000_000L;
        System.out.println(numero4);

        // tipos numéricos flutuantes = float, double
        float wage = 2200.00F;
        double height = 1.70;
        System.out.printf("Seu salário é: %.2f", wage);
        System.out.println("");
        System.out.printf("Seu peso é: %.2f", height);
        System.out.println("");
        
        // tipos caractére = char => suporta apenas um caractére
        char caractere = '\u0041'; // de acordo com a tabela ASCII e Unicode
        System.out.println("Caractere:"+ caractere);  
        
        // tipo boolean = true or false
        boolean married = true;
        boolean father = false;
        System.out.println("casado?"+married+ "; pai? "+father);
    }

}
