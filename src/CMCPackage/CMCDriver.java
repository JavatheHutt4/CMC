package CMCPackage;

/**
 * driver class for the CMC project to demonstrate its uses
 * @author tdrichmond
 * @version 03/14/16
 *
 */
public class CMCDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AdminUI adminUI = new AdminUI();
		UserUI userUI = new UserUI();
		
		System.out.println("********************************Tests for user agent uses********************************");
		// testing user logon with invalid username and password
		userUI.logon("invalid", "invalid");
		// testing user logon with valid username and password
		userUI.logon("juser", "user");
		//prints the info for current user
		System.out.println(userUI.viewMemberInfo());
		
		System.out.println("\n********************************Tests for admin agent uses********************************");
		// testing admin logon with invalid username and password
		adminUI.logon("invalid", "invalid");
		// testing admin logon with valid username and password
		adminUI.logon("nadmin", "admin");
		System.out.println(adminUI.viewMemberInfo());
	}

}
