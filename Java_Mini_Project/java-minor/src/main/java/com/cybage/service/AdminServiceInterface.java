package com.cybage.service;

import java.sql.SQLException;
import java.util.List;

import com.cybage.model.Category;
import com.cybage.model.Course;

public interface AdminServiceInterface {
	public boolean addCourse(Course c);
	public boolean deleteCourse(int id);
	public List<Course> getCourse();
	public Course getCourseById(int id);
	public List<Course> getCourseByCid(int id);
	public boolean updateCourse(Course c);
	
	public List<Category> getCategory() throws SQLException, Exception;
	public int addCategory(Category cat);

}