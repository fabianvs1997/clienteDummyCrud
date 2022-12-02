package com.example.clienteDumyCrud.controller;

import com.example.clienteDumyCrud.model.ClientesResponse;
import com.example.clienteDumyCrud.model.register.ClientesRegister;
import com.example.clienteDumyCrud.service.ICliente;
import jakarta.websocket.server.PathParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private ICliente cliente;


    @PostMapping("/create")
    public ClientesResponse createCliente(@RequestBody ClientesRegister cliente) {
        LOGGER.info("createCliente");
        return this.cliente.createCliente(cliente);
    }

    @PostMapping("/update{id}")
    public ClientesResponse updateCliente(@RequestBody ClientesRegister cliente, @PathParam("id") String id) {
        LOGGER.info("updateCliente {}",id);
        return this.cliente.updateCliente(id, cliente);
    }

    @DeleteMapping("/delete{id}")
    public Map<String, Object> deleteCliente(@PathParam("id") String id) {
        LOGGER.info("deleteCliente {}",id);
        return this.cliente.deleteCliente(id);
    }

    @GetMapping("/get{id}")
    public ClientesResponse getCliente(@PathParam("id") String id) {
        LOGGER.info("getCliente {}",id);
        return this.cliente.getCliente(id);
    }

}
