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

	public String getActividadEconomicaPrincipal() {
		for (ActividadEconomica actividad : this.actividades) {
			if (actividad.isPrincipal()) {
				return actividad.getDescripcion();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Contribuyente c = new Contribuyente();
		ActividadEconomica a1 = new ActividadEconomica();
		a1.setCodigo("a1");
		a1.setDescripcion("a1");
		a1.setPrincipal(false);
		ActividadEconomica a2 = new ActividadEconomica();
		a2.setCodigo("a2");
		a2.setDescripcion("a2");
		a2.setPrincipal(true);
		Set<ActividadEconomica> set = new HashSet<ActividadEconomica>();
		set.add(a2);
		set.add(a1);
		c.setActividades(set);
		System.out.println(c.getActividadEconomicaPrincipal());
	}

}
