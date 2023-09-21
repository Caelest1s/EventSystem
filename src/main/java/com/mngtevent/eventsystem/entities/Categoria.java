package com.mngtevent.eventsystem.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

    // attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;

    // relationship atividade
    @OneToMany(mappedBy = "categoria")
    private List<Atividade> atividades = new ArrayList<>();

    // constructor
    public Categoria() {

    }

    public Categoria(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

}
