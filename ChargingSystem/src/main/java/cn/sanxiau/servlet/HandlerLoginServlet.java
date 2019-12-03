package cn.sanxiau.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationHelper;

import cn.sanxiau.bean.User;
import cn.sanxiau.dao.UserDao;
import sun.net.httpserver.HttpServerImpl;

public class HandlerLoginServlet extends HttpServlet{


	UserDao dao = new UserDao();
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//处理数据的过程
		/*
		 * HttpServletRequest req
		 * 	请求----负责接收来自服务器的数据或者转发
		 * HttpServletResponse resp
		 * 	响应----响应结果（网页面写东西）
		 */
		req.setCharacterEncoding("utf8");
		String uname = req.getParameter("username");
		String upwd = req.getParameter("password");
		
		User user = dao.findByUser(uname, upwd);
		
		if(user==null){
			
			req.setAttribute("error", "用户名或者密码错误！");
			
			req.getRequestDispatcher("index.jsp").forward(req, resp);
			
		}else{
			req.getSession().setAttribute("userId", user.getId());
			
			req.getSession().setAttribute("username", user);
			
			
			req.getRequestDispatcher("main.jsp").forward(req, resp);
		}
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String name = req.getParameter("username");
		
		String pwd = req.getParameter("password");
		
		User user = new User(name, pwd);
		
		boolean flag = dao.validUser(user);
		
		if(flag){
			((HttpServletResponse) resp).sendRedirect("index.jsp");
		}else{
			
			req.setAttribute("error", "该用户已存在");
			
			req.getRequestDispatcher("register.jsp").forward(req, resp);
		}
	}
	
}
