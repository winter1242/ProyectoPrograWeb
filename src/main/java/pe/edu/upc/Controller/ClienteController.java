package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IClienteDao;
import pe.edu.upc.entity.Cliente;


@Named
@RequestScoped
public class ClienteController {
	@Inject
	private IClienteDao cService;
	private Cliente c;
	List<Cliente> listClientes;
	
	//constructor
		@PostConstruct
		public void init() {
			this.listClientes = new ArrayList<Cliente>();
			this.c = new Cliente();
			this.list();
		}

	// métodos
		public String newCliente() {
			this.setC(new Cliente());
			return "Cliente.xhtml";
		}

		public void insert() {
			try {
				cService.insert(c);
				cleanCliente();
				this.list();
			} catch (Exception e) {
				e.getMessage();
			}
		}

		public void list() {
			try {
				listClientes = cService.list();
			} catch (Exception e) {
				e.getMessage();
			}
		}

		public void cleanCliente() {
			this.init();
		}

	
	
	//get y set
	public Cliente getC() {
		return c;
	}
	public void setC(Cliente c) {
		this.c = c;
	}
	public List<Cliente> getListClientes() {
		return listClientes;
	}
	public void setListClientes(List<Cliente> listClientes) {
		this.listClientes = listClientes;
	}

	
	
}
