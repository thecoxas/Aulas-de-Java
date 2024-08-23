/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.figurasgeometrica;

/**
 *
 * @author Welton
 */
public class Cubo extends Figura3D{
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * (Math.pow(lado, 2));
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }
    
    
}
