package com.cybage.service;

import java.sql.SQLException;
import java.util.List;

import com.cybage.dao.AdminDaoImplements;
import com.cybage.model.Category;
import com.cybage.model.Course;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AdminServiceImplements implements AdminServiceInterface {
	private AdminDaoImplements ad;

	public static final Logger log = LogManager.getLogger(AdminServiceImplements.class);
	public AdminServiceImplements(AdminDaoImplements ad) {
		super();
		this.ad = ad;
	}

	public boolean addCourse(Course c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteCourse(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return ad.getCourse();
	}

	public Course getCourseById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Course> getCourseByCid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateCourse(Course c) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Category> getCategory() throws Exception {
		log.debug("Inside get Category method Service Level...");
		return ad.getCategory();
	}

	public int addCategory(Category cat) {
		// TODO Auto-generated method stub
		return 0;
	}

}
