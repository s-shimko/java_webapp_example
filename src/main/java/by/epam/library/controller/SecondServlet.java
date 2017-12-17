package by.epam.library.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SecondServlet() {
        super();
        System.out.println("Second constructor");
    }

	public void init(ServletConfig config) throws ServletException {
        System.out.println("Second init");
	}

	public void destroy() {
        System.out.println("Second destroy");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Second service");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Second do get");
		response.getWriter().println("Second do get ");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Second do post");
		response.getWriter().println("Second do post");
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Second do put");
		response.getWriter().println("Second do put");
	}

}
