package by.epam.library.service;

import by.epam.library.domain.User;
import by.epam.library.domain.vo.Librarian;

public interface LoginService {
	
	public Librarian authorizeUser(String userName, String userPass);

}
