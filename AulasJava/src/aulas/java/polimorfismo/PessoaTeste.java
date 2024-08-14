/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.polimorfismo;

/**
 *
 * @author Welton
 */
public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        
        pessoa.setEndereco("Rua 1, nº 1");
        aluno.setEndereco("Rua 2, nº 2");
        professor.setEndereco("Rua 3, nº 3");
        
        System.out.println(pessoa.ObterEtiquetaEndereco());
        System.out.println(aluno.ObterEtiquetaEndereco());
        System.out.println(professor.ObterEtiquetaEndereco());
        
    }
}
