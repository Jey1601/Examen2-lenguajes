package com.examen2.examen2.servicios;

import java.util.List;

import com.examen2.examen2.modelos.Cliente;

public interface ClienteService {

    public List<Cliente> obtenerTodos();

    public Cliente obtenerCliente(int idCliente);

    public Cliente crearCliente(Cliente cliente);

    public Boolean verificarCliente(int idCliente);
} 
