/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.heranca.teste;

import aulas.java.animais.Animais;
import aulas.java.heranca.Pessoa;
import aulas.java.heranca.Professor;

/**
 *
 * @author Welton
 */
public class TestPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Welton");
        Professor professor = new Professor();
        professor.setSalario(2200.0);
        Animais cao = new Animais();
        cao.name = "JUGGERNAULT";
        System.out.println("eu "+pessoa.getNome()+" ganho "+ professor.getSalario()+" meu cachorro se chama "+cao.name);
    }
}
