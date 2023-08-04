package com.google.ctag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintTag extends TagSupport{

	int count;//3

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		System.out.println("set count");
		this.count = count;
	} 
	
	@Override
	public int doStartTag() throws JspException {
		 System.out.println("start tag");
		return EVAL_BODY_INCLUDE;//body add 
	}
	@Override
	public int doAfterBody() throws JspException {
		count--;
		System.out.println("after body");
		if(count == 0)
			return SKIP_BODY;
		return EVAL_BODY_AGAIN;
	}
	
	@Override
	public int doEndTag() throws JspException {
		System.out.println("end tag");
		return EVAL_PAGE;
	}
	
}


//<print count="3">royal</print>