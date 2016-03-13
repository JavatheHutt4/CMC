/**
 * 
 */

/**
 * @author tdrichmond
 *
 */
public class LogonController {

	private Member member;
	private MemberHome memberHome;
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
		Member temp = memberHome.findByName(user);
		if (temp.isValid())
		member = temp;
	}

}
