/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

/**
 *
 * @author Welton
 */
public class OperadoresAtribuicao {
    public static void main(String[] args) {
        int x = 25; // atribuição simples
        byte y = 15;
        x += y; // atribuição composta = 40
        x-= y; // 25
        x *= 5; // 125
        x /= 5; // 25
        x %= 2; // 1
        
        System.out.println(x);
        
        int num1 = 21;
        String versao = "java";
        versao += num1;
        System.out.println(versao);
    }
}
