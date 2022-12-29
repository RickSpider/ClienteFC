/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nm.clientefc.modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author BlackSpider
 */
public class Contribuyente {

	private Long contribuyenteid;
	private String ruc;
	private String dv;

	/**
	 * 
	 * Razon Social
	 * 
	 */
	private String nombre; // razon social
	private String nombreFantasia;
	private Distrito distrito;
	private String direccion;
	private String numCasa;

	private String telefono;

	private String email;
	private String sucursal;

	private Set<ActividadEconomica> actividades;

	private String pass;

	public Long getContribuyenteid() {
		return contribuyenteid;
	}

	public void setContribuyenteid(Long contribuyenteid) {
		this.contribuyenteid = contribuyenteid;
	}

	public String getActividadEconomicaPrincipal() {
		String out = "Actividad Económica: ";
		for (ActividadEconomica actividad : this.actividades) {
			out += actividad.getDescripcion() + " ";
		}
		return out;
	}
	// ===================================

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getDv() {
		return dv;
	}

	public void setDv(String dv) {
		this.dv = dv;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumCasa() {
		return numCasa;
	}

	public void setNumCasa(String numCasa) {
		this.numCasa = numCasa;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public Set<ActividadEconomica> getActividades() {
		return actividades;
	}

	public void setActividades(Set<ActividadEconomica> actividades) {
		this.actividades = actividades;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public String getNombreFantasia() {
		return nombreFantasia;
	}

	public void setNombreFantasia(String nombreFantasia) {
		this.nombreFantasia = nombreFantasia;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

}
