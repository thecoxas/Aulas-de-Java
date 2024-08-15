/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.ffinal;

/**
 *
 * @author Welton
 */
public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //Pessoa aluno = new Aluno();
        //Pessoa professor = new Professor();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        
        System.out.println(Constante.NOME_ALUNO);
        //System.out.println(Constante.NOME_CURSO); Para acessar o atributo ele precisa ser estatico
        System.out.println(Constante.NOME_PROFESSOR);
    }
}
