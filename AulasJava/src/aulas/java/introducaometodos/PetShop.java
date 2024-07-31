/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducaometodos;

/**
 *
 * @author Welton
 */
public class PetShop {
    public static void main(String[] args) {
        Animais cat = new Animais();
        Animais dog = new Animais();
        
        dog.sleep("dormindo");
        cat.sleep("acordado");
        cat.play();
        dog.feed();
        dog.play();
    }
    
}
