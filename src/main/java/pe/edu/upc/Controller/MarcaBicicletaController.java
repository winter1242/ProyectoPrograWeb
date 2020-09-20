package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.MarcaBicicleta;
import pe.edu.upc.serviceinterface.IMarcaBicicletaService;

@Named
@RequestScoped
public class MarcaBicicletaController {
	@Inject
	private IMarcaBicicletaService mService;
	private MarcaBicicleta m;
	List<MarcaBicicleta> listMarcaBicicletas;
	
	//constructor
	@PostConstruct
	public void init() {
		this.listMarcaBicicletas = new ArrayList<MarcaBicicleta>();
		this.m = new MarcaBicicleta();
		this.list();
	}
	
	
	// métodos
	public String newMarcaBicicleta() {
		this.setM(new MarcaBicicleta());
		return "MarcaBicicleta.xhtml";
	}

	public void insert() {
		try {
			mService.insert(m);
			cleanMarcaBicicleta();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void list() {
		try {
			listMarcaBicicletas = mService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanMarcaBicicleta() {
		this.init();
	}
	
	
	
	//get y set
	public MarcaBicicleta getM() {
		return m;
	}
	public void setM(MarcaBicicleta m) {
		this.m = m;
	}
	public List<MarcaBicicleta> getListMarcaBicicletas() {
		return listMarcaBicicletas;
	}
	public void setListMarcaBicicletas(List<MarcaBicicleta> listMarcaBicicletas) {
		this.listMarcaBicicletas = listMarcaBicicletas;
	}
	
	
	
	
	
	
}
