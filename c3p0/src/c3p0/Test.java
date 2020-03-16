package c3p0;

import java.sql.Connection;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try {
			Connection connection=c3p0.getConnection();
			String sql="delete from students where id=111;";
			Statement st=connection.createStatement();
			int i=st.executeUpdate(sql);
			if(i!=0) {
				System.out.println("ok");
			}else {
				System.out.println("sorry");
			}
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e. printStackTrace();
			}

	}
}
