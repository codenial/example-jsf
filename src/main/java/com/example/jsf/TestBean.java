package com.example.jsf;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class TestBean {

	@Inject
	Greeting greetingService;
	
	public String getMessage(){
		return greetingService.getSalute();
	}
	
}
