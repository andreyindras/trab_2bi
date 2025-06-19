package br.edu.unicesumar.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "speakers")
public class Palestrante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String miniCurriculo;
    private String instituicao;

    public Palestrante() {
    }

    public Palestrante(String name, String miniCurriculo, String instituicao) {
        this.name = name;
        this.miniCurriculo = miniCurriculo;
        this.instituicao = instituicao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiniCurriculo() {
        return miniCurriculo;
    }

    public void setMiniCurriculo(String miniCurriculo) {
        this.miniCurriculo = miniCurriculo;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

}
