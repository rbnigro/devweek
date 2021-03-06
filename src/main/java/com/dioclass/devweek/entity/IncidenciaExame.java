package com.dioclass.devweek.entity;

import javax.persistence.*;

@Entity
public class IncidenciaExame {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Integer regiaoId;
    private Integer mes;
    private Long faixaId;
    private Integer qntExames;

    public IncidenciaExame(){

    }

    public IncidenciaExame(Integer mes, Long faixaid, Integer qntexames){
        this.mes = mes;
        this.faixaId = faixaid;
        this.faixaId = faixaid;
    }

    public Long getId() {
        return id;
    }

    public Integer getRegiaoId() {
        return regiaoId;
    }

    public void setRegiaoId(Integer regiaoId) {
        this.regiaoId = regiaoId;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Long getFaixaId() {
        return faixaId;
    }

    public void setFaixaId(Long faixaId) {
        this.faixaId = faixaId;
    }

    public Integer getQntExames() {
        return qntExames;
    }

    public void setQntExames(Integer qntExames) {
        this.qntExames = qntExames;
    }
}
