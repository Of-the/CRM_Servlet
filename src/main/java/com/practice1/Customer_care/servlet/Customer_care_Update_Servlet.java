package com.practice1.Customer_care.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.Customer_careDAO;
import com.practice1.dao.impl.Customer_careDAOImpl;
import com.practice1.model.Customer_care;

/**
 * Servlet implementation class Customer_care_Update_Servlet
 */
public class Customer_care_Update_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_care_Update_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customer_care_id=request.getParameter("customer_care_id");
		Customer_careDAO dao=new Customer_careDAOImpl();
		Customer_care care=dao.updateByID(Integer.valueOf(customer_care_id));
		request.setAttribute("care", care);
		request.getRequestDispatcher("Customer_care/Customer_care_Update.jsp").forward(request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
