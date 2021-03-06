package com.practice1.Customer_care.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.Customer_careDAO;
import com.practice1.dao.impl.Customer_careDAOImpl;
import com.practice1.model.Customer;
import com.practice1.model.Customer_care;

/**
 * Servlet implementation class Customer_care_Add_Servlet
 */
public class Customer_care_Add_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_care_Add_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customer_care_id=request.getParameter("customer_care_id");
		String care_subject=request.getParameter("care_subject");
		String remark=request.getParameter("remark");
		Customer_careDAO dao=new Customer_careDAOImpl();
		Customer_care customer=new Customer_care();
		customer.setRemark(remark);
		customer.setStatus(2);
		customer.setCare_subject(care_subject);
		dao.add(customer);
		response.sendRedirect("Customer_care_Servlet");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
