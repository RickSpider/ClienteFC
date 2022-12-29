package com.nm.clientefc;

public class MappingSET {

	public static String[][] UND = { //
			{ "77", "UND" } //
	};

	public String getUND(long idUND) {
		String idUNDstr = idUND + "";
		String out = "undER";
		for (int i = 0; i < UND.length; i++) {
			if (UND[i][0].compareTo(idUNDstr) == 0) {
				out = UND[i][1];
			}
		}
		return out;
	}

}
