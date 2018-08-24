package com.practice1.role.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.StringManager;

import com.practice1.dao.RoleDAO;
import com.practice1.dao.impl.RoleDAOImpl;
import com.practice1.model.Role;

/**
 * Servlet implementation class RoleUpdateServlet
 */
public class RoleUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoleUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String role_id=request.getParameter("role_id");
		String role_name=request.getParameter("role_name");
//		String role_permission=request.getParameter("role_permission");
//		String status=request.getParameter("status");
		String remark=request.getParameter("remark");
		RoleDAO roleDAO=new RoleDAOImpl();
		System.out.println(role_id);
		Role role=roleDAO.updateByID(Integer.valueOf(role_id));
		role.setRole_name(role_name);
//		role.setRole_permission(Integer.valueOf(role_permission));
//		role.setStatus(Integer.valueOf(status));
		role.setRemark(remark);
		roleDAO.update(role);
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
