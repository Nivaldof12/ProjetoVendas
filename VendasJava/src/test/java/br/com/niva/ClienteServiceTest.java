package br.com.niva;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.niva.dao.ClienteDaoMock;
import br.com.niva.dao.IClienteDAO;
import br.com.niva.dao.exceptions.TipoChaveNaoEncontradaException;
import br.com.niva.domain.Cliente;
import br.com.niva.services.ClienteService;
import br.com.niva.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setNome("Nivaldo");
		cliente.setCpf(12312312312L);
		cliente.setCidade("Caruaru");
		cliente.setEnd("Rua iracema");
		cliente.setEstado("PE");
		cliente.setNumero(10);
		cliente.setTel(81994685930L);
	}

	@Test
	public void pesquisarCliente() {
		
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.salvar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Nivaldo Ferreira");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Nivaldo Ferreira",cliente.getNome());
	}
}
