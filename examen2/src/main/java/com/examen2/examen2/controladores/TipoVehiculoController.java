package com.examen2.examen2.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.examen2.modelos.TipoVehiculo;
import com.examen2.examen2.servicios.impl.TipoClienteServiceImpl;
import com.examen2.examen2.servicios.impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/api/tipovehiculo")

public class TipoVehiculoController {
    
    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/crear")
    public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo){
        return this.tipoVehiculoServiceImpl.crearTipoVehiculo(tipoVehiculo);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarTipoVehiculo(@PathVariable(name="id") int id){
        return this.tipoVehiculoServiceImpl.eliminarTipoVehiculo(id);
    }

    @GetMapping("/obtener/todos")
    public List<TipoVehiculo> obtener(){
        return this.tipoVehiculoServiceImpl.obtenerTodos();
    }
}
