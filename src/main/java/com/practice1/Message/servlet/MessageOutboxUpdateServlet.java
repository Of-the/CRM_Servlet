package com.practice1.Message.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.MessageDAO;
import com.practice1.dao.UserDAO;
import com.practice1.dao.impl.MessageDAOImpl;
import com.practice1.dao.impl.UserDAOImpl;
import com.practice1.model.Message;
import com.practice1.model.User;

/**
 * Servlet implementation class MessageOutboxUpdateServlet
 */
public class MessageOutboxUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageOutboxUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDAO dao=new UserDAOImpl();
		List<User> users=dao.selectAll();
		request.setAttribute("users", users);
		String message_id=request.getParameter("message_id");
		MessageDAO dao2=new MessageDAOImpl();
		Message message=dao2. outboxByID(Integer.valueOf(message_id));
		request.setAttribute("message", message);
		request.getRequestDispatcher("Message/MessageOutboxUpdate.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
