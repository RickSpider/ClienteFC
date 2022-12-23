/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nm.clientefc.modelo;

/**
 *
 * @author BlackSpider
 */
public class Tarjeta {
    
     //seccion tarjeta credito/debito
    private Long denominacionTarjeta;
    private Long formaProcesamiento;
    
    //Campos no Obligatorios
    private String procesadora;
    private String ProcesadoraRuc;
    private Integer procesadoraDV;
   
    private Integer codigoAutorizacion;
    private String tarjetaNombre;
    private Integer tarjetaNro;
    

    /**
     * 
     * DENOMINACION DE LA TARJETA
     * 1:Visa
     * 2:Mastercard
     * 3:American Express
     * 4:Maestro
     * 5:Panal
     * 6:Cabal
     * 99:Otro
     * 
     * FORMA DE PROCESAMIENTO
     * 1:POS
     * 2:Pago Electronico (Ej. Compras por internet)
     * 9:Otro
     * 
     * 
     * @param denominacionTarjeta
     * @param formaProcesamiento 
     */
    public Tarjeta(Long denominacionTarjeta, Long formaProcesamiento) {
        this.denominacionTarjeta = denominacionTarjeta;
        this.formaProcesamiento = formaProcesamiento;
    }
    
    
    
    public String getProcesadora() {
        return procesadora;
    }

    public void setProcesadora(String procesadora) {
        this.procesadora = procesadora;
    }

    public String getProcesadoraRuc() {
        return ProcesadoraRuc;
    }

    public void setProcesadoraRuc(String ProcesadoraRuc) {
        this.ProcesadoraRuc = ProcesadoraRuc;
    }

    public Integer getProcesadoraDV() {
        return procesadoraDV;
    }

    public void setProcesadoraDV(Integer procesadoraDV) {
        this.procesadoraDV = procesadoraDV;
    }

    public Long getFormaProcesamiento() {
        return formaProcesamiento;
    }

    /**
     * 
     * 1:POS
     * 2:Pago Electronico (Ej. Compras por internet)
     * 9:Otro
     * 
     * @param formaProcesamiento 
     */
    public void setFormaProcesamiento(Long formaProcesamiento) {
        this.formaProcesamiento = formaProcesamiento;
    }

    public Integer getCodigoAutorizacion() {
        return codigoAutorizacion;
    }

    public void setCodigoAutorizacion(Integer codigoAutorizacion) {
        this.codigoAutorizacion = codigoAutorizacion;
    }

    public String getTarjetaNombre() {
        return tarjetaNombre;
    }

    public void setTarjetaNombre(String tarjetaNombre) {
        this.tarjetaNombre = tarjetaNombre;
    }

    public Integer getTarjetaNro() {
        return tarjetaNro;
    }

    /**
     * 
     * Cuatro ultimos digitos de la tarjeta
     * 
     * @param tarjetaNro 
     */
    public void setTarjetaNro(Integer tarjetaNro) {
        this.tarjetaNro = tarjetaNro;
    }

    public Long getDenominacionTarjeta() {
        return denominacionTarjeta;
    }

    /**
     * 
     * 1:Visa
     * 2:Mastercard
     * 3:American Express
     * 4:Maestro
     * 5:Panal
     * 6:Cabal
     * 99:Otro
     * 
     * @param denominacionTarjeta 
     */
    public void setDenominacionTarjeta(Long denominacionTarjeta) {
        this.denominacionTarjeta = denominacionTarjeta;
    }
}
