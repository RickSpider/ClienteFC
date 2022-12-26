/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nm.clientefc.modelo;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author BlackSpider
 */

//por el momento solo soporte para guaranies

public class Comprobante {
    
   // private Long comprobanteid;
    
    
    //datos contribuyente
    private Contribuyente contribuyente;
    
    private Timbrado timbrado;

    private String sucursal;
   
    //conforme a la moneda en sifen
    private String operacionMoneda;

    private Receptor receptor;
    
    //private String receptorTipoPersona;
   // private int tipoTransaccion;
    //private int tipoImpuesto;
    
  
    private Calendar fecha;
    
    private CondicionOperacion condicionOperacion;
    
    private ArrayList<ComprobanteDetalle> detalles = new ArrayList<ComprobanteDetalle>();
    
    private Transporte transporte;

    
    private Remision remision;
    
    private NotaCreditoDebito notaCreditoDebito;

    private ArrayList<DocAsociado> docAsociados;
    
    private String infoFisco;
    
    private double totalComprobante;
    private double totalIVA10;
    private double totalIVA5;
    private double totalExcento;

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    public Timbrado getTimbrado() {
        return timbrado;
    }

    public void setTimbrado(Timbrado timbrado) {
        this.timbrado = timbrado;
    }
    
    public ArrayList<ComprobanteDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<ComprobanteDetalle> detalles) {
        this.detalles = detalles;
    }
    
    
    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getOperacionMoneda() {
        return operacionMoneda;
    }

    public void setOperacionMoneda(String operacionMoneda) {
        this.operacionMoneda = operacionMoneda;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Receptor getReceptor() {
        return receptor;
    }

    public void setReceptor(Receptor receptor) {
        this.receptor = receptor;
    }

    public CondicionOperacion getCondicionOperacion() {
        return condicionOperacion;
    }

    public void setCondicionOperacion(CondicionOperacion condicionOperacion) {
        this.condicionOperacion = condicionOperacion;
    }

    public Remision getRemision() {
        return remision;
    }

    public void setRemision(Remision remision) {
        this.remision = remision;
    }
    
    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public String getInfoFisco() {
        return infoFisco;
    }

    public void setInfoFisco(String infoFisco) {
        this.infoFisco = infoFisco;
    }

    public NotaCreditoDebito getNotaCreditoDebito() {
        return notaCreditoDebito;
    }

    public void setNotaCreditoDebito(NotaCreditoDebito notaCreditoDebito) {
        this.notaCreditoDebito = notaCreditoDebito;
    }

    public ArrayList<DocAsociado> getDocAsociados() {
        return docAsociados;
    }

    public void setDocAsociados(ArrayList<DocAsociado> docAsociados) {
        this.docAsociados = docAsociados;
    }

    public double getTotalComprobante() {
        return totalComprobante;
    }

    public void setTotalComprobante(double totalComprobante) {
        this.totalComprobante = totalComprobante;
    }

    public double getTotalIVA10() {
        return totalIVA10;
    }

    public void setTotalIVA10(double totalIVA10) {
        this.totalIVA10 = totalIVA10;
    }

    public double getTotalIVA5() {
        return totalIVA5;
    }

    public void setTotalIVA5(double totalIVA5) {
        this.totalIVA5 = totalIVA5;
    }

    public double getTotalExcento() {
        return totalExcento;
    }

    public void setTotalExcento(double totalExcento) {
        this.totalExcento = totalExcento;
    }

   
   
}
