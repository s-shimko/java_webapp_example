package by.epam.library.command.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import by.epam.library.command.impl.util.*;
import by.epam.library.domain.User;
import by.epam.library.domain.vo.Librarian;
import by.epam.library.service.LoginService;
import by.epam.library.service.impl.LoginServiceImpl;
import by.epam.library.command.BaseCommand;

import static by.epam.library.command.impl.util.RequestParameter.*;
import static by.epam.library.command.impl.util.RequestParameterValidator.*;
import javax.servlet.*;

public class LoginCommandImpl implements BaseCommand {
	
	private LoginService service = new LoginServiceImpl(); //add ioc

	@Override
	public String execute(HttpServletRequest request) {


		String userName = request.getParameter(REQUEST_LOGIN_USERNAME);
		String userPass = request.getParameter(REQUEST_LOGIN_USERPASS);
		
		
		try {
			validateUserName(userName);
			validateUserPass(userPass);
			
			Librarian librarian = service.authorizeUser(userName, userPass);	
			
			HttpSession session = request.getSession();
			session.setAttribute(RESPONSE_USER_LOGIN,librarian.getUser().getName());
			
			request.setAttribute(RESPONSE_BOOK_LIST, librarian.getBooks());	
			
		} catch (ValidatorException e) {
			e.printStackTrace();
			return RESPONSE_PAGE_ERROR;
		}
		
		return RESPONSE_PAGE_USER_NAME;
	}

}
