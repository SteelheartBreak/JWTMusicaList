package com.example.demo.model;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class UserEntity {
    
    @Id
    @GeneratedValue
    Long id;

    private String nombre;
    private String contrasenia;
    private String correo;
    private String rol;
    
    public UserEntity(String nombre, String contrasenia, String correo, String rol) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.correo = correo;
        this.rol = rol;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public String getRol() {
        return rol;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia=contrasenia;
    }

    public void setCorreo(String correo) {
        this.correo=correo;
    }

    public void setRol(String rol) {
        this.rol=rol;
    }


}
