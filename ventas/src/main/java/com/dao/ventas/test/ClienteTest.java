package com.dao.ventas.test;

import java.util.List;

import com.dao.ventas.model.dao.IClienteDAO;
import com.dao.ventas.model.dao.impl.ClienteDAOImpl;
import com.gao.ventas.model.entities.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		IClienteDAO target = new ClienteDAOImpl();
		List<Cliente> listaClientes = target.listar(Cliente.class);
		for(Cliente c: listaClientes) {
			System.out.println(c.toString());
		}

	}

}
