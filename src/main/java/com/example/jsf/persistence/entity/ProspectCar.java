package com.example.jsf.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "agency_prospect_car")
@IdClass(ProspectCarPk.class)
public class ProspectCar {
	
	@Id
	@Column(name = "prospect_id")
	private String prospectId;
	@Id
	@OneToOne
	@JoinColumn(name = "car_id")
	private CarInfo prospectCar;
	
	public ProspectCar() {}
	
	public ProspectCar(String prospectId,CarInfo car) {
		this.prospectId = prospectId;
		this.prospectCar = car;
	}
	
	public String getProspectId() {
		return prospectId;
	}
	
	public void setProspectId(String prospectId) {
		this.prospectId = prospectId;
	}
	
	public CarInfo getProspectCar() {
		return prospectCar;
	}
	
	public void setProspectCar(CarInfo prospectCar) {
		this.prospectCar = prospectCar;
	}

}

class ProspectCarPk implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6890701321009255651L;
	
	private String prospectId;
	private CarInfo prospectCar;
	
	public String getProspectId() {
		return prospectId;
	}
	public void setProspectId(String prospectId) {
		this.prospectId = prospectId;
	}
	public CarInfo getProspectCar() {
		return prospectCar;
	}
	public void setProspectCar(CarInfo prospectCar) {
		this.prospectCar = prospectCar;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prospectCar == null) ? 0 : prospectCar.hashCode());
		result = prime * result + ((prospectId == null) ? 0 : prospectId.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProspectCarPk other = (ProspectCarPk) obj;
		if (prospectCar == null) {
			if (other.prospectCar != null)
				return false;
		} else if (!prospectCar.equals(other.prospectCar))
			return false;
		if (prospectId == null) {
			if (other.prospectId != null)
				return false;
		} else if (!prospectId.equals(other.prospectId))
			return false;
		return true;
	}
	
}
