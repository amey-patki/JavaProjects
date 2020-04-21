package com.amey.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
  
		if(request.getParameter("number1")!=null && request.getParameter("number2")!=null) {
		String  no1 =request.getParameter("number1");
		String no2 =request.getParameter("number2");
		
		PrintWriter out = response.getWriter();
	    out.println((no1+no2));
	}

}
}