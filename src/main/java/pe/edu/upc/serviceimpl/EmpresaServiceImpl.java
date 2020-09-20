package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.daointerface.IEmpresaDao;
import pe.edu.upc.entity.Empresa;
import pe.edu.upc.serviceinterface.IEmpresaService;


public class EmpresaServiceImpl implements IEmpresaService, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IEmpresaDao eD;
	

	@Override
	public void insert(Empresa emp) {
		eD.insert(emp);
		
	}

	@Override
	public List<Empresa> list() {
		// TODO Auto-generated method stub
		return eD.list();
	}

}
