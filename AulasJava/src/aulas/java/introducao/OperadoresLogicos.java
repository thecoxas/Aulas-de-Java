/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

/**
 *
 * @author Welton
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        /*Os operadores lógicos, representam o recurso que nos permite criar expressões lógicas
        maiores, a partir da junção de duas ou mais expressões. && operador and || operador or ^ operador xou ! operador not
        
        int x,y,z;
        x = 10;
        y = 20;
        z = 30;
        boolean r = (x>y ^ y!=z)? true:false; 
        System.out.println(r);
         */
        int age = 39;
        float wage = 2200.0f;
        boolean res = (age >= 30 || wage >= 4612.0) ? true : false;
        System.out.println(res);
    }

}
