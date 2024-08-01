/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.livro;

/**
 *
 * @author Welton
 */
public class Livro {

    /*    Encapsulamento
    se refere ao conceito de esconder os detalhes internos de uma classe e proteger os dados 
    de acessos e modificações indevidos. Isso é feito ao controlar o acesso a variáveis e 
    métodos usando modificadores de acesso.
     */
    private String author;
    private String gender;
    private String name;
    private int numPages;  // Variáveis de instância privadas

    public Livro() {
    }

    public Livro(String author, String gender, String name, int numPages) {
        this.author = author;
        this.gender = gender;
        this.name = name;
        this.numPages = numPages;
    }

    public String getAuthor() {
        return this.author;
    }

    /*
    Métodos getters e setters: métodos públicos (getters e setters) servem para acessar e 
    modificar os valores das variáveis privadas, quando necessário.    
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    
    public void showInfo(){
        System.out.println("author :"+ author);
        System.out.println("Gender :"+ gender);
        System.out.println("Name :"+ name);
        System.out.println("Numbers of pages :"+ numPages);
    }

}
