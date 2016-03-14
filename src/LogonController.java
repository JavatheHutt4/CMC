/**
 * 
 */

/**
 * @author tdrichmond
 *
 */
public class LogonController {

	private Member member;
	private DatabaseController DB;
	/**
	 * 
	 */
	public LogonController() {
		// TODO Auto-generated constructor stub
	}
	public void changePassword (String pass){
		member.setPassword(pass);
	}
	public void logon(String user, String pass){
		Member temp = DB.findByName(user);
		if (DB.isValid(user, pass)){
			member = temp;
			System.out.println("Logon Successful");
		}
	}
	public void logoff(){
		member = null;
		System.out.println("Log Off Successful");
	}
	

}
