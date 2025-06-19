package br.edu.unicesumar.api.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "speakers")
public class Palestrante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDpalestrante;

    private String name;
    private String miniCurriculo;
    private String instituicao;

}
