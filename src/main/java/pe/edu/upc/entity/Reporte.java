package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reporte")
public class Reporte {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idReporte;
	@Column (name="descripcionReporte",nullable=false,length=35)
	private String descripcionReporte;
	public Reporte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdReporte() {
		return idReporte;
	}
	public void setIdReporte(int idReporte) {
		this.idReporte = idReporte;
	}
	public String getDescripcionReporte() {
		return descripcionReporte;
	}
	public void setDescripcionReporte(String descripcionReporte) {
		this.descripcionReporte = descripcionReporte;
	}

}
