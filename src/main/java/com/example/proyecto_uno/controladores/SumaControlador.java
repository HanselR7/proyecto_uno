package com.example.proyecto_uno.controladores;

import com.example.proyecto_uno.servicios.Calculadora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumaControlador {
    @Autowired
    private Calculadora calculadora;

    public SumaControlador() {
        System.out.println("Controlador de suma creado");
    }

    @GetMapping("/sumar")
    public String sumar() {
        int a = 5, b = 10;
        return a + " + " + b + " = " + calculadora.suma(a, b);
    }
}
