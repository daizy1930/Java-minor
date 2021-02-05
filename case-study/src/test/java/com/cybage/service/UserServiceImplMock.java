package com.cybage.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.cybage.dao.UserDao;
import com.cybage.model.User;

class UserServiceImplMockTest {

	private UserDao userDao = Mockito.mock(UserDao.class); // creating dummy implementation
															// done by mockito framework

	private UserService userService = new UserServiceImpl(userDao);
	// adding dummy dependency

	@Test
	void testAddUer() throws SQLException {
		User user = new User(123, "dm123", "dm123", "pune","User");
		Mockito.when(userDao.addUser(user)).thenReturn(1);
		
		//SUT ==>  userService.addUer
		int addCount = userService.addUser(user);	//userDAo.adduser
		assertEquals(1, addCount);
	}
	
	@Test
	void testFindUser() throws SQLException {
		
		//userDao.findUser is not SUT 
		List<User> users = Arrays.asList(new User(101, "dm101", "dm101", "pune101","user"),
								new User(102, "abc", "kp", "gnr","admin"),
								new User(103, "def", "kp", "gnr","provider"),
								new User(104, "xyz", "kp", "hyd","vendor"),
								new User(105, "mno", "kp", "pune","designer")
								);
		
		Mockito.when(userDao.findUser()).thenReturn(users);
		
		
		//SUT --> system under test --> userService.findUser()
		List<User> fromServiceUsers = userService.findUser();
		
//		assertEquals(users.size(), fromServiceUsers.size());
//		assertEquals(users.get(0), fromServiceUsers.get(0));
//		assertEquals(users.get(1), fromServiceUsers.get(1));
//		assertEquals(users.get(2), fromServiceUsers.get(2));
//		assertEquals(users.get(3), fromServiceUsers.get(3));
//		assertEquals(users.get(4), fromServiceUsers.get(3));
//		
		assertIterableEquals(users, fromServiceUsers);
	}

}
