package com.practice1.role.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.RoleDAO;
import com.practice1.dao.impl.RoleDAOImpl;
import com.practice1.model.Role;

/**
 * Servlet implementation class RoleShowServlet
 */
public class RoleShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoleShowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page=request.getParameter("page");
		if (page==null) {
			page="1";
		}
		int pageValue=Integer.valueOf(page);
		RoleDAO roleDAO=new RoleDAOImpl();
		List<Role> roles=roleDAO.selectAllByPage(10*(pageValue-1), 10);
		request.setAttribute("roles", roles);
		request.setAttribute("current", pageValue);
		request.setAttribute("count", roleDAO.sum());
		request.getRequestDispatcher("Role/RoleShow.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
