package by.epam.library.persistence.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import by.epam.library.domain.User;
import by.epam.library.persistence.UserDAO;

public class UserMySqlDaoImpl extends BaseMySqlDao implements UserDAO {

	private static final String SQL_SELECT_USER = "select * from user where login = ? and pass = ? ";
	private static final String USER_LOGIN = "login";

	@Override
	public User readUser(String login, String pass) {

		User user = new User();
		Connection conn = null;
		try {

			conn = getDBConnection();
			PreparedStatement ps = conn.prepareStatement(SQL_SELECT_USER);
			ps.setString(1, login);
			ps.setString(2, pass);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				user.setName(rs.getString(USER_LOGIN));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn);
		}
		return user;
	}

}
