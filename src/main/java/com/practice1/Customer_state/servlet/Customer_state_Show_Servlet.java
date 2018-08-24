package com.practice1.Customer_state.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.Customer_sourceDAO;
import com.practice1.dao.Customer_stateDAO;
import com.practice1.dao.impl.Customer_sourceDAOImpl;
import com.practice1.dao.impl.Customer_stateDAOImpl;
import com.practice1.model.Customer_source;
import com.practice1.model.Customer_state;

/**
 * Servlet implementation class Customer_state_Show_Servlet
 */
public class Customer_state_Show_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_state_Show_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer_stateDAO dao=new Customer_stateDAOImpl();
		List<Customer_state> cares=dao.selectAll();
		request.setAttribute("cares", cares);
		
		request.getRequestDispatcher("Customer_state/Customer_state_Show.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
