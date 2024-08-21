/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.interfaces;

/**
 *
 * @author Welton
 */
public class Circulo implements FigurasGeometrica {
    // Atributos
    private int raio;
    
    // Construtor
    public Circulo(int raio){
        this.raio = raio;
    }
    
    // métodos getters e setters
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    // Métodos específicos
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }
}
