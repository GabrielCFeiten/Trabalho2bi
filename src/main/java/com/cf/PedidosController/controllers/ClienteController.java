package com.cf.PedidosController.controllers;

import com.cf.PedidosController.models.ClienteModel;
import com.cf.PedidosController.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteModel> buscar(){
        return clienteService.findAll();
    }

    @PostMapping
    public ClienteModel salval(@RequestBody ClienteModel clienteModel){
        return clienteService.save(clienteModel);
    }
}
