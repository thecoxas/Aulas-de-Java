/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.animais;

/**
 *
 * @author Welton
 */
public class Animais {

    public String name;
    public String breed;
    public String color;
    public int age;

    public Animais() {
    }

    public Animais(String name, String breed) {
        this.name = name;
        this.breed = breed;
        System.out.println("Construtor com 2 parâmetros");
    }

    public Animais(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        System.out.println("Chamando construtor com 4 parâmetros");
    }

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
