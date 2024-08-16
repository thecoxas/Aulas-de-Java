/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.banco;

/**
 *
 * @author Welton
 */
public class BancoTeste {

    public static void main(String[] args) {

        System.out.println("################Conta Bancaria######################");

        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNomeCliente("Welton");
        conta1.setNumConta(12345);
        conta1.depositar(100);
        conta1.sacar(70);
        conta1.sacar(50);

        System.out.println(conta1.toString());

        System.out.println("###############Conta Poupança########################");

        ContaPoupança conta2 = new ContaPoupança();
        conta2.setNomeCliente("Lucinéia");
        conta2.setNumConta(54321);
        conta2.setDiaRendimento(16);

        conta2.depositar(1000.0);
        conta2.sacar(500.0);
        conta2.sacar(250);

        if (conta2.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento aplicado, novo saldo é de: " + conta2.getSaldo());

        } else {
            System.out.println("Hoje não é o dia do rendimento, novo saldo não calculado");
        }

        System.out.println(conta2);
        
        System.out.println("###############Conta Epecial##########################");
        
        ContaEspecial conta3 = new ContaEspecial();
        conta3.setNomeCliente("Myckaelly");
        conta3.setNumConta(13579);
        conta3.setLimite(100);
        conta3.depositar(500);
        conta3.sacar(250);
        conta3.sacar(300);
        conta3.sacar(100);
        
        System.out.println(conta3);
    }

}
