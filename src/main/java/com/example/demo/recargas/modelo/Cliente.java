package com.example.demo.recargas.modelo;

import java.math.BigDecimal;

public class Cliente {

	private String nombre;
	private String cedula;
	private String id;
	private String numeroCelular;
	private String tipo;
	private BigDecimal saldoActual;
	
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
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public BigDecimal getSaldoActual() {
			return saldoActual;
		}
		public void setSaldoActual(BigDecimal saldoActual) {
		this.saldoActual = saldoActual;
	}
	
	
	
	
	
}
