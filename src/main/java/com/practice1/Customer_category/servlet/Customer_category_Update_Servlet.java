package com.practice1.Customer_category.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.Customer_categoryDAO;
import com.practice1.dao.impl.Customer_categoryDAOImpl;
import com.practice1.model.Customer_category;

/**
 * Servlet implementation class Customer_category_Update_Servlet
 */
public class Customer_category_Update_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_category_Update_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String care_subject=request.getParameter("care_subject");
		String remark=request.getParameter("remark");
		System.out.println(remark);
		String customer_category_id=request.getParameter("customer_category_id");
		Customer_categoryDAO dao=new Customer_categoryDAOImpl();
		Customer_category care=dao.updateByID(Integer.valueOf(customer_category_id));
		care.setCustomer_category_desc(remark);
		care.setCustomer_category_name(care_subject);
		dao.update(care);
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
