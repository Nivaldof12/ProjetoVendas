package br.com.niva.services;

import br.com.niva.domain.Cliente;

public interface IClienteService {

	Boolean salvar(Cliente cliente);

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

}
