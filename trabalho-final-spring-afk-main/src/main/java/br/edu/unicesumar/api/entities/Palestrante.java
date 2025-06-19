package br.edu.unicesumar.api.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "speakers")
public class Palestrante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String name;
    private String miniCurriculo;
    private String instituicao;

    @ManyToMany(mappedBy = "palestrantes")
    private List<Evento> eventos;

    public Palestrante() {
    }

    public Palestrante(Long ID, String name, String miniCurriculo, String instituicao, List<Evento> eventos) {
        this.ID = ID;
        this.name = name;
        this.miniCurriculo = miniCurriculo;
        this.instituicao = instituicao;
        this.eventos = eventos;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
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

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }
}
