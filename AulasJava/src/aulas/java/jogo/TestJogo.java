/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.jogo;

import java.util.Scanner;

/**
 *
 * @author Welton
 */
public class TestJogo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do jogo: ");
        String nome = scan.nextLine();

        Jogo jogo = new Jogo(nome);
        //jogo.setNome(nome);

        Personagem[] personagem = new Personagem[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite as informações do personagem:" + (i + 1));
            Personagem p1 = new Personagem();

            System.out.println("Entre com o nome do personagem");
            nome = scan.nextLine();
            p1.setNome(nome);

            System.out.println("Entre com o atributo principal do personagem: ");
            String atributo = scan.nextLine();
            p1.setAtributoPrincipal(atributo);

            System.out.println("Entre com a característica do personagem: ");
            String caracteristica = scan.nextLine();
            p1.setCaracteristica(caracteristica);
            
            personagem[i] = p1;
        }
        jogo.setPersonagens(personagem);
        if(jogo != null){
            System.out.println(jogo.getInfo());
        }
    }
}
