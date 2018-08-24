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
 * Servlet implementation class NoticeUpdateServlet
 */
public class NoticeUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String notice_id=request.getParameter("notice_id");
		String pub_time=request.getParameter("pub_time");
		String expire_time=request.getParameter("expire_time");
		String subject=request.getParameter("subject");
		String receive_id=request.getParameter("receive_id");
		String text=request.getParameter("text");
		NoticeDAO noticeDAO=new NoticeDAOImpl();
		Notice notice=noticeDAO.updateByID(Integer.valueOf(notice_id));
		notice.setPub_time(DateString.method1(pub_time));
		notice.setExpire_time(DateString.method1(expire_time));
		notice.setSubject(subject);
		notice.setReceive_id(Integer.valueOf(receive_id));
		notice.setText(text);
		
		noticeDAO.update(notice);
		response.sendRedirect("NoticeShowServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
