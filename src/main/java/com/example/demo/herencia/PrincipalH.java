package com.example.demo.herencia;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;

public class PrincipalH {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		OperadoraH miOperadora = new OperadoraH();
		miOperadora.setNombreEmpresa("Claro");
		
		ClientePrepagoH miClientePrepago = new ClientePrepagoH();
		miClientePrepago.setNombre("Alexis Macalister");
		miClientePrepago.setCedula("179765456");
		miClientePrepago.setId("78-sa");
		miClientePrepago.setNumeroCelular("098778271");
		miClientePrepago.setTipo("Prepago");
		
		ClientePospagoH miClientePospago = new ClientePospagoH();
		miClientePospago.setNombre("María Jose");
		miClientePospago.setCedula("179765456");
		miClientePospago.setId("sa");
		miClientePospago.setNumeroCelular("098778271");
		miClientePospago.setTipo("Pospago");
	
		
		AbonoSaldosH nuevoAbono = new AbonoSaldosH();
		nuevoAbono.abonarSaldos("234567", miClientePrepago, null,  miOperadora);
		//nuevoAbono.abonarSaldos("234567", null, miClientePospago ,  miOperadora);

	}
	

}
