package cn.sanxiau.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.sanxiau.bean.BasicBean;
import cn.sanxiau.bean.Phone;
import cn.sanxiau.bean.User;
import cn.sanxiau.util.DbUtils;

public class UserDao {
	
	public User findByUser(String name,String password){
			Connection connection = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
		try {
			
			connection = DbUtils.getConnection();
			
			String sql = "select * from user where uname=? and upassword=?";
			
			ps = connection.prepareStatement(sql);
			
			ps.setString(1,name);
			
			ps.setString(2,password);
			
			rs = ps.executeQuery();
			
			if(rs.next()){
				
				User user = new User();
				
				user.setId(rs.getInt("id"));
				
				user.setUsername(rs.getString("uname"));
				
				user.setPwd(rs.getString("upassword"));
				
				return user;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
					
				try {
					DbUtils.closeStream(connection, ps, rs);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
		
		return null;
		
	}

	//注册
	public boolean validUser(User user) {
		/**先验证有没有该用户----查询
		 * 如果有：提示该用户已存在
		 * 如果没有：就添加到数据库
		 */
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			connection=DbUtils.getConnection();
			
			String sql="select * from user where uname=?";
			
			ps = connection.prepareStatement(sql);
			
			ps.setString(1, user.getUsername());
			
			rs = ps.executeQuery();
			
			boolean b=rs.next();
			
			if(!b){
				
				sql="insert into user(uname,upassword) values(?,?)";
				
				ps = connection.prepareStatement(sql);
				
				ps.setString(1, user.getUsername());
				
				ps.setString(2, user.getPwd());
				
				ps.executeUpdate();
				
				return true;
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{	
			try {
				DbUtils.closeStream(connection, ps, rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 	false;
		
	}
	
	public String findPwdByName(String name){
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			connection = DbUtils.getConnection();
			String sql = "select upassword from user where uname="+name;
			ps = connection.prepareStatement(sql );
			rs = ps.executeQuery();
			if(rs.next()){
				return rs.getString("upassword");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbUtils.closeStream(connection, ps, rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	
	public void modifyPwd(String pwd,String username){
		
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			connection = DbUtils.getConnection();
			String sql = "update user set upassword=? where uname=?";
			ps = connection.prepareStatement(sql);
			ps.setString(1, pwd);
			ps.setString(2, username);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbUtils.closeStream(connection, ps, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public Phone findByUserId(int user_id) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DbUtils.getConnection();
			String sql = "select * from phone where user_id="+user_id;
			ps = con.prepareStatement(sql );
			rs = ps.executeQuery();
			if(rs.next()){
				return new Phone(
						rs.getString("status"), 
						rs.getString("type"), 
						rs.getDate("admission"), 
						rs.getString("level"), 
						rs.getString("brand"), 
						rs.getInt("user_id"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbUtils.closeStream(con, ps, rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
		
	}
	/*resultSet--->Json   下载一个JSON包 */
	public BasicBean findBasicBeanByUserId(int user_id) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DbUtils.getConnection();
			String sql = "select * from basic_information where user_id="+user_id;
			ps = con.prepareStatement(sql );
			rs = ps.executeQuery();
			if(rs.next()){
				return new BasicBean(
						rs.getString("name"), 
						rs.getString("meal"), 
						rs.getString("level"), 
						rs.getString("papers"), 
						rs.getString("papers_number"), 
						rs.getString("account_manager"), 
						rs.getString("hotline"), 
						rs.getString("bill_name"), 
						rs.getString("pay_method"), 
						rs.getString("email"), 
						rs.getString("address"), 
						rs.getInt("user_id"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbUtils.closeStream(con, ps, rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	
	
}
