package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TipoPago")
public class TipoPago implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTipoPago;
	@Column(name = "nameTipoPago", nullable = false, length = 45)
	private String nameTipoPago;
	public TipoPago() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TipoPago(int idTipoPago, String nameTipoPago) {
		super();
		this.idTipoPago = idTipoPago;
		this.nameTipoPago = nameTipoPago;
	}
	public int getIdTipoPago() {
		return idTipoPago;
	}
	public void setIdTipoPago(int idTipoPago) {
		this.idTipoPago = idTipoPago;
	}
	public String getNameTipoPago() {
		return nameTipoPago;
	}
	public void setNameTipoPago(String nameTipoPago) {
		this.nameTipoPago = nameTipoPago;
	}
	
	
	
}
