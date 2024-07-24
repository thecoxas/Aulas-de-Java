/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

import java.util.Scanner;

/**
 *
 * @author Welton
 */
public class EstruturasCondicionaisIf {

    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);

        System.out.println("Digite a 1º nota:");
        double n1 = output.nextDouble();

        System.out.println("Digite a 2º nota:");
        double n2 = output.nextDouble();

        System.out.println("Digite a 3º nota:");
        double n3 = output.nextDouble();

        System.out.println("Digite a 4º nota:");
        double n4 = output.nextDouble();

        double result = (n1 + n2 + n3 + n4) / 4;
        System.out.println("Sua média foi: " + result);
        if (result >= 7.0) {
            System.out.println("Parabens você esta Aprovado!");
        } else if (result >= 5.0) {
            System.out.println("você ficou de Recuperação!");
        } else {
            System.out.println("Precisa se esforçar mais Reprovado!");

        }

    }
}
