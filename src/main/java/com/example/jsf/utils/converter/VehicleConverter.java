package com.example.jsf.utils.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;

import com.example.jsf.persistence.entity.CarInfo;
import com.example.jsf.service.VehicleService;

@Named
@FacesConverter(value = "vehicleConverter")
public class VehicleConverter implements Converter{

	@Inject
	private VehicleService vehicleService;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(StringUtils.isNotEmpty(value)) {
			CarInfo carInfo = vehicleService.findVehicleById(value);
			return 	carInfo;
		}else {
			return null;	
		}
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value == null) {
			return null;
		}
		return ((CarInfo)value).getId();
	}

}
