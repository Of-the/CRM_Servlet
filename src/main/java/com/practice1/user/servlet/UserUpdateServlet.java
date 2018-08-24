package com.practice1.user.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.UserDAO;
import com.practice1.dao.impl.UserDAOImpl;
import com.practice1.model.User;

/**
 * Servlet implementation class UserUpdateServlet
 */
public class UserUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_id=request.getParameter("user_id");
		String department_id =request.getParameter("department_id");
		String role_id =request.getParameter("role_id");
		String username =request.getParameter("username");
		String is_male =request.getParameter("is_male");
		String mobile =request.getParameter("mobile");
		String age =request.getParameter("age");
		String address =request.getParameter("address");
		String is_admin =request.getParameter("is_admin");
		String is_system =request.getParameter("is_system");
		String password =request.getParameter("password");
		String tel =request.getParameter("tel");
		String id_num =request.getParameter("id_num");
		String email =request.getParameter("email");
		String hobby =request.getParameter("hobby");
		String education =request.getParameter("education");
		String card_num =request.getParameter("card_num");
		String nation =request.getParameter("nation");
		String marry =request.getParameter("marry");
		String remark =request.getParameter("remark");
		UserDAO userDAO=new UserDAOImpl();
		User user=userDAO.updateByID(Integer.valueOf(user_id));
		user.setAddress(address);
		user.setDepartment_id(Integer.valueOf(department_id));
		user.setRole_id(Integer.valueOf(role_id));
		user.setUsername(username);
		user.setIs_male(Boolean.parseBoolean(is_male));
		user.setMobile(mobile);
		user.setAge(Integer.valueOf(age));
		user.setAddress(address);
		user.setIs_admin(Boolean.parseBoolean(is_admin));
		user.setIs_system(Boolean.parseBoolean(is_system));
		user.setPassword(password);
		user.setTel(tel);
		user.setId_num(id_num);
		user.setEmail(email);
		user.setHobby(hobby);
		user.setEducation(Integer.valueOf(education));
		user.setCard_num(card_num);
		user.setNation(nation);
		user.setMarry(Integer.valueOf(marry));
		user.setRemark(remark);
		userDAO.update(user);
		response.sendRedirect("UserShowServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
