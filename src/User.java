/**
 * 
 */

/**
 * @author tdrichmond
 *
 */
public class User extends Member{
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
	public User(String firstName, String lastName, String userName, String password, String type, String status) {
		super(firstName, lastName, userName, password, type, status);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
