package com.nm.clientefc;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import com.google.zxing.WriterException;
import com.nm.clientefc.util.GenerarQR;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class PruebaReporte {

	public static void main(String[] args) throws JRException, WriterException, IOException {
		// TODO Auto-generated method stub

//		String path = "/home/erick/JaspersoftWorkspace/MyReports/facturaOri.jasper";
		String path = "/home/erick/JaspersoftWorkspace/MyReports/test.jasper";
		GenerarQR generaQR = new GenerarQR();
		BufferedImage imagenQR = generaQR.crearQR("eriiiiiccckkk", 100, 100);
		File file = new File("/home/erick/logo.png");
		BufferedImage imagen = ImageIO.read(file);
		

		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("Nombre", "Esta es una prueba");
		parameter.put("qr", imagenQR);
		parameter.put("logo", imagen);
		
		
		//JRBeanArrayDataSource ds = new JRBeanArrayDataSource(comp.getDetalles().toArray());
		JasperPrint print = JasperFillManager.fillReport(path, parameter, new JREmptyDataSource());

		JasperViewer.viewReport(print);

		System.out.println("fin de proceso");

	}

}
