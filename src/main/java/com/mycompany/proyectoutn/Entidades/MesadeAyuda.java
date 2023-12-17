/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
@Table(name="MesadeAyuda")
public class MesadeAyuda {
    @Id
    @Column(name="idIncidente")
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int idIncidente;
    //////******invocaciones
    @ManyToOne
    @JoinColumn(name = "idCliente")
    public  AreaComercial areaCom;
    
    @ManyToOne
    @JoinColumn(name = "idTecnico")
    public Tecnico tecnico;
    /////************** 
    @Column(name="problema")
    private String problema;
    @Column(name="inicioT")
    private LocalDate inicioT;
    
    @Column(name="inicioF")
    private LocalDate inicioF;
    @Column (name = "estado")
    private boolean estado;
    
    
    public MesadeAyuda() {
    }


    
    
}
