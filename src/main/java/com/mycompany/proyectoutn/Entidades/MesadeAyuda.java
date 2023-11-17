/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoutn.Entidades;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author ilux
 */
public class MesadeAyuda {
    private int idIncidente;
    public  AreaComercial areaCom;
    private String problema;
    private LocalDate inicioT;
    private LocalDate inicioF;

    public MesadeAyuda() {
    }

    public MesadeAyuda(AreaComercial areaCom, String problema, LocalDate inicioT, LocalDate inicioF) {
        this.areaCom = areaCom;
        this.problema = problema;
        this.inicioT = inicioT;
        this.inicioF = inicioF;
    }

    public MesadeAyuda(int idIncidente, AreaComercial areaCom, String problema, LocalDate inicioT, LocalDate inicioF) {
        this.idIncidente = idIncidente;
        this.areaCom = areaCom;
        this.problema = problema;
        this.inicioT = inicioT;
        this.inicioF = inicioF;
    }
    
    
    
    
}
