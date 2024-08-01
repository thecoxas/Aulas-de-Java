/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.livro;

/**
 *
 * @author Welton
 */
public class Biblioteca {

    public static void main(String[] args) {
        Livro book1 = new Livro("William Shakespeare", "Tragédia", "Hamlet", 112);

        // Acessando os dados através dos métodos getters 
        System.out.println("auhtor " + book1.getAuthor());
        System.out.println("Name of book " + book1.getName());

        // Modificando os dados através dos métodos setters
        book1.setAuthor("Clarice Linspector");
        book1.setName("Um sopro de vida");

        book1.showInfo();
    }

}
