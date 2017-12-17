package by.epam.library.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import by.epam.library.domain.User;

public interface UserDAO {

	User readUser(String login, String pass);



}
