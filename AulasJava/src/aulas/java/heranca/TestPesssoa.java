/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.heranca;

/**
 *
 * @author Welton
 */
public class TestPesssoa {
    public static void main(String[] args) {
        
        Professor professor = new Professor();
        professor.setNome("Loinane");
        
        Pessoa prof = new Professor();
        prof.setNome("Guanabara");
        
        Pessoa aluno = new Aluno();
        aluno.setNome("DevCoxinha");
        
        Pessoa aluno2 = new Pessoa();
        aluno2.setNome("devCoxas");
        
        System.out.println("");
    }
}
