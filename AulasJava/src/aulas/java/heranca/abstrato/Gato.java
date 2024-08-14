/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.heranca.abstrato;

/**
 *
 * @author Welton
 */
public class Gato extends Mamifero {

    @Override
    public String amamentar() {
        String x = "amamentando";
        return x;
    }

    @Override
    public String emitirSom() {
        String y = "Miaaauuuu";
        return y;
    }
    
}
