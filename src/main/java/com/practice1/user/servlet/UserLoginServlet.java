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
 * Servlet implementation class UserLoginServlet
 */
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if (username==null||username.length()==0) {
			request.setAttribute("msg", "帐号不能为空");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		if (password==null||password.length()==0) {
			request.setAttribute("msg", "密码不能为空");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		UserDAO dao=new UserDAOImpl();
		User user=dao.searchByUsername(username);
			if (user==null) {
				request.setAttribute("msg", "帐号不存在");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else {
				if (user.getPassword().equals(password)) {
					request.getSession().setAttribute("user", user);
					response.sendRedirect("base.jsp");
				}else {
					request.setAttribute("msg", "密码错误");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
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
