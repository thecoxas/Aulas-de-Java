/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.curso;

/**
 *
 * @author Welton
 */
public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }


    public String getInfo() {
        String info = "Nome do curso: " + nome + "\n";
        if (professor != null) {
            info += professor.getInfo();
        }
        if (alunos != null) {
            System.out.println("############Alunos###############");
            for (Aluno aluno : alunos) {
                if(aluno != null){
                    aluno.getInfo();
                    info += "\n";
                }
                
            }
            info += "\nMedia da turma = "+ getMediaTurma();
        }
        return info;
    }

    public double getMediaTurma() {
        double soma = 0;
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                soma += aluno.getMedia();
            }

        }
        return soma/alunos.length;
    }
}
