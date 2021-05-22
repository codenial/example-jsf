package com.example.jsf.persistence.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "agency_prospects")
public class Prospect {

	@Id
	@Column(name = "prospect_id")
	private String id;
	@Column(name = "prospect_name")
	private String name;
	@Column(name = "prospect_lastName")
	private String lastName;
	@Column(name = "prospect_email")
	private String email;
	@Column(name = "prospect_phone")
	private String phone;
	@Column(name = "prospect_address")
	private String address;
	@Column(name = "prospect_city")
	private String city;
	@Column(name = "prospect_state")
	private String state;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "prospect_id")
	private List<ProspectCar> carList;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public List<ProspectCar> getCarList() {
		return carList;
	}
	
	public void setCarList(List<ProspectCar> carList) {
		this.carList = carList;
	}

}
