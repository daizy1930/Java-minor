package com.cybage.service;

import java.sql.SQLException;
import java.util.List;

import com.cybage.model.User;

public interface UserService {
	public int addUser(User user) throws SQLException;
	public List<User> findUser() throws SQLException;
	public User findUserById(int id) throws SQLException;
	public int deleteUser(int id) throws SQLException;
	public int updateUser(User user) throws SQLException;
}
