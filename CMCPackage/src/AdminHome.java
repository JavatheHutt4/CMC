/**
 * @author jffritz
 * @version 3/13/3
 */
public class AdminHome {
	// admin object
	public Admin admin;
	// databasecontroller object to access the datbase
	public DatabaseController databasecontroller;

	/**
	 * Deactivates the member by setting its type to "N"
	 * @param member to be deactivated
	 */
	public void deactivateMember(Member m)
	{
		m.deactivateMember();
	}
	/**
	 * adds a new member with all the information provided in the parameter
	 * @param username
	 * @param first name
	 * @param last name
	 * @param password
	 * @param type
	 */
	public void addNewMember(String u, String f, String l, String p, char t)
	{
		if(t != 'a' && t != 'u'){
			System.out.print("Invalid new member information");
		}
		databasecontroller.addNewMember(f, l, u, p, t);
	}
	/*
	 *  edits the members info in accordance to the information in the parameters
	 *  @param first name
	 *  @param last name
	 *  @param username
	 *  @param password
	 *  @param type
	 *  @param status
	 * 
	 */
	public void editMemberInformation(String f, String l, String u, String p, char t, char s)
	{
		if(t != 'a' || t != 'u' && s != 'N' || s != 'A'){
			System.out.print("Invalid new member information");
		}
		databasecontroller.editUser(f, l, u, p, t, s);
	}
}
