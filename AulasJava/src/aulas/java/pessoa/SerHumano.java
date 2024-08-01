/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.pessoa;

import aulas.java.animais.Animais;
import aulas.java.contacorrente.ContaCorrente;

/**
 *
 * @author Welton
 */
public class SerHumano {

    public static void main(String[] args) {

        /*
        public é o modificador menos restritivo de todos os demais. Declarando classes, 
        atributos ou métodos com este modificador, automaticamente dizemos que aquela 
        propriedade é acessível a partir de qualquer outra classe.
         */
        ContaCorrente conta = new ContaCorrente(5000.00);
        Animais dog = new Animais("Xena", "Pit-bull");
        Pessoa ser1 = new Pessoa();
        ser1.name = "Welton";
        System.out.println(ser1.name);

        /* Ao modificar o acesso da classe animais e ContaCorrente para public eu posso 
        importar e acessar suas propriedades em qualquer classe dentro do projeto       
        */
        System.out.println("O cachorro " + dog.name + " é do " + ser1.name + " e Ele tem " + conta.saldo
                + " na conta do banco");

    }

}
