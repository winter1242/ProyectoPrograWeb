package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bicicleta")
public class Bicicleta {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idBicicleta;
	@Column (name="nombreBicicleta",nullable=false,length=35)
	private String nombreBicicleta;
	@Column (name="modeloBicicleta",nullable=false,length=35)
	private String modeloBicicleta;
	@Column (name="largoBiella",nullable=false,length=35)
	private String largoBiella;
	@Column (name="largoAvance",nullable=false,length=35)
	private String largoAvance;
	@Column (name="largoPosteAsiento",nullable=false,length=35)
	private String largoPosteAsiento;
	@Column (name="EmpresaRuc",nullable=false,length=35)
	private String EmpresaRuc;
	@Column (name="TipoId",nullable=false)
	private int TipoId;
	@Column (name="MarcaId",nullable=false)
	private int MarcaId;
	@Column (name="cantidad",nullable=false)
	private int cantidad;
	public Bicicleta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdBicicleta() {
		return idBicicleta;
	}
	public void setIdBicicleta(int idBicicleta) {
		this.idBicicleta = idBicicleta;
	}
	public String getNombreBicicleta() {
		return nombreBicicleta;
	}
	public void setNombreBicicleta(String nombreBicicleta) {
		this.nombreBicicleta = nombreBicicleta;
	}
	public String getModeloBicicleta() {
		return modeloBicicleta;
	}
	public void setModeloBicicleta(String modeloBicicleta) {
		this.modeloBicicleta = modeloBicicleta;
	}
	public String getLargoBiella() {
		return largoBiella;
	}
	public void setLargoBiella(String largoBiella) {
		this.largoBiella = largoBiella;
	}
	public String getLargoAvance() {
		return largoAvance;
	}
	public void setLargoAvance(String largoAvance) {
		this.largoAvance = largoAvance;
	}
	public String getLargoPosteAsiento() {
		return largoPosteAsiento;
	}
	public void setLargoPosteAsiento(String largoPosteAsiento) {
		this.largoPosteAsiento = largoPosteAsiento;
	}
	public String getEmpresaRuc() {
		return EmpresaRuc;
	}
	public void setEmpresaRuc(String empresaRuc) {
		EmpresaRuc = empresaRuc;
	}
	public int getTipoId() {
		return TipoId;
	}
	public void setTipoId(int tipoId) {
		TipoId = tipoId;
	}
	public int getMarcaId() {
		return MarcaId;
	}
	public void setMarcaId(int marcaId) {
		MarcaId = marcaId;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
