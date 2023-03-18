package br.com.niva.services;

import br.com.niva.dao.exceptions.TipoChaveNaoEncontradaException;
import br.com.niva.domain.Cliente;

public interface IClienteService {

	Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
