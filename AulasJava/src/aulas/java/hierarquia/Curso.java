/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.hierarquia;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Welton
 */
public class Curso {

    private String nome;
    private double[] notas;
    private String endereco;
    private boolean aprovado;

    public Curso() {
    }

    public Curso(String nome, double[] notas, String endereco, boolean aprovado) {
        this.nome = nome;
        this.notas = notas;
        this.endereco = endereco;
        this.aprovado = aprovado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    @Override
    public String toString() {
        String s = " Notas = ";
        for (double nota : notas) {
            s += nota;
        }
        return "Curso{" + "nome=" + nome + s + ", endereco= " + endereco + ", aprovado=" + aprovado + '}';
    }
    /*
    O método equals() em Java é uma ferramenta poderosa para comparar objetos e determinar a igualdade
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (this.aprovado != other.aprovado) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        return Arrays.equals(this.notas, other.notas);
    }

}
