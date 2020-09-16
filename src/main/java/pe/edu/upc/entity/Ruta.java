package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ruta")
public class Ruta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idRuta;
	@Column (name="puntoInicio",nullable=false,length=35)
	private String puntoInicio;
	@Column (name="puntoFinal",nullable=false,length=35)
	private String puntoFinal;
	@Column (name="idReserva",nullable=false)
	private int idReserva;
	public Ruta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdRuta() {
		return idRuta;
	}
	public void setIdRuta(int idRuta) {
		this.idRuta = idRuta;
	}
	public String getPuntoInicio() {
		return puntoInicio;
	}
	public void setPuntoInicio(String puntoInicio) {
		this.puntoInicio = puntoInicio;
	}
	public String getPuntoFinal() {
		return puntoFinal;
	}
	public void setPuntoFinal(String puntoFinal) {
		this.puntoFinal = puntoFinal;
	}
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	
	

}
