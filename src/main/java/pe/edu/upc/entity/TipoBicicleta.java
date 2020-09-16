package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoBicicleta")
public class TipoBicicleta {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idTipo;
	@Column (name="nombreTipo",nullable=false,length=35)
	private String nombreTipo;
	public TipoBicicleta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	public String getNombreTipo() {
		return nombreTipo;
	}
	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}
	
	
}
