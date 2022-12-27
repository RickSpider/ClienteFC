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
import java.io.FileNotFoundException;

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

	//private String pathReporte = "/home/erick/JaspersoftWorkspace/MyReports/facturaOri.jasper";
	//private Comprobante comprobante;
	//private String pathSalida = "/home/erick/prueba.pdf";
	//private String pathLogoEmpresa;

	private JasperPrint generarReporte(String pathReporte, Comprobante comprobante, Kude kude) throws JRException, IOException, WriterException {
		
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
                
                switch(kude.getTipo()){
                
                    case Kude.FACTURA_ELECTRONICA:
                        parametros.put("tipoDocumento", "FACTURA ELECTRONICA IMPORTACION");
                        break;
                        
                        case Kude.FACTURA_ELECTRONICA_IMPORTACION:
                        parametros.put("tipoDocumento", "FACTURA ELECTRONICA IMPORTACION");
                        break;
                        
                        case Kude.FACTURA_ELECTRONICA_EXPORTACION:
                        parametros.put("tipoDocumento", "FACTURA ELECTRONICA EXPORTACION");
                        break;
                        
                        case Kude.NOTA_CREDITO_ELECTRONICA:
                        parametros.put("tipoDocumento", "NOTA CREDITO ELECTRONICA");
                        break;
                        
                        case Kude.NOTA_DEBITO_ELECTRONICA:
                        parametros.put("tipoDocumento", "NOTA DEBITO ELECTRONICA");
                        break;
                        
                        case Kude.NOTA_REMISION_ELECTRONICA:
                        parametros.put("tipoDocumento", "NOTA REMISION ELECTRONICA");
                        break;
                        
                        case Kude.COMPROBANTE_RETENCION_ELECTRONICA:
                        parametros.put("tipoDocumento", "COMPROBANTE RETENCION ELECTRONICA");
                        break;
                    
                }

		JasperPrint print = JasperFillManager.fillReport(pathReporte, parametros, new JRBeanCollectionDataSource(comprobante.getDetalles()));
	
                return print;
		//JasperViewer.viewReport(print);
		//OutputStream output = new FileOutputStream(new File(pathSalida));
//		JasperExportManager.exportReportToPdfStream(print, output);

	}
        
        public void generarKudePDF(String pathReporte, String pathSalida, Comprobante comprobante, String link) throws IOException, JRException, FileNotFoundException, WriterException{
        
            ClientHTTP cliente = new ClientHTTP();
            this.generarKudePDF(pathReporte, pathSalida, comprobante, cliente.enviarComprovante(link, comprobante));
            
        }
        
        public void generarKudePDF(String pathReporte, String pathSalida, Comprobante comprobante, Kude kude) throws JRException, FileNotFoundException, IOException, WriterException{

            OutputStream output = new FileOutputStream(new File(pathSalida));
            JasperExportManager.exportReportToPdfStream(this.generarReporte(pathReporte, comprobante, kude), output);
        }
        
         public void generarKudeVisor(String pathReporte, String pathSalida, Comprobante comprobante, String link) throws IOException, JRException, FileNotFoundException, WriterException{
        
            ClientHTTP cliente = new ClientHTTP();
            this.generarKudeVisor(pathReporte, pathSalida, comprobante, cliente.enviarComprovante(link, comprobante));
            
        }
        
        public void generarKudeVisor(String pathReporte, String pathSalida, Comprobante comprobante, Kude kude) throws JRException, IOException, WriterException{
        
            JasperViewer.viewReport(this.generarReporte(pathReporte, comprobante, kude));
            
        }
	
        
	public static void main(String[] args) throws JRException, IOException, WriterException {
		GenerarKude gk = new GenerarKude();
		//gk.generarArchivoPDF();
	}

	
}
