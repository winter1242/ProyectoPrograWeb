package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IEmpresaDao;
import pe.edu.upc.entity.Empresa;



@Named
@RequestScoped
public class EmpresaController {
	@Inject
	private IEmpresaDao eService;
	private Empresa e;
	List<Empresa> listEmpresas;
	
	
	//constructor
	@PostConstruct
	public void init() {
		this.listEmpresas = new ArrayList<Empresa>();
		this.e = new Empresa();
		this.list();
	}
	
	//metodos
	public String newEmpresa() {
		this.setE(new Empresa());
		return "Empresa.xhtml";
	}

	public void insert() {
		try {
			eService.insert(e);
			cleanEmpresa();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void list() {
		try {
			listEmpresas = eService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanEmpresa() {
		this.init();
	}
	
	
	//get y set
	public Empresa getE() {
		return e;
	}
	public void setE(Empresa e) {
		this.e = e;
	}
	public List<Empresa> getListEmpresas() {
		return listEmpresas;
	}
	public void setListEmpresas(List<Empresa> listEmpresas) {
		this.listEmpresas = listEmpresas;
	}
	
	
	
	

}
