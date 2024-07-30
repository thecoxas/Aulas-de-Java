/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducaoclasse;

/**
 *
 * @author Welton
 */
public class Concessionaria {

    public static void main(String[] args) {
        // Um objeto é uma instância de uma classe. Ao criar um objeto, estamos criando uma
        // instancia específica dessa classe com valores para os atributos definidos.
        
        Carro sport = new Carro();
        sport.marca = "lamborghini";
        sport.modelo = "huracan";
        sport.numPassageiro = 2;
        sport.capCombustivel = 80;
        sport.consCombustivel = 10;

        System.out.println(sport.marca);
        System.out.println(sport.modelo);
        System.out.println("----------------------------------------------------");

        Carro caminhonete = new Carro();
        caminhonete.marca = "Toyota";
        caminhonete.modelo = "Hilux";
        caminhonete.numPassageiro = 5;
        caminhonete.capCombustivel = 80;
        caminhonete.consCombustivel = 4.8;

        System.out.println(caminhonete.marca);
        System.out.println(caminhonete.modelo);
        System.out.println(caminhonete.capCombustivel);
        System.out.println(caminhonete.consCombustivel);
    }

}
