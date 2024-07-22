/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

/**
 *
 * @author Welton
 */
public class TiposPrimitivosCasting {
    public static void main(String[] args) {
        // converter tipos primitivos
        double db = 7.5;
        short number = 10;
        
        int x = (int)db / number; // o casting força o java a colocar um tipo de dado dentro de outro
        
        System.out.println(x);
        
    }
    
}
