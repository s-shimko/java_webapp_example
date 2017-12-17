package by.epam.library.service.impl;

import java.util.List;

import by.epam.library.domain.Book;
import by.epam.library.domain.User;
import by.epam.library.domain.vo.Librarian;
import by.epam.library.persistence.BookDAO;
import by.epam.library.persistence.UserDAO;
import by.epam.library.persistence.jdbc.BookMysqlDaoImpl;
import by.epam.library.persistence.jdbc.UserMySqlDaoImpl;
//import by.epam.library.persistence.jdbc.BookMySqlDaoImpl;
import by.epam.library.service.LoginService;

public class LoginServiceImpl implements LoginService {
	
	private UserDAO userDao = new UserMySqlDaoImpl(); //TODO add ioc
	private BookDAO bookDao = new BookMysqlDaoImpl(); //TODO add ioc
	
	@Override
	public Librarian authorizeUser(String userName, String userPass) {
		User user = userDao.readUser(userName, userPass);
		List<Book> books = bookDao.readBooks();
		
		Librarian librarian = new Librarian();
		librarian.setUser(user);
		librarian.setBooks(books);
		
//		new UserMySqlDaoImpl().readUser(userName, userPass);
		
		return librarian;
	}

}
