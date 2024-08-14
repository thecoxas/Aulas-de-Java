/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.heranca.abstrato;

/**
 *
 * @author Welton
 */
public class Cachorro extends Mamifero {

    private String tamanho;

    @Override
    public String amamentar() {
        String x = "mamando";
        return x;
    }

    @Override
    public String emitirSom() {
        String y = "Rau rau!";
        return y;
    }

}
