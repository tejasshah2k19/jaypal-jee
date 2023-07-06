package com.google.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class UserCounterListener implements HttpSessionListener {

	public static Integer userCounter= 0;
	public void sessionCreated(HttpSessionEvent he) {
		userCounter++;
		System.out.println("Total+ ->"+userCounter);
	}

	public void sessionDestroyed(HttpSessionEvent he) {
		userCounter--;
		System.out.println("Total- ->"+userCounter);

	}
}
