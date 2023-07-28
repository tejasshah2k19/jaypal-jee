package com.google.elfunction;

import java.util.Date;

public class Greet {

	
	public static String greet() {
		Date d =new Date();
		int h = d.getHours();
		
		
		if(h >=0 && h<=11) {
			return "Good Morning";
		}else if(h >=12 && h<=17) {
			return "Good AfterNoon";
		}else {
			return "Good Evening";
		}
	}
}
