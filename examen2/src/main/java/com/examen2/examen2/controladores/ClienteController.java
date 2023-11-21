package com.examen2.examen2.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.examen2.modelos.Cliente;
import com.examen2.examen2.servicios.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientes")

public class ClienteController {
    
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente){
        return this.clienteServiceImpl.crearCliente(cliente);
    }

    @GetMapping("/obtener/{idCliente}")
    public Cliente obtenerCliente(@PathVariable(name="idCliente") int idCliente){
        return this.clienteServiceImpl.obtenerCliente(idCliente);
    }

    @GetMapping("/obtener/todos")
    public List<Cliente> obtenerTodos(){
        return this.clienteServiceImpl.obtenerTodos();
    }
}
