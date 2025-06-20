package br.edu.unicesumar.api.dto;

import java.time.LocalDateTime;

import br.edu.unicesumar.api.enums.StatusInscricao;

public class InscricaoCadastroDTO {

    private Long idAluno;
    private Long eventoId;
    private String eventoNome;
    private String eventoDescricao;
    private LocalDateTime eventoData;
    private String departamentoNome;
    private LocalDateTime dataInscricao;
    private StatusInscricao status;

    public InscricaoCadastroDTO() {

    }

    public Long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Long idAluno) {
        this.idAluno = idAluno;
    }

    public Long getEventoId() {
        return eventoId;
    }

    public void setEventoId(Long eventoId) {
        this.eventoId = eventoId;
    }

    public String getEventoNome() {
        return eventoNome;
    }

    public void setEventoNome(String eventoNome) {
        this.eventoNome = eventoNome;
    }

    public String getEventoDescricao() {
        return eventoDescricao;
    }

    public void setEventoDescricao(String eventoDescricao) {
        this.eventoDescricao = eventoDescricao;
    }

    public LocalDateTime getEventoData() {
        return eventoData;
    }

    public void setEventoData(LocalDateTime eventoData) {
        this.eventoData = eventoData;
    }

    public String getDepartamentoNome() {
        return departamentoNome;
    }

    public void setDepartamentoNome(String departamentoNome) {
        this.departamentoNome = departamentoNome;
    }

    public LocalDateTime getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(LocalDateTime dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public StatusInscricao getStatus() {
        return status;
    }

    public void setStatus(StatusInscricao status) {
        this.status = status;
    }
}