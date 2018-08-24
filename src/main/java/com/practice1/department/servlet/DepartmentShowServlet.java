
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
 * Servlet implementation class DepartmentShowServlet
 */
public class DepartmentShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentShowServlet() {
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
		DepartmentDAO dao=new DepartmentDAOImpl();
		List<Department> departments= dao.selectAllByPage(10*(pageValue-1), 10);
		request.setAttribute("current", pageValue);
		request.setAttribute("departments", departments);
		request.setAttribute("count", dao.sum());
		request.getRequestDispatcher("Department/DepartmentShow.jsp").forward(request, response);;

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
