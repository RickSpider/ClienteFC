/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nm.clientefc.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author BlackSpider
 */
public class Transporte {

	private Long tipo;
	private Long modo;
	private Long responsableFlete;
	private String condicionNeg;
	private String manifiestoNro;
	private String despachoImpNro;
	private Date fechaSalida;
	private Date fechaLlegada;
	private Long paisDestino;

	private MercaderiaMov salida;
	private List<MercaderiaMov> entregas;

	private List<Vehiculo> vehiculos;
	private Transportista transportista;

	// datos del vehiculo de transporte

	private String tipoStr;
	private String modoStr;
	private String responsableFleteStr;

	/**
	 * Campos minimos para declarar un Transporte
	 * 
	 * Posibles Tipos de Transporte 1:Propio 2:Tercero
	 * 
	 * Posibles modos de Transporte 1:Terrestre 2:Fluvial 3:Aereo 4:Multimodal
	 * 
	 * 
	 * Posibles responsables del costo de transporte 1:Emisor de factura 2:Receptor
	 * de la factura 3:Tercero 4:Agente intermediario del transorte (cuado
	 * interventa) 5:Transporte propio
	 * 
	 * @param tipo
	 * @param modo
	 * @param responsableFlete
	 * @param fechaSalida
	 * @param fechaLlegada
	 * @param salida
	 * @param entregas
	 * @param vehiculos
	 * @param transportista
	 */
	public Transporte(Long tipo, Long modo, Long responsableFlete, Date fechaSalida, Date fechaLlegada,
			MercaderiaMov salida, List<MercaderiaMov> entregas, List<Vehiculo> vehiculos, Transportista transportista) {
		this.tipo = tipo;
		this.modo = modo;
		this.responsableFlete = responsableFlete;
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
		this.salida = salida;
		this.entregas = entregas;
		this.vehiculos = vehiculos;
		this.transportista = transportista;
	}

	public Long getTipo() {
		return tipo;
	}

	/**
	 * 
	 * Posibles Tipos de Transporte 1:Propio 2:Tercero
	 * 
	 * @param tipoTransporte
	 */
	public void setTipo(Long tipoTransporte) {
		this.tipo = tipoTransporte;
	}

	public Long getModo() {
		return modo;
	}

	/**
	 * Posibles modos de Transporte 1:Terrestre 2:Flvial 3:Aereo 4:Multimodal
	 * 
	 * @param modoTransporte
	 */
	public void setModo(Long modoTransporte) {
		this.modo = modoTransporte;
	}

	public Long getResponsableFlete() {
		return responsableFlete;
	}

	/**
	 * 
	 * Posibles responsables del costo de transporte 1:Emisor de factura 2:Receptor
	 * de la factura 3:Tercero 4:Agente intermediario del transorte (cuado
	 * interventa) 5:Transporte propio
	 * 
	 * @param responsableFlete
	 */
	public void setResponsableFlete(Long responsableFlete) {
		this.responsableFlete = responsableFlete;
	}

	public String getManifiestoNro() {
		return manifiestoNro;
	}

	public void setManifiestoNro(String manifiestoNro) {
		this.manifiestoNro = manifiestoNro;
	}

	public Long getPaisDestino() {
		return paisDestino;
	}

	public void setPaisDestino(Long paisDestino) {
		this.paisDestino = paisDestino;
	}

	public String getCondicionNeg() {
		return condicionNeg;
	}

	public void setCondicionNeg(String condicionNeg) {
		this.condicionNeg = condicionNeg;
	}

	public String getDespachoImpNro() {
		return despachoImpNro;
	}

	public void setDespachoImpNro(String despachoImpNro) {
		this.despachoImpNro = despachoImpNro;
	}

	public MercaderiaMov getSalida() {
		return salida;
	}

	public void setSalida(MercaderiaMov salida) {
		this.salida = salida;
	}

	public Transportista getTransportista() {
		return transportista;
	}

	public void setTransportista(Transportista transportista) {
		this.transportista = transportista;
	}

	public List<MercaderiaMov> getEntregas() {
		return entregas;
	}

	public void setEntregas(List<MercaderiaMov> entregas) {
		this.entregas = entregas;
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public String getTipoStr() {
		return tipoStr;
	}

	public String getModoStr() {
		return modoStr;
	}

	public String getResponsableFleteStr() {
		return responsableFleteStr;
	}

	public void setTipoStr(String tipoStr) {
		this.tipoStr = tipoStr;
	}

	public void setModoStr(String modoStr) {
		this.modoStr = modoStr;
	}

	public void setResponsableFleteStr(String responsableFleteStr) {
		this.responsableFleteStr = responsableFleteStr;
	}

	public String getFechaSalida() {
		return new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(fechaSalida);
	}

	public String getFechaLlegada() {
		return new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(fechaLlegada);
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

}
