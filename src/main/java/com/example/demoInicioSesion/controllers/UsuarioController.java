package com.example.demoInicioSesion.controllers;

import com.example.demoInicioSesion.dao.UsuarioDao;
import com.example.demoInicioSesion.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class UsuarioController {

    private UsuarioDao usuarioDao;

    public UsuarioController(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    @RequestMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model){
        Usuario usuario = usuarioDao.findByUsername(username);
        System.out.println(username);


        if(usuario ==null){
            model.addAttribute("error", "Usuario no existe");
            return "index";
            }

        if(usuario.getPassword().equals(password)){
            return "redirect:/sucess.html";
        }

        model.addAttribute("error", "Contraseña incorrecta");
        return "index";
    }

    @PostMapping("/registro")
    public String registrarUsuario(Usuario usuario) {

        usuarioDao.save(usuario);

        return "redirect:/";
    }

}
