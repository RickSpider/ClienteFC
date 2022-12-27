/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nm.clientefc;

import com.google.gson.Gson;
import com.google.zxing.WriterException;
import com.nm.clientefc.modelo.Comprobante;
import com.nm.clientefc.modelo.Kude;
import com.nm.clientefc.util.GenerarKude;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author BlackSpider
 */
public class Main {

    
    public static void main(String[] args){
    	System.out.println("inicio proceso...");
        String help = "Los campos con \"*\" son obligatorios \n"
                + "-L: path del logo. \n"
                + "-jc: Json comprobante * \n"
                + "-jk: Json kude *\n"
                + "-r: path template reporte *\n"
                + "-d: path del destino PDF *\n ";

        String pathLogo ="";
        String jsonComprobante ="";
        String jsonKude = "";
        String pathReporte = "";
        String pathDestino = "";

        if (args.length == 0) {

            System.out.println("-h para ver las ayudas");
            return;
        }

        for (int i = 0; i < args.length; i++) {

            if (args[i].compareTo("-L") == 0) {

                i++;
                pathLogo = args[i];

            }

            if (args[i].compareTo("-jc") == 0) {

                i++;
                jsonComprobante = args[i];

            }

            if (args[i].compareTo("-jk") == 0) {

                i++;
                jsonKude = args[i];

            }

            if (args[i].compareTo("-r") == 0) {

                i++;
                pathReporte = args[i];

            }

            if (args[i].compareTo("-d") == 0) {

                i++;
                pathDestino = args[i];

            }
            
            if (args[i].compareTo("-h") == 0) {
              
                System.out.println(help);
                return;

            }

        }
        
        Kude kude = new Gson().fromJson(jsonKude, Kude.class);
        Comprobante comprobante = new Gson().fromJson(jsonComprobante, Comprobante.class);

       GenerarKude gk = new GenerarKude();
        try {
            gk.generarKudePDF(pathReporte, pathDestino, comprobante, kude);
        } catch (JRException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println(ex.getMessage());
        } catch (WriterException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println(ex.getMessage());
        }
       
       System.out.println("fin del proceso...");
    }

}
