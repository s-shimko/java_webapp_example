package by.epam.library.persistence.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.epam.library.domain.Book;
import by.epam.library.domain.User;
import by.epam.library.persistence.BookDAO;

public class BookMysqlDaoImpl extends BaseMySqlDao implements BookDAO {

	private static final String SQL_SELECT_BOOKS = "select * from book";
	private static final String SQL_INSERT_BOOK = "insert into book(title, author, price) VALUES (?,?,?)";

	@Override
	public List<Book> readBooks() {
		Connection con = null;

		List<Book> books = new ArrayList<Book>();
		Book book = null;

		try {
			con = getDBConnection();

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_BOOKS);

			while (rs.next()) {
				book = new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getDouble("price"));

				books.add(book);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(con);
		}
		return books;
	}

	@Override
	public int createBook(Book book) {
		Connection conn = null;
		int bookId = 0;
		try {
			conn = getDBConnection();

			PreparedStatement ps = conn.prepareStatement(SQL_INSERT_BOOK);
			ps.setString(1, book.getTitle());
			ps.setString(2, book.getAuthor());
			ps.setDouble(3, book.getPrice());

			ps.executeUpdate();

			ResultSet rs = ps.getGeneratedKeys();

			if (rs.next()) {
				bookId = rs.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeConnection(conn);
		}
		return bookId;
	}
}
