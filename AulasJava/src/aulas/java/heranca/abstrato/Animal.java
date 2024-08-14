/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.heranca.abstrato;

/**
 *
 * @author Welton
 */
public abstract class Animal {

    /*              Classe Abstrata
    É um tipo de classe especial que não pode ser instanciada, apenas herdada. 
    Sendo assim, uma classe abstrata não pode ter um objeto criado a partir de sua instanciação.
     */
    private String nome;

    public abstract String emitirSom();
    /*         Método abstrato
     um método abstrato indica que todas as classes filhas 
    (concretas, ou seja, não abstratas) devem reescrever esse método, ou não compilarão.
     */

}
