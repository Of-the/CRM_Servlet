package com.practice1.Message.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.MessageDAO;
import com.practice1.dao.impl.MessageDAOImpl;
import com.practice1.model.Message;
import com.practice1.model.User;

/**
 * Servlet implementation class MessageAddServlet
 */
public class MessageAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  sub=request.getParameter("sub");
		String user_id=request.getParameter("user_id");
		String subject=request.getParameter("subject");
		String content=request.getParameter("content");
		User users=(User)request.getSession().getAttribute("user");
		Message message=new Message();
		message.setSubject(subject);
		message.setContent(content);
		message.setSender(users.getUser_id());
		message.setSend_delete(2);
		if (sub.equals("发送")) {
			message.setSend_status(2);
		}else {
			message.setSend_status(0);
		}		
		message.setReceiver(Integer.valueOf(user_id));
		message.setReceive_delete(2);
		message.setReceive_status(2);
		MessageDAO dao=new MessageDAOImpl();
		dao.add(message);
		response.sendRedirect("MessageShowServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
