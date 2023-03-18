package br.com.niva.services;

import br.com.niva.dao.IClienteDAO;
import br.com.niva.dao.exceptions.TipoChaveNaoEncontradaException;
import br.com.niva.domain.Cliente;

public class ClienteService implements IClienteService {
	
	private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
		
	}

	@Override
	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		return clienteDAO.cadastrar(cliente);

	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return clienteDAO.consultar(cpf);
	}

	@Override
	public void excluir(Long cpf) {
		clienteDAO.excluir(cpf);
	}

	@Override
	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		clienteDAO.alterar(cliente);
		
	}

}
