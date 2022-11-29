package com.example.demo.recargas.repository;

import com.example.demo.recargas.modelo.Cliente;

public interface IAbonoSaldosRepository {
	
	public Cliente buscarPorNumero(String numero);

	//CRUD
	public Cliente buscar(Integer id);
	public void actualizar(Cliente cliente);
	public void insertar(Cliente cliente);
	public void borrar(Integer id);

	
}
