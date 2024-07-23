/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

/**
 *
 * @author Welton
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        /* operadores aritméticos são = +, -, *, /, %
        Operadores aritméticos são usados para executar: adição, subtração, multiplicação, divisão e resto. 
        Eles agem como operações matemáticas básicas.
        
        int num1 = 10;
        int num2 = 20;
        int soma = num1 + num2;
        int diferenca = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisao = num1 / (double)num2; //Typecast para forçar o int a virar double
        int resto = num1 % num2;
         
        System.out.println(soma);
        System.out.println(diferenca);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(resto);
        
        // Classe math
        float x = (float) Math.PI; // valor da constante PI
        float y = (float) Math.pow(5, 3);  // potência de 5 elevado a 3
        double z = Math.sqrt(81);  // raiz quadrada de um número
        double a = Math.cbrt(125); // a raiz cúbica de um número
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        
        // Arredondamentos
        double abs = Math.abs(-25); // valor absoluto
        double few = Math.floor(5.8); // Arredonda pra baixo
        double loud = Math.ceil(5.2); // arredonda pra cima
        double balance = Math.round(5.4); // arredondamento aritmético
        
        System.out.println(abs);
        System.out.println(few);
        System.out.println(loud);
        System.out.println(balance);
        */
        // Gerar Número randomico
        
        double random = Math.random();
        int ale = (int) (1 + random *(10-1)); // gera um número aleatório de 1 a 9
        System.out.println(ale);
    }
    
}
