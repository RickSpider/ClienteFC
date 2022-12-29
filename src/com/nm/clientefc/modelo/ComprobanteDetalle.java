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
public class ComprobanteDetalle {

	private String itemCodigo = "";
	private String itemDescripcion = "";
	private Long itemUndMedida;
	private String itemUndMedidaStr = "";

	private double descuento = 0.0;

	private double cantidad = 0.0;
	private double precioUnitario = 0.0;

	private double totalExentas = 0.0;
	private double totalIVA5 = 0.0;
	private double totalIVA10 = 0.0;

	private Long afectacionTributaria;
	private int proporcionIVA = 0;
	private int tasaIVA = 0;

	public String getItemCodigo() {
		return itemCodigo;
	}

	public void setItemCodigo(String itemCodigo) {
		this.itemCodigo = itemCodigo;
	}

	public String getItemDescripcion() {
		return itemDescripcion;
	}

	public void setItemDescripcion(String itemDescripcion) {
		this.itemDescripcion = itemDescripcion;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getProporcionIVA() {
		return proporcionIVA;
	}

	public void setProporcionIVA(int proporcionIVA) {
		this.proporcionIVA = proporcionIVA;
	}

	public int getTasaIVA() {
		return tasaIVA;
	}

	public void setTasaIVA(int tasaIVA) {
		this.tasaIVA = tasaIVA;
	}

	public Long getItemUndMedida() {
		return itemUndMedida;
	}

	public void setItemUndMedida(Long itemUndMedida) {
		this.itemUndMedida = itemUndMedida;
	}

	public Long getAfectacionTributaria() {
		return afectacionTributaria;
	}

	/**
	 * Posibles valores
	 * 
	 * 1: Gravado IVA 2: Exonerado (Art. 83- Ley 125/91) 3: Exento 4: Gravado
	 * parcial (Grav-Exento)
	 * 
	 * @param afectacionTributaria
	 */
	public void setAfectacionTributaria(Long afectacionTributaria) {
		this.afectacionTributaria = afectacionTributaria;
	}

	public double getDescuento() {
		return descuento;
	}

	public double getTotalExentas() {
		return totalExentas;
	}

	public double getTotalIVA5() {
		return totalIVA5;
	}

	public double getTotalIVA10() {
		return totalIVA10;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public void setTotalExentas(double totalExentas) {
		this.totalExentas = totalExentas;
	}

	public void setTotalIVA5(double totalIVA5) {
		this.totalIVA5 = totalIVA5;
	}

	public void setTotalIVA10(double totalIVA10) {
		this.totalIVA10 = totalIVA10;
	}

	public String getItemUndMedidaStr() {
		return itemUndMedidaStr;
	}

	public void setItemUndMedidaStr(String itemUndMedidaStr) {
		this.itemUndMedidaStr = itemUndMedidaStr;
	}

}
