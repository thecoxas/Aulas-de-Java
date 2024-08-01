/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.animais;

/**
 *
 * @author Welton
 */
public class PetShop {
    public static void main(String[] args) {
        Animais cat = new Animais();
        Animais dog = new Animais();
        Animais cat2 = new Animais("Juggernault", "Agility", "Yellow", 10);
        Animais dog2 = new Animais("Pudge", "Strenght");
        
        dog.sleep("dormindo");
        cat.sleep("acordado");
        cat.play();
        dog.feed();
        dog.play();
        
        System.out.println(cat2.name);
        System.out.println(dog2.name);
        
    }
    
}
