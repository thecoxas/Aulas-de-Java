/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.figurasgeometrica;

/**
 *
 * @author Welton
 */
public class Piramide extends Figura3D {

    private double altura;
    private double arestaBase;
    private double apotema;
    private int numPoligoBase;

    private Figura2D base;

    public Piramide(double altura, double arestaBase, double apotema, int numPoligoBase, Figura2D base) {
        this.altura = altura;
        this.arestaBase = arestaBase;
        this.apotema = apotema;
        this.numPoligoBase = numPoligoBase;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public int getNumPoligoBase() {
        return numPoligoBase;
    }

    public void setNumPoligoBase(int numPoligoBase) {
        this.numPoligoBase = numPoligoBase;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        if (base != null) {
            return (numPoligoBase * (arestaBase * apotema) / 2) + base.calcularArea();
        }
        return 0;
    }

    @Override
    public double calcularVolume() {
        if (base != null) {
            return (base.calcularArea() * altura) / 3;
        }
        return 0;
    }

}
