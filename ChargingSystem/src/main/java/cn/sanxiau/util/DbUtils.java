package cn.sanxiau.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DbUtils {
	
	public static String driverName="com.mysql.jdbc.Driver";
	
	public static String root="root";
	
	public static String password="123456";
	
	public static String url="jdbc:mysql:///ruanjian1702";
	
	public static Connection getConnection() throws Exception{
		
		Class.forName(driverName);
		
		return DriverManager.getConnection(url,root,password);
		
	}
	
	public static void closeStream(Connection con,PreparedStatement ps,ResultSet rs) throws Exception{
		
		if(con!=null){
			con.close();
		}
		if(ps!=null){
			ps.close();
		}
		if(rs!=null){
			rs.close();
		}
	}
	
	
}
