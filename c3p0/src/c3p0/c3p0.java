package c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class c3p0 {
	private static ComboPooledDataSource dataSource=new ComboPooledDataSource("s");
	public static DataSource getdataSource() {
		return dataSource;
	}
	public static Connection getConnection() throws Exception {
		return  dataSource.getConnection();
	}
}
