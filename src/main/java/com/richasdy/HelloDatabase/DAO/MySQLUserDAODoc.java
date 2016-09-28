// sample from oracle documentation
// the only file that different

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

public class MySQLUserDAODoc implements UserDAO {

	private Connection connection;
	private Statement statement;

	// public MySQLUserDAODoc() {
	// connection load in constructor, become lazy load
	// connection = MySQLDAOFactory.createConnection();
	// }

	public List<User> getAllUser() {

		String query = "SELECT * FROM Users";
		List<User> users = new LinkedList<User>();

		// try-with-resource, java 1.7 above.
		// no need to close the resource (con, stat, rs)
		try (Connection connection = MySQLDAOFactory.createConnection();
				Statement statement = (Statement) connection.createStatement()) {
			try (ResultSet rs = statement.executeQuery(query)) {
				// Do stuff with the result set.
				while (rs.next()) {
					User user = new User();

					user.setId(rs.getInt("id"));
					user.setName(rs.getString("name"));
					user.setEmail(rs.getString("email"));
					user.setPassword(rs.getString("password"));

					users.add(user);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// // java below 1.7
		// // need to close the resource (con, stat, rs) in finally
		// try {
		// // make connection every query
		// connection = MySQLDAOFactory.createConnection();
		// statement = (Statement) connection.createStatement();
		// ResultSet rs = statement.executeQuery(query);
		//
		// while (rs.next()) {
		// User user = new User();
		//
		// user.setId(rs.getInt("id"));
		// user.setName(rs.getString("name"));
		// user.setEmail(rs.getString("email"));
		// user.setPassword(rs.getString("password"));
		//
		// users.add(user);
		// }
		//
		// } catch (SQLException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// } finally {
		// // when these commented, its become lazy load
		// // not good if we not connection not close
		// // DBUtil.close(rs); // rs sutomatic close with statement
		// DBUtil.close(statement);
		// DBUtil.close(connection);
		// }

		return users;

	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

}
