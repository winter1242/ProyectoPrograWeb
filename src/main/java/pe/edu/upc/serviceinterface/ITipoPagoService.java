package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.TipoPago;

public interface ITipoPagoService {

	public void insert(TipoPago tip);
	
	public List<TipoPago> list();
}
