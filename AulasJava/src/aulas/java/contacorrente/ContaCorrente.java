/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.contacorrente;

/**
 *
 * @author Welton
 */
public class ContaCorrente {

    int numConta;
    public double saldo;
    boolean especial;
    double limite;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public ContaCorrente() {
    }

    double Sacar(double valorSaque) {

        if (valorSaque > saldo) {
            System.out.println("Não há saldo suficiente");

        }
        return saldo -= valorSaque;

    }

    double depositar(double valorDeposito) {
        if (valorDeposito + saldo > limite) {
            System.out.println("Valor ultrapassa o limite da conta que é de :" + limite);
        }
        return saldo += valorDeposito;

    }

    void consultarSaldo() {
        System.out.printf("Seu saldo é de :$%.2f", saldo);
        System.out.println(" ");
    }

}
