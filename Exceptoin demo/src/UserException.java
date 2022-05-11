
public class UserException extends Throwable
{
	

	public void checkPassword(String password ) throws Exception, Throwable 
	{
		if(password.length()>=8)
	    {
			System.out.println("Valid Password");
	    }
		else
		{
			UserException pe = new UserException(); 
			throw pe;
		}
    }
	
		public static void main(String[] args) throws UserException {
			// TODO Auto-generated method stub
			UserException pe = new UserException();
		try {
			pe.checkPassword("Aa4fghrtrt?");
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Invalid Password....");
		}
		}
}
	


