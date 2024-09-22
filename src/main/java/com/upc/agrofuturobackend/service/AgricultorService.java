package com.upc.agrofuturobackend.service;

import com.upc.agrofuturobackend.model.Agricultor;
import com.upc.agrofuturobackend.repository.AgricultorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgricultorService {
    private final AgricultorRepository repository;

    public AgricultorService(AgricultorRepository repository) {
        this.repository = repository;
    }

    public List<Agricultor> obtenerTodos() {
        return repository.findAll();
    }

    public Agricultor crearAgricultor(Agricultor agricultor) {
        return repository.save(agricultor);
    }
}
