package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Cliente;

public interface IClienteDao {
	public void insert(Cliente client);
	
	public List<Cliente> list();
	

}
