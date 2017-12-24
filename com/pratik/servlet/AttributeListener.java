package com.pratik.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AttributeListener")
public class AttributeListener extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set the attributes
				request.setAttribute("Pratik", "Pratik");
				request.setAttribute("Rohit", "Rohit");
				request.setAttribute("Shubham", "Shubham");
					//replaced Attributes
					request.setAttribute("Pratik", "Dimble");
					request.setAttribute("Rohit", "Kulkarni");
					request.setAttribute("Shubham", "Kothawade");
						//remove the attributes
						request.removeAttribute("Pratik");
						request.removeAttribute("Rohit");
						request.removeAttribute("Shubham");
	}

}
