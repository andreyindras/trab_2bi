package br.edu.unicesumar.api.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "departments")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String nome;
    private String sigla;
    private String responsavel;

    @OneToMany(mappedBy = "departamento")
    private List<Evento> eventos;

    public Departamento() {
    }

    public Departamento(String nome, String sigla, String responsavel, List<Evento> eventos) {
        this.nome = nome;
        this.sigla = sigla;
        this.responsavel = responsavel;
        this.eventos = eventos;
    }

    public Departamento(Long ID, String nome, String sigla, String responsavel, List<Evento> eventos) {
        this.ID = ID;
        this.nome = nome;
        this.sigla = sigla;
        this.responsavel = responsavel;
        this.eventos = eventos;
    }
}
