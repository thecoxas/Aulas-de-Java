/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.matematica;

/**
 *
 * @author Welton
 */
public class Matematica {

    public static int soma(int x, int y) {
        return x + y;
    }

    public static double soma(double x, int y) {
        return x + y;
    }

    public static int soma(int x, int y, int z) {
        return x + y + z;
    }

    public static double soma(double x, double y, int z) {
        return x + y + z;
    }

    public static int soma(int x[]) {
        int total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        return total;
    }
   
}
