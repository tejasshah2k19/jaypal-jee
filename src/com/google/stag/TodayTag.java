package com.google.stag;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TodayTag extends SimpleTagSupport {

	String format; // attribute

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public void doTag() throws JspException, IOException {
		String today = "";
		JspWriter out = getJspContext().getOut();
		if (format.toLowerCase().equals("mm-dd-yyyy")) {
			SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
			today = s.format(new Date());

		} else if (format.toLowerCase().equals("dd-MM-yyyy")) {
			SimpleDateFormat s = new SimpleDateFormat(format);
			today = s.format(new Date());

		} else if (format.toLowerCase().equals("yyyy-MM-dd")) {
			SimpleDateFormat s = new SimpleDateFormat(format);
			today = s.format(new Date());

		} else {
			today = LocalDate.now().toString();

		}

		out.print(today);
	}
}
