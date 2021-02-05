package com.cybage.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

public class DbUtil {
	
	private static String className = "com.mysql.cj.jdbc.Driver";
	private static String dbUrl;
	private static String dbUser;
	private static String dbPassword;

	
	static {
	try {
			FileReader reader = new FileReader("d://---- java properties files ----//db_casestudy.properties");
			Properties props = new Properties();
			
			props.load(reader);
			dbUrl = props.getProperty("dbUrl");
			dbUser = props.getProperty("dbUser");
			dbPassword = props.getProperty("dbPassword");
			
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
			}
		
			
	}
	
	// without connection pool
	public static Connection getCon() throws SQLException {
				/*//1. need to load necessary class
				Class.forName(className);
				
				//2. connect to actual db using (mysql driver)
				Connection con = DriverManager.getConnection(dbUrl, dbUser,dbPassword);
				return con;*/
		
		BasicDataSource bs = new BasicDataSource();
		bs.setUrl(dbUrl);
		bs.setUsername(dbUser);
		bs.setPassword(dbPassword);
		bs.setMinIdle(5);
		bs.setMaxIdle(10);
		bs.setMaxOpenPreparedStatements(100);     
//		
//				
		return bs.getConnection();
				
	}
}
