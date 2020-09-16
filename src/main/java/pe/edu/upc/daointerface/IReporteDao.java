package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Reporte;

public interface IReporteDao {
	public void insert(Reporte reporte);
	public List<Reporte> list();
}
