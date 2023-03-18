package br.com.niva.dao;

import br.com.niva.domain.Cliente;

public interface IClienteDAO {

	Boolean salvar(Cliente cliente);
	
	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

}
