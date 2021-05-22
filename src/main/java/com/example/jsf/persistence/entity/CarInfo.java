package com.example.jsf.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.annotations.NamedQuery;

//@NamedQuery(name = "carInfo_findAll", query = "from CarInfo")
@Entity
@Table(name = "agency_cars")
public class CarInfo {
	
	@Id
	@Column(name="car_id")
	private String id;
	@Column(name="car_brand")
	private String brand;
	@Column(name="model")
	private String model;
	@Column(name="year")
	private int year;
	@Column(name="color")
	private String color;
	
	public CarInfo() {}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

}
