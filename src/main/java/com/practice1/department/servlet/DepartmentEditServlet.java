package com.practice1.department.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.DepartmentDAO;
import com.practice1.dao.impl.DepartmentDAOImpl;
import com.practice1.model.Department;

/**
 * Servlet implementation class DepartmentEditServlet
 */
public class DepartmentEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String department_id=request.getParameter("department_id");
		System.out.println(department_id);
		DepartmentDAO dao=new DepartmentDAOImpl();
		Department department=dao.updateByID(Integer.valueOf(department_id));
		request.setAttribute("department", department);
		request.getRequestDispatcher("Department/DepartmentUpdate.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
