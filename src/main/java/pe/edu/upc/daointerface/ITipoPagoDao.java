package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.TipoPago;

public interface ITipoPagoDao {

	public void insert(TipoPago tip);
	
	public List<TipoPago> list();
}
