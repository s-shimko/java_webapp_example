package by.epam.library.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.epam.library.command.BaseCommand;

import static by.epam.library.command.CommandChooser.*;


public class LibraryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String ACTION = "action";

	public LibraryServlet() {
		super();
		System.out.println("LibServlet Constructor");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init");
	}

	public void destroy() {
		super.destroy();
		System.out.println("LibServlet Destroy");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		super.service(req, res);
		System.out.println("Libservlet Service");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String userAction = request.getParameter(ACTION);
		BaseCommand command = defineCommand(userAction);
		String path = command.execute(request);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
		requestDispatcher.forward(request, response);

//		String userName = request.getParameter("param1");
//		String surName = request.getParameter("param2");
//		
//		System.out.println("First do get");
//		response.getWriter().println("<H1>First Servlet: do get " + "<p><span style=\"color: red; font-size: 2em\">" + userName + " " + surName + "</span></p></H1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("do post");
		response.getWriter().println("First Servlet: do post ");
	}

}
