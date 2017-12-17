package by.epam.library.command.impl.util;

public class RequestParameterValidator {
	
	private RequestParameterValidator( ) {
		
	}
	
	public static void validateUserName(String userName) throws ValidatorException {
		
		if(userName == null || userName.isEmpty()) {
			throw new ValidatorException("Invalid user name");
		}

	}
	
	public static void validateUserPass(String userPass) throws ValidatorException {
		
		if(userPass == null || userPass.isEmpty()) {
			throw new ValidatorException("Invalid pass");
		}

	}


}
