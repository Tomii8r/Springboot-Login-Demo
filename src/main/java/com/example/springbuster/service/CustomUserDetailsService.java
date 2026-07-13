package com.example.demoInicioSesion.service;


import com.example.demoInicioSesion.dao.UsuarioDao;
import com.example.demoInicioSesion.models.Usuario;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UsuarioDao usuarioDao;

    public CustomUserDetailsService(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    @Override
    public UserDetails loadUserByUsername(
            String username)
            throws UsernameNotFoundException {

        Usuario usuario =
                usuarioDao.findByUsername(username);

        if(usuario == null){
            throw new UsernameNotFoundException(
                    "Usuario no encontrado"
            );
        }

        return User.builder()
                .username(usuario.getUsername())
                .password(usuario.getPassword())
                .roles("USER")
                .build();
    }
}
