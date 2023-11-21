package com.examen2.examen2.servicios;

import java.util.List;

import com.examen2.examen2.modelos.TipoVehiculo;

public interface TipoVehiculoService {

    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo);

    public String eliminarTipoVehiculo(int id);
    
    public List<TipoVehiculo> obtenerTodos();
} 