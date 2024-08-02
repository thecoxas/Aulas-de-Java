/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.estatico;

/**
 *
 * @author Welton
 */

public class TestEstatico {
    
    public static String nome = "Welton";
    
    public static void main(String[] args) {
        metodoTeste();
        System.out.println("My name is "+nome);
    }
    
    public static void metodoTeste(){
        System.out.println("Ola "+nome);
    }
}
