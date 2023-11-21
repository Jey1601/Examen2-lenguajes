package com.examen2.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.examen2.modelos.TipoCliente;
import com.examen2.examen2.repositorios.TipoClienteRepository;
import com.examen2.examen2.servicios.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService {

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(TipoCliente tipoCliente ) {
        return this.tipoClienteRepository.save(tipoCliente);
    }
    
}
