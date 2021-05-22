package com.example.jsf.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsf.persistence.entity.CarInfo;
import com.example.jsf.service.VehicleService;
import com.example.jsf.utils.VehicleUtils;

@Named
@ViewScoped
public class VehicleInfoBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<CarInfo> vehicles = new ArrayList<CarInfo>();
	
	@Inject
	private VehicleService vehicleService;
	
	@PostConstruct
	public void init() {
		this.vehicles.addAll(vehicleService.findAllVehicles());
		System.out.println("Encontro vehiculos");
	}
	
	public void addNewVehicleData() {
		CarInfo carInfo = vehicleService.saveCarInfo(VehicleUtils.createRandom());
		this.vehicles.add(carInfo);
	}

	public List<CarInfo> getVehicles() {
		return vehicles;
	}



	public void setVehicles(List<CarInfo> vehicles) {
		this.vehicles = vehicles;
	}

	

}
