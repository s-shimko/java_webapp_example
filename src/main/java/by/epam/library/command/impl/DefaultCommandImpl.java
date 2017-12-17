package by.epam.library.command.impl;

import javax.servlet.http.HttpServletRequest;
import static by.epam.library.command.impl.util.RequestParameter.*;

import by.epam.library.command.BaseCommand;

public class DefaultCommandImpl implements BaseCommand {

	@Override
	public String execute(HttpServletRequest request) {
		request.setAttribute(REQUEST_ERROR_MSG, "invalid_action");
		return RESPONSE_PAGE_ERROR;
	}

}
