package cn.sanxiau.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.sanxiau.bean.Phone;
import cn.sanxiau.util.DbUtils;

public class PhoneDao {
	
	public Phone findByUserId(int user_id){
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			connection = DbUtils.getConnection();
			String sql = "select * from phone where user_id=?";
			ps = connection.prepareStatement(sql );
			ps.setInt(1, user_id);
			rs = ps.executeQuery();
			if(rs.next()){
				return new Phone(rs.getInt("phone_id"), 
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
				DbUtils.closeStream(connection, ps, rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}	
