package com.generation.ProyectoSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // con getmapping estamos diciendo en que punto hara la petición
    @GetMapping("/")
    public String index() {
        return "Dani si pudo usar el Spring Boot!";
    }
}