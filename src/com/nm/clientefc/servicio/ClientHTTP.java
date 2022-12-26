/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nm.clientefc.servicio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nm.clientefc.modelo.Comprobante;
import com.nm.clientefc.modelo.Kude;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author BlackSpider
 */
public class ClientHTTP {
    
    /**
     * 
     * 
     * 
     * @param link
     * @param comprobante
     * @return
     * @throws IOException 
     */
    public Kude enviarComprovante(String link, Comprobante comprobante) throws IOException {

    	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").create();
        return this.enviarComprovante(link, gson.toJson(comprobante));        
    }
    
    public Kude enviarComprovante(String link, String jsonComprobante) throws IOException {
        System.out.println(jsonComprobante);
        URL url = new URL(link);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setDoOutput(true);        
        urlConnection.setRequestProperty("Content-Type", "application/json");
        urlConnection.setRequestMethod("POST");        
        urlConnection.setUseCaches(false);        
        urlConnection.setConnectTimeout(10000);        
        urlConnection.setReadTimeout(10000);        
        
        urlConnection.setRequestProperty("charset", "utf-8");
        
        urlConnection.connect();        
        
        OutputStreamWriter out = new OutputStreamWriter(urlConnection.getOutputStream());        
        out.write(jsonComprobante);
        out.close();
        
        int httpResult = urlConnection.getResponseCode();
        System.out.println(httpResult);
        
        StringBuffer sb = new StringBuffer();
        if (httpResult == HttpURLConnection.HTTP_CREATED) {            
            
            BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "utf-8"));            
            
            String line = null;            
            while ((line = br.readLine()) != null) {                
                sb.append(line);                
            }            
            br.close();            
            
        }
        
        urlConnection.disconnect(); 
        return new Gson().fromJson(sb.toString(), Kude.class);
        
        
    }
    
}
