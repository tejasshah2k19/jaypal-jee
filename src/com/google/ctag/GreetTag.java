package com.google.ctag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

//classic tag 
public class GreetTag extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut(); 
		try {
		out.print("Good mornig");
		}catch(Exception e ) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;//page SKIP_PAGE
//		return SKIP_PAGE;
	}
}


// <greet></greet>
// hi 