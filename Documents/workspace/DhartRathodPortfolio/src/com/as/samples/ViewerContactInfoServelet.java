package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewerContactInfoServelet
 */
@WebServlet("/ViewerContactInfoServelet")
public class ViewerContactInfoServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	String contactInfo = request.getParameter("contactInfo");
		 String city = request.getParameter("city");
		 String state = request.getParameter("state");
		 String softwareIndustry = request.getParameter("softwareIndustry");
	    	String phoneNumber = request.getParameter("phoneNumber");
	    	
	    	System.out.print("contactInfo is: "+ contactInfo);
	    	System.out.print("city is: "+ city);
	    	System.out.print("state is: "+ state);
	    	System.out.print("softwareIndustry is: "+ softwareIndustry);
	    	System.out.print("phoneNumber is: "+ phoneNumber);

	    	
	    	
	    	//once we get the data, create sessions and set value in the attribute
	    	request.getSession().setAttribute("contactInfo", contactInfo);
	    	request.getSession().setAttribute("city", city);
	    	request.getSession().setAttribute("state", state);
	    	request.getSession().setAttribute("softwareIndustry", softwareIndustry);
	    	request.getSession().setAttribute("phoneNumber", phoneNumber);
	    	
	    	//send the response to next page
	    	response.sendRedirect("html/successfulLoginToCheckProfile.html");

	}

}
