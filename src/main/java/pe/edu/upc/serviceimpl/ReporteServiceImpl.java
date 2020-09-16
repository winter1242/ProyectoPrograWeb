package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.edu.upc.daointerface.IReporteDao;
import pe.edu.upc.entity.Reporte;




@Named
@RequestScoped
public class ReporteServiceImpl {
	@Inject
	private IReporteDao lD;

	public void insert(Reporte rep) {
		// TODO Auto-generated method stub

		try {
			lD.insert(rep);
		} catch (Exception e) {
			System.out.println("Error al insertar en el Service");
		}

	}

	public List<Reporte> list() {

		return lD.list();
	}
}
