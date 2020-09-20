package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.daointerface.IClienteDao;
import pe.edu.upc.entity.Cliente;
import pe.edu.upc.serviceinterface.IClienteService;

public class ClienteServiceImpl implements IClienteService,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IClienteDao cD;
	
	@Override
	public void insert(Cliente cli) {
		cD.insert(cli);
		
	}

	@Override
	public List<Cliente> list() {
		// TODO Auto-generated method stub
		return cD.list();
	}

	
}
