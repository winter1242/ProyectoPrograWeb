package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MarcaBicicleta")
public class MarcaBicicleta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idMarcaBicicleta;
	
	@Column(name = "nameMarca", nullable = false, length = 45)
	private String nameMarca;

	public MarcaBicicleta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MarcaBicicleta(int idMarcaBicicleta, String nameMarca) {
		super();
		this.idMarcaBicicleta = idMarcaBicicleta;
		this.nameMarca = nameMarca;
	}

	public int getIdMarcaBicicleta() {
		return idMarcaBicicleta;
	}

	public void setIdMarcaBicicleta(int idMarcaBicicleta) {
		this.idMarcaBicicleta = idMarcaBicicleta;
	}

	public String getNameMarca() {
		return nameMarca;
	}

	public void setNameMarca(String nameMarca) {
		this.nameMarca = nameMarca;
	}
	
	
	

}
