package com.examen2.examen2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.examen2.modelos.TipoVehiculo;
import com.examen2.examen2.repositorios.TipoVehiculoRepository;
import com.examen2.examen2.servicios.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl  implements TipoVehiculoService{

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
       return this.tipoVehiculoRepository.save(tipoVehiculo);
    }

    @Override
    public String eliminarTipoVehiculo(int id) {
        TipoVehiculo tipoVehiculo=this.tipoVehiculoRepository.findById(id).get();

        if(tipoVehiculo!=null){
            this.tipoVehiculoRepository.deleteById(id);
            return "Tipo Vehiculo Elimnado";
        }

        return "Tipo Vehiculo no existe";
    }

    @Override
    public List<TipoVehiculo> obtenerTodos() {
        return this.tipoVehiculoRepository.findAll();
    }
    
}
