package com.examen2.examen2.controladores;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.examen2.modelos.Reserva;
import com.examen2.examen2.modelos.ReservaDTO;
import com.examen2.examen2.modelos.Vehiculo;
import com.examen2.examen2.servicios.impl.ClienteServiceImpl;
import com.examen2.examen2.servicios.impl.ReservaServiceImpl;
import com.examen2.examen2.servicios.impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api/reservas")

public class ReservaController {
    
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @Autowired 
    private ReservaServiceImpl reservaServiceImpl;


    @PostMapping("/reservar")
    public String resevar(@RequestBody ReservaDTO reservaDTO){
        Reserva reserva = new Reserva();
       
        if(this.clienteServiceImpl.verificarCliente(reservaDTO.getIdCliente())){
            if(this.vehiculoServiceImpl.cambiarEstadoOcupado(reservaDTO.getIdVehiculo())){
                Vehiculo vehiculo= this.vehiculoServiceImpl.obtenerVehiculo(reservaDTO.getIdVehiculo());
                double total =reservaDTO.getDias()*vehiculo.getTipoVehiculo().getPrecioXhora();
                Date fecha= new Date();
                
                reserva.setDias(reservaDTO.getDias());
                reserva.setIdVehiculo(reservaDTO.getIdVehiculo());
                reserva.setFecha(fecha);
                reserva.setIdCliente(reservaDTO.getIdCliente());
                reserva.setTotal(total);

                return this.reservaServiceImpl.crearReserva(reserva);


            }else{  
                return "Vehiculo se encuentra ocupado";
            }
            
        }else{
            return "Cliente no existe";
        }

    }
}
