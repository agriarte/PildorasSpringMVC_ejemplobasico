/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tallerdeapps.primermvc;

/**
 *
 * @author Pedro
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
    
    @RequestMapping("")
    public String mostrarIniciovacio() {
        return "inicio";
    }

    @RequestMapping("/inicio")
    public String mostrarInicio() {
        return "inicio";
    }

    @RequestMapping("/otraPagina")
    public String mostrarOtraPagina() {
        return "otraPagina";
    }
}
