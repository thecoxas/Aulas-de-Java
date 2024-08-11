/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.curso;

/**
 *
 * @author Welton
 */
public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getInfo() {
        String info = "Nome do aluno: " + nome;
        info += " Numero da matrícula: " + matricula;
        info += " Notas: ";

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
            info += nota + " ";
        }
        double media = soma / 4;
        info += "\n" + "Media" + media + " - ";
        if (media > 7) {
            info += "APROVADO!";
        } else {
            info += "REPROVADO!";
        }
        return info;
    }

    public double getMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;

        }
        return soma / 4;
    }
}
