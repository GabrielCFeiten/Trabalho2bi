package com.cf.PedidosController.models;

import jakarta.persistence.*;
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
    @JoinColumn(name = "cliente_id")
    private ClienteModel clienteModel;

}
