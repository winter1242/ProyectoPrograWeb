package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Empresa;

public interface IEmpresaService {
	public void insert(Empresa emp);
	
	public List<Empresa> list();

}
