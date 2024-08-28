/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.minhaexception;

/**
 *
 * @author Welton
 */
public class MinhaException {

    public static void main(String[] args) {
        try {
            teste();
        } catch (DivisaoNaoExata e) {
            e.printStackTrace();
        }

    }

    public static void teste() throws DivisaoNaoExata {
        int numeros[] = {4, 8, 5, 16, 32, 21, 64, 128,};
        int denom[] = {2, 0, 4, 0, 2, 4, 2};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    throw new DivisaoNaoExata(numeros[i], denom[i]);
                }
                System.out.println(numeros[i] + " /" + denom[i] + " =" + (numeros[i] / denom[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
                System.out.println("Aconteceu um erro!");
                e.printStackTrace();

            }

        }
    }
}
