package com.google.ctag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MaxTag extends TagSupport {

	int n1;
	int n2;

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			if (n1 > n2)
				out.print(n1);
			else if (n2 > n1)
				out.print(n2);

			else
				out.print("EQUAL");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
//		return SKIP_PAGE;
		return SKIP_BODY;
	}

}
