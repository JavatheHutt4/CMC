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
		userUI.logon("invalid", "invalid");
		userUI.logon("juser", "user");
		adminUI.logon("invalid", "invalid");
		adminUI.logon("nadmin", "admin");
	}

}
