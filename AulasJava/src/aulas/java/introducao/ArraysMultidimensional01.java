/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

/**
 *
 * @author Welton
 */
public class ArraysMultidimensional01 {

    public static void main(String[] args) {
        /*
         Arrays multidimensionais em Java são arrays que contêm outros arrays como elementos. 
        O tipo mais comum é o array bidimensional, que você pode imaginar como uma tabela ou grade 
        com linhas e colunas.
         */
        double notasAlunos[][] = new double[4][4];

        notasAlunos[0][0] = 8.0;
        notasAlunos[0][1] = 7.5;
        notasAlunos[0][2] = 9.5;
        notasAlunos[0][3] = 8.5;

        notasAlunos[1][0] = 6.0;
        notasAlunos[1][1] = 5.5;
        notasAlunos[1][2] = 7.5;
        notasAlunos[1][3] = 6.5;

        notasAlunos[2][0] = 4.0;
        notasAlunos[2][1] = 5.5;
        notasAlunos[2][2] = 6.5;
        notasAlunos[2][3] = 5.0;

        notasAlunos[3][0] = 8.5;
        notasAlunos[3][1] = 7.0;
        notasAlunos[3][2] = 9.0;
        notasAlunos[3][3] = 8.0;

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) { // for aninhado para percorrer o vetor multidimensional
                System.out.print(notasAlunos[i][j] + " ");

            }
            System.out.println(" "); // para poder ver o print na tela em forma de tabela
        }
        System.out.println("Calculando a média");
        double media;
        for (int i = 0; i < notasAlunos.length; i++) {
            media = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                media += notasAlunos[i][j];

            }
            System.out.print("Media do aluno " + i + " é " + (media / 4));
            System.out.println(" ");
        }
    }

}
