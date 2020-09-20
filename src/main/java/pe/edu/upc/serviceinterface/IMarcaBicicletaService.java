package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.MarcaBicicleta;

public interface IMarcaBicicletaService {
	public void insert(MarcaBicicleta mar);
	
	public List<MarcaBicicleta> list();
}
