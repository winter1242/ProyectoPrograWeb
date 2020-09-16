package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Reserva;

public interface IReservaDao {
	public void insert(Reserva lab);
	public List<Reserva> list();
}
