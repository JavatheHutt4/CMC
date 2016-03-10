/**
 * 
 */

/**
 * @author jcblomquist
 *
 */
public class Admin extends Member {
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String type;
	private String status;
	/**
	 * @param firstName
	 * @param lastName
	 * @param userName
	 * @param password
	 * @param type
	 * @param status
	 */
	public Admin(String firstName, String lastName, String userName, String password, String type, String status) {
		super(firstName, lastName, userName, password, type, status);
	}
	
	/**
	 * Retrieves password for a given Admin
	 * @return String password
	 */
	public getPassword(){
	}
	
	/**
	 * 
	 */
	
}
