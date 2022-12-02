package com.example.clienteDumyCrud.model.register;

import lombok.Data;

@Data
public class ClientesRegister {

    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;

    public ClientesRegister() {
        super();
    }

    public ClientesRegister(String nombre, String apellido,
                            String direccion, String telefono,
                            String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
}
