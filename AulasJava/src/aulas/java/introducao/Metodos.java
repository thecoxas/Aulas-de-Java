/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

/**
 *
 * @author Welton
 */
public class Metodos {

    /* static é um modificador de acesso 
    () dentro dele fica o parametro de entrada para o método
    Usa-se void para indicar que o método não retorna nenhum valor, apenas altera os 
    valores dos atributos de um objeto.
    
     */
    static void msg() {
        System.out.println("Hello World");
    }

    static void somar(int x, double y) {
        double s = x + y;
        System.out.println("soma é:" + s);
    }

    static int somar2(int n1, int n2, int n3) {
        int res = n1 + n2 + n3;
        return res;
    }

    public static void main(String[] args) {
        msg();
        somar(5, 9.8);
        System.out.println("A soma dos 3 números é: "+somar2(5, 9, 12));

    }
}
