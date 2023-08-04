package com.google.ctag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class MarkTag extends BodyTagSupport {

	BodyContent bodyContent;

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_BODY_BUFFERED;
	}

	@Override
	public void doInitBody() throws JspException {
		// TODO Auto-generated method stub
		super.doInitBody();
	}

	@Override
	public void setBodyContent(BodyContent b) {
		this.bodyContent = b;
	}

	@Override
	public int doAfterBody() throws JspException {
		String body = this.bodyContent.getString();
		JspWriter out = this.bodyContent.getEnclosingWriter();
		try {
			out.print("<b>" + body + "</b>");
			// write
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return super.doEndTag();
	}
}
