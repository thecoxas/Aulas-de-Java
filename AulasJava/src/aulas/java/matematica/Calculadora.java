/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.matematica;

/**
 *
 * @author Welton
 */
public class Calculadora {
    public static void main(String[] args) {
        Matematica calculadora = new Matematica();
        double res = calculadora.soma(4.5, 10);
        System.out.println(res);
        
        double res2 = calculadora.soma(2.5, 4.7, 20);
        System.out.println(res2);
        
        int tabuada[] = {1,2,3,4,5,6,7,8,9,10};
        int resultado = calculadora.soma(tabuada);
        System.out.println(resultado);
                
    }
    
}
