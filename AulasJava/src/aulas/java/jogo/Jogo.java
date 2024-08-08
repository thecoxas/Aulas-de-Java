/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.jogo;

/**
 *
 * @author Welton
 */
public class Jogo {

    private String nome;
    private Personagem[] personagens;

    public Jogo() {
    }

    public Jogo(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the personagens
     */
    public Personagem[] getPersonagens() {
        return personagens;
    }

    /**
     * @param personagens the personagens to set
     */
    public void setPersonagens(Personagem[] personagens) {
        this.personagens = personagens;
    }
    public String getInfo(){
        String info = "nome "+nome+"\n";
        
        if(personagens != null){
            for(Personagem p1 : personagens){
                info += p1.getInfo() +"\n";
            }
        }
        
        
        return info;
    }
}
