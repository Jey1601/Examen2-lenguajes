package com.examen2.examen2.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.examen2.modelos.Vehiculo;
import com.examen2.examen2.servicios.impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api/vehiculos")

public class VehiculoController {
    
    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/crear")
    public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo){
        return this.vehiculoServiceImpl.crearVehiculo(vehiculo);
    }

    @GetMapping("/obtener/todos")
    public List<Vehiculo> obtenerTodos(){
        return this.vehiculoServiceImpl.obtenerTodos();
    }

    @GetMapping("/obtener/{idVehiculo}")
    public Vehiculo obtener(@PathVariable(name="idVehiculo") int idVehiculo){
        return this.vehiculoServiceImpl.obtenerVehiculo(idVehiculo);
    }

}
