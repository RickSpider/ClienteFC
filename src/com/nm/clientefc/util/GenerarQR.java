package com.nm.clientefc.util;

import java.awt.image.BufferedImage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.ByteMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class GenerarQR {
	/**
	 * @param los datos que corresponden a la informacion del qr
	 * @param ancho del codigo
	 * @param altura del codigo
	 * @return imagen del qr*/
	public BufferedImage crearQR(String datos, int ancho, int altura) throws WriterException {
		ByteMatrix matrix;
		Writer escritor = new QRCodeWriter();
		matrix = escritor.encode(datos, BarcodeFormat.QR_CODE, ancho, altura);
		BufferedImage img = new BufferedImage(ancho, altura, BufferedImage.TYPE_INT_RGB);
		for (int y = 0; y < altura; y++) {
			for (int i = 0; i < ancho; i++) {
				int grayValue = (matrix.get(i, y) == 0 ? 0 : 1) & 0xff;
				img.setRGB(i, y, (grayValue == 0 ? 0 : 0xFFFFFF));
			}
		}
		return img;
	}
}
