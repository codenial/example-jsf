package com.example.jsf.ejb;

import javax.ejb.Local;

import com.example.jsf.persistence.entity.RequestFollowUp;

@Local
public interface RequestFollowFacadeLocal {
	
	RequestFollowUp getRequestOpen();

}
