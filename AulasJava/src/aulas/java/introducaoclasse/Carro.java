/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducaoclasse;

/**
 *
 * @author Welton
 */
public class Carro { // A classe é um  plano para criar objetos
    
    String marca;
    String modelo;
    int numPassageiro;        // Os atributos são variáveis que representam as propriedades da classe.
    double capCombustivel;
    double consCombustivel;
    
    void exibirAutonomia(){ // Mètodo simples sem retorno
        System.out.println("A autonomia do carro é:"+ capCombustivel*consCombustivel+" Km");
    }
    
    double obterAutonomia(){
        System.out.println("Método que precisa retornar algo");
        
        return capCombustivel * consCombustivel;
    }
    
    double calcularCombustivel(double km){
        double qtdQuilometros = km/consCombustivel;
        return qtdQuilometros;
    }
    
    
}
