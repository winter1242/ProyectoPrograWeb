package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Empresa;

public interface IEmpresaDao {
	public void insert(Empresa emp);
	
	public List<Empresa> list();

}
