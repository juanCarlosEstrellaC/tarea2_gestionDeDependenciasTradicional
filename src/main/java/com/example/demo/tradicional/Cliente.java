package com.example.demo.tradicional;

public class Cliente {
	
	protected String nombre;
	protected String cedula;
	protected String id;
	protected String numeroCelular;
	protected double saldoActual;
	
	
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", cedula=" + cedula + ", id=" + id + ", numeroCelular=" + numeroCelular
				+ ", saldoActual=" + saldoActual + "]";
	}
	
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getCedula() {
			return cedula;
		}
		public void setCedula(String cedula) {
			this.cedula = cedula;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getNumeroCelular() {
			return numeroCelular;
		}
		public void setNumeroCelular(String numeroCelular) {
			this.numeroCelular = numeroCelular;
		}
		public double getSaldoActual() {
			return saldoActual;
		}
		public void setSaldoActual(double saldoActual) {
			this.saldoActual = saldoActual;
		}
	
}
