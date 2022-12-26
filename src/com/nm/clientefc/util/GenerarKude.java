/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nm.clientefc.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import com.google.zxing.WriterException;
import com.nm.clientefc.modelo.Comprobante;
import com.nm.clientefc.modelo.Kude;
import com.nm.clientefc.servicio.ClientHTTP;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author BlackSpider
 */
public class GenerarKude {

	private String pathReporte = "/home/erick/JaspersoftWorkspace/MyReports/facturaOri.jasper";
	private Comprobante comprobante;
	private String pathSalida = "/home/erick/prueba.pdf";
	private String tipoDocumento;
	private String pathLogoEmpresa;

	public void generarArchivoPDF() throws JRException, IOException, WriterException {

		ClientHTTP cliente = new ClientHTTP();
		Kude kude = cliente.enviarComprovante("http://192.168.1.50:5050/factura", comprobante);
		//tipoDocumento = "Factura Electrónica";
//		if(kude == null) return;
		GenerarQR generaQR = new GenerarQR();
		BufferedImage imagenQR = generaQR.crearQR(kude.getQr(), 100, 100);
//		File fileLogo = new File(pathLogoEmpresa);
//		BufferedImage imagen = ImageIO.read(file); logo de la empresa
		
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("comprobante", comprobante);
		parametros.put("cdc", kude.getCdc());
		parametros.put("QR", imagenQR);
		parametros.put("tipoDocumento", tipoDocumento);

		JasperPrint print = JasperFillManager.fillReport(pathReporte, parametros, new JRBeanCollectionDataSource(comprobante.getDetalles()));
	
		JasperViewer.viewReport(print);
		//OutputStream output = new FileOutputStream(new File(pathSalida));
//		JasperExportManager.exportReportToPdfStream(print, output);

	}
	
	public static void main(String[] args) throws JRException, IOException, WriterException {
		GenerarKude gk = new GenerarKude();
		gk.generarArchivoPDF();
	}

	public Comprobante getComprobante() {
		return comprobante;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setComprobante(Comprobante comprobante) {
		this.comprobante = comprobante;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

}
