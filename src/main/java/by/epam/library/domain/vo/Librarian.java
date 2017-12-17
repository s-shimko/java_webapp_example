package by.epam.library.domain.vo;

import java.util.List;

import by.epam.library.domain.Book;
import by.epam.library.domain.User;

public class Librarian {

	private User user;
	private List<Book> books;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
