package com.example.clienteDumyCrud.service.implement;

import com.example.clienteDumyCrud.model.ClientesResponse;
import com.example.clienteDumyCrud.model.register.ClientesRegister;
import com.example.clienteDumyCrud.service.ICliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

@Service
public class ClienteImplement implements ICliente {


    private static final Logger LOGGER = LoggerFactory.getLogger(ClienteImplement.class);


    // Create Cliente
    @Override
    public ClientesResponse createCliente(ClientesRegister cliente) {
        LOGGER.info("createCliente");
        ClientesResponse response = new ClientesResponse();

        response.setId(UUID.randomUUID().toString());
        response.setNombre(cliente.getNombre());
        response.setApellido(cliente.getApellido());
        response.setDireccion(cliente.getDireccion());
        response.setTelefono(cliente.getTelefono());
        response.setEmail(cliente.getEmail());

        return response;
    }

    // Update Cliente
    @Override
    public ClientesResponse updateCliente(String id, ClientesRegister cliente) {

        LOGGER.info("updateCliente {}",id);
        ClientesResponse response = new ClientesResponse();

        response.setId(id);
        response.setNombre(cliente.getNombre());
        response.setApellido(cliente.getApellido());
        response.setDireccion(cliente.getDireccion());
        response.setTelefono(cliente.getTelefono());
        response.setEmail(cliente.getEmail());

        return response;
    }

    // Delete Cliente
    @Override
    public Map<String, Object> deleteCliente(String id) {

        LOGGER.info("deleteCliente {}",id);

        Map<String, Object> response = new HashMap<>();

        if (Objects.nonNull(id)) {
            response.put("id", id);
            response.put("message", "Cliente eliminado");
        }

        return response;
    }

    // Get Cliente
    @Override
    public ClientesResponse getCliente(String id) {

        LOGGER.info("getCliente {}",id);
        ClientesResponse response = new ClientesResponse();

        response.setId(id);
        response.setNombre("Nombre");
        response.setApellido("Apellido");
        response.setDireccion("Direccion");
        response.setTelefono("Telefono");
        response.setEmail("Email");

        return response;
    }
}

