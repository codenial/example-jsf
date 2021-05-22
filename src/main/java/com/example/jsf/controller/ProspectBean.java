package com.example.jsf.controller;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.example.jsf.persistence.entity.CarInfo;
import com.example.jsf.persistence.entity.Prospect;
import com.example.jsf.service.ProspectService;
import com.example.jsf.service.VehicleService;
import com.example.jsf.utils.UIUtils;

@Named
@ViewScoped
public class ProspectBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Prospect prospect;
	private List<CarInfo> allCars;
	private List<CarInfo> selectedCars;
	
	@Inject
	private ProspectService prospectService;
	
	@Inject
	private VehicleService vehicleService; 
	
	@PostConstruct
	public void init() {
		prospect = new Prospect();
		allCars = vehicleService.findAllVehicles();
	}

	public void sendProspectInfo(){
		prospectService.register(prospect,selectedCars);
		UIUtils.showInfoMessage("Prospecto guardado exitosamente");
		prospect = new Prospect();
		selectedCars.clear();
	}
	
	public Prospect getProspect() {
		return prospect;
	}

	public void setProspect(Prospect prospect) {
		this.prospect = prospect;
	}

	public List<CarInfo> getSelectedCars() {
		return selectedCars;
	}

	public void setSelectedCars(List<CarInfo> selectedCars) {
		this.selectedCars = selectedCars;
	}

	public List<CarInfo> getAllCars() {
		return allCars;
	}

	public void setAllCars(List<CarInfo> allCars) {
		this.allCars = allCars;
	}
	
}
