package com.example.jsf.utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class UIUtils {

	public static void showInfoMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", message));
	}
	
	private UIUtils() {}
}
