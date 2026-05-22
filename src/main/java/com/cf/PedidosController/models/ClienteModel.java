package com.cf.PedidosController.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_clientes")
@Data
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;

    @OneToMany(mappedBy = "clienteModel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProdutoModel> produtoModelList = new ArrayList<>();

}
