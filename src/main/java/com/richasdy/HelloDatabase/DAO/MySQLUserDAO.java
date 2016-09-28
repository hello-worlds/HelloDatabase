package com.richasdy.HelloDatabase.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.richasdy.HelloDatabase.Util.ConnectionFactory;
import com.richasdy.HelloDatabase.Util.DBUtil;
import com.richasdy.HelloDatabase.model.User;

public class MySQLUserDAO implements UserDAO {

	private Connection connection;
	private Statement statement;

	public List<User> getAllUser() {
		
		String query = "SELECT * FROM Users";
		List<User> users = new LinkedList<User>();
		ResultSet rs = null;
		
		try {
			
			connection = ConnectionFactory.getConnection();
			statement = (Statement) connection.createStatement();
			rs = statement.executeQuery(query);
			
			while (rs.next()) {
				User user = new User();
				
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				
				users.add(user);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(rs);
			DBUtil.close(statement);
			DBUtil.close(connection);
		}
		
		return users;
		
	}

	public User getUser(int rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateUser(User student) {
		// TODO Auto-generated method stub

	}

	public void deleteUser(User student) {
		// TODO Auto-generated method stub

	}

}
