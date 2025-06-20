package br.edu.unicesumar.api.dto;

import java.time.LocalDateTime;
import java.util.List;

public class EventoDTO {

    private Long id;
    private String nome;
    private String descricao;
    private LocalDateTime data;
    private Integer limiteParticipantes;
    private Long idDepartamento;
    private List<Long> idsPalestrantes;
    private Long numeroInscritos;
    private Boolean lotado;


    public EventoDTO() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public List<Long> getIdsPalestrantes() {
        return idsPalestrantes;
    }

    public void setIdsPalestrantes(List<Long> idsPalestrantes) {
        this.idsPalestrantes = idsPalestrantes;
    }

    public Long getNumeroInscritos() {
        return numeroInscritos;
    }

    public void setNumeroInscritos(Long numeroInscritos) {
        this.numeroInscritos = numeroInscritos;
    }

    public Boolean getLotado() {
        return lotado;
    }

    public void setLotado(Boolean lotado) {
        this.lotado = lotado;
    }
}