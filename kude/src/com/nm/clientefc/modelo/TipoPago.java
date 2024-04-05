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
public class TipoPago {
    
    private Long tipoPagoCodigo;
    private double monto;
    private String modeda;
    
    //Seccion Cheque
    private Cheque cheque;
    
    private Tarjeta tarjeta;
   
 
    public Long getTipoPagoCodigo() {
        return tipoPagoCodigo;
    }

    /**
     * Posibles valores, si no se carga valor se toma como 1
     * 
     * 1:Efectivo
     * 2:Cheque
     * 3:Tarjeta de credito
     * 4:Tarjeta de debito
     * 5:Transferencia
     * 6:Giro
     * 7:Billetera electronica
     * 8:Tarjeta empresarial
     * 9:Vale
     * 10:Retencion
     * 11:Pago por anticipo
     * 12:Valor fiscal
     * 13:Valor comercial
     * 14:Compensacion
     * 15:Permuta
     * 16:Pago bancario
     * 17:Pago Movil
     * 18:Donacion
     * 19:Promocion
     * 20:Consumo Interno
     * 21:Pago Electronico
     * 
     * 
     * @param tipoPagoCodigo 
     */
    public void setTipoPagoCodigo(Long tipoPagoCodigo) {
        this.tipoPagoCodigo = tipoPagoCodigo;
    }
    
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getModeda() {
        return modeda;
    }

    public void setModeda(String modeda) {
        this.modeda = modeda;
    }

    public Cheque getCheque() {
        return cheque;
    }

    public void setCheque(Cheque cheque) {
        this.cheque = cheque;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    
}
