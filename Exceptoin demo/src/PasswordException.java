public class PasswordException extends Exception {
	
	public void checkPassword(String password, PasswordException pe2) throws PasswordException
	{
		
		String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
	    char currentCharacter;
	    boolean numberPresent = false;
	    boolean upperCasePresent = false;
	    boolean lowerCasePresent = false;
	    boolean specialCharacterPresent = false;
	    boolean validPass = false;
	    if(password.length()>=8)
	    {
	    for (int i = 0; i < password.length(); i++) {
	        currentCharacter = password.charAt(i);
	        if (Character.isDigit(currentCharacter)) {
	            numberPresent = true;
	        } else if (Character.isUpperCase(currentCharacter)) {
	            upperCasePresent = true;
	        } else if (Character.isLowerCase(currentCharacter)) {
	            lowerCasePresent = true;
	        } else if (specialChars.contains(String.valueOf(currentCharacter))) {
	            specialCharacterPresent = true;
	        }
	    }
	    }
	    
	    if (numberPresent && upperCasePresent && lowerCasePresent && specialCharacterPresent) 
	    	validPass = true;
	    else
	    	validPass = false;
	    
		if (validPass == true )
				System.out.println("Ok, Valid Password");	
		else
		{
			PasswordException pe = new PasswordException(); 
			throw pe;
		}
	}

}