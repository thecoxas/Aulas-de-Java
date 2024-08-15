/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.ffinal;



/**
 *
 * @author Welton
 */
public class Aluno { // Aluno É UMA Pessoa

    private String[][] notas;
    private String cursos;

    public Aluno() {
    }

    public Aluno(String nome, String endereco, String telefone, String cpf, String cursos) {
        //super(nome, endereco, telefone, cpf);
        this.cursos = cursos;
    }

    public String[][] getNotas() {
        return notas;
    }

    public void setNotas(String[][] notas) {
        this.notas = notas;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
        /*this.setNome("Welton");
        this.setEndereco("Rua 13 Nº 56");
        // você escolhe como acessar os dois funcionam
        super.setCpf("3333999999"); 
        super.setTelefone("9999-8888");*/
        
    }

}
