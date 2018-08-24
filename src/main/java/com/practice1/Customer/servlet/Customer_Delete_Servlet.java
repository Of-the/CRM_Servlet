package com.practice1.Customer.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.CustomerDAO;
import com.practice1.dao.Customer_stateDAO;
import com.practice1.dao.impl.CustomerDAOImpl;
import com.practice1.dao.impl.Customer_stateDAOImpl;

/**
 * Servlet implementation class Customer_Delete_Servlet
 */
public class Customer_Delete_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_Delete_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customer_id=request.getParameter("customer_id");
		CustomerDAO dao=new CustomerDAOImpl();
		dao.deleteByID(Integer.valueOf(customer_id));
		response.sendRedirect("Customer_Show_Servlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
