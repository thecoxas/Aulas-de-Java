/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.banco;

/**
 *
 * @author Welton
 */
public class ContaBancaria {

    private String nomeCliente;
    private int numConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "nomeCliente = " + nomeCliente + ", numConta = " + numConta + ", saldo = " + saldo + '}';
    }

    public double depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito realizado com sucessso saldo atual " + saldo);
        return saldo;
    }

    public double sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente seu saldo atual é de: " + saldo);
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso seu novo saldo é de: " + saldo);
        }
        return saldo;
    }
}
