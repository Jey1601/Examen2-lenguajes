package com.examen2.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.examen2.modelos.TipoCliente;
import com.examen2.examen2.servicios.impl.TipoClienteServiceImpl;

@RestController
@RequestMapping("/api/tipocliente")
public class TipoClienteController {
    
    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/crear/{descripcion}")
    public TipoCliente crearTipoCliente(@PathVariable(name="descripcion") String descripcion){
        TipoCliente tipoCliente = new TipoCliente();
        tipoCliente.setDescripcion(descripcion);

        return this.tipoClienteServiceImpl.crearTipoCliente(tipoCliente);
   }

  
}
