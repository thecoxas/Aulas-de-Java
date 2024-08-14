/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.heranca.abstrato;

/**
 *
 * @author Welton
 */
public class TesteAnimal {

    public static void main(String[] args) {
        //Animal cao = new Animal();  A classe Animal por ser abstrata não pode ser instanciada
        //Animal cao = new Mamifero();  A classe Mamifero por ser abstrata nao pode ser instanciada
        //Animal papagaio = new Ave();  A classe Ave por ser abstrata nao pode ser instanciada
        Animal louro = new Papagaio();
        Ave rio = new Papagaio();

        System.out.println(louro.emitirSom());
        System.out.println(rio.voar());
    }

}
