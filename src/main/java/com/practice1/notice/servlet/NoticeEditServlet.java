package com.practice1.notice.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.NoticeDAO;
import com.practice1.dao.impl.DateString;
import com.practice1.dao.impl.NoticeDAOImpl;
import com.practice1.model.Notice;

/**
 * Servlet implementation class NoticeEditServlet
 */
public class NoticeEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String notice_id=request.getParameter("notice_id");
		NoticeDAO dao=new NoticeDAOImpl();
		Notice notice=dao.updateByID(Integer.valueOf(notice_id));		
		request.setAttribute("notice", notice);
		request.setAttribute("g", DateString.method1(notice.getExpire_time()));
		request.setAttribute("p", DateString.method1(notice.getPub_time()));
		request.getRequestDispatcher("Notice/NoticeUpdate.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
