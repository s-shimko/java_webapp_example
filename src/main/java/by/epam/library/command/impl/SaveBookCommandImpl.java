package by.epam.library.command.impl;

import java.util.List;

import static by.epam.library.command.impl.util.RequestParameter.RESPONSE_BOOK_LIST;

import javax.servlet.http.HttpServletRequest;

import by.epam.library.command.BaseCommand;
import by.epam.library.domain.Book;
import by.epam.library.service.BookService;
import by.epam.library.service.impl.BookServiceImpl;

public class SaveBookCommandImpl implements BaseCommand {
	
	private BookService bookService = new BookServiceImpl();

	@Override
	public String execute(HttpServletRequest request) {
		String title = request.getParameter("book_title");
		String author = request.getParameter("book_author");
		String price = request.getParameter("book_price");
		
		double priceDoube = Double.parseDouble(price);
		
		Book book = new Book(title, author, priceDoube);
		List<Book> books = bookService.saveBook(book);
		request.setAttribute(RESPONSE_BOOK_LIST, books);
		
		return RESPONSE_PAGE_USER_NAME;
	}

}
