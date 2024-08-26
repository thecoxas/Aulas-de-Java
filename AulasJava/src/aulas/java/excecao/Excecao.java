/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.excecao;

import javax.swing.JOptionPane;

/**
 *
 * @author Welton
 */
public class Excecao {

    public static void main(String[] args) {

        try {  // try: Para encapsular o código que pode lançar uma exceção.
            int vetor[] = new int[4];
            System.out.println("Antes da exception");

            vetor[5] = 10;
            System.out.println("Esse texto não será impresso");
        } catch (Exception e) {  // catch: Para capturar e tratar a exceção lançada.
            JOptionPane.showMessageDialog(null, e);
        }
        System.out.println("Depois da exception");
    }
}
