/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nm.clientefc;

import com.google.gson.Gson;
import com.google.zxing.WriterException;
import com.nm.clientefc.modelo.Comprobante;
import com.nm.clientefc.modelo.Kude;
import com.nm.clientefc.util.GenerarKude;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author blackspider
 */
public class test2 {

	public static void mainx(String[] args) throws JRException {
		Comprobante comp = new Comprobante();

		// Set<Actividad>
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("comprobante", comp);
//		parameter.put("qr", null);
//		parameter.put("logo", null);
//		parameter.put("titulo", "1234");
//		parameter.put("nombre", "1234");
		String path = "/home/erick/JaspersoftWorkspace/MyReports/facturaOri.jasper";

		// JRBeanArrayDataSource ds = new
		// JRBeanArrayDataSource(comp.getDetalles().toArray());
		JasperPrint print = JasperFillManager.fillReport(path, parameter,
				new JRBeanCollectionDataSource(comp.getDetalles()));

		JasperViewer.viewReport(print);
		System.out.println("listo");

	}

	public static void main(String[] args) throws JRException, IOException, WriterException {

		GenerarKude gk = new GenerarKude();

		String kude = "{\n"
				+ "	\"qr\": \"https://ekuatia.set.gov.py/consultas-test/qr?nVersion\\u003d150\\u0026Id\\u003d01800025245001003010911522022122718422646281\\u0026dFeEmiDE\\u003d323032322d31322d32375430393a31343a3231\\u0026dRucRec\\u003d80059091\\u0026dTotGralOpe\\u003d110850\\u0026dTotIVA\\u003d10077\\u0026cItems\\u003d1\\u0026DigestValue\\u003d7a3959734c71435a4c7271564e594f49475368777a5439394d76556550365158726352453178506e6448673d\\u0026IdCSC\\u003d0001\\u0026cHashQR\\u003d367cb44ceb3b74582184e2f7883e7ffdca888dc0cf704d31ff5d3858751e2487\",\n"
				+ "	\"cdc\": \"01800025245001003010911522022122718422646281\",\n" + "	\"tipo\": \"FE\"\n" + "}";

		String comp = "{\n" + "	\"contribuyente\": {\n" + "		\"contribuyenteid\": 1,\n"
				+ "		\"ruc\": \"80002524\",\n" + "		\"dv\": \"5\",\n"
				+ "		\"nombre\": \"Vidrio Luz S.R.L \",\n" + "		\"distrito\": {\n"
				+ "			\"distrito\": \"ASUNCIÓN\",\n" + "			\"codigoSifen\": 1,\n"
				+ "			\"departamento\": {\n" + "				\"departamento\": \"CAPITAL\",\n"
				+ "				\"codigoSifen\": 1\n" + "			}\n" + "		},\n"
				+ "		\"telefono\": \"+595 21 562754\",\n" + "		\"actividades\": [{\n"
				+ "			\"principal\": true,\n" + "			\"codigo\": \"C4_46634\",\n"
				+ "			\"descripcion\": \"COMERCIO AL POR MAYOR DE VIDRIOS\"\n" + "		}, {\n"
				+ "			\"principal\": false,\n" + "			\"codigo\": \"C4_46699\",\n"
				+ "			\"descripcion\": \"COMERCIO AL POR MAYOR DE OTROS PRODUCTOS N.C.P.\"\n" + "		}, {\n"
				+ "			\"principal\": false,\n" + "			\"codigo\": \"C4_46520\",\n"
				+ "			\"descripcion\": \"COMERCIO AL POR MAYOR DE COMPONENTES ELECTRÓNICOS Y EQUIPOS DE COMUNICACIONES\"\n"
				+ "		}, {\n" + "			\"principal\": false,\n" + "			\"codigo\": \"C4_47529\",\n"
				+ "			\"descripcion\": \"COMERCIO AL POR MENOR DE OTROS ARTÍCULOS N.C.P.\"\n" + "		}],\n"
				+ "		\"pass\": \"A665A45920422F9D417E4867EFDC4FB8A04A1F3FFF1FA07E998E86F7F7A27AE3\"\n" + "	},\n"
				+ "	\"timbrado\": {\n" + "		\"timbrado\": \"12558948\",\n" + "		\"establecimiento\": \"001\",\n"
				+ "		\"puntoExpedicion\": \"003\",\n" + "		\"documentoNro\": \"0109115\",\n"
				+ "		\"fecIni\": \"2021-08-25T00:00:00-0400\"\n" + "	},\n"
				+ "	\"sucursal\": \"Vidrioluz S.R.L.\",\n" + "	\"operacionMoneda\": \"PYG\",\n"
				+ "	\"receptor\": {\n" + "		\"docNro\": \"80059091\",\n" + "		\"dv\": \"0\"\n" + "	},\n"
				+ "	\"fecha\": \"2022-12-27T09:14:21-0300\",\n" + "	\"condicionOperacion\": {\n"
				+ "		\"condicion\": 1,\n" + "		\"tiposPagos\": [{\n" + "			\"monto\": 110850.0,\n"
				+ "			\"modeda\": \"PYG\"\n" + "		}]\n" + "	},\n" + "	\"detalles\": [{\n"
				+ "		\"itemCodigo\": \"1\",\n" + "		\"itemDescripcion\": \"Envío \",\n"
				+ "		\"itemUndMedida\": 77,\n" + "		\"descuento\": 0.0,\n" + "		\"cantidad\": 1.0,\n"
				+ "		\"precioUnitario\": 110850.0,\n" + "		\"totalExentas\": 0.0,\n"
				+ "		\"totalIVA5\": 0.0,\n" + "		\"totalIVA10\": 100773.0,\n"
				+ "		\"afectacionTributaria\": 1,\n" + "		\"proporcionIVA\": 100,\n" + "		\"tasaIVA\": 10\n"
				+ "	}],\n" + "	\"totalComprobante\": 110850.0,\n" + "	\"totalIVA10\": 10077.272727272728,\n"
				+ "	\"totalIVA5\": 0.0,\n" + "	\"totalExcento\": 0.0\n" + "}";

		// erick test

		String comp2 = "{\n" + "	\"contribuyente\": {\n" + "		\"contribuyenteid\": 1,\n"
				+ "		\"ruc\": \"80002524\",\n" + "		\"dv\": \"5\",\n"
				+ "		\"nombre\": \"Vidrio Luz S.R.L.\",\n" + "		\"distrito\": {\n"
				+ "			\"distrito\": \"ASUNCIÓN\",\n" + "			\"codigoSifen\": 1,\n"
				+ "			\"departamento\": {\n" + "				\"departamento\": \"CAPITAL\",\n"
				+ "				\"codigoSifen\": 1\n" + "			}\n" + "		},\n"
				+ "		\"direccion\": \"Médicos del Chaco 2713 c/ M. Mallorquín. Asunción, Paraguay.\",\n"
				+ "		\"numCasa\": \"2713\",\n" + "		\"telefono\": \"+595 21 562754\",\n"
				+ "		\"email\": \"ventas@vidrioluz.com.py\",\n" + "		\"actividades\": [{\n"
				+ "			\"principal\": true,\n" + "			\"codigo\": \"C4_46634\",\n"
				+ "			\"descripcion\": \"COMERCIO AL POR MAYOR DE VIDRIOS.\"\n" + "		}, {\n"
				+ "			\"principal\": false,\n" + "			\"codigo\": \"C4_46520\",\n"
				+ "			\"descripcion\": \"COMERCIO AL POR MAYOR DE COMPONENTES ELECTRÓNICOS Y EQUIPOS DE COMUNICACIONES.\"\n"
				+ "		}, {\n" + "			\"principal\": false,\n" + "			\"codigo\": \"C4_46699\",\n"
				+ "			\"descripcion\": \"COMERCIO AL POR MAYOR DE OTROS PRODUCTOS N.C.P.\"\n" + "		}, {\n"
				+ "			\"principal\": false,\n" + "			\"codigo\": \"C4_47529\",\n"
				+ "			\"descripcion\": \"COMERCIO AL POR MENOR DE OTROS ARTÍCULOS N.C.P.\"\n" + "		}],\n"
				+ "		\"pass\": \"A665A45920422F9D417E4867EFDC4FB8A04A1F3FFF1FA07E998E86F7F7A27AE3\"\n" + "	},\n"
				+ "	\"timbrado\": {\n" + "		\"timbrado\": \"16105981\",\n" + "		\"establecimiento\": \"001\",\n"
				+ "		\"puntoExpedicion\": \"003\",\n" + "		\"documentoNro\": \"0109236\",\n"
				+ "		\"fecIni\": \"2022-12-23T00:00:00-0300\"\n" + "	},\n"
				+ "	\"sucursal\": \"Vidrioluz S.R.L.\",\n" + "	\"operacionMoneda\": \"PYG\",\n"
				+ "	\"receptor\": {\n" + "		\"docNro\": \"2030776\",\n" + "		\"dv\": \"4\",\n"
				+ "		\"razonSocial\": \"DELGADO ESQUIVEL, EMILIO\"\n" + "	},\n"
				+ "	\"fecha\": \"2022-12-29T10:24:33-0300\",\n" + "	\"condicionOperacion\": {\n"
				+ "		\"condicion\": 1,\n" + "		\"tiposPagos\": [{\n" + "			\"monto\": 2139543.0,\n"
				+ "			\"modeda\": \"PYG\"\n" + "		}]\n" + "	},\n" + "	\"detalles\": [{\n"
				+ "		\"itemCodigo\": \"V2I\",\n"
				+ "		\"itemDescripcion\": \"2,25 x 1,80 plancha;  2mm - VIDRIO INCOLORO (BAJA)\",\n"
				+ "		\"itemUndMedida\": 77,\n" + "		\"itemUndMedidaStr\": \"UNI\",\n"
				+ "		\"descuento\": 0.0,\n" + "		\"cantidad\": 10.0,\n" + "		\"precioUnitario\": 213954.0,\n"
				+ "		\"totalExentas\": 0.0,\n" + "		\"totalIVA5\": 0.0,\n"
				+ "		\"totalIVA10\": 2139543.0,\n" + "		\"afectacionTributaria\": 1,\n"
				+ "		\"proporcionIVA\": 100,\n" + "		\"tasaIVA\": 10\n" + "	}],\n"
				+ "	\"totalComprobante\": 2139543.0,\n" + "	\"totalIVA10\": 194503.90909090906,\n"
				+ "	\"totalIVA5\": 0.0,\n" + "	\"totalExcento\": 0.0\n" + "}";

		String kude2 = "{\"qr\":\"https://ekuatia.set.gov.py/consultas-test/qr?nVersion\\u003d150\\u0026Id\\u003d07800025245001003000065522022122611066050871\\u0026dFeEmiDE\\u003d323032322d31322d32365431343a32323a3335\\u0026dRucRec\\u003d4912021\\u0026dTotGralOpe\\u003d0\\u0026dTotIVA\\u003d0\\u0026cItems\\u003d1\\u0026DigestValue\\u003d372f5439714e426b79376c78672f664364654751764b356f7453577372735336566f736a696c7239786b733d\\u0026IdCSC\\u003d0001\\u0026cHashQR\\u003d2947ffb207dd8b7a9094bd1624c1e32298c6b9673695965aa43ed176d798eade\",\"cdc\":\"07800025245001003000065522022122611066050871\",\"tipo\":\"NRE\"}\n"
				+ "";
		Comprobante c = new Gson().fromJson(comp, Comprobante.class);
		Kude k = new Gson().fromJson(kude, Kude.class);

		// erick test

		Comprobante c2 = new Gson().fromJson(comp2, Comprobante.class);
		Kude k2 = new Gson().fromJson(kude2, Kude.class);

//		gk.generarKudeVisor("archivos/facturaOri.jasper", "resultado/kude.pdf", "archivos/logo.png", c, k);

//		gk.generarKudeVisor("/home/erick/JaspersoftWorkspace/MyReports/remision.jasper",
//				"/home/erick/reportes/resultado/kude.pdf", "/home/erick/logo.png", c2, k2);
		
		gk.generarKudeVisor("/home/erick/JaspersoftWorkspace/MyReports/facturaOri.jasper",
				"/home/erick/reportes/resultado/kude.pdf", "/home/erick/logo.png", c2, k2);

	}

}
