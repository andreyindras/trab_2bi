package br.edu.unicesumar.api.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "departments")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDdepartamento;

    private String nome;
    private String sigla;
    private String responsavel;


}
