package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoPago")
public class TipoPago {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idTipoPago;
	@Column (name="namePago",nullable=false,length=35)
	private String namePago;
	public TipoPago() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdTipoPago() {
		return idTipoPago;
	}
	public void setIdTipoPago(int idTipoPago) {
		this.idTipoPago = idTipoPago;
	}
	public String getNamePago() {
		return namePago;
	}
	public void setNamePago(String namePago) {
		this.namePago = namePago;
	}
	

}
