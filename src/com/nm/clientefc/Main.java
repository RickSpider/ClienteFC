/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nm.clientefc;

import com.nm.clientefc.modelo.Kude;
import com.nm.clientefc.servicio.ClientHTTP;
import java.io.IOException;


/**
 *
 * @author BlackSpider
 */
public class Main {
    
    public static void main(String args[]) throws IOException{
    
        ClientHTTP cliente = new ClientHTTP();
        
        String json = "{\n" +
"    \"contribuyente\": {\n" +
"        \"contribuyenteid\": 1,\n" +
"        \"pass\": \"\"\n" +
"    },\n" +
"    \"timbrado\": {\n" +
"        \"timbrado\": \"12558948\",\n" +
"        \"establecimiento\": \"001\",\n" +
"        \"puntoExpedicion\": \"001\",\n" +
"        \"documentoNro\": \"0000108\",\n" +
"        \"fecIni\": \"2021-08-25T00:00:00-04:00\"\n" +
"    },\n" +
"	\"sucursal\": \"Central\",\n" +
"    \"receptor\": {\n" +
"        \"docNro\": \"4912021\",\n" +
"        \"dv\": \"2\"\n" +
"    },\n" +
"    \"fecha\": \"2022-12-19T00:00:00-04:00\",\n" +
"    \"condicionOperacion\":{\n" +
"\n" +
"        \"condicion\":1,\n" +
"\n" +
"        \"tiposPagos\": [\n" +
"        {\n" +
"            \"monto\": 100000\n" +
"        },\n" +
"        {\n" +
"            \"monto\":25000,\n" +
"\n" +
"            \"tarjeta\":{\n" +
"            \"tipoPagoCodigo\":3,\n" +
"            \"denominacionTarjeta\":2,\n" +
"            \"formaProcesamiento\":1\n" +
"           \n" +
"            }\n" +
"        },\n" +
"         {\n" +
"            \"monto\":25000,\n" +
"\n" +
"            \"tarjeta\":{\n" +
"            \"tipoPagoCodigo\":3,\n" +
"            \"denominacionTarjeta\":2,\n" +
"            \"formaProcesamiento\":1\n" +
"           \n" +
"            }\n" +
"        },\n" +
"        {\n" +
"            \"monto\":50000,\n" +
"            \"cheque\":{\n" +
"\n" +
"                \"nro\":\"12345678\",\n" +
"                \"banco\":\"Itau\"\n" +
"\n" +
"            }\n" +
"\n" +
"        }\n" +
"\n" +
"        \n" +
"    ]\n" +
"\n" +
"    },\n" +
"    \"detalles\": [\n" +
"        {\n" +
"            \"itemCodigo\": \"001\",\n" +
"            \"itemDescripcion\": \"producto001\",\n" +
"            \"cantidad\": 1,\n" +
"            \"precioUnitario\": 200000,\n" +
"            \"afectacionTributaria\": 1,\n" +
"            \"proporcionIVA\": 100,\n" +
"            \"tasaIVA\": 10\n" +
"        }\n" +
"    ]\n" +
"}";
        
       Kude kude =  cliente.enviarComprovante("http://localhost:5050/factura", json);
       
        System.out.println("esto retorno "+kude.getQr());
        
    }
    
}
