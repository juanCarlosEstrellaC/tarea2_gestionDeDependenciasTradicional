package com.example.demo.tradicional;

import org.springframework.boot.SpringApplication;

public class Principal {

	public static void main(String[] args) {
		AbonoSaldos nuevoAbono = new AbonoSaldos();
		nuevoAbono.AbonarSaldos("234567", "Alexis Macalister", "179765456", "78-sa", "098778271", "Prepago", "Claro");

	}
	

}
