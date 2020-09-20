package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.ITipoPagoDao;
import pe.edu.upc.entity.TipoPago;
import pe.edu.upc.serviceinterface.ITipoPagoService;

@Named
@RequestScoped
public class TipoPagoServiceImpl implements ITipoPagoService, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ITipoPagoDao tD;
	
	@Override
	public void insert(TipoPago tip) {
		tD.insert(tip);
		
	}

	@Override
	public List<TipoPago> list() {
		// TODO Auto-generated method stub
		return tD.list();
	}

}
