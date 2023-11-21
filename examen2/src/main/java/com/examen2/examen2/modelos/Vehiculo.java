package com.examen2.examen2.modelos;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="vehiculo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Vehiculo {
    
    @Id
    @Column(name="idvehiculo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVehiculo;

    private String marca;

    private int anio;

    private boolean disponible;


    @ManyToOne
    @JoinColumn(name="idtipovehiculo", referencedColumnName = "idtipovehículo")
    private TipoVehiculo tipoVehiculo;

    
}
