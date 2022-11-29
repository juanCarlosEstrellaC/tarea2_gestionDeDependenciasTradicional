package com.example.demo.recargas.repository;

import com.example.demo.recargas.modelo.AbonoSaldos;

public interface IClienteRepository {

	//CRUD
	public AbonoSaldos buscar(String id);
	public void actualizar(AbonoSaldos abonoSaldos);
	public void insertar(AbonoSaldos abonoSaldos);
	public void borrar(String id);

	
}
