package com.trash.transformers.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_unidade")
public class Unidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_unidade;

    private String nome_unidade;

    public Unidade() {

    }

    public Unidade(Integer id_unidade, String nome_unidade) {
        this.id_unidade = id_unidade;
        this.nome_unidade = nome_unidade;
    }

    public Integer getId_unidade() {
        return id_unidade;
    }

    public void setId_unidade(Integer id_unidade) {
        this.id_unidade = id_unidade;
    }

    public String getNome_unidade() {
        return nome_unidade;
    }

    public void setNome_unidade(String nome_unidade) {
        this.nome_unidade = nome_unidade;
    }
}
