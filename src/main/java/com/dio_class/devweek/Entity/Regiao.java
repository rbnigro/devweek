package com.dio_class.devweek.Entity;

import javax.persistence.*;

@Entity
public class Regiao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String regiao;
    private Integer totalExames;

    public Regiao(String regiao, Integer total) {
        this.regiao = regiao;
        this.totalExames = total;
    }

    public Regiao() {

    }

    public Long getId() {
        return id;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Integer getTotalExames() {
        return totalExames;
    }

    public void setTotalExames(Integer totalExames) {
        this.totalExames = totalExames;
    }
}
