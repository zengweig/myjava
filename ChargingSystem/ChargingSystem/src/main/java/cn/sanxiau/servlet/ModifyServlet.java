package cn.sanxiau.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.sanxiau.bean.BasicBean;
import cn.sanxiau.bean.Phone;
import cn.sanxiau.dao.UserDao;

public class ModifyServlet extends HttpServlet{
	
	UserDao dao = new UserDao();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String new_pwd = req.getParameter("new_pwd");
		
		String new_pwd2 = req.getParameter("new_pwd2");
		
		if(new_pwd.equals(new_pwd2)){
			
			String old_pwd = req.getParameter("old_pwd");
			
			String username = (String) req.getSession().getAttribute("username");
			
			String findPwdByName = dao.findPwdByName(username);
			
			if(old_pwd.equals(findPwdByName)){
				
				dao.modifyPwd(new_pwd, username);
				
				req.setAttribute("flag", true);
				
				req.getRequestDispatcher("modify.jsp").forward(req, resp);
				
			}else{
				req.setAttribute("message1", "你个傻子！旧密码输入错误");
				req.getRequestDispatcher("modify.jsp").forward(req, resp);
			}
			
		}else{
			req.setAttribute("message", "你个傻子！两次输入的密码不一致");
			req.getRequestDispatcher("modify.jsp").forward(req, resp);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		int user_id = Integer.parseInt(req.getParameter("username"));
		
		Phone phone = dao.findByUserId(user_id);
		
		BasicBean basic = dao.findBasicBeanByUserId(user_id);
		
		if(phone!=null){
			
			req.setAttribute("basic", basic);
			
			req.setAttribute("phone", phone);
			
			req.getRequestDispatcher("info.jsp").forward(req, resp);
		}
		
	}
}
