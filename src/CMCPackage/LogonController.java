package CMCPackage;
/**
 * 
 */

/**
 * LogonController class to make changes to a member object and it's login status
 * @author tdrichmond
 * @version 
 */
public class LogonController {

	/**
	 * Member which is currently logged in
	 */
	private Member member;
	
	/**
	 * DatabaseController to access the user information
	 */
	private DatabaseController DB;
	
	/**
	 * Constructor for a LogonController
	 */
	public LogonController() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Changes the password of the logged on member
	 * @param String password
	 */
	public void changePassword (String pass){
		member.setPassword(pass);
	}
	
	/**
	 * logs on a user with the username and password passed as parameters
	 * @param String user
	 * @param String password
	 */
	public void logon(String user, String pass){
		Member temp = null; //DB.findByName(user);
		if (DB.isValid(user, pass)){
			member = temp;
			System.out.println("Logon Successful");
		}
		else
			System.out.println("Logon unsuccessful");
	}
	
	/**
	 * logs off any member who is currently logged on, and returns them to the logon screen
	 */
	public void logoff(){
		member = null;
		System.out.println("Log Off Successful");
	}
	

}
