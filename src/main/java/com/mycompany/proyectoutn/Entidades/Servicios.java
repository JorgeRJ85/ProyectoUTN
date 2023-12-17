/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoutn.Entidades;
import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ilux
 */
@Entity
@Table(name="Servicios")

public class Servicios {
    
    @Id
    @Column(name="idServicio")
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int idServicio;
    @Column(name="nombreServicio")
    private String Nombreservicio;
    @Column(name="timepodeResolucion")
    private LocalDate timepodeResolucion;

    public Servicios() {
    }

    public Servicios(String Nombreservicio, LocalDate timepodeResolucion) {
        this.Nombreservicio = Nombreservicio;
        this.timepodeResolucion = timepodeResolucion;
    }

    public Servicios(int idServicio, String Nombreservicio, LocalDate timepodeResolucion) {
        this.idServicio = idServicio;
        this.Nombreservicio = Nombreservicio;
        this.timepodeResolucion = timepodeResolucion;
    }


   
    
}
