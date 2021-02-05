package com.cybage.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.model.User;

class UserServiceImplTest {

	UserDao userDao = new UserDaoImpl();
	UserService userService = new UserServiceImpl(userDao);

	@Test
	void testAddUer() throws SQLException {
		//SUT --> system under test --> add user
		int userid = (int) Math.round(Math.random() * 99999);
		int addCount = userService.addUser(new User(userid, "DP", "DP123", "abad","role"));
		assertEquals(1, addCount);		
		userService.deleteUser(userid);
	}
	
	@Test
	void testFindUser() throws SQLException {
		List<User> users = userService.findUser();
		assertEquals(12, users.size());		
	}
	
	@Test
	void testDeleteUser() throws SQLException {
		User user = userService.findUserById(89707);
		int deleteCount = userService.deleteUser(89707);
		assertEquals(1, deleteCount);		
		userService.addUser(user);
	} 
	
	@Test
	void testUpdateUser() throws SQLException {
		User user = new User(89707, "new name", "newpass", "newaddress","role");
		int updateCount = userService.updateUser(user);
		assertEquals(1, updateCount);
		
		User updatedUser = userService.findUserById(user.getId());
		
		assertEquals(updatedUser.getId(), user.getId());
		assertEquals(updatedUser.getName(), user.getName());
		assertEquals(updatedUser.getAddress(), user.getAddress());
		assertEquals(updatedUser.getPassword(), user.getPassword());
		assertEquals(updatedUser.getRole(), user.getRole());			
	} 
	
}
