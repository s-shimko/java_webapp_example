package by.epam.library.persistence;

import java.util.List;

import by.epam.library.domain.Book;

public interface BookDAO {
	
	List<Book> readBooks();
	int createBook(Book book);
}
