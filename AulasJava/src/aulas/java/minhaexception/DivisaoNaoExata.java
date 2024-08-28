/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.minhaexception;

/**
 *
 * @author Welton
 */
public class DivisaoNaoExata extends Exception{
    private int num;
    private int denom;

    public DivisaoNaoExata(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    @Override
    public String toString() {
        return "Resultado de "+ num +"/"+denom+" não retorna um número inteiro";
    }
    
    
}
