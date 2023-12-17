/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoutn.Entidades;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

public class Tecnico { 
    
    private int idTecnico;
    private String nombre;
    private boolean estado;
    private String email;
    
    private Servicios servicio;
    

    public Tecnico() {
    }

  
    
    

}
