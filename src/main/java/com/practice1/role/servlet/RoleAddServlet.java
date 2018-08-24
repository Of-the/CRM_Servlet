package com.practice1.role.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.RoleDAO;
import com.practice1.dao.impl.RoleDAOImpl;
import com.practice1.model.Role;

/**
 * Servlet implementation class RoleAddServlet
 */
public class RoleAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoleAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String role_id=request.getParameter("role_id");
		String role_name=request.getParameter("role_name");
//		String role_permission=request.getParameter("role_permission");
//		String status=request.getParameter("status");
		String remark=request.getParameter("remark");
		Role role=new Role();
		//role.setRole_id(Integer.valueOf(role_id));
		role.setRole_name(role_name);
	//	role.setRole_permission(Integer.valueOf(role_permission));
		role.setStatus(2);
		role.setRemark(remark);
		RoleDAO roleDAO=new RoleDAOImpl();
		roleDAO.add(role);
		System.out.println(role);
		System.out.println(123);
		response.sendRedirect("RoleShowServlet");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
