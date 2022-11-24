package com.example.demo.herencia;

import java.time.LocalDateTime;
import java.util.Scanner;

public class AbonoSaldosH {

	private String numeroConsulta;
	private LocalDateTime fechaConsulta;
	private OperadoraH operadora;
	private ClientePrepagoH clientePrepago;
	private ClientePospagoH clientePospago;

	Scanner teclado = new Scanner(System.in);

	public void abonarSaldos(String numeroConsulta, ClientePrepagoH clientePrepago, ClientePospagoH clientePospago,
			                 OperadoraH operadora) {

		this.numeroConsulta = numeroConsulta;
		this.fechaConsulta = LocalDateTime.now();

		this.operadora = operadora;
		this.clientePrepago = clientePrepago;
		this.clientePospago = clientePospago;
		
		if (clientePospago == null) {
			System.out.println("Ingrese el saldo a abonar, por favor: ");
			double ab = teclado.nextDouble();
			clientePrepago.setAbono(ab);
			this.clientePrepago.setSaldoActual(ab);

			System.out.println("Operacion con Cliente Prepago");
			System.out.println(clientePrepago.getAbono());

		} 
		
		if (clientePrepago == null) {
			double cte = 20.5;
			clientePospago.setSaldoAbonoConstante(cte);
			this.clientePospago.setSaldoActual(cte);

			System.out.println("Operacion con Cliente Pospago");
			System.out.println(clientePospago.getSaldoAbonoConstante());
		}
		
		guardarCambios(this);
	}

	private void guardarCambios(AbonoSaldosH abonoSaldos) {
		System.out.println(abonoSaldos);
	}

	@Override
	public String toString() {
		String resp = null;
		if (clientePospago == null) {
			
			resp = "AbonoSaldos [numeroConsulta=" + numeroConsulta + ", fechaConsulta=" + fechaConsulta + ", operadora="
					+ operadora + ", cliente=" + clientePrepago;
		} 
		
		if (clientePrepago == null) {
			resp = "AbonoSaldos [numeroConsulta=" + numeroConsulta + ", fechaConsulta=" + fechaConsulta + ", operadora="
					+ operadora + ", cliente=" + clientePospago;
		}
		
		return resp;
	}

}
