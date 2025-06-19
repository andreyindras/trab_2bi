package br.edu.unicesumar.api.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "events")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDevento;

    private String nome;
    private String descricao;
    private LocalDateTime data;
    private Integer limiteParticipantes;



}
