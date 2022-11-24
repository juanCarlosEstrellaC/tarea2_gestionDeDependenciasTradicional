package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.springBoot.AbonoSaldosSB;
import com.example.demo.springBoot.ClientePospagoSB;
import com.example.demo.springBoot.ClientePrepagoSB;
import com.example.demo.springBoot.OperadoraSB;

@SpringBootApplication
public class Tarea2GestionDeDependenciasTradicionalApplication implements CommandLineRunner {

	@Autowired
	private OperadoraSB miOperadora;
	
	@Autowired
	private ClientePrepagoSB miClientePrepago;
	
	@Autowired
	private ClientePospagoSB miClientePospago;
	
	@Autowired
	private AbonoSaldosSB nuevoAbono;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea2GestionDeDependenciasTradicionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Spring Boot");
		
		miOperadora.setNombreEmpresa("Claro");
		
		this.miClientePrepago.setNombre("Alexis Macalister");
		this.miClientePrepago.setCedula("179765456");
		this.miClientePrepago.setId("78-sa");
		this.miClientePrepago.setNumeroCelular("098778271");
		this.miClientePrepago.setTipo("Prepago");
		
		this.miClientePospago.setNombre("María Jose");
		this.miClientePospago.setCedula("179765456");
		this.miClientePospago.setId("sa");
		this.miClientePospago.setNumeroCelular("098778271");
		this.miClientePospago.setTipo("Pospago");
		
		//nuevoAbono.abonarSaldos("234567", miClientePrepago, null,  miOperadora);
		nuevoAbono.abonarSaldos("234567", null, miClientePospago ,  miOperadora);
		
		//j

	}

}
