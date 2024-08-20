/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.exercico.heranca;

/**
 *
 * @author Welton
 */
// Classe abstrata que não pode ser instanciada diretamente
public abstract class Animal {

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void emitirSom();

    // Método final que não pode ser sobrescrito pelas subclasses
    public final void dormir() {
        System.out.println("O animal está dormindo.");
    }

    @Override
    public String toString() {
        return "Isto é um animal";
    }
}
