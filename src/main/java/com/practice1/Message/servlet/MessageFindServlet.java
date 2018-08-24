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
 * Servlet implementation class MessageFindServlet
 */
public class MessageFindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageFindServlet() {
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
		String find=request.getParameter("find");
		String text=request.getParameter("text");
		User user=(User)request.getSession().getAttribute("user");
		MessageDAO dao=new MessageDAOImpl();
		if (find.equals("标题")) {	
			int connte=dao.sun(user.getUser_id(), text);
			request.setAttribute("connte", connte);
			List<Message>messages=dao.selectByIDname(user.getUser_id(),text,(pagevalue-1)*5, 5);
			request.setAttribute("messages", messages);
		}else {
			int connte=dao.sum(user.getUser_id(), text);
			request.setAttribute("connte", connte);
			List<Message>messages=dao.selectyByIDdesc(user.getUser_id(),text,(pagevalue-1)*5, 5);
			request.setAttribute("messages", messages);
		}
		request.setAttribute("find", find);
		request.setAttribute("text", text);
		request.setAttribute("pagevalue", pagevalue);
		
		
		request.getRequestDispatcher("Message/MessageFind.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
