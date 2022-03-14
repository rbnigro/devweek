package com.dioclass.devweek.Entity;

import javax.persistence.*;

@Entity
public class Regiao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(name = "regiao")
    private String regiaoExame;

    private Integer totalExames;

    public Regiao(String regiao, Integer total) {
        this.regiaoExame = regiao;
        this.totalExames = total;
    }

    public Regiao() {

    }

    public Long getId() {
        return id;
    }

    public String getRegiaoExame() {
        return regiaoExame;
    }

    public void setRegiaoExame(String regiaoExame) {
        this.regiaoExame = regiaoExame;
    }

    public Integer getTotalExames() {
        return totalExames;
    }

    public void setTotalExames(Integer totalExames) {
        this.totalExames = totalExames;
    }
}
