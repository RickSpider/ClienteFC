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
public class Kude {
    
    public static final String FACTURA_ELECTRONICA = "FE";
    public static final String FACTURA_ELECTRONICA_EXPORTACION = "FEE";
    public static final String FACTURA_ELECTRONICA_IMPORTACION = "FEI";
    public static final String AUTOFACTURA_ELECTRONICA = "AE";
    public static final String NOTA_CREDITO_ELECTRONICA = "NCE";
    public static final String NOTA_DEBITO_ELECTRONICA = "NDE";
    public static final String NOTA_REMISION_ELECTRONICA = "NRE";
    public static final String COMPROBANTE_RETENCION_ELECTRONICA = "CRE";
    
    private String qr;
    private String cdc;
    private String tipo;
    
    public Kude(String qr, String cdc, String tipo){
    
        this.qr = qr;
        this.cdc = cdc;
        this.tipo = tipo;
    }

    public String getQr() {
        return qr;
    }

    public void setQr(String qr) {
        this.qr = qr;
    }

    public String getCdc() {
        return cdc;
    }

    public void setCdc(String cdc) {
        this.cdc = cdc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
