/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.heranca.abstrato;

/**
 *
 * @author Welton
 */
public class Papagaio extends Ave {

    @Override
    public String voar() {
        String y = "Voou!";
        return y;
    }

    @Override
    public String emitirSom() {
       String y = "vem ca meu loro!";
        return y;
    }
    
}
