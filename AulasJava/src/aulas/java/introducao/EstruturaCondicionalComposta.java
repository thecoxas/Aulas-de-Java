/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

/**
 *
 * @author Welton
 */
public class EstruturaCondicionalComposta {

    public static void main(String[] args) {
        /* A estrutura if executa um bloco de código se a condição especificada for verdadeira.
        int age = 17;
        if (age >= 18) {
            System.out.println("you are an adult");
           
        }
          A estrutura if-else executa um bloco de código se a condição for verdadeira, e outro bloco se a condição for falsa.
            if(age >=18){
                System.out.println("you are an adult");
            }else{
                System.out.println("You are not an adult");
            } */
        
        // A estrutura if-else if-else permite testar várias condições.
        
        int categoryName = 39;
        if (categoryName < 2) {
            System.out.println("Baby!");
        } else if(categoryName > 3 && categoryName < 12) {
            System.out.println("Children!");
        }else if(categoryName >= 12 && categoryName < 18){
            System.out.println("teenager!");   
        }else{
            System.out.println("adult");
        }
        

    }

}
