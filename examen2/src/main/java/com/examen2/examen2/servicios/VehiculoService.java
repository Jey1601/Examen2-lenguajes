package com.examen2.examen2.servicios;

import java.util.List;

import com.examen2.examen2.modelos.Vehiculo;

public interface VehiculoService {

    public Vehiculo crearVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> obtenerTodos();
    
    public Vehiculo obtenerVehiculo(int idVehiculo);

    public Boolean cambiarEstadoOcupado(int idVehiculo);
    
} 
