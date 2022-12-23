/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nm.clientefc.modelo;

/**
 *
 * @author BlackSpider
 */
public class Cheque {
    
    private String nro;
    private String banco;

    /**
     * 
     * Los campos del construcctor son obligatorios
     * 
     * @param nro Completar con 0 (cero) a la izquierda hasta alcanzar 8 (ocho) cifras
     * @param banco Nombre del banco ej: (Itau, Vision, etc.)
     */
    public Cheque(String nro, String banco) {
        this.nro = nro;
        this.banco = banco;
    }
    
    

    public String getNro() {
        return nro;
    }
    /**
     * 
     * Completar con 0 (cero) a la izquierda hasta alcanzar 8 (ocho) cifras
     * 
     * @param nro 
     * 
     */
    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
    
    
    
}
