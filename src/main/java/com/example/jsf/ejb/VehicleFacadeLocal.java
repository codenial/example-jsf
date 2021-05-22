package com.example.jsf.ejb;

import java.util.List;

import javax.ejb.Local;

import com.example.jsf.persistence.entity.CarInfo;

@Local
public interface VehicleFacadeLocal {
	
	/**
	 * 
	 * */
	List<CarInfo> findAll();
	/**
	 * 
	 * */
	CarInfo save(CarInfo carInfo);
	/**
	 * 
	 * */
	CarInfo findVehicleById(String id);

}
