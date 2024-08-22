/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.casting;

/**
 *
 * @author Welton
 */
public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Pessoa pessoa = aluno; // Upcasting

        Pessoa pessoa2 = new Aluno();
        Aluno aluno2 = (Aluno) pessoa2;  // Downcasting

        // funciona
        Object obj1 = obterString();
        String s1 = (String) obj1;

        // funciona
        Object obj2 = "Welton Dias";
        String s2 = (String) obj2;

        /* falha em tempo de execução
        Object obj3 = new Object();
        String s3 = (String) obj3;
         */
    }

    public static String obterString() {
        return "Minha String";
    }
}
