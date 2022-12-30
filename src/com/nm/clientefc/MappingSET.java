package com.nm.clientefc;

public class MappingSET {

	public static String[][] ARR_UNIDADES_DE_MEDIDA = { //
			{ "77", "UNI" } //
	};

	public static String[][] ARR_TIPOS_DOCUMENTOS_ASOCIADOS = { //
			{ "1", "Factura electrónica" }, //
			{ "2", "Factura electrónica de exportación" }, //
			{ "3", "Factura electrónica de importación" }, //
			{ "4", "Autofactura electrónica" }, //
			{ "5", "Nota de crédito electrónica" }, //
			{ "6", "Nota de débito electrónica" }, //
			{ "7", "Nota de remisión electrónica" }, //
			{ "8", "Comprobante de retención" }, //
	};

	public static String[][] ARR_TIPO_DOCUMENTO = { //
			{ "1", "Electrónico" }, //
			{ "2", "Impreso" }, //
			{ "3", "Constancia Electrónica" },//
	};
	
	public String getTipoDocAso(long idTipoDoc) {
		String out = "tipoERR";
		String id = idTipoDoc + "";
		for (String[] arr : ARR_TIPO_DOCUMENTO) {
			if (arr[0].compareTo(id) == 0) {
				out = arr[1];
				return out;
			}
		}
		return out;
	}
	/**
	 * Si el tipo de documento es impreso
	 * */
	public String getTipoDocAsociadoDescripcion(long idTipoDocAsociado) {
		String out = "tipoERR";
		String id = idTipoDocAsociado + "";
		for (String[] arr : ARR_TIPOS_DOCUMENTOS_ASOCIADOS) {
			if (arr[0].compareTo(id) == 0) {
				out = arr[1];
				return out;
			}
		}
		return out;
	}

	public String getUND(long idUND) {
		String idUNDstr = idUND + "";
		String out = "undER";
		for (int i = 0; i < ARR_UNIDADES_DE_MEDIDA.length; i++) {
			if (ARR_UNIDADES_DE_MEDIDA[i][0].compareTo(idUNDstr) == 0) {
				out = ARR_UNIDADES_DE_MEDIDA[i][1];
			}
		}
		return out;
	}

}
