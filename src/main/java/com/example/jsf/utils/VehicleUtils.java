package com.example.jsf.utils;

import com.example.jsf.constant.VehicleProperties;
import com.example.jsf.persistence.entity.CarInfo;

public class VehicleUtils {

	public static CarInfo createRandom() {
		CarInfo carInfo = new CarInfo();
		carInfo.setId(Utils.randomString(6));
		int color = Utils.randomNumber(0,VehicleProperties.colors.length);
		carInfo.setColor(VehicleProperties.colors[color]);
		int model = Utils.randomNumber(0,VehicleProperties.models.length);
		carInfo.setModel(VehicleProperties.models[model]);
		int year = Utils.randomNumber(0,VehicleProperties.years.length);
		carInfo.setYear(VehicleProperties.years[year]);
		carInfo.setBrand("VW");
		return carInfo;
	}
	
	private VehicleUtils() {}
}
