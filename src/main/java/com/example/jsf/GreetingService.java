package com.example.jsf;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class GreetingService implements Greeting{

	public String getSalute() {
		return "Hi from service";
	}

}
