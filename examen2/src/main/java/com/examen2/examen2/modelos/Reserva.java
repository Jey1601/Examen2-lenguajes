package com.examen2.examen2.modelos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="reserva")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Reserva {

    @Id
    @Column(name="idreserva")
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int idReserva;

    @Column(name="idcliente")
    private int idCliente;

    @Column(name="idvehiculo")
    private int idVehiculo;

    private Date fecha;  
    
    private int dias;

    private double total;
}
