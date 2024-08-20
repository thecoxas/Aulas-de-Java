/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.exercico.heranca;

/**
 *
 * @author Welton
 */
// Classe principal para testar os conceitos
public class Main {

    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro(); // Polimorfismo
        Animal meuGato = new Gato(); // Polimorfismo

        meuCachorro.emitirSom(); // Saída: O cachorro late: Au Au!
        meuGato.emitirSom(); // Saída: O gato mia: Miau!

        System.out.println(meuCachorro.toString()); // Saída: Isto é um cachorro
        System.out.println(meuGato.toString()); // Saída: Isto é um gato

        meuCachorro.dormir(); // Saída: O animal está dormindo.
        meuGato.dormir(); // Saída: O animal está dormindo.
    }
}
