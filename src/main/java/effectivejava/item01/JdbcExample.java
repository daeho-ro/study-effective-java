package effectivejava.item01;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JdbcExample {

	public void jdbcExample() throws SQLException {

		// 서비스 제공자 인터페이스 Driver
		Driver driver = new Driver();
		// 제공자 등록 API registerDriver
		DriverManager.registerDriver(driver);
		// 서비스 인터페이스 Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost", "root", "password"); // 서비스 접근 API getConnection
	}

}
