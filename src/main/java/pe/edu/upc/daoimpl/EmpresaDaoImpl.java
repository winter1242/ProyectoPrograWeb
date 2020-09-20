package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IEmpresaDao;
import pe.edu.upc.entity.Empresa;

public class EmpresaDaoImpl implements Serializable, IEmpresaDao{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "Trabajo_Parcial")
	private EntityManager em;
	
	@Transactional
	public void insert(Empresa emp) {
		try {
			em.persist(emp);
		}catch (Exception e) {
			System.out.println("Error al insertar");
		}
		
	}

	@SuppressWarnings("unchecked")
	public List<Empresa> list() {
		List<Empresa> lista=new ArrayList<Empresa>();
		try {
			Query q=em.createQuery("from Empresa e");
			lista= (List<Empresa>) q.getResultList();
		}catch (Exception e) {
			System.out.println("Error al listar");
		}
		return lista;
	}

}
