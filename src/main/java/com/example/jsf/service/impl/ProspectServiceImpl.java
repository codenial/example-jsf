package com.example.jsf.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.example.jsf.ejb.ProspectFacadeLocal;
import com.example.jsf.persistence.entity.CarInfo;
import com.example.jsf.persistence.entity.Prospect;
import com.example.jsf.persistence.entity.ProspectCar;
import com.example.jsf.service.ProspectService;
import com.example.jsf.utils.Utils;

@Named("prospectService")
@ApplicationScoped
public class ProspectServiceImpl implements ProspectService{

	@Inject
	private ProspectFacadeLocal prospectFacade;
	
	@Override
	public Prospect register(Prospect prospect,List<CarInfo> vehicles) {
		List<ProspectCar> prospectCars = new ArrayList<ProspectCar>();
		String id = Utils.randomString(0);
		prospect.setId(id);
		for(CarInfo car:vehicles) {
			prospectCars.add(new ProspectCar(id,car));
		}
		prospect.setCarList(prospectCars);
		return prospectFacade.save(prospect);
	}

}
