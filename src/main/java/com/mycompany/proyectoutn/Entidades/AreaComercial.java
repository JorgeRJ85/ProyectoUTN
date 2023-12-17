/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoutn.Entidades;
import jakarta.persistence.*;

import java.util.List;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name="AreaComercial")
public class AreaComercial {
    @Id
    @Column(name="idCliente")
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    
    private int idCliente;
    @Column(name="nombre")
    private String Nombre;
    @Column(name="cuit")
    private int Cuit;
     @Column(name="estado")
    private boolean Estado;
      @Column(name="nombreEmpresa")
    private String nombreEmpresa;
    @Column(name="email")
    private String email;  
    @ManyToOne
    @JoinColumn(name = "idServicio")
    private Servicios servicio;

    public AreaComercial() {
    }

    public AreaComercial(String Nombre, int Cuit, boolean Estado, String nombreEmpresa, String email, Servicios servicio) {
        this.Nombre = Nombre;
        this.Cuit = Cuit;
        this.Estado = Estado;
        this.nombreEmpresa = nombreEmpresa;
        this.email = email;
        this.servicio = servicio;
    }

    public AreaComercial(int idCliente, String Nombre, int Cuit, boolean Estado, String nombreEmpresa, String email, Servicios servicio) {
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.Cuit = Cuit;
        this.Estado = Estado;
        this.nombreEmpresa = nombreEmpresa;
        this.email = email;
        this.servicio = servicio;
    }


    
}
