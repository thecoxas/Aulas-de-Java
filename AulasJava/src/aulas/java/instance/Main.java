/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.instance;

/**
 *
 * @author Welton
 */
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor prof = new Professor();
        
        if(pessoa instanceof Pessoa){
            System.out.println("Objeto do tipo Pessoa");
        }
        if(aluno instanceof Aluno){
            System.out.println("Objeto do tipo Aluno");
        }
        if(prof instanceof Professor){
            System.out.println("Objeto do tipo Professor");
        }
    }
}
