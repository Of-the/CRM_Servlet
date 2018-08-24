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
 * Servlet implementation class NoticeFindServlet
 */
public class NoticeFindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeFindServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String find=request.getParameter("find");
		String name=request.getParameter("name");
		String page=request.getParameter("page");
		request.setAttribute("find", find);
		request.setAttribute("name", name);
		if (page==null) {
			page="1";
		}
		int pageValue=Integer.valueOf(page);
		NoticeDAO dao=new NoticeDAOImpl();
		if (find.equals("主题")) {
			int conte=dao.sum("%"+name+"%");
			request.setAttribute("conte", conte);
			List<Notice> notices=dao.selectByIDname(name, (5*(pageValue-1)), 5);			
			request.setAttribute("connte", pageValue);
			request.setAttribute("notices", notices);
			request.getRequestDispatcher("Notice/NoticeFind.jsp").forward(request, response);
		}else if (find.equals("内容")) {
			int conte=dao.sun("%"+name+"%");
			request.setAttribute("conte", conte);
			List<Notice> notices=dao.selectyByIDdesc(name, (5*(pageValue-1)), 5);
			request.setAttribute("connte", pageValue);
			request.setAttribute("notices", notices);
			request.getRequestDispatcher("Notice/NoticeFind.jsp").forward(request, response);
		}
			
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
