package com.example.demoInicioSesion.controllers;

import com.example.demoInicioSesion.dao.PeliculaDao;
import com.example.demoInicioSesion.models.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PeliculaController {

    @Autowired
    private PeliculaDao peliculaDao;

    @GetMapping("/catalogo")
    public String mostrarCatalogo(Model model){

        List<Pelicula> peliculas = peliculaDao.findAll();

        model.addAttribute("peliculas", peliculas);

        return "catalogo";
    }

}


