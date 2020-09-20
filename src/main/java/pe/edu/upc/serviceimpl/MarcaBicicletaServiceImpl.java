package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.daointerface.IMarcaBicicletaDao;
import pe.edu.upc.entity.MarcaBicicleta;
import pe.edu.upc.serviceinterface.IMarcaBicicletaService;

public class MarcaBicicletaServiceImpl implements IMarcaBicicletaService, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IMarcaBicicletaDao mD;
	
	@Override
	public void insert(MarcaBicicleta mar) {
		mD.insert(mar);
		
	}

	@Override
	public List<MarcaBicicleta> list() {
		// TODO Auto-generated method stub
		return mD.list();
	}

}
