package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.daointerface.ITipoPagoDao;
import pe.edu.upc.entity.TipoPago;

public class TipoPagoDaoImpl implements Serializable, ITipoPagoDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "Trabajo_Parcial")
	private EntityManager em;

	@Override
	public void insert(TipoPago tip) {
		try {
			em.persist(tip);
		}catch (Exception e) {
			System.out.println("Error al insertar ");
		}
		
	}

	@SuppressWarnings("unchecked")
	public List<TipoPago> list() {
		List<TipoPago> lista=new ArrayList<TipoPago>();
		try {
			Query q = em.createQuery("from TipoPago t");
			lista = (List<TipoPago>) q.getResultList();
		}catch (Exception e) {
			System.out.println("Error al listar");
		}
		
		return lista;
	}

}
