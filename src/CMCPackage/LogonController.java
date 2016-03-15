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
		DB = new DatabaseController();
	}
	
	/**
	 * Changes the password of the logged on member
	 * @param String password
	 */
	public void changePassword (String pass){
		member.setPassword(pass);
	}
	
	/**
	 * logs on a user with the userName and password passed as parameters
	 * @param String user
	 * @param String password
	 */
	public void logon(String user, String pass){
		Member temp = DB.findByName(user);
		if (temp != null){
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
	public String toString(){
		if (member.equals(null))
			return "No member is currently logged on.";
		return "The Member currently logged in is user " +member.getUserName();
	}

}
