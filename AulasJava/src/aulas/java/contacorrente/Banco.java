/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.contacorrente;

/**
 *
 * @author Welton
 */
public class Banco {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();

        conta1.numConta = 123456;
        conta1.especial = false;
        conta1.saldo = 5000.00;
        conta1.limite = 10000.00;

        System.out.println(conta1.Sacar(3000.00));
        conta1.consultarSaldo();
        
        System.out.println(conta1.depositar(5000.00));
        
        conta1.consultarSaldo();
        
        
    }
}
