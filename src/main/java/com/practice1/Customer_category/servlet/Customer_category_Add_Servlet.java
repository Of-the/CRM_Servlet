package com.practice1.Customer_category.servlet;

import java.io.IOException;
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
 * Servlet implementation class Customer_category_Add_Servlet
 */
public class Customer_category_Add_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_category_Add_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customer_category_name=request.getParameter("customer_category_name");
		String customer_category_desc=request.getParameter("customer_category_desc");
		Customer_categoryDAO dao=new Customer_categoryDAOImpl();
		Customer_category care=new Customer_category();
		care.setCustomer_category_name(customer_category_name);
		care.setCustomer_category_desc(customer_category_desc);	
		care.setStatus(2);
		dao.add(care);
		response.sendRedirect("Customer_category_Show_Servlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
