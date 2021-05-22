package com.example.jsf.service;

import java.util.List;

import com.example.jsf.persistence.entity.CarInfo;

public interface VehicleService {
	
	/**
	 * Save new vehicle info
	 * @param entity
	 * @return <code>CarInfo</code>
	 * */
	CarInfo saveCarInfo(CarInfo carInfo);
	/**
	 * Gets all vehicles info from db
	 * @return <code>List<CarInfo></code>
	 * */
	List<CarInfo> findAllVehicles();
}
