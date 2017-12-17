package by.epam.library.command.impl;

import javax.servlet.http.HttpServletRequest;

import by.epam.library.command.BaseCommand;

public class AddBookCommandImpl implements BaseCommand {

	@Override
	public String execute(HttpServletRequest request) {
		  return RESPONSE_PAGE_ADD_BOOK;
	}

}
