/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.banco;

/**
 *
 * @author Welton
 */
public class ContaEspecial extends ContaBancaria {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s = "Conta Especial; ";
        s += " Limite: " + limite;
        s += " ; "+ super.toString();
        s += "]";
        return s;
    }
    @Override
    public double sacar(double valor){
        double saldoComLimite = this.getSaldo() + limite;
        if((saldoComLimite - valor) >= 0 ){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso, saldo atual "+ this.getSaldo());
            
        }else{
            System.out.println("Saldo insuficiente limite estourado, seu saldo atual: "+ this.getSaldo());
        }
        return this.getSaldo();
    }
    
    
    
}
