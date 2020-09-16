package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Bicicleta;

public interface IBicicletaDao {
	public void insert(Bicicleta lab);
	public List<Bicicleta> list();
}
