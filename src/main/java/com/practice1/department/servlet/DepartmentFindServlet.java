package com.practice1.department.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.DepartmentDAO;
import com.practice1.dao.impl.DepartmentDAOImpl;
import com.practice1.model.Department;

/**
 * Servlet implementation class DepartmentFindServlet
 */
public class DepartmentFindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentFindServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String find=request.getParameter("find");
		String findName=request.getParameter("findName");
		System.out.println(find);
		DepartmentDAO dao=new DepartmentDAOImpl();
		if (find.equals("姓名")) {			
			List<Department> department=dao.selectByIDname(findName);
			request.setAttribute("department", department);
			System.out.println(3);
			request.getRequestDispatcher("Department/DepartmentFind.jsp").forward(request, response);
		}else if (find.equals("描述")) {
			List<Department> department=dao.selectyByIDdesc(findName);
			request.setAttribute("department", department);
			request.getRequestDispatcher("Department/DepartmentFind.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
