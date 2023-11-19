package com.example.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;
    private boolean feita;

    public Tarefa() {
        // Construtor padrão necessário para JPA
    }

    public Tarefa(int id, String descricao, boolean feita) {
        this.id = id;
        this.descricao = descricao;
        this.feita = feita;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    private String getDescricao() {
        return descricao;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private boolean isFeita() {
        return feita;
    }

    private void setFeita(boolean feita) {
        this.feita = feita;
    }
}
