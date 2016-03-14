/**
 * 
 */

/**
 * @author jcblomquist
 *
 */
public abstract class Member {
	/**
	 * String representing first name of the Member
	 */
	private String firstName;
	/**
	 * String representing last name of the Member
	 */
	private String lastName;
	/**
	 * String representing username of the Member
	 */
	private String userName;
	/**
	 * String representing password of the Member
	 */
	private String password;
	/**
	 * char representing type of the Member
	 */
	private char type;
	/**
	 * char representing status of the Member
	 */
	private char status;
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param userName
	 * @param password
	 * @param type
	 * @param status
	 */
	public Member(String firstName, String lastName, String userName, String password, char type, char status) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.type = type;
		this.status = status;
	}
	
	/**
	 * getter for firstName
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * setter for firstName
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * getter for lastName
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * setter for lastName
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * getter for userName
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * setter for userName
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * getter for password
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * setter for password
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * getter for type
	 * @return the type
	 */
	public char getType() {
		return type;
	}
	
	/**
	 * setter for type
	 * @param type the type to set
	 */
	public void setType(char type) {
		this.type = type;
	}
	
	/**
	 * getter for status
	 * @return the status
	 */
	public char getStatus() {
		return status;
	}
	
	/**
	 * setter for status
	 * @param status the status to set
	 */
	public void setStatus(char status) {
		this.status = status;
	}

	
	 /** 
	  * Deactivates the Member by setting its type to 'N'
	   */
	public void deactivateMember() {
		this.type = 'N';
	} 
}