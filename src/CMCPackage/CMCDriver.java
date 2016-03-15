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
		DatabaseController db = new DatabaseController();
		
		// testing user logon with invalid username and password
		userUI.logon("invalid", "invalid");
		// testing user logon with valid username and password
		userUI.logon("juser", "user");
		
		
		// testing admin logon with invalid username and password
		adminUI.logon("invalid", "invalid");
		// testing admin logon with valid username and password
		adminUI.logon("nadmin", "admin");
	}

}
