package com.trash.transformers.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_curso;
    private String nome_curso;

    public Curso() {

    }


    public Curso(Integer id_curso, String nome_curso) {
        this.id_curso = id_curso;
        this.nome_curso = nome_curso;
    }



    public Integer getId_curso() {
        return id_curso;
    }

    public void setId_curso(Integer id_curso) {
        this.id_curso = id_curso;
    }

    public String getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }
}
