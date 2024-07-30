/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

import java.util.Arrays;

/**
 *
 * @author Welton
 */
public class Vetores05 {

    public static void main(String[] args) {
        /*int random[] = {45, 37, 27, 2, 56, 25, 27, 8, 12, 10, 31, 15, 60, 50, 40};
        Arrays.sort(random);  // metodo da classe array que deixa os numeros em ordem crescente.
        for (int values : random) {
            System.out.print(values + " ");
        }
        */
        int search[] = {10 ,2 , 3, 4, 5, 6};
        int pos = Arrays.binarySearch(search, 4); // mostra a posição do numero em seu Indice correspondente
        System.out.println("The number 4 is in the index "+pos);
         
        int number[] = new int[20];
        Arrays.fill(number, 25);  // Preenche automaticamente os indices com um número prédefinido
        for(int values:number){
            System.out.print(values+ " ");
        }
    }

}
