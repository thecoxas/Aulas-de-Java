/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.carro;

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
    
    // Um construtor é um bloco de código especial dentro de uma classe, 
    //designado para inicializar novos objetos.
    
    Carro(){ // construtor simples sem parâmetro
        
    }
    
    Carro(String marca_){   // construtor com apenas 1 parâmetro
        marca = marca_;
    }
    // Construtor com varios parâmetros
    Carro(String marca_, String modelo_, int numPassageiro_, double capCombustivel_, 
            double consCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiro = numPassageiro_;
        capCombustivel = capCombustivel_;
        consCombustivel = consCombustivel_;
    }
    
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
