/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

/**
 *
 * @author Welton
 */
public class OperadoresRelacionais {
    public static void main(String[] args) {
        /* Operador Ternario
        int x = 30;
        int y = 27;
        int res = (x > y)? x+y:x-y; // if e else em uma linha apenas
        System.out.println(res);
        */
        
        /* Operador Relacional
        >, <, ==, !=, >=, <= Sempre retornaram um valor true or false
        */
        int a = 12;
        int b = 10;
        int c = 15;
        int d = 10;
        
        boolean isMaiorQue = a > b;
        System.out.println(isMaiorQue);
        boolean isMenorQue = c < b;
        System.out.println(isMenorQue);
        boolean isIgual = b == d;
        System.out.println(isIgual);
        boolean isDifferent = a != d;
        System.out.println(isDifferent);
        
    }
    
}
