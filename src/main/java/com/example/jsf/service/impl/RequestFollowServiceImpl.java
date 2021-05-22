package com.example.jsf.service.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsf.ejb.RequestFollowFacadeLocal;
import com.example.jsf.persistence.entity.RequestFollowUp;
import com.example.jsf.service.RequestFollowService;

@Named
@ApplicationScoped
public class RequestFollowServiceImpl implements RequestFollowService{
	
	@Inject
	private RequestFollowFacadeLocal requestFollowFacade;

	
	@Override
	public RequestFollowUp getRequestOpen() {
		return requestFollowFacade.getRequestOpen();
	}

}
