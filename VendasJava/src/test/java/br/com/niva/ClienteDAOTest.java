package br.com.niva;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.niva.dao.ClienteDaoMock;
import br.com.niva.dao.IClienteDAO;
import br.com.niva.dao.exceptions.TipoChaveNaoEncontradaException;
import br.com.niva.domain.Cliente;

public class ClienteDAOTest {
	
	private IClienteDAO clienteDao;
	
	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDaoMock();
	}

	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		cliente = new Cliente();
		cliente.setNome("Nivaldo");
		cliente.setCpf(12312312312L);
		cliente.setCidade("Caruaru");
		cliente.setEnd("Rua iracema");
		cliente.setEstado("PE");
		cliente.setNumero(10);
		cliente.setTel(81994685930L);
		clienteDao.cadastrar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteDao.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Nivaldo Ferreira");
		clienteDao.alterar(cliente);
		
		Assert.assertEquals("Nivaldo Ferreira",cliente.getNome());
	}
	
}
