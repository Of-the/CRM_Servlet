package com.practice1.Message.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.MessageDAO;
import com.practice1.dao.impl.MessageDAOImpl;
import com.practice1.model.Message;
import com.practice1.model.User;

/**
 * Servlet implementation class MessageDustbinShowServlet
 */
public class MessageDustbinShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageDustbinShowServlet() {
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
		int pagevalue=Integer.valueOf(page);
		request.setAttribute("pagevalue", pagevalue);
		User user=(User)request.getSession().getAttribute("user");
		MessageDAO dao=new MessageDAOImpl();
		int connte=dao.dustbinSum(user.getUser_id(),user.getUser_id());
		request.setAttribute("connte", connte);
		List<Message> messages=dao.dustbinSelectAll(user.getUser_id(),(pagevalue-1)*5,5);
		List<Message> messages2=dao.dustbinReceiverSelectAll(user.getUser_id(),(pagevalue-1)*5,5);
		request.setAttribute("messages2", messages2);
		request.setAttribute("messages", messages);
		request.getRequestDispatcher("Message/MessageDustbinShow.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
