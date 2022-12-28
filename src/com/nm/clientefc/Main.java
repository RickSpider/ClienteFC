/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nm.clientefc;

import java.nio.file.Paths;

import com.google.gson.Gson;
import com.nm.clientefc.modelo.Comprobante;
import com.nm.clientefc.modelo.Kude;
import com.nm.clientefc.util.GenerarKude;


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
        
       // System.out.println("salida " +pathDestino);
        //System.out.println("reporte "+pathReporte);
        System.out.println(jsonKude+"/n");
        System.out.println(jsonComprobante+"/n");
        
        Kude kude = new Gson().fromJson(jsonKude, Kude.class);
        Comprobante comprobante = new Gson().fromJson(jsonComprobante, Comprobante.class);

       GenerarKude gk = new GenerarKude();
       gk.generarKudePDF(pathReporte, pathDestino, comprobante, kude);
       
       System.out.println("fin del proceso...");
    }

}
