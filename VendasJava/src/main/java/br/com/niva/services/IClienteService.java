package br.com.niva.services;

import br.com.niva.domain.Cliente;

public interface IClienteService {

	void salvar(Cliente cliente);

	Cliente buscarPorCPF(Long cpf);

}
