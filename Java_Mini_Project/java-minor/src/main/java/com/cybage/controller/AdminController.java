package com.cybage.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.dao.AdminDaoImplements;
import com.cybage.exception.CategoryException;
import com.cybage.model.Category;
import com.cybage.service.AdminServiceImplements;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController/*")
public class AdminController extends HttpServlet {
	
	public static final Logger log = LogManager.getLogger(AdminController.class.getName());

	
	private static final long serialVersionUID = 1L;
	private AdminDaoImplements adao=new AdminDaoImplements();
	private AdminServiceImplements aservice=new AdminServiceImplements(adao);

    /**
     * Default constructor. 
     */
    public AdminController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getPathInfo();
		log.info("Inside UserController....Page is Working....");
		if(request.getPathInfo().equals("/fetch")){
			response.getWriter().append("Fetching data");
			aservice.getCourse();
		}
		if(path.equals("/Fetch-category")) {
			log.debug("inside Fetch-category");
			try {
				List<Category> categories = aservice.getCategory();
				request.setAttribute("categories", categories);
				request.getRequestDispatcher("/admin/Category.jsp").forward(request, response);
				
			} catch (Exception e) {
				log.error("Exception occured..."+e.getLocalizedMessage());
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}