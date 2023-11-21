package com.examen2.examen2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.examen2.modelos.Vehiculo;
import com.examen2.examen2.repositorios.VehiculoRepository;
import com.examen2.examen2.servicios.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
       return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> obtenerTodos() {
       return this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo obtenerVehiculo(int idVehiculo) {
       return this.vehiculoRepository.findById(idVehiculo).orElse(null);
    }

    @Override
    public Boolean cambiarEstadoOcupado(int idVehiculo) {
        Vehiculo vehiculo=this.vehiculoRepository.findById(idVehiculo).get();

        if(vehiculo!=null){
            if(vehiculo.isDisponible()){
                vehiculo.setDisponible(false);
                return true;
            }else{
                return false;
            }

        }

        return false;
    }
    
}
