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
public class MercaderiaMov {
    
    private String direccion;
    private Integer casaNro = 0;
    private String direccion1;
    private String direccion2;
    
    private Long departamento;
    private Long distrito;
    private Long ciudad;
    
    private String telf;

    public MercaderiaMov() {
    }
    
    
    
    public MercaderiaMov(String direccion, Integer casaNro, Long departamento, Long ciudad) {
        this.direccion = direccion;
        this.casaNro = casaNro;
        this.departamento = departamento;
        this.ciudad = ciudad;
    }
    
    /**
     * 
     * Campos Minimos requeridos
     * 
     * 
     * @param direccion
     * @param departamento
     * @param ciudad 
     */
    public MercaderiaMov(String direccion,  Long departamento, Long ciudad) {
        this.direccion = direccion;
        this.departamento = departamento;
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCasaNro() {
        return casaNro;
    }

    public void setCasaNro(Integer casaNro) {
        this.casaNro = casaNro;
    }

  

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public Long getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Long departamento) {
        this.departamento = departamento;
    }

    public Long getDistrito() {
        return distrito;
    }

    public void setDistrito(Long distrito) {
        this.distrito = distrito;
    }

    public Long getCiudad() {
        return ciudad;
    }

    public void setCiudad(Long ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }
    
    
}
