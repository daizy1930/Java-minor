package com.cybage.dao;

import java.sql.SQLException;
import java.util.List;

import com.cybage.model.Category;
import com.cybage.model.Course;
import com.cybage.model.Video;

public interface AdminDaoInterface {
	public boolean addCourse(Course c);
	public boolean deleteCourse(int id);
	public List<Course> getCourse();
	public List<Category> getCategory() throws Exception;
	public int addCategory(Category cat);
	public List<Video> getVideo();
	public Course getCourseById(int id);
	public List<Course> getCourseByCid(int id);
	public boolean updateCourse(Course c);
}