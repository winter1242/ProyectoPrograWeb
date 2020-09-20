package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IMarcaBicicletaDao;
import pe.edu.upc.entity.MarcaBicicleta;

public class MarcaBicicletaDaoImpl implements Serializable, IMarcaBicicletaDao{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "Trabajo_Parcial")
	private EntityManager em;
	
	@Transactional
	public void insert(MarcaBicicleta mar) {
		try {
			em.persist(mar);
		}catch (Exception e) {
			System.out.println("Error al insertar ");
		}
		
	}

	@SuppressWarnings("unchecked")
	public List<MarcaBicicleta> list() {
		List<MarcaBicicleta> lista=new ArrayList<MarcaBicicleta>();
		try {
			Query q = em.createQuery("from MarcaBicicleta m");
			lista = (List<MarcaBicicleta>) q.getResultList();
		}catch (Exception e) {
			System.out.println("Error al listar");
		}
		return lista;
	}

}
