package com.example.demo.recargas.modelo;

import java.time.LocalDateTime;

public class AbonoSaldos {
	
	private String numeroConsulta;
	private LocalDateTime fechaConsulta;
	
		public String getNumeroConsulta() {
			return numeroConsulta;
		}
		public void setNumeroConsulta(String numeroConsulta) {
			this.numeroConsulta = numeroConsulta;
		}
		public LocalDateTime getFechaConsulta() {
			return fechaConsulta;
		}
		public void setFechaConsulta(LocalDateTime fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	
}
