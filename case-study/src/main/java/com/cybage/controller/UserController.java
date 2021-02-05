package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.exception.UserException;
import com.cybage.model.User;
import com.cybage.service.UserService;
import com.cybage.service.UserServiceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@ServletSecurity(
		value = @HttpConstraint(rolesAllowed = {"user"})
		)


public class UserController extends HttpServlet {

//	private UserDao userDao = new BetterUserDaoImpl();

	private UserDao userDao = new UserDaoImpl();
	private UserService userService = new UserServiceImpl(userDao);
	
	public static final Logger log = LogManager.getLogger(UserController.class.getName());

	private static final long serialVersionUID = 1L;

	public UserController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, UserException {
		
		PrintWriter pw = response.getWriter();
		
		log.info("Inside userController...page is working...");
		
		String path = request.getPathInfo();
		if(path.equals("/add")) {
			System.out.println("Inside add method...");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String address = request.getParameter("address");
			
//			System.out.println(username +" "+ password +" "+ address);
			
			User user = new User(username, password, address,"user");
			try {
		
				  int addCount = userService.addUser(user);
	                 log.info("number of record added.."+ addCount);
	                 if(addCount <= 0) {
	                	 
	                	 throw new UserException("could not add user");
	                 }
	                     response.sendRedirect("list"); 
			} catch (SQLException e) {
				log.error("exception occurred..."+ e.getLocalizedMessage());
			}
		}
		if(path.equals("/list")) {
			
			try {
				List<User> users = userService.findUser();
				
				if(users.size() == 0) {
					throw new UserException("Could not Fetch data...There is no data in database");
				}
				
				request.setAttribute("users", users);
				request.getRequestDispatcher("/user/viewUser.jsp").forward(request, response);;
			} catch (SQLException e) {
				log.error("exception occurred..."+ e.getLocalizedMessage());
			}
		}
		if(path.equals("/delete")) {
			log.debug("inside delete...");
			try {
				int id =Integer.parseInt(request.getParameter("id"));
				int deleted = userService.deleteUser(id);
				
					response.sendRedirect("list");
				
			} catch (SQLException e) {
				log.error("exception occurred..."+ e.getLocalizedMessage());
			}

		}
		
		if(path.equals("/edit")) {
			log.debug("inside edit...");
			try {
				int id = Integer.parseInt(request.getParameter("id"));
				User users = userService.findUserById(id);
				request.setAttribute("users", users);
				
				request.getRequestDispatcher("/user/editUser.jsp").forward(request, response);;
			} catch (SQLException e) {
				log.error("exception occurred..."+ e.getLocalizedMessage());
			}

		}
		
		if(path.equals("/update-user")) {
			log.debug("inside update...");
			
				int id = Integer.parseInt(request.getParameter("id"));
				String name = request.getParameter("username");
				String password = request.getParameter("password");
				String address = request.getParameter("address");
				String role = request.getParameter("role");
				User users = new User(id,name,password,address,role);
				try {
					userService.updateUser(users);
					response.sendRedirect("list");
			} catch (SQLException e) {
				log.error("exception occurred..."+ e.getLocalizedMessage());
			}

		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
