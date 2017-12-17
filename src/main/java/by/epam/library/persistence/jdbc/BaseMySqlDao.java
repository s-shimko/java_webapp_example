package by.epam.library.persistence.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

abstract class BaseMySqlDao {
	

	protected Connection getDBConnection() throws SQLException {

		ResourceBundle rb = ResourceBundle.getBundle("db_config");
		String url = rb.getString("db.url");
		String dbUser = rb.getString("db.login");
		String dbPass = rb.getString("db.pass");
		String driver = rb.getString("db.driver.name");

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection conn = null;
		conn = DriverManager.getConnection(url, dbUser, dbPass);

		return conn;
	}

	protected void closeConnection(Connection conn) {

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
