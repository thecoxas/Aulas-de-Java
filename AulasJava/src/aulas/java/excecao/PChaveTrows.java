/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.excecao;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Welton
 */
public class PChaveTrows {

    public static void main(String[] args) {
        System.out.println("Digite um número decimal");
        try {
            double num = leNumero();
            System.out.println("O número digitado é: " + num);
        } catch (Exception e) {

            System.out.println("Número inválido");
            e.printStackTrace();

        }

    }

    public static double leNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
