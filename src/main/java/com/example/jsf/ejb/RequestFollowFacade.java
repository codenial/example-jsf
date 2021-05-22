package com.example.jsf.ejb;

import javax.ejb.Stateless;
import com.example.jsf.persistence.entity.RequestFollowUp;

@Stateless
public class RequestFollowFacade extends AbstractFacade<RequestFollowUp> implements RequestFollowFacadeLocal{

	public RequestFollowFacade() {
		super(RequestFollowUp.class);
	}

	public 	RequestFollowUp getRequestOpen() {
		return null;
	}
}
