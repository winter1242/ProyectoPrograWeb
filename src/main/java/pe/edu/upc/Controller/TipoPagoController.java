package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;


import pe.edu.upc.entity.TipoPago;
import pe.edu.upc.serviceinterface.ITipoPagoService;



public class TipoPagoController {
	@Inject
	private ITipoPagoService tService;
	private TipoPago t;
	List<TipoPago> listTipoPagos;
	
	//constructor
	@PostConstruct
	public void init() {
		this.listTipoPagos = new ArrayList<TipoPago>();
		this.t = new TipoPago();
		this.list();
	}
	
	

	// métodos
	public String newTipoPago() {
		this.setT(new TipoPago());
		return "tipopago.xhtml";
	}

	public void insert() {
		try {
			tService.insert(t);
			cleanTipoPago();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void list() {
		try {
			listTipoPagos = tService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanTipoPago() {
		this.init();
	}

	
	//get y set
	public TipoPago getT() {
		return t;
	}

	public void setT(TipoPago t) {
		this.t = t;
	}

	public List<TipoPago> getListTipoPagos() {
		return listTipoPagos;
	}

	public void setListTipoPagos(List<TipoPago> listTipoPagos) {
		this.listTipoPagos = listTipoPagos;
	}

	
	
}
