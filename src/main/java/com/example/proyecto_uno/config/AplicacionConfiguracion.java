package com.example.proyecto_uno.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.proyecto_uno.servicios.Calculadora;

@Configuration
public class AplicacionConfiguracion {

    @Bean
    public Calculadora configurarCalculadora() {
        System.out.println("Bean calculadora creado");
        return new Calculadora();
    }
}
