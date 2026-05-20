package com.cf.PedidosController.services;

import com.cf.PedidosController.models.ClienteModel;
import com.cf.PedidosController.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> findAll(){
        return clienteRepository.findAll();
    }

    public ClienteModel save(ClienteModel clienteModel){
        return clienteRepository.save(clienteModel);
    }
}
