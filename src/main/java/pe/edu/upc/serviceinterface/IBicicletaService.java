package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Bicicleta;

public interface IBicicletaService {
	public void insert(Bicicleta lab);
	public List<Bicicleta> list();
}
