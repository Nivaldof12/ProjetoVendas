package br.com.niva.dao;

import br.com.niva.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO {

	@Override
	public void salvar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		return cliente;
	}

}
