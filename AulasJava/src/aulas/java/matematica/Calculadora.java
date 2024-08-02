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

        double res = Matematica.soma(4.5, 10);
        System.out.println(res);

        double res2 = Matematica.soma(2.5, 4.7, 20);
        System.out.println(res2);

        int tabuada[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int resultado = Matematica.soma(tabuada);
        System.out.println(resultado);
        
        double res3 = Matematica.soma(3.3, 5.5, 7);
        System.out.println(res3);
        
        double res4 = Math.max(4.5, 5.5);
        System.out.println(res4);

    }

}
