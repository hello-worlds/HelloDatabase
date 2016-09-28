package com.richasdy.HelloDatabase.DAO;

import java.util.List;

import com.richasdy.HelloDatabase.model.User;

public interface UserDAO {
	public List<User> getAllUser();
	public User getUser(int rollNo);
	public void updateUser(User student);
	public void deleteUser(User student);
}
