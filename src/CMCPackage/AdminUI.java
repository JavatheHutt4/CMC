package CMCPackage;
/**
 * 
 */

/**
 * AdminUI class, accessed by the agent, used to control the AdminHome class
 * @author jcblomquist
 * @version 03/09/16
 *
 */
public class AdminUI {
	public AdminHome adminHome;
	public LogonController log;
	
	public AdminUI(){
		adminHome = new AdminHome();
		log = new LogonController();
	}
	/**
	 *  pulls up profile and is given the option to edit it 
	*/
	public void manageMyProfile()
	{		
	}
	/**
	 * pulls up saved universities and is given the option to view or edit them
	 */
	public void manageUniversities()
	{
	}
	/**
	 * pulls up list of all users and is given the option to deactivate or edit them
	 */
	public void manageUsers()
	{
	}
	
	/**
	 * deactivates member
	 * @param name of member to be deactivated
	 */
	public void deactivateMember(Member m)
	{
		adminHome.deactivateMember(m);
	}
	
	/**
	 * Adds a new member using the adminHome method addNewMethod
	 * @param first name of member
	 * @param last name of member
	 * @param username of member
	 * @param password of member
	 * @param char representing the status of member
	 * @param char representing the type of member
	 */
	public void addMember(String f, String l, String u, String p, char s, char t){
		adminHome.addNewMember(u,f,l,p,t);
	}
	
	/**
	 * Edits the information of a member
	 * @param first name of member
	 * @param last name of member
	 * @param username of member
	 * @param password of member
	 * @param char representing the status of member
	 * @param char representing the type of member
	 */
	public void editMember(String f, String l, String u, String p, char s, char t)
	{
		adminHome.editMemberInformation(f, l, u, p, s, t);
	}
	
	/**
	 * Runs the logon method from the LogonController class
	 * @param username
	 * @param password
	 */
	public void logon(String user, String pass){
		log.logon(user, pass);
	}
	
	/**
	 * Runs the logoff method from the LogonController class
	 */
	public void logoff()
	{
		log.logoff();
	}
}
