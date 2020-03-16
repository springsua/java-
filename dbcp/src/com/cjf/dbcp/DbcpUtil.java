package com.cjf.dbcp;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DbcpUtil {
	
	private static DataSource dataSource;
	static {
		InputStream iStream=DbcpUtil.class.getClassLoader().getResourceAsStream("db.properties");
		Properties properties=new Properties();
		try {
			properties.load(iStream);
			dataSource=BasicDataSourceFactory.createDataSource(properties);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
	public static DataSource getdDataSource() {
		return dataSource;
	}
	public static Connection geConnection() throws Exception {
		return dataSource.getConnection();
		
	}
}
