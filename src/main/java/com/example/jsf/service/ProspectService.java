package com.example.jsf.service;

import java.util.List;

import com.example.jsf.persistence.entity.CarInfo;
import com.example.jsf.persistence.entity.Prospect;

public interface ProspectService {
	
	Prospect register(Prospect prospect,List<CarInfo> vehicles);

}
