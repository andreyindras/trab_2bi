package br.edu.unicesumar.api.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "registrations")
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDinscricao;

    @ManyToOne
    @JoinColumn(name = "id_evento")
    private Evento evento;

    @ManyToOne
    @JoinColumn(name = "id_aluno")
    private Aluno aluno;

    private LocalDateTime dataInscricao;

    public Inscricao() {
    }

    public Inscricao(Evento evento, Aluno aluno, LocalDateTime dataInscricao) {
        this.evento = evento;
        this.aluno = aluno;
        this.dataInscricao = dataInscricao;
    }

    public Long getIDinscricao() {
        return IDinscricao;
    }

    public void setIDinscricao(Long IDinscricao) {
        this.IDinscricao = IDinscricao;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public LocalDateTime getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(LocalDateTime dataInscricao) {
        this.dataInscricao = dataInscricao;
    }
}
