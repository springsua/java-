package com.cjf.dbcp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try {
			Connection connection=DbcpUtil.geConnection();
			String sql="insert into students(id,name) values(121,'gg');";
			Statement st=connection.createStatement();
			int i=st.executeUpdate(sql);
			if(i!=0) {
				System.out.println("�ɹ�");
			}else {
				System.out.println("ʧ��");
			}
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}

}
