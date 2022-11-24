package com.example.demo.springBoot;
import org.springframework.stereotype.Component;

@Component
public class ClientePrepagoSB extends ClienteSB {
	
	private double abono;

		public double getAbono() {
			return abono;
		}
		public void setAbono(double abono) {
			this.abono = abono;
		}
		
}
