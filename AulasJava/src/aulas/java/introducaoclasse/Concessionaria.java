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
        sport.consCombustivel = 5.1;

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
        
        caminhonete.exibirAutonomia();
        sport.exibirAutonomia();
        System.out.println("-----------------------------------------------------");
        caminhonete.obterAutonomia(); // aqui o método quando chamado nao tras o retorno mais nao o exibe na tela 
        
        double autonomia = caminhonete.obterAutonomia(); // chama o método e guarda o retorno na variavel autonomia
        System.out.println(autonomia);  // apresenta o retorno na tela
        
        System.out.println(sport.obterAutonomia()); // exibe o retorno diretamente na tela
        System.out.println("Calculando a quantidade litros de gasolina para uma certa distancia");
        double kmRodados = sport.calcularCombustivel(25);
        System.out.println(kmRodados);
        
        System.out.println(caminhonete.calcularCombustivel(100));
        
        Carro gol = new Carro("Volksvagen","gol",4,80,10);
        System.out.println(gol.marca);
        System.out.println(gol.modelo);
        System.out.println(gol.numPassageiro);
        System.out.println(gol.capCombustivel);
        System.out.println(gol.consCombustivel);
        
        Carro brasilia = new Carro("Volksvagen");
        System.out.println(brasilia.marca);
    }

}
