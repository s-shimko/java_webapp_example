package by.epam.library.command;

import javax.servlet.http.HttpServletRequest;

public interface BaseCommand {
//docs
	
		String RESPONSE_PAGE_USER_NAME = "/WEB-INF/pages/user/main.jsp"; 
		String RESPONSE_PAGE_ADD_BOOK = "/WEB-INF/pages/admin/add_book.jsp"; 
		String RESPONSE_PAGE_ERROR = "/WEB-INF/pages/error.jsp"; 
	
		public String execute(HttpServletRequest request);
}
