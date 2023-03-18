package br.com.niva;

import org.junit.Assert;
import org.junit.Test;

import br.com.niva.dao.ClienteDaoMock;
import br.com.niva.dao.IClienteDAO;
import br.com.niva.domain.Cliente;
import br.com.niva.services.ClienteService;
import br.com.niva.services.IClienteService;

public class ClienteTest {
	
	private IClienteService clienteService;
	
	public ClienteTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}

	@Test
	public void pesquisarCliente() {
		Cliente cliente = new Cliente();
		cliente.setNome("Nivaldo");
		cliente.setCpf(12312312312L);
		cliente.setCidade("Caruaru");
		cliente.setEnd("Rua iracema");
		cliente.setEstado("PE");
		cliente.setNumero(10);
		cliente.setTel(81994685930L);
		
		clienteService.salvar(cliente);
		
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}
}
