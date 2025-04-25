package com.trash.transformers.entities;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_entrega")
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_entrega;

    private Date data_hora;

    public Entrega() {

    }

    public Entrega(Integer id_entrega, Date data_hora) {
        this.id_entrega = id_entrega;
        this.data_hora = data_hora;
    }

    public Integer getId_entrega() {
        return id_entrega;
    }

    public void setId_entrega(Integer id_entrega) {
        this.id_entrega = id_entrega;
    }

    public Date getData_hora() {
        return data_hora;
    }

    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }
}
