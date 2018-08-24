package com.practice1.Customer_source.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.Customer_linkDAO;
import com.practice1.dao.Customer_sourceDAO;
import com.practice1.dao.impl.Customer_linkDAOImpl;
import com.practice1.dao.impl.Customer_sourceDAOImpl;
import com.practice1.model.Customer_link;
import com.practice1.model.Customer_source;

/**
 * Servlet implementation class Customer_source_Edit_Servlet
 */
public class Customer_source_Edit_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_source_Edit_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customer_source_id=request.getParameter("customer_source_id");
		Customer_sourceDAO dao=new Customer_sourceDAOImpl();
		Customer_source care=dao.updateByID(Integer.valueOf(customer_source_id));
		request.setAttribute("care", care);
		request.getRequestDispatcher("Customer_source/Customer_source_Update.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
