package com.example.clienteDumyCrud.model;


import lombok.Data;

@Data
public class ClientesResponse {

    private String id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;

    public ClientesResponse() {
        super();
    }

    public ClientesResponse(String id, String nombre,
                            String apellido, String direccion,
                            String telefono, String email) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
}
