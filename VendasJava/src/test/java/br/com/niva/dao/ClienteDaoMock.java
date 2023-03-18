package br.com.niva.dao;

import br.com.niva.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO {

	@Override
	public Boolean salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		return cliente;
	}

	@Override
	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		
	}

}
