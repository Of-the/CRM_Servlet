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
 * Servlet implementation class DepartmentAddServlet
 * 
 */
public class DepartmentAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentAddServlet() {
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
		String department_name=request.getParameter("department_name");
		String department_desc=request.getParameter("department_desc");
		String status=request.getParameter("status");
		String remark=request.getParameter("remark");
		String create_time=request.getParameter("create_time");
		String creater=request.getParameter("creater");
		String update_time=request.getParameter("update_time");
		String updater=request.getParameter("updater");
		DepartmentDAO dao=new DepartmentDAOImpl();
		Department department=new Department();
		department.setDepartment_id(Integer.valueOf(department_id));
		department.setDepartment_name(department_name);
		department.setDepartment_desc(department_desc);
		department.setStatus(Integer.valueOf(status)); 
		department.setRemark(remark);
		department.setCreater(Integer.valueOf(creater));
		department.setUpdater(Integer.valueOf(updater));
		
		dao.add(department);
		response.sendRedirect("DepartmentShowServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
