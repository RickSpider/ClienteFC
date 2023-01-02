/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nm.clientefc.modelo;

import java.util.Calendar;

/**
 *
 * @author BlackSpider
 */
public class DocAsociado {

	private Long tipo;
	private String tipoDescripcion;
	private String cdc;
	private Long timbrado;
	private String establecimiento;
	private String puntoExpedicion;
	private String docNro;
	private Long tipoDocAsociado;
	private String tipoDocAsociadoDescripcion;
	private Calendar fechaEmision;
	private String compRetencionNro;
	private String resolucionCreditoFiscalNro;
	private Long constanciaTipo;
	private Long constanciaNro;
	private String constanciaControlNro;

	public String getDocAsociado() {
		String out = "";
		if (this.getTipo() == 1) {
			out = this.getCdc();
		} else if (this.getTipo() == 2) {
			out = this.getTipoDocAsociadoDescripcion();
		} else if (this.getTipo() == 3) {
			out = this.getConstanciaControlNro();
		}
		return out;
	}

	public Long getTipo() {
		return tipo;
	}

	/**
	 * Posibles valores
	 * 
	 * 1:Electronico 2:Impreso 3:Constancia Electronica
	 * 
	 * @param tipo
	 */
	public void setTipo(Long tipo) {
		this.tipo = tipo;
	}

	public String getCdc() {
		return cdc;
	}

	/**
	 * Setear en caso que el el tipo sea "Electronico"
	 * 
	 * @param cdc
	 */
	public void setCdc(String cdc) {
		this.cdc = cdc;
	}

	public Long getTimbrado() {
		return timbrado;
	}

	/**
	 * Setear en caso que el tipo sea "Impreso"
	 * 
	 * @param timbrado
	 */
	public void setTimbrado(Long timbrado) {
		this.timbrado = timbrado;
	}

	public String getEstablecimiento() {
		return establecimiento;
	}

	/**
	 * Setear en caso que el tipo sea "Impreso"
	 * 
	 * ej: 001
	 * 
	 * @param establecimiento
	 */
	public void setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
	}

	public String getPuntoExpedicion() {
		return puntoExpedicion;
	}

	/**
	 * Setear en caso que el tipo sea "Impreso"
	 * 
	 * ej: 001
	 * 
	 * @param puntoExpedicion
	 */
	public void setPuntoExpedicion(String puntoExpedicion) {
		this.puntoExpedicion = puntoExpedicion;
	}

	public String getDocNro() {
		return docNro;
	}

	/**
	 * 
	 * Setear en caso que el tipo sea "Impreso"
	 * 
	 * ej: 0000001
	 * 
	 * @param docNro
	 */
	public void setDocNro(String docNro) {
		this.docNro = docNro;
	}

	public Long getTipoDocAsociado() {
		return tipoDocAsociado;
	}

	/**
	 * 
	 * Setear en caso que el tipo sea "Impreso" 1: Factura 2: Nota Credito 3: Nota
	 * Debito 4: Nota Remision 5: Comprobante Retencion
	 * 
	 * @param tipoDocAsociado
	 */
	public void setTipoDocAsociado(Long tipoDocAsociado) {
		this.tipoDocAsociado = tipoDocAsociado;
	}

	public Calendar getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Calendar fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getCompRetencionNro() {
		return compRetencionNro;
	}

	/**
	 * 
	 * Setear solo si el documento es una retencion
	 * 
	 * @param compRetencionNro
	 */
	public void setCompRetencionNro(String compRetencionNro) {
		this.compRetencionNro = compRetencionNro;
	}

	public String getResolucionCreditoFiscalNro() {
		return resolucionCreditoFiscalNro;
	}

	/**
	 * 
	 * Solo para venta de credito fiscal
	 * 
	 * @param resolucionCreditoFiscalNro
	 */
	public void setResolucionCreditoFiscalNro(String resolucionCreditoFiscalNro) {
		this.resolucionCreditoFiscalNro = resolucionCreditoFiscalNro;
	}

	public Long getConstanciaTipo() {
		return constanciaTipo;
	}

	/**
	 * 
	 * Setear solo si el tipo es "CONSTANCIA ELECTRONICA" 1: Constancia de no ser
	 * contribuyente 2: constancia de ser mcroroductores
	 * 
	 * @param constanciaTipo
	 */
	public void setConstanciaTipo(Long constanciaTipo) {
		this.constanciaTipo = constanciaTipo;
	}

	public Long getConstanciaNro() {
		return constanciaNro;
	}

	/**
	 * 
	 * Setear solo si tipo es "CONSTANCIA ELECTRONICA", y el tipo de constancia es
	 * "CONSTANCIA DE MICROPRODUCTORES"
	 * 
	 * @param constanciaNro
	 */
	public void setConstanciaNro(Long constanciaNro) {
		this.constanciaNro = constanciaNro;
	}

	public String getConstanciaControlNro() {
		return constanciaControlNro;
	}

	/**
	 * 
	 * Setear solo si tipo es "CONSTANCIA ELECTRONICA", y el tipo de constancia es
	 * "CONSTANCIA DE MICROPRODUCTORES"
	 * 
	 * @param constanciaControlNro
	 */
	public void setConstanciaControlNro(String constanciaControlNro) {
		this.constanciaControlNro = constanciaControlNro;
	}

	public String getTipoDescripcion() {
		return tipoDescripcion;
	}

	public void setTipoDescripcion(String tipoDescripcion) {
		this.tipoDescripcion = tipoDescripcion;
	}

	public String getTipoDocAsociadoDescripcion() {
		return tipoDocAsociadoDescripcion;
	}

	public void setTipoDocAsociadoDescripcion(String tipoDocAsociadoDescripcion) {
		this.tipoDocAsociadoDescripcion = tipoDocAsociadoDescripcion;
	}

}
