package com.trash.transformers.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_itemEntrega")
public class ItemEntrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_item;

    private Integer quantidade_kg;

    public ItemEntrega() {

    }

    public ItemEntrega(Integer id_item, Integer quantidade_kg) {
        this.id_item = id_item;
        this.quantidade_kg = quantidade_kg;
    }

    public Integer getId_item() {
        return id_item;
    }

    public void setId_item(Integer id_item) {
        this.id_item = id_item;
    }

    public Integer getQuantidade_kg() {
        return quantidade_kg;
    }

    public void setQuantidade_kg(Integer quantidade_kg) {
        this.quantidade_kg = quantidade_kg;
    }
}
