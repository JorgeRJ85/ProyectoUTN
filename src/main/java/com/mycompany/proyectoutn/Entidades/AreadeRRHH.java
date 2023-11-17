/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoutn.Entidades;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author ilux
 */
public class AreadeRRHH {
    private int idReporte;
    private String reporte;        
    
    private Tecnico tecni;

    public AreadeRRHH() {
    }

    public AreadeRRHH(String reporte, Tecnico tecni) {
        this.reporte = reporte;
        this.tecni = tecni;
    }

    public AreadeRRHH(int idReporte, String reporte, Tecnico tecni) {
        this.idReporte = idReporte;
        this.reporte = reporte;
        this.tecni = tecni;
    }
    
    
    
    
}
