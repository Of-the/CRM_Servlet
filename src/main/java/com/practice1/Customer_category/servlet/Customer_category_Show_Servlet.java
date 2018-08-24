package com.practice1.Customer_category.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.Customer_careDAO;
import com.practice1.dao.Customer_categoryDAO;
import com.practice1.dao.impl.Customer_careDAOImpl;
import com.practice1.dao.impl.Customer_categoryDAOImpl;
import com.practice1.model.Customer_care;
import com.practice1.model.Customer_category;

/**
 * Servlet implementation class Customer_category_Show_Servlet
 */
public class Customer_category_Show_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_category_Show_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer_categoryDAOImpl dao=new Customer_categoryDAOImpl();
		List<Customer_category> cares=dao.selectAll();
		request.setAttribute("cares", cares);
		request.getRequestDispatcher("Customer_category/Customer_category_Show.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
