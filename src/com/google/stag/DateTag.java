package com.google.stag;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

//implements TagSupport -> you have to create all methods 
public class DateTag extends SimpleTagSupport{

	//servlet -> service 
	@Override
	public void doTag() throws JspException, IOException {
		LocalDate today = LocalDate.now(); 
		
		JspWriter out = getJspContext().getOut();
		out.print(today);
	
	}
}
