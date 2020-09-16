package pe.edu.upc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String correoCliente;
	@Column (name="nombreCliente",nullable=false,length=35)
	private String nombreCliente;
	@Column (name="ApellidoCliente",nullable=false,length=35)
	private String ApellidoCliente;
	@Column (name="telefonoCliente",nullable=true,length=35)
	private String telefonoCliente;
	@Column (name="contraseniaCliente",nullable=false,length=35)
	private String contraseniaCliente;
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCorreoCliente() {
		return correoCliente;
	}
	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoCliente() {
		return ApellidoCliente;
	}
	public void setApellidoCliente(String apellidoCliente) {
		ApellidoCliente = apellidoCliente;
	}
	public String getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}
	public String getContraseniaCliente() {
		return contraseniaCliente;
	}
	public void setContraseniaCliente(String contraseniaCliente) {
		this.contraseniaCliente = contraseniaCliente;
	}
	
	

}
