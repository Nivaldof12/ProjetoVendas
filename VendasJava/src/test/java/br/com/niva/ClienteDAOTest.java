package br.com.niva;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.niva.dao.ClienteDaoMock;
import br.com.niva.dao.IClienteDAO;
import br.com.niva.domain.Cliente;

public class ClienteDAOTest {
	
	private IClienteDAO clienteDao;
	
	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDaoMock();
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
		clienteDao.salvar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDao.buscarPorCPF(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() {
		Boolean retorno = clienteDao.salvar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	
}
