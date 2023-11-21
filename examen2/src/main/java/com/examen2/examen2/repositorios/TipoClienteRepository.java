package com.examen2.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen2.examen2.modelos.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {
    
}
