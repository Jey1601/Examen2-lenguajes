package com.examen2.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.examen2.modelos.Reserva;
import com.examen2.examen2.repositorios.ReservaRepository;
import com.examen2.examen2.servicios.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;
    @Override
    public String crearReserva(Reserva reserva) {
       Reserva reserva2=this.reservaRepository.save(reserva);

       if(reserva2!=null){
        return "Reservado correctamente";
       }

       return "no se pudo realizar la reserva";
    }
    
}
