/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.pessoa;

/**
 *
 * @author Welton
 */
class Pessoa {
    // Modificadores de acesso

    /*Os modificadores de acesso são palavras-chave na linguagem Java. Eles servem 
    para definir a visibilidade que determinada classe ou membro terá diante das outras.
     */
    String name;
    /* modificador de acesso default ou package
    Este modificador permite que apenas classes do mesmo pacote tenham acesso as 
    propriedades que possuem este modificador.
     */
    private String cpf; /*
    private é um modificador de acesso que restringe totalmente o acesso aquele recurso 
    da classe de todas as demais classes, sejam elas do mesmo pacote, de outros pacotes 
    ou até subclasses. Este modificador pode ser aplicado a atributos e métodos.
    */
    protected int age; /*
    protected é um modificador um pouco menos restritivo que o default. Com este tipo 
    modificador, podemos declarar que um atributo ou método é visível apenas para as classes 
    do mesmo pacote ou para as subclasses daquela classe.
    */
    
}
