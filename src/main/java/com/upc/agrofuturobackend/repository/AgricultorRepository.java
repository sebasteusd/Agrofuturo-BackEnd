package com.upc.agrofuturobackend.repository;

import com.upc.agrofuturobackend.model.Agricultor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgricultorRepository extends JpaRepository<Agricultor, Long> {
}
