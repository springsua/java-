package com.cjf.dbcp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			Connection connection=DbcpUtil.geConnection();
			String sql="insert into students(id,name) values(121,'gg');";
			Statement st=connection.createStatement();
			int i=st.executeUpdate(sql);
			if(i!=0) {
				System.out.println("成功");
			}else {
				System.out.println("失败");
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}

}
