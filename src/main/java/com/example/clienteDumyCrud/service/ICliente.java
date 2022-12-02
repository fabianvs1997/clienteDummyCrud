package com.example.clienteDumyCrud.service;

import com.example.clienteDumyCrud.model.ClientesResponse;
import com.example.clienteDumyCrud.model.register.ClientesRegister;
import netscape.javascript.JSObject;

import java.util.Map;
import java.util.Objects;

public interface ICliente {

    ClientesResponse createCliente(ClientesRegister cliente);

    ClientesResponse updateCliente(String id, ClientesRegister cliente);

    Map<String, Object> deleteCliente(String id);

    ClientesResponse getCliente(String id);
}
