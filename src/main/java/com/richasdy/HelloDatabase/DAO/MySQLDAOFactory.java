package com.richasdy.HelloDatabase.DAO;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MySQLDAOFactory extends DAOFactory {

	public static final String URL = "jdbc:mysql://localhost/hellojava";
	public static final String USER = "root";
	public static final String PASSWORD = "";
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

	// method to create mysql connections
	public static Connection createConnection() {
		// Use DRIVER and DBURL to create a connection
		// Recommend connection pool implementation/usage
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			System.out.println("ERROR: Unable to Connect to Database.");
		}

		return connection;
	}

	public UserDAO getUserDAO() {

		// MySQLUserDAO implements UserDAO
		// Using MySQLUserDAODoc from oracle documentation
		return new MySQLUserDAODoc();

	}

	// public AccountDAO getAccountDAO() {
	// // CloudscapeAccountDAO implements AccountDAO
	// return new CloudscapeAccountDAO();
	// }
	//
	// public OrderDAO getOrderDAO() {
	// // CloudscapeOrderDAO implements OrderDAO
	// return new CloudscapeOrderDAO();
	// }
}
