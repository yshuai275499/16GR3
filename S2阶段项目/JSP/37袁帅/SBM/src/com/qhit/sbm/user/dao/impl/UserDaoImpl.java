/**
 * 
 */
package com.qhit.sbm.user.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.qhit.sbm.user.bean.User;
import com.qhit.sbm.user.dao.UserDao;
import com.qhit.sbm.utils.DBManager;

/**
 * @author admin
 * 2017年11月13日
 */
public class UserDaoImpl implements UserDao {
	private Connection con = null;
	private PreparedStatement ps = null;
	private User user = null;

	@Override
	public User doLogin(String userName, String userPassword) {
		
		con = DBManager.getConnection();
		String sql = "select * from tb_user where userName = ? and userPassword = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, userPassword);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				user = new User(
							rs.getInt("userId"), 
							userName, 
							userPassword, 
							rs.getString("userSex"), 
							rs.getInt("userAge"), 
							rs.getString("telephone"), 
							rs.getString("address"), 
							rs.getString("pic"), 
							rs.getInt("type"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBManager.close(ps, con);
		}
		return user;
	}

}
