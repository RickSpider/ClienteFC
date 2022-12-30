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
public class Transportista {
    
    private String Nombre;
    private String docNro;
    private Integer dv;
    private Long tipoDoc;
    private String nacionalidad;
    private String choferDocNum;
    private String choferNombre;
    private String domicilio;
    private String choferDireccion;
    private String agenteRuc;
    private String agenteDV;
    private String agenteDireccion;
    
    public String getNaturalezaTransportista() {
    	String out =  "No contribuyente";
    	if(this.getDv() != null) {
    		out = "Contribuyente";
    		return out;
    	}
    	return out;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDocNro() {
        return docNro;
    }

    public void setDocNro(String docNro) {
        this.docNro = docNro;
    }

    public Integer getDv() {
        return dv;
    }

    public void setDv(Integer dv) {
        this.dv = dv;
    }

    public Long getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(Long tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * 
     * Buscar codigo de nacionalidad en 
     * https://es.wikipedia.org/wiki/ISO_3166-1#C%C3%B3digos_ISO_3166-1
     * columna Codigo alf-3 
     *
     * 
     * @param nacionalidad 
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getChoferDocNum() {
        return choferDocNum;
    }

    public void setChoferDocNum(String choferDocNum) {
        this.choferDocNum = choferDocNum;
    }

    public String getChoferNombre() {
        return choferNombre;
    }

    public void setChoferNombre(String choferNombre) {
        this.choferNombre = choferNombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getChoferDireccion() {
        return choferDireccion;
    }

    public void setChoferDireccion(String choferDireccion) {
        this.choferDireccion = choferDireccion;
    }

    public String getAgenteRuc() {
        return agenteRuc;
    }

    public void setAgenteRuc(String agenteRuc) {
        this.agenteRuc = agenteRuc;
    }

    public String getAgenteDV() {
        return agenteDV;
    }

    public void setAgenteDV(String agenteDV) {
        this.agenteDV = agenteDV;
    }

    public String getAgenteDireccion() {
        return agenteDireccion;
    }

    public void setAgenteDireccion(String agenteDireccion) {
        this.agenteDireccion = agenteDireccion;
    }
    
}
