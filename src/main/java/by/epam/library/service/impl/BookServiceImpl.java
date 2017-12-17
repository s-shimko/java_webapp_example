package by.epam.library.service.impl;

import java.util.List;

import by.epam.library.domain.Book;
import by.epam.library.persistence.BookDAO;
import by.epam.library.persistence.jdbc.BookMysqlDaoImpl;
import by.epam.library.service.BookService;

public class BookServiceImpl implements BookService {

	BookDAO bookDao = new BookMysqlDaoImpl();
	
	@Override
	public List<Book> saveBook(Book book) {
		int newBookId = bookDao.createBook(book);
		
		List<Book> books = bookDao.readBooks();
		
		return books;
	}

}
