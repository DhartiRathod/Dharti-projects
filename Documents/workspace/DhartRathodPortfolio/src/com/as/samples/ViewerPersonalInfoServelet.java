package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewerPersonalInfoServelet
 */
@WebServlet("/ViewerPersonalInfoServelet")
public class ViewerPersonalInfoServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
    	
    	//set the parameter value which we recieve from http client
    	String professionalJobTitle = request.getParameter("pjt");
    	String fname = request.getParameter("fname");
    	String lname = request.getParameter("lname");
    	String mname = request.getParameter("mname");
    	String gender = request.getParameter("gender");
    	
    	System.out.print("Fname is: "+ professionalJobTitle);
    	System.out.print("Fname is: "+ fname);
    	System.out.print("lname is: "+ lname);
    	System.out.print("mname is: "+ mname);
    	System.out.print("gender is: "+ gender);
    	
    	//set value in my program
    	request.getSession().setAttribute("pjt", professionalJobTitle);
    	request.getSession().setAttribute("fname", fname);
    	request.getSession().setAttribute("lname", lname);
    	request.getSession().setAttribute("mname", mname);
    	request.getSession().setAttribute("gender", gender);
    	
    	//once i get the data send it to ContactInfo.html page
    	response.sendRedirect("html/viewerContactInfo.html");
	}

}
