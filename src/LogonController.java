/**
 * 
 */

/**
 * @author tdrichmond
 *
 */
public class LogonController {

	private Member member;
	/**
	 * 
	 */
	public LogonController() {
		// TODO Auto-generated constructor stub
	}
	public void changePassword (String pass){
		member.setPassword(pass);
	}


}
