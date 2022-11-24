package com.example.demo.springBoot;
import org.springframework.stereotype.Component;

@Component
public class ClientePospagoSB extends ClienteSB {
	
	private double saldoAbonoConstante;

		public double getSaldoAbonoConstante() {
			return saldoAbonoConstante;
		}
		public void setSaldoAbonoConstante(double saldoAbonoConstante) {
			this.saldoAbonoConstante = saldoAbonoConstante;
		}

}
