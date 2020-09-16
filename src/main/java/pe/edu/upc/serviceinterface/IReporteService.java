package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Reporte;

public interface IReporteService {
	public void insert(Reporte rep);
	public List<Reporte> list();
}
