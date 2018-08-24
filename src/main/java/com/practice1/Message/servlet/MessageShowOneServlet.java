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
 * Servlet implementation class MessageShowOneServlet
 */
public class MessageShowOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageShowOneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message_id=request.getParameter("message_id");
		String b=request.getParameter("b");
		request.setAttribute("b", b);
		MessageDAO dao=new MessageDAOImpl();
		Message messa=dao.outboxByID(Integer.valueOf(message_id));
		if (b.equals("1")) {
			Message message=dao.updateByID(Integer.valueOf(message_id));
			request.setAttribute("message", message);
		}else {
			Message message=dao.goUpdateByID(Integer.valueOf(message_id));
			request.setAttribute("message", message);
		}
		if (messa.getReceive_delete()==0) {
			Message message=dao.updateByID(Integer.valueOf(message_id));
			request.setAttribute("message", message);
		}else if (messa.getSend_delete()==0) {
			Message message=dao.goUpdateByID(Integer.valueOf(message_id));
			request.setAttribute("message", message);
		}
		
		
		request.getRequestDispatcher("Message/MessageShowOne.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
