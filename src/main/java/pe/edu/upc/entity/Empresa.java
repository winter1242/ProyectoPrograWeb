package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Empresa")
public class Empresa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEmpresa;
	@Column(name = "nameEmpresa", nullable = false, length = 45)
	private String nameEmpresa;
	@Column(name = "rucEmpresa", nullable = false, length = 45)
	private String rucEmpresa;
	
	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empresa(int idEmpresa, String nameEmpresa, String rucEmpresa) {
		super();
		this.idEmpresa = idEmpresa;
		this.nameEmpresa = nameEmpresa;
		this.rucEmpresa = rucEmpresa;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNameEmpresa() {
		return nameEmpresa;
	}

	public void setNameEmpresa(String nameEmpresa) {
		this.nameEmpresa = nameEmpresa;
	}

	public String getRucEmpresa() {
		return rucEmpresa;
	}

	public void setRucEmpresa(String rucEmpresa) {
		this.rucEmpresa = rucEmpresa;
	}

	

}
