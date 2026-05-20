package com.cf.PedidosController.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_produtos")
@Data
public class ProdutoModel {

    @Id
    private Long id;
    private String nome;
    private Double preco;

    @ManyToOne
    private ClienteModel clienteModel;

}
