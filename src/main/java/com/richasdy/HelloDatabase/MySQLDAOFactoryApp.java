// DAO using DAO factory

package com.richasdy.HelloDatabase;

import java.util.List;

import com.richasdy.HelloDatabase.DAO.DAOFactory;
import com.richasdy.HelloDatabase.DAO.UserDAO;
import com.richasdy.HelloDatabase.model.User;

public class MySQLDAOFactoryApp {

	public static void main(String[] args) {

		// create the required DAO Factory

		// for more clear use
		DAOFactory mySQLDAOFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		// Create a DAO
		UserDAO userDAO = mySQLDAOFactory.getUserDAO();

		// for flexible use in programming, to change entire database
		// DAOFactory daofactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		// Create a DAO
		// UserDAO userDAO = daofactory.getUserDAO();

		// Find all user object.
		List<User> userList = userDAO.getAllUser();
		for (User user : userList) {
			System.out.println("User: [id : " + user.getId() + ", Name : " + user.getName() + ", Email : "
					+ user.getEmail() + ", Password : " + user.getPassword() + " ]");
		}

		for (User user : userDAO.getAllUser()) {
			System.out.println("User: [id : " + user.getId() + ", Name : " + user.getName() + ", Email : "
					+ user.getEmail() + ", Password : " + user.getPassword() + " ]");
		}
	}
}
