/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nm.clientefc.modelo;

/**
 *
 * @author BlackSpider
 */
public class ComprobanteDetalle {
 
    private String itemCodigo;
    private String itemDescripcion;
    private Long itemUndMedida;
    private double desccuento;
    
    private double cantidad;
    private double precioUnitario;
    
  
    private Long afectacionTributaria;
    private int proporcionIVA;
    private int tasaIVA;

    public String getItemCodigo() {
        return itemCodigo;
    }

    public void setItemCodigo(String itemCodigo) {
        this.itemCodigo = itemCodigo;
    }

    public String getItemDescripcion() {
        return itemDescripcion;
    }

    public void setItemDescripcion(String itemDescripcion) {
        this.itemDescripcion = itemDescripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getProporcionIVA() {
        return proporcionIVA;
    }

    public void setProporcionIVA(int proporcionIVA) {
        this.proporcionIVA = proporcionIVA;
    }

    public int getTasaIVA() {
        return tasaIVA;
    }

    public void setTasaIVA(int tasaIVA) {
        this.tasaIVA = tasaIVA;
    }

    public Long getItemUndMedida() {
        return itemUndMedida;
    }

    public void setItemUndMedida(Long itemUndMedida) {
        this.itemUndMedida = itemUndMedida;
    }

    public Long getAfectacionTributaria() {
        return afectacionTributaria;
    }

    /**
     * Posibles valores
     *   
     *   1: Gravado IVA
     *   2: Exonerado (Art. 83- Ley 125/91)
     *   3: Exento
     *   4: Gravado parcial (Grav-Exento)
     * 
     * @param afectacionTributaria 
     */
    public void setAfectacionTributaria(Long afectacionTributaria) {
        this.afectacionTributaria = afectacionTributaria;
    }

    public double getDesccuento() {
        return desccuento;
    }

    public void setDesccuento(double desccuento) {
        this.desccuento = desccuento;
    }

     
}
