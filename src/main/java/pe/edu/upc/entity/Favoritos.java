package pe.edu.upc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Favoritos")
public class Favoritos {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idFavoritos;
	@Column (name="nombreLista",nullable=false,length=35)
	private String nombreLista;
	@Column (name="descripcionFavorito",nullable=false,length=35)
	private String descripcionFavorito;
	@Column (name="clienteCorreo",nullable=false,length=35)
	private String clienteCorreo;
	public Favoritos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdFavoritos() {
		return idFavoritos;
	}
	public void setIdFavoritos(int idFavoritos) {
		this.idFavoritos = idFavoritos;
	}
	public String getNombreLista() {
		return nombreLista;
	}
	public void setNombreLista(String nombreLista) {
		this.nombreLista = nombreLista;
	}
	public String getDescripcionFavorito() {
		return descripcionFavorito;
	}
	public void setDescripcionFavorito(String descripcionFavorito) {
		this.descripcionFavorito = descripcionFavorito;
	}
	public String getClienteCorreo() {
		return clienteCorreo;
	}
	public void setClienteCorreo(String clienteCorreo) {
		this.clienteCorreo = clienteCorreo;
	}
	
	
	
}
