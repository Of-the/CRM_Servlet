package com.practice1.notice.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice1.dao.NoticeDAO;
import com.practice1.dao.impl.NoticeDAOImpl;
import com.practice1.model.Notice;

/**
 * Servlet implementation class NoticeShow_Show_Servlet
 */
public class NoticeShow_Show_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeShow_Show_Servlet() {
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
		int pageValue=Integer.valueOf(page);
		NoticeDAO noticeDAO=new NoticeDAOImpl();
		int count=noticeDAO.sum();
		List<Notice> notices=noticeDAO.selectAllByPage(10*(pageValue-1), 10);
		request.setAttribute("current", pageValue);
		request.setAttribute("count", count);
		request.setAttribute("notices", notices);
		request.getRequestDispatcher("Notice/NoticeShow_Show.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
