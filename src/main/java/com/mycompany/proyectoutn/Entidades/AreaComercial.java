/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoutn.Entidades;

import java.util.List;
import lombok.Getter;
import lombok.Setter;




public class AreaComercial {
    private int idCliente;
    private String Nombre;
    private int Cuit;
    private boolean Estado;
    private String nombreEmpresa;
    private List<String> serviciosContratados;

    public AreaComercial() {
    }

    public AreaComercial(String Nombre, int Cuit, boolean Estado, String nombreEmpresa, List<String> serviciosContratados) {
        this.Nombre = Nombre;
        this.Cuit = Cuit;
        this.Estado = Estado;
        this.nombreEmpresa = nombreEmpresa;
        this.serviciosContratados = serviciosContratados;
    }

    public AreaComercial(int idCliente, String Nombre, int Cuit, boolean Estado, String nombreEmpresa, List<String> serviciosContratados) {
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.Cuit = Cuit;
        this.Estado = Estado;
        this.nombreEmpresa = nombreEmpresa;
        this.serviciosContratados = serviciosContratados;
    }
    
    
    
}
