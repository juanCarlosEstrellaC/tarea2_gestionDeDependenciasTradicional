package com.example.demo.herencia;

public class OperadoraH {

	private String nombreEmpresa;
	private String Ruc;

	@Override
	public String toString() {
		return "Operadora [nombreEmpresa=" + nombreEmpresa ;
	}
		public String getNombreEmpresa() {
			return nombreEmpresa;
		}
		public void setNombreEmpresa(String nombreEmpresa) {
			this.nombreEmpresa = nombreEmpresa;
		}
		public String getRuc() {
			return Ruc;
		}
		public void setRuc(String ruc) {
		Ruc = ruc;
	}

}
