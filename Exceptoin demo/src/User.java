
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordException pe = new PasswordException();
	try {
		pe.checkPassword("Aa1234fgh?");
	} catch (PasswordException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("Invalid Password");
	}
	}

}
