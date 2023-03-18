package br.com.niva.dao;

import br.com.niva.domain.Cliente;

public interface IClienteDAO {

	void salvar(Cliente cliente);
	
	Cliente buscarPorCPF(Long cpf);

}
