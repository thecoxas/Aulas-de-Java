/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducaometodos;

/**
 *
 * @author Welton
 */
public class Animais {

    String name;
    String breed;
    String color;
    int age;

    /*
    modificador de acesso public, static
    void => nao especifica o que sera retornado, pode ser um objeto, String e qualquer tipo primitivo
     */
    void sleep(String x) {
        System.out.println(x);
    }

    void play() {
        System.out.println("brincando");
    }

    void feed() {
        System.out.println("alimentado");
    }

}
