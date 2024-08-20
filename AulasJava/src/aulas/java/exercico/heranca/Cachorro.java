/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.exercico.heranca;

/**
 *
 * @author Welton
 */
// Subclasse de Animal, representando um Cachorro
public class Cachorro extends Animal {

    // Implementação do método abstrato emitirSom
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }

    // Sobrescrita do método toString para fornecer uma representação específica
    @Override
    public String toString() {
        return "Isto é um cachorro";
    }
}
