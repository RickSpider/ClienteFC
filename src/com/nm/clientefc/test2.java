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
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author blackspider
 */
public class test2 {
    
    public static void main(String[] args) throws JRException, IOException, WriterException{
    
        GenerarKude gk = new GenerarKude();
        
        String kude = "{\n" +
"	\"qr\": \"https://ekuatia.set.gov.py/consultas-test/qr?nVersion\\u003d150\\u0026Id\\u003d01800025245001003010911522022122718422646281\\u0026dFeEmiDE\\u003d323032322d31322d32375430393a31343a3231\\u0026dRucRec\\u003d80059091\\u0026dTotGralOpe\\u003d110850\\u0026dTotIVA\\u003d10077\\u0026cItems\\u003d1\\u0026DigestValue\\u003d7a3959734c71435a4c7271564e594f49475368777a5439394d76556550365158726352453178506e6448673d\\u0026IdCSC\\u003d0001\\u0026cHashQR\\u003d367cb44ceb3b74582184e2f7883e7ffdca888dc0cf704d31ff5d3858751e2487\",\n" +
"	\"cdc\": \"01800025245001003010911522022122718422646281\",\n" +
"	\"tipo\": \"FE\"\n" +
"}";
                
        String comp = "{\n" +
"	\"contribuyente\": {\n" +
"		\"contribuyenteid\": 1,\n" +
"		\"ruc\": \"80002524\",\n" +
"		\"dv\": \"5\",\n" +
"		\"nombre\": \"Vidrio Luz S.R.L \",\n" +
"		\"distrito\": {\n" +
"			\"distrito\": \"ASUNCIÓN\",\n" +
"			\"codigoSifen\": 1,\n" +
"			\"departamento\": {\n" +
"				\"departamento\": \"CAPITAL\",\n" +
"				\"codigoSifen\": 1\n" +
"			}\n" +
"		},\n" +
"		\"telefono\": \"+595 21 562754\",\n" +
"		\"actividades\": [{\n" +
"			\"principal\": true,\n" +
"			\"codigo\": \"C4_46634\",\n" +
"			\"descripcion\": \"COMERCIO AL POR MAYOR DE VIDRIOS\"\n" +
"		}, {\n" +
"			\"principal\": false,\n" +
"			\"codigo\": \"C4_46699\",\n" +
"			\"descripcion\": \"COMERCIO AL POR MAYOR DE OTROS PRODUCTOS N.C.P.\"\n" +
"		}, {\n" +
"			\"principal\": false,\n" +
"			\"codigo\": \"C4_46520\",\n" +
"			\"descripcion\": \"COMERCIO AL POR MAYOR DE COMPONENTES ELECTRÓNICOS Y EQUIPOS DE COMUNICACIONES\"\n" +
"		}, {\n" +
"			\"principal\": false,\n" +
"			\"codigo\": \"C4_47529\",\n" +
"			\"descripcion\": \"COMERCIO AL POR MENOR DE OTROS ARTÍCULOS N.C.P.\"\n" +
"		}],\n" +
"		\"pass\": \"A665A45920422F9D417E4867EFDC4FB8A04A1F3FFF1FA07E998E86F7F7A27AE3\"\n" +
"	},\n" +
"	\"timbrado\": {\n" +
"		\"timbrado\": \"12558948\",\n" +
"		\"establecimiento\": \"001\",\n" +
"		\"puntoExpedicion\": \"003\",\n" +
"		\"documentoNro\": \"0109115\",\n" +
"		\"fecIni\": \"2021-08-25T00:00:00-0400\"\n" +
"	},\n" +
"	\"sucursal\": \"Vidrioluz S.R.L.\",\n" +
"	\"operacionMoneda\": \"PYG\",\n" +
"	\"receptor\": {\n" +
"		\"docNro\": \"80059091\",\n" +
"		\"dv\": \"0\"\n" +
"	},\n" +
"	\"fecha\": \"2022-12-27T09:14:21-0300\",\n" +
"	\"condicionOperacion\": {\n" +
"		\"condicion\": 1,\n" +
"		\"tiposPagos\": [{\n" +
"			\"monto\": 110850.0,\n" +
"			\"modeda\": \"PYG\"\n" +
"		}]\n" +
"	},\n" +
"	\"detalles\": [{\n" +
"		\"itemCodigo\": \"1\",\n" +
"		\"itemDescripcion\": \"Envío \",\n" +
"		\"itemUndMedida\": 77,\n" +
"		\"descuento\": 0.0,\n" +
"		\"cantidad\": 1.0,\n" +
"		\"precioUnitario\": 110850.0,\n" +
"		\"totalExentas\": 0.0,\n" +
"		\"totalIVA5\": 0.0,\n" +
"		\"totalIVA10\": 100773.0,\n" +
"		\"afectacionTributaria\": 1,\n" +
"		\"proporcionIVA\": 100,\n" +
"		\"tasaIVA\": 10\n" +
"	}],\n" +
"	\"totalComprobante\": 110850.0,\n" +
"	\"totalIVA10\": 10077.272727272728,\n" +
"	\"totalIVA5\": 0.0,\n" +
"	\"totalExcento\": 0.0\n" +
"}";
        
        Comprobante c = new Gson().fromJson(comp, Comprobante.class);
        Kude k = new Gson().fromJson(kude, Kude.class);
        
        gk.generarKudePDF("/Users/blackspider/NetBeansProjects/ClienteFC/archivos/facturaOri.jasper", "resultado/kude.pdf", c, k);
      
        
    }
    
}
