/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.jogo;

/**
 *
 * @author Welton
 */
public class Personagem {
    private String nome;
    private String atributoPrincipal;
    private String caracteristica;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtributoPrincipal() {
        return atributoPrincipal;
    }

    public void setAtributoPrincipal(String atributoPrincipal) {
        this.atributoPrincipal = atributoPrincipal;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    public String getInfo(){
        return "Nome = " +nome+ " ; "+"Atributo Principal = "+atributoPrincipal+ " ; "+"Caracteristica = "
                +caracteristica;
    }
    
}
