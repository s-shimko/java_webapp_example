package by.epam.library.command;

import by.epam.library.command.impl.AddBookCommandImpl;
import by.epam.library.command.impl.DefaultCommandImpl;
import by.epam.library.command.impl.LoginCommandImpl;
import by.epam.library.command.impl.SaveBookCommandImpl;

public final class CommandChooser {

	private CommandChooser() {

	}

	public static BaseCommand defineCommand(String action) {

		BaseCommand command = null;
		switch (action) {

		case "login":
			command = new LoginCommandImpl();
			break;

		case "add_book":
			command = new AddBookCommandImpl();
			break;
			
		case "save_book":
			command = new SaveBookCommandImpl();
			break;

		default:
			command = new DefaultCommandImpl();
			break;

		}
		return command;
	}

}
