package com.richasdy.HelloDatabase.DAO;

import java.util.List;

import com.richasdy.HelloDatabase.model.User;

public interface UserDAO {
	public List<User> getAllUser();
	public User getUser(int id);
	public void updateUser(User user);
	public void deleteUser(User user);
}
