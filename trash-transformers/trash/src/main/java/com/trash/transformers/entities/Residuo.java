package com.trash.transformers.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_residuo")
public class Residuo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_residuo;

    private String nome_residuo;

    public Residuo() {

    }

    public Residuo(Integer id_residuo, String nome_residuo) {
        this.id_residuo = id_residuo;
        this.nome_residuo = nome_residuo;
    }

    public Integer getId_residuo() {
        return id_residuo;
    }

    public void setId_residuo(Integer id_residuo) {
        this.id_residuo = id_residuo;
    }

    public String getNome_residuo() {
        return nome_residuo;
    }

    public void setNome_residuo(String nome_residuo) {
        this.nome_residuo = nome_residuo;
    }
}



