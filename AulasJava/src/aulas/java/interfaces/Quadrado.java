/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.interfaces;

/**
 *
 * @author Welton
 */
public class Quadrado implements FigurasGeometrica{

    // Atributos
    private int lado;

    //Construtor
    public Quadrado(int lado) {
        this.lado = lado;
    }
    
    // Métodos getters e setters
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    // Métodos específicos
    @Override
    public double calcularArea(){
        return Math.pow(lado, 2);
    }
}
