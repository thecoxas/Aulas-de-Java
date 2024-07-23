/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

/**
 *
 * @author Welton
 */
public class OperadoresUnarios {
    public static void main(String[] args) {
        int num1 = 27;
        int num2 = 27;
        int valor1 = 10 + ++num1; // exemplo de pré incremento
        System.out.println(valor1);
        int valor2 = 10 + num2++; // exemplo de pós incremento
        System.out.println(valor2); // o resultado será 37 pois o incremento so acontece depois da soma
        
        int valor3 = 10 + --num1; // exemplo de pré decremento
        System.out.println(valor3);
        int valor4 = 10 + num2--; // exemplo de pós decremento
        System.out.println(valor4); // o resultado será 38 pois ouve o incremento na linha 17 e agora ele volta a valer 27 pois ouve o 
        // decremento na linha 22
        System.out.println(num2);
    }
            
    
}
