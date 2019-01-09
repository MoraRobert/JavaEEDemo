package com.robert.service.demo;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService {
	
	public List<String> getWelcomeMessage (String name) {
		List<String> myWelcomeMessage = new ArrayList<>();
		
		myWelcomeMessage.add(name);
		myWelcomeMessage.add(", welcome to Wekerle :-)");
		
		return myWelcomeMessage;
	}
 
}
