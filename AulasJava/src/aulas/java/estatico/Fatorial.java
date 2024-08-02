/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.estatico;

/**
 *
 * @author Welton
 */
public class Fatorial {

    // 5! => 5*4=  5*3=  5*2=  5*1=120
    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        }
        int total = 1;
        for (int i = num; i > 1; i--) {
            total *= i;

        }

        return total;
    }

}
