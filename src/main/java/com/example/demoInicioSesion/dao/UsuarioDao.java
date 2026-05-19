package com.example.demoInicioSesion.dao;

import com.example.demoInicioSesion.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Integer> {
    Usuario findByUsername(String username);

    boolean existsByUsername(String username);
}
