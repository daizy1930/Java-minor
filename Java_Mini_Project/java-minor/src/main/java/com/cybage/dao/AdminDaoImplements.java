package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cybage.model.Category;
import com.cybage.model.Course;
import com.cybage.model.Video;
import com.cybage.service.AdminServiceImplements;
import com.cybage.util.DbUtil;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

public class AdminDaoImplements implements AdminDaoInterface{
	public static final Logger log = LogManager.getLogger(AdminServiceImplements.class);
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
		return null;
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
		Connection con = DbUtil.getCon();
		log.debug("inside getCategory Dao Level");
		String sql = "Select category_id, category_name, category_url from category";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<Category> categories = new ArrayList<Category>();
		while(rs.next()) {
			Category category = new Category();
			category.setId(rs.getInt(1));
			category.setName(rs.getString(2));
			category.setCategory_url(rs.getString(3));
			
			categories.add(category);
			
		}
		return categories;

	}

	public List<Video> getVideo() {
		// TODO Auto-generated method stub
		return null;
	}

	public int addCategory(Category cat) {
		// TODO Auto-generated method stub
		return 0;
	}

}
