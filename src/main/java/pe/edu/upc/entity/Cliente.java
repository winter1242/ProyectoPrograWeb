package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCliente;

	@Column(name = "nameCliente", nullable = false, length = 45)
	private String nameCliente;
	
	@Column(name = "lastNameCliente", nullable = false, length = 45)
	private String lastNameCliente;
	
	@Column(name = "emailCliente", nullable = false, length = 45)
	private String emailCliente;
	
	@Column(name = "phoneCliente", nullable = false, length = 45)
	private String phoneCliente;
	
	@Column(name = "passwordCliente", nullable = false, length = 45)
	private String passwordCliente;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int idCliente, String nameCliente, String lastNameCliente, String emailCliente, String phoneCliente,String passwordCliente) {
		super();
		this.idCliente = idCliente;
		this.nameCliente = nameCliente;
		this.lastNameCliente = lastNameCliente;
		this.emailCliente = emailCliente;
		this.phoneCliente = phoneCliente;
		this.passwordCliente = passwordCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNameCliente() {
		return nameCliente;
	}

	public void setNameCliente(String nameCliente) {
		this.nameCliente = nameCliente;
	}

	public String getLastNameCliente() {
		return lastNameCliente;
	}

	public void setLastNameCliente(String lastNameCliente) {
		this.lastNameCliente = lastNameCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getPhoneCliente() {
		return phoneCliente;
	}

	public void setPhoneCliente(String phoneCliente) {
		this.phoneCliente = phoneCliente;
	}

	public String getPasswordCliente() {
		return passwordCliente;
	}

	public void setPasswordCliente(String passwordCliente) {
		this.passwordCliente = passwordCliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
