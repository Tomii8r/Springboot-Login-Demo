package com.example.demoInicioSesion.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuarios")
@ToString
@EqualsAndHashCode
public class Usuario {
    @Id
    @Getter @Setter @Column(name="id")
    private int id;
    @Getter @Setter @Column(name="username")
    private String username;
    @Getter @Setter @Column(name="password")
    private String password;
    @Getter @Setter @Column(name="rol")
    private String rol;

    public Usuario() {
    }

    public Usuario(int id, String username, String password, String rol) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.rol= rol;
    }
}
