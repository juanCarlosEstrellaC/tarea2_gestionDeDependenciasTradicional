package com.example.demo.recargas.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.recargas.modelo.Cliente;

@Repository
public class ClienteRepositoryImpl implements IAbonoSaldosRepository {

	private static List<Cliente> baseClientes = new ArrayList<>();
	
	
	@Override
	public Cliente buscarPorNumero(String id) {
		// Normalmente, iría la instrucción SQL:
		// SELECT * FROM CUENTA C WHERE C.NUMERO = numeroCuenta
		
		Cliente cliente = new Cliente();
		cliente.setCedula("3456789");
		cliente.setId(id);
		cliente.setNombre("José Torres");
		cliente.setSaldoActual(new BigDecimal(2.52));
		cliente.setNumeroCelular("09965854656");
		cliente.setTipo("Prepago");
		
		//return cliente;
		return null;

	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Cliente cliente) {
		baseClientes.add(cliente);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
