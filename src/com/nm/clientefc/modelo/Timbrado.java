/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nm.clientefc.modelo;

import java.util.Calendar;

/**
 *
 * @author BlackSpider
 */
public class Timbrado {
 
    private String timbrado;
    private String establecimiento;
    private String puntoExpedicion;
    private String documentoNro;
    private Calendar fecIni;

    public String getTimbrado() {
        return timbrado;
    }

    public void setTimbrado(String timbrado) {
        this.timbrado = timbrado;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getPuntoExpedicion() {
        return puntoExpedicion;
    }

    public void setPuntoExpedicion(String puntoExpedicion) {
        this.puntoExpedicion = puntoExpedicion;
    }

    public String getDocumentoNro() {
        return documentoNro;
    }

    public void setDocumentoNro(String documentoNro) {
        this.documentoNro = documentoNro;
    }

    public Calendar getFecIni() {
        return fecIni;
    }

    public void setFecIni(Calendar fecIni) {
        this.fecIni = fecIni;
    }
    
    
    
}
