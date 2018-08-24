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
 * Servlet implementation class MessageDustbinRestoreServlet
 */
public class MessageDustbinRestoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageDustbinRestoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message_id=request.getParameter("message_id");
		MessageDAO dao=new MessageDAOImpl();
		Message message=dao.updateByID(Integer.valueOf(message_id));
		System.out.println(message.getReceiver());
		System.out.println(message_id);
		if (message.getReceive_delete()==0) {
			dao.dustbinByID(Integer.valueOf(message_id));
		}else {
			dao.dustbinOutboxByID(Integer.valueOf(message_id));
		}
		
		response.sendRedirect("MessageDustbinShowServlet");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
