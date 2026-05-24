package com.example.demoInicioSesion.controllers;

import com.example.demoInicioSesion.dao.UsuarioDao;
import com.example.demoInicioSesion.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class UsuarioController {

    private final UsuarioDao usuarioDao;

    private final PasswordEncoder passwordEncoder;


    public UsuarioController(UsuarioDao usuarioDao, PasswordEncoder passwordEncoder) {
        this.usuarioDao = usuarioDao;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/")
    public String mostrarLogin(@RequestParam(required = false) String error, Model model) {
        if(error != null){
            model.addAttribute(
                    "error",
                    "Usuario o contraseña incorrectos"
            );
        }

        return "index";
    }

    @GetMapping("/success")
    public String success() {
        return "success";
    }

    @PostMapping("/registro")
    public String registrarUsuario(Usuario usuario, RedirectAttributes redirectAttributes) {


        if (usuarioDao.existsByUsername(usuario.getUsername())) {

            redirectAttributes.addFlashAttribute("estado", "Nombre de usuario ya existe");

            return "redirect:/registro";
        }
        if(usuario.getUsername() == null || usuario.getUsername().trim().isEmpty() || usuario.getPassword() == null || usuario.getPassword().trim().isEmpty()){
            redirectAttributes.addFlashAttribute("estado", "Rellene todos los campos");
            return "redirect:/registro";
        }
        if(usuario.getUsername().length() < 3 || usuario.getUsername().length() > 25 ){
            redirectAttributes.addFlashAttribute("estado", "Usuario debe contener entre 3 y 25 caracteres");
            return "redirect:/registro";
        }
        if (usuario.getPassword().length() < 6 || usuario.getPassword().length() > 32){
            redirectAttributes.addFlashAttribute("estado","La contraseña debe contener entre 6 y 32 caracteres");
            return "redirect:/registro";
        }
        if(!usuario.getPassword().matches("^(?=.*[A-Z])(?=.*[^a-zA-Z0-9]).+$")){
            redirectAttributes.addFlashAttribute("estado","La contraseña debe contenar una mayuscula y al menos un caracter especial");
            return "redirect:/registro";
        }

        String passwordHasheada = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(passwordHasheada);


        usuarioDao.save(usuario);

        redirectAttributes.addFlashAttribute("estado", "Usuario registrado con éxito");
        return "redirect:/registro";
    }
    @GetMapping("/registro")
    public String mostrarRegistro() {
        return "registro";
    }
}
