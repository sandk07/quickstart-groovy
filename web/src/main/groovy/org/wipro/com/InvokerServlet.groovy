package org.wipro.com

import java.io.IOException

import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.http.HttpSession

/**
 * Servlet implementation class Login
 */
@WebServlet("/InvokerServlet")
 class InvokerServlet extends HttpServlet {
	 static final long serialVersionUID = 1L
       
    /**
     * @see HttpServlet#HttpServlet()
     */
     InvokerServlet() {
        super()
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	 void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		def firstName = request.getParameter("fname")
		def lastName = request.getParameter("lname")
		
		UserDetails userDetails = new UserDetails()
		userDetails.setFirstName(firstName)
		userDetails.setLastName(lastName)
		
		userDetails = Services.login(userDetails)
		
		HttpSession session = request.getSession(true)	    
        session.setAttribute("currentSessionUser",userDetails)
        response.sendRedirect("View.jsp")
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
