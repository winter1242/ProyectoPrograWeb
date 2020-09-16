package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idEmpresa;
	@Column (name="RUCEmpresa",nullable=false,length=35)
	private String RUCEmpresa;
	@Column (name="razonSocial",nullable=true,length=35)
	private String razonSocial;
	@Column (name="descripcionEmpresa",nullable=true,length=35)
	private String descripcionEmpresa;
	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getRUCEmpresa() {
		return RUCEmpresa;
	}
	public void setRUCEmpresa(String rUCEmpresa) {
		RUCEmpresa = rUCEmpresa;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getDescripcionEmpresa() {
		return descripcionEmpresa;
	}
	public void setDescripcionEmpresa(String descripcionEmpresa) {
		this.descripcionEmpresa = descripcionEmpresa;
	}
	
	

}
