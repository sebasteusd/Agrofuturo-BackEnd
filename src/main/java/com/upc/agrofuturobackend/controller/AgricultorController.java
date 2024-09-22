package com.upc.agrofuturobackend.controller;

import com.upc.agrofuturobackend.model.Agricultor;
import com.upc.agrofuturobackend.service.AgricultorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agricultores")
public class AgricultorController {
    private final AgricultorService service;

    public AgricultorController(AgricultorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Agricultor> obtenerTodos() {
        return service.obtenerTodos();
    }

    @PostMapping
    public Agricultor crearAgricultor(@RequestBody Agricultor agricultor) {
        return service.crearAgricultor(agricultor);
    }
}
