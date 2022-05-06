package com.platzi.market.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private String id;

    private String nombre;

    private String apellido;

    private Long celular;

    private String direccion;

    @Column(name = "correo_electronico")
    private String corrreoElectronico;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorrreoElectronico() {
        return corrreoElectronico;
    }

    public void setCorrreoElectronico(String corrreoElectronico) {
        this.corrreoElectronico = corrreoElectronico;
    }
}
