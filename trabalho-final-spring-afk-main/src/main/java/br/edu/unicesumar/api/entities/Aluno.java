package br.edu.unicesumar.api.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDaluno;

    private String nome;
    private String matricula;
    private String curso;

    public Aluno() {
    }

    public Aluno( String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public Long getIDaluno() {
        return IDaluno;
    }

    public void setIDaluno(Long IDaluno) {
        this.IDaluno = IDaluno;
    }

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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
