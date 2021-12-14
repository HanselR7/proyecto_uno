package com.example.proyecto_uno.controladores;

import com.example.proyecto_uno.servicios.Calculadora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaControlador {
    @Autowired
    private Calculadora calculadora;
    public RestaControlador() {
        System.out.println("Controlador de resta creado");
    }

    @GetMapping("/restar")
    public String resta() {
        int a = 5, b = 10;
        return a + " - " + b + " = " + calculadora.resta(a, b);
    }
}
