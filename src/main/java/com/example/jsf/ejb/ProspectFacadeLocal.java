package com.example.jsf.ejb;

import javax.ejb.Local;

import com.example.jsf.persistence.entity.Prospect;

@Local
public interface ProspectFacadeLocal {

	/**
	 * Register new prospect
	 * */
	Prospect save(Prospect prospect);
}
