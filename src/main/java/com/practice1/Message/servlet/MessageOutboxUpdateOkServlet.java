package com.practice1.Message.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.MessageDAO;
import com.practice1.dao.impl.MessageDAOImpl;
import com.practice1.model.Message;

/**
 * Servlet implementation class MessageOutboxUpdateOkServlet
 */
public class MessageOutboxUpdateOkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageOutboxUpdateOkServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message_id=request.getParameter("message_id");
		String user_id=request.getParameter("user_id");
		String subject=request.getParameter("subject");
		String content=request.getParameter("content");
		String sub=request.getParameter("sub");
		MessageDAO dao=new MessageDAOImpl();
		Message message=dao.outboxByID(Integer.valueOf(message_id));
		message.setReceiver(Integer.valueOf(message_id));
		message.setSubject(subject);
		message.setContent(content);
		if (sub.equals("发送")) {
			message.setSend_status(2);
		}else {
			message.setSend_status(0);
		}
		response.sendRedirect("MessageDraftShowServlet");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
