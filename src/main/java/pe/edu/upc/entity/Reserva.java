package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reserva")
public class Reserva {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idReserva;
	@Column (name="clienteCorreo",nullable=false,length=35)
	private String nameLaboratory;
	@Column (name="idBicicleta",nullable=false)
	private int idBicicleta;
	@Column (name="horaReserva",nullable=false)
	private int horaReserva;
	@Column (name="fechaReserva",nullable=false)
	private Date fechaReserva;
	@Column (name="costoReserva",nullable=false)
	private float costoReserva;
	@Column (name="idTipoPago",nullable=false)
	private int idTipopago;
	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public String getNameLaboratory() {
		return nameLaboratory;
	}
	public void setNameLaboratory(String nameLaboratory) {
		this.nameLaboratory = nameLaboratory;
	}
	public int getIdBicicleta() {
		return idBicicleta;
	}
	public void setIdBicicleta(int idBicicleta) {
		this.idBicicleta = idBicicleta;
	}
	public int getHoraReserva() {
		return horaReserva;
	}
	public void setHoraReserva(int horaReserva) {
		this.horaReserva = horaReserva;
	}
	public Date getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	public float getCostoReserva() {
		return costoReserva;
	}
	public void setCostoReserva(float costoReserva) {
		this.costoReserva = costoReserva;
	}
	public int getIdTipopago() {
		return idTipopago;
	}
	public void setIdTipopago(int idTipopago) {
		this.idTipopago = idTipopago;
	}
	
	
	
	
}
