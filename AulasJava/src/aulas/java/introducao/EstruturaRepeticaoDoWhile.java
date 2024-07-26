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
public class EstruturaRepeticaoDoWhile {
    public static void main(String[] args) {
        /* A estrutura de repetição do-while é semelhante ao while, mas garante que o bloco de código do laço seja executado pelo 
        menos uma vez, já que a condição é validada após a execução do bloco de código, e não antes como no for e no while
        do {
        // bloco de código a ser repetido
        } while (condicao); 
        */ 
        Scanner scan = new Scanner(System.in);
        
        String senha;
        String confirmarSenha;
        boolean confirmacao = false; 
        do {  
            System.out.println("Digite sua senha");
            senha = scan.next();
            System.out.println("Confirme sua senha");
            confirmarSenha = scan.next();
            if (senha.equals(confirmarSenha)) {
                System.out.println("Parabens senha registrada");
                confirmacao = true;
            } else {
                System.out.println("Senha e confirmação de senha são diferentes");
            }
            
        } while (!confirmacao); // Apenas sai do loop quando a condição for verdadeira
        
        
        
    }
    
}
