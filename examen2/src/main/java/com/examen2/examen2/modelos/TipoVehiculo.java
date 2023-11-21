package com.examen2.examen2.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tipovehiculo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class TipoVehiculo {
    
    @Id
    @Column(name="idtipovehículo ")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoVehiculo;

    private String descripcion;
    
    @Column(name="precioxhora")
    private double precioXhora;

    @OneToMany(mappedBy = "tipoVehiculo", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Vehiculo> vehiculos;

}
