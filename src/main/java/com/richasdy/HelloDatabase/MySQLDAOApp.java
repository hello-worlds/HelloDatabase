package com.richasdy.HelloDatabase;

import com.richasdy.HelloDatabase.DAO.UserDAO;
import com.richasdy.HelloDatabase.DAO.MySQLUserDAO;
import com.richasdy.HelloDatabase.model.User;

/**
 * Hello world!
 *
 */
public class MySQLDAOApp {
	public static void main(String[] args) {
		
		UserDAO userDAO = new MySQLUserDAO();

		// print all students
		for (User user : userDAO.getAllUser()) {
			System.out.println("User: [id : " + user.getId() + ", Name : " + user.getName() + ", Email : "
					+ user.getEmail() + ", Password : " + user.getPassword() + " ]");
		}
	}

}