package br.edu.unicesumar.api.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "events")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String nome;
    private String descricao;
    private LocalDateTime data;
    private Integer limiteParticipantes;

    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamento departamento;

    @ManyToMany
    @JoinTable(name = "evento_palestrantes")
    private List<Palestrante> palestrantes;

    @OneToMany(mappedBy = "evento")
    private List<Inscricao> inscricoes;

    public Evento() {
    }

    public Evento(List<Inscricao> inscricoes, List<Palestrante> palestrantes, Departamento departamento, Integer limiteParticipantes, LocalDateTime data, String descricao, String nome) {
        this.inscricoes = inscricoes;
        this.palestrantes = palestrantes;
        this.departamento = departamento;
        this.limiteParticipantes = limiteParticipantes;
        this.data = data;
        this.descricao = descricao;
        this.nome = nome;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Integer getLimiteParticipantes() {
        return limiteParticipantes;
    }

    public void setLimiteParticipantes(Integer limiteParticipantes) {
        this.limiteParticipantes = limiteParticipantes;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Palestrante> getPalestrantes() {
        return palestrantes;
    }

    public void setPalestrantes(List<Palestrante> palestrantes) {
        this.palestrantes = palestrantes;
    }

    public List<Inscricao> getInscricoes() {
        return inscricoes;
    }

    public void setInscricoes(List<Inscricao> inscricoes) {
        this.inscricoes = inscricoes;
    }
}
