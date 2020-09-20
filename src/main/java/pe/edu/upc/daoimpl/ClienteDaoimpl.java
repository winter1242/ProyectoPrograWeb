package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IClienteDao;
import pe.edu.upc.entity.Cliente;

public class ClienteDaoimpl implements Serializable,IClienteDao{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "Trabajo_Parcial")
	private EntityManager em;
	

	@Transactional
	public void insert(Cliente client) {
		try {
			em.persist(client);
		}catch (Exception e) {
			System.out.println("Error al insertar");
		}
		
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> list() {
		List<Cliente> lista=new ArrayList<Cliente>();
		
		try {
			Query q = em.createQuery("from Cliente c");
			lista=(List<Cliente>) q.getResultList();
		}catch (Exception e) {
			System.out.println("Error al listar");
		}
		
		
		return lista;
	}

	
}
