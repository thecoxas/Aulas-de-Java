/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

/**
 *
 * @author Welton
 */
public class ArraysMuldimensionais02 {

    public static void main(String[] args) {

        // Declaração e inicialização
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Acesso e modificação
        int valor = matriz[1][2];  // Acessa o elemento na segunda linha e terceira coluna
        System.out.println("Valor na posição [1][2]: " + valor);

        matriz[0][0] = 10;  // Modifica o elemento na primeira linha e primeira coluna
        System.out.println("Novo valor na posição [0][0]: " + matriz[0][0]);

        // Iteração com loops aninhados
        System.out.println("Todos os elementos da matriz:");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();  // Nova linha após cada linha da matriz
        }
    }
}



