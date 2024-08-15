/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.hierarquia;

/**
 *
 * @author Welton
 */
public class TesteCurso {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setNome("Java");
        double[] notas = {7.5, 7.0, 8.5, 9.0};
        curso1.setNotas(notas);
        curso1.setEndereco("Rua 25 Nº 2223");
        curso1.setAprovado(true);

        curso2.setNome("Java");
        double[] notas2 = {7.5, 7.0, 8.5, 9.0};
        curso2.setNotas(notas);
        curso2.setEndereco("Rua 25 Nº 2223");
        curso2.setAprovado(true);

        
        System.out.println(curso1.toString()); // O método toString() retorna uma string representando o objeto
        //System.out.println(curso1 == curso2);  não são iguais pois estão em referência de memoria diferentes 
        System.out.println(curso1.equals(curso2)); // com o método equals a comparação é mais precisa agora retornando true
    }
}
