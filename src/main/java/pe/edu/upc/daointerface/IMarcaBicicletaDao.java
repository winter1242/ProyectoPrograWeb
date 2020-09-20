package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.MarcaBicicleta;

public interface IMarcaBicicletaDao {
	public void insert(MarcaBicicleta mar);
	
	public List<MarcaBicicleta> list();

}
