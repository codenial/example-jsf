package com.example.jsf.ejb;

import java.util.List;
import javax.ejb.Singleton;
import com.example.jsf.persistence.entity.CarInfo;

@Singleton
public class VehicleFacade extends AbstractFacade<CarInfo> implements VehicleFacadeLocal{

	public VehicleFacade() {
		super(CarInfo.class);
	}

	@Override
	public List<CarInfo> findAll() {		
		return super.findAll();
	}
	
	@Override
	public CarInfo save(CarInfo carInfo) {
		return super.save(carInfo);
	}

	@Override
	public CarInfo findVehicleById(String id) {
		return super.findById(id);
	}

}
