package com.cybage.model;

public class Course {
	private int id;
	private String name;
	private String desc;
	private String course_url;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCourse_url() {
		return course_url;
	}
	public void setCourse_url(String course_url) {
		this.course_url = course_url;
	}
	public Course(int id, String name, String desc, String course_url) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.course_url = course_url;
	}
	public Course(String name, String desc, String course_url) {
		super();
		this.name = name;
		this.desc = desc;
		this.course_url = course_url;
	}
	
	
}
