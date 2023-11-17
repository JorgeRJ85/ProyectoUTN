/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoutn.Entidades;

import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Tecnico { 
    private int idTecnico;
    private String nombre;
    private List<String> especialidades;
    private MesadeAyuda mesAyu;
    private LocalDate timepoderesolucion;

    public Tecnico() {
    }

    public Tecnico(String nombre, List<String> especialidades, MesadeAyuda mesAyu, LocalDate timepoderesolucion) {
        this.nombre = nombre;
        this.especialidades = especialidades;
        this.mesAyu = mesAyu;
        this.timepoderesolucion = timepoderesolucion;
    }

    public Tecnico(int idTecnico, String nombre, List<String> especialidades, MesadeAyuda mesAyu, LocalDate timepoderesolucion) {
        this.idTecnico = idTecnico;
        this.nombre = nombre;
        this.especialidades = especialidades;
        this.mesAyu = mesAyu;
        this.timepoderesolucion = timepoderesolucion;
    }
    
    
    

}
