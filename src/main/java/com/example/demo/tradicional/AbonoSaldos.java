package com.example.demo.tradicional;

import java.time.LocalDateTime;
import java.util.Scanner;

public class AbonoSaldos {

	private String numeroConsulta;
	private LocalDateTime fechaConsulta;
	private Operadora operadora;
	Cliente cliente;

	Scanner teclado = new Scanner(System.in);

	public void AbonarSaldos(String numeroConsulta, String nombre, String cedula, String id, String numeroCelular,
			String tipo, String nombreEmpresa) {

		this.numeroConsulta = numeroConsulta;
		this.fechaConsulta = LocalDateTime.now();

		Operadora operadoraObjeto = new Operadora();
		operadoraObjeto.setNombreEmpresa(nombreEmpresa);
		this.operadora = operadoraObjeto;

		if (tipo.equals("Prepago")) {
			ClientePrepago clientePrepagoObjeto = new ClientePrepago();
			System.out.println("Ingrese el saldo a abonar, por favor: ");
			double ab = teclado.nextDouble();
			clientePrepagoObjeto.setAbono(ab);
			this.cliente = clientePrepagoObjeto;
			this.cliente.setSaldoActual(ab);

			System.out.println("Operacion con Cliente Prepago");
			System.out.println(clientePrepagoObjeto.getAbono());

		} else {
			ClientePospago clientePospagoObjeto = new ClientePospago();
			double cte = 20.5;
			clientePospagoObjeto.setSaldoAbonoConstante(cte);
			this.cliente = clientePospagoObjeto;
			this.cliente.setSaldoActual(cte);

			System.out.println("Operacion con Cliente Pospago");
			System.out.println(clientePospagoObjeto.getSaldoAbonoConstante());
		}

		this.cliente.setNombre(nombre);
		this.cliente.setCedula(cedula);
		this.cliente.setId(id);
		this.cliente.setNumeroCelular(numeroCelular);

		guardarCambios(this);
	}

	private void guardarCambios(AbonoSaldos abonoSaldos) {
		System.out.println(abonoSaldos);
	}

	@Override
	public String toString() {
		return "AbonoSaldos [numeroConsulta=" + numeroConsulta + ", fechaConsulta=" + fechaConsulta + ", operadora="
				+ operadora + ", cliente=" + cliente;
	}

}
