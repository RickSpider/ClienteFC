/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nm.clientefc.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BlackSpider
 */
public class CondicionOperacion {
 
    private Long condicion;
   
    private ArrayList<TipoPago> tiposPagos = new ArrayList<TipoPago>() ;
    
    public Long getCondicion() {
        return condicion;
    }

    /**
     * Valores posibles de condicion
     * 1:Contado 
     * 2:credito
     * @param condicion
    */
    public void setCondicion(Long condicion) {
        this.condicion = condicion;
    }

    
    public ArrayList<TipoPago> getTiposPagos() {
        return tiposPagos;
    }

    
    /**
     * 
     * Solo agregar esto en caso de que la condicion se CONTADO
     * 
     * @param tiposPagos 
     * 
     */
    public void setTiposPagos(ArrayList<TipoPago> tiposPagos) {
        this.tiposPagos = tiposPagos;
    }

    
    //SECCION CREDITO
    
    
    private Long operacionTipo;
    
    private String plazoCredito;
    
    private Integer cantidadCuota;
    
    private Double montoEntregaIni;
    
    private List<Cuota> cuotas;
    
    public Long getOperacionTipo() {
        return operacionTipo;
    }

    /**
     * Tipo de Operacion de Credito
     * Valores Posibles:
     * 1:Plazo
     * 2:cuota
     * 
     * @param operacionTipo
     * 
     */
    public void setOperacionTipo(Long operacionTipo) {
        this.operacionTipo = operacionTipo;
    }

    public String getPlazoCredito() {
        return plazoCredito;
    }

    /**
     * Solo si la operacionTipo es Plazo
     * Ejemplo: 30 dias, 12 meses
     * 
     * @param plazoCredito 
     */
    public void setPlazoCredito(String plazoCredito) {
        this.plazoCredito = plazoCredito;
    }

    public Integer getCantidadCuota() {
        return cantidadCuota;
    }

    /**
     * Solo si operacionTipo es Cuota
     * Cantidad de cuotas
     * 
     * @param cantidadCuota ej: 12,24,36
     */
    public void setCantidadCuota(Integer cantidadCuota) {
        this.cantidadCuota = cantidadCuota;
    }

    public Double getMontoEntregaIni() {
        return montoEntregaIni;
    }

    /**
     * Monto de entrega Inicia maximo cuatro decimales
     * 
     * @param montoEntregaIni 
     */
    public void setMontoEntregaIni(Double montoEntregaIni) {
        this.montoEntregaIni = montoEntregaIni;
    }

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    /**
     * 
     * Solo agregar esto en caso de que la condicion se CREDITO
     * 
     * @param cuotas 
     */
    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }
    
    public String getCondicionStr() {
    	String out = this.getCondicion() == 1 ? "CONTADO" : "CRÉDITO";
    	return out;
    }
    
}
