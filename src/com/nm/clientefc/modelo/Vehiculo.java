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
public class Vehiculo {
   
    private String marca;
    private Long tipoIdentificacion;
    private String identificacionNro;
    private String datosAdicionales;
    private String matriculaNro;
    private String vueloNro;
    
   /**
    * 
    * Tipo de identificacion
    * 1:Numero de identificacion del vehiculo 
    * 2:Numero de matricula del vehiculo
    * 
    * 
    * 
    * @param marca
    * @param tipoIdentificacion
    * @param nro : Es el numero de identificacion o numero de matricula dependiendo al tipo de identificacion del vehiculo
    */

    public Vehiculo(String marca, Long tipoIdentificacion, String nro) {
        
        this.marca = marca;
        this.tipoIdentificacion = tipoIdentificacion;
        
        if (this.tipoIdentificacion.longValue() == 1L){
        
            this.identificacionNro = nro;
             
        }
        
        if(this.tipoIdentificacion.longValue() == 2L){
        
            this.matriculaNro = nro;
            
        }
       
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
      * Tipo de identificacion
      * 1:Numero de identificacion del vehiculo 
      * 2:Numero de matricula del vehiculo
     * 
     * @param tipoIdentificacion 
     */
    public void setTipoIdentificacion(Long tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getDatosAdicionales() {
        return datosAdicionales;
    }

    public void setDatosAdicionales(String datosAdicionales) {
        this.datosAdicionales = datosAdicionales;
    }

    public String getMatriculaNro() {
        return matriculaNro;
    }

    public void setMatriculaNro(String matriculaNro) {
        this.matriculaNro = matriculaNro;
    }

    public String getVueloNro() {
        return vueloNro;
    }

    public void setVueloNro(String vueloNro) {
        this.vueloNro = vueloNro;
    }

    public String getIdentificacionNro() {
        return identificacionNro;
    }

    public void setIdentificacionNro(String identificacionNro) {
        this.identificacionNro = identificacionNro;
    }
    
    
    
}
