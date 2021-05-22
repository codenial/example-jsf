package com.example.jsf.service.impl;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.example.jsf.ejb.VehicleFacadeLocal;
import com.example.jsf.persistence.entity.CarInfo;
import com.example.jsf.service.VehicleService;


@Named("vehicleService")
@ApplicationScoped
public class VehicleServiceImpl implements VehicleService{

	@Inject
	VehicleFacadeLocal vehicleFacade;
	//@Inject
	//private VehicleRepository vehicleRepository;
	
	public CarInfo saveCarInfo(CarInfo carInfo) {
		return vehicleFacade.save(carInfo);
	}

	public List<CarInfo> findAllVehicles() {
		return vehicleFacade.findAll();
	}

}
