/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.interfaces;

/**
 *
 * @author Welton
 */
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        System.out.println(circulo.calcularArea());
        Quadrado quadrado = new Quadrado(5);
        System.out.println(quadrado.calcularArea());
    }
}
