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
public class EstruturaRepeticaoWhile {
    public static void main(String[] args) {
        /* A estrutura de repetição while é usada quando o número de iterações não é conhecido antecipadamente.
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        } 
        */
        Scanner scan = new Scanner(System.in);
        int resposta = (int) (Math.random()*10) + 1;
        
        boolean controlador = true;
        
        while (controlador) {
            System.out.println("Digite um número de 1 a 10 para tentar adivinha-lo");
            int palpite =scan.nextInt();
            
            if (palpite == resposta) {
                System.out.println("Parabens você acertou!");
                controlador = false;                
            } else {
                System.out.println("Passou perto, continue tentando!");
                System.out.println(resposta);
            }
            // enquanto o palpite nao for o correto o codigo continuará rodando
        }
    }
    
}
