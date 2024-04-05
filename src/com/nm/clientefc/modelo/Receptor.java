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
public class Receptor {

	private String docNro;
	private String dv;
	private String razonSocial;
	private String telefono;
	private String email;
	// estos campos se debe agregar si el receptor no tiene ruc
	private Long tipoDocumento;
	private String direccion;
	private Integer casaNro;
	private Long departamento;
	private Long distrito;
	private Long ciudad;

	private String direccionKude;
	private String telefonoKude;

	public Receptor() {
	}

	/**
	 * campos minimos cuando es contribuyente
	 * 
	 * @param docNro
	 * @param dv
	 */
	public Receptor(String docNro, String dv) {
		this.docNro = docNro;
		this.dv = dv;
	}

	/**
	 * 
	 * Campos minimos para remision y es contribuyente
	 * 
	 * 
	 * @param docNro
	 * @param dv
	 * @param direccion
	 * @param casaNro
	 * @param departamento
	 * @param ciudad
	 */
	public Receptor(String docNro, String dv, String direccion, Integer casaNro, Long departamento, Long ciudad) {
		this.docNro = docNro;
		this.dv = dv;
		this.direccion = direccion;
		this.casaNro = casaNro;
		this.departamento = departamento;
		this.ciudad = ciudad;
	}

	public String getDocumentoNumero() {
		String out = "";
		if (dv != null && !dv.isEmpty()) {
			out = docNro + "-" + dv;
		} else if (tipoDocumento != null && tipoDocumento == 1) {
			out = docNro;
		} else if (tipoDocumento != null && tipoDocumento == 0) {
			out = docNro;
		}
		return out;
	}

	public String getDv() {
		return dv;
	}

	public void setDv(String dv) {
		this.dv = dv;
	}

	public Long getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * 
	 * 1:Cedula Paraguay 2:Pasaporte 3:Cedula Extranjera 4:Carnet de Residencia
	 * 5:Innominado 6:Tarjeta Diplomatica de exoneracion fiscal 9:Otro
	 * 
	 * @param tipoDocumento
	 */
	public void setTipoDocumento(Long tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public String getDocNro() {
		return docNro;
	}

	public void setDocNro(String docNro) {
		this.docNro = docNro;
	}

	public Integer getCasaNro() {
		return casaNro;
	}

	public void setCasaNro(Integer casaNro) {
		this.casaNro = casaNro;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccionKude() {
		return direccionKude;
	}

	public void setDireccionKude(String direccionKude) {
		this.direccionKude = direccionKude;
	}

	public String getTelefonoKude() {
		return telefonoKude;
	}

	public void setTelefonoKude(String telefonoKude) {
		this.telefonoKude = telefonoKude;
	}

//	public static void main(String[] args) {
//		Receptor r = new Receptor();
//
//		r.setDocNro("0");
//		//r.setDv("2");
//		r.setRazonSocial("Erick");
//		r.setTipoDocumento((long) 0);
//
//		System.out.println(r.getDocumentoNumero() + " documento de " + r.getRazonSocial());
//	}

}
