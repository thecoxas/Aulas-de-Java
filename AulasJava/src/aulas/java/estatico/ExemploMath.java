/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.estatico;

/**
 *
 * @author Welton
 */
public class ExemploMath {
    
    public static void main(String[] args) {
        double valor = -15.7;
        
        /*                     Metodos estáticos
         Todos os métodos da classe Math são estáticos, então você não precisa criar uma 
        instância da classe para usá-los.
        */

        // Arredondamento
        System.out.println("Valor absoluto: " + Math.abs(valor));
        System.out.println("Arredondado para cima: " + Math.ceil(valor));
        System.out.println("Arredondado para baixo: " + Math.floor(valor));
        System.out.println("Arredondado: " + Math.round(valor));

        // Potências e raízes
        System.out.println("Raiz quadrada de 16: " + Math.sqrt(16));
        System.out.println("2 elevado a 3: " + Math.pow(2, 3));

        // Trigonometria
        System.out.println("Seno de PI/2: " + Math.sin(Math.PI / 2));

        // Logaritmos e exponenciais
        System.out.println("Logaritmo natural de 10: " + Math.log(10));
        System.out.println("e^2: " + Math.exp(2));

        // Máximo e mínimo
        System.out.println("Máximo entre 5 e 10: " + Math.max(5, 10));
        System.out.println("Mínimo entre 5 e 10: " + Math.min(5, 10));
    }
}

    

