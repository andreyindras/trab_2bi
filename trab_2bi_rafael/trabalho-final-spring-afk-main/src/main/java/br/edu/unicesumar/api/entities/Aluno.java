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

}
