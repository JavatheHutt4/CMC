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
	
	/**
	 * AdminHome object to be used by UI
	 */
	public AdminHome adminHome;
	
	/**
	 * LogonController object to manage Member and the login status
	 */
	public LogonController log;
	
	/**
	 * AdminUI constructor to create both AdminHome and LogonController instances
	 */
	public AdminUI(){
		adminHome = new AdminHome();
		log = new LogonController();
	}
	
	/**
	 * pulls up saved universities and is given the option to view or edit them
	 */
	public void editUniversity(String f, String l, String u, String p, char t, char s){
		
	}
	
	/**
	 * pulls up list of all users and is given the option to deactivate or edit them
	 */
	public void editUser(String f, String l, String u, String p, char t, char s){
		adminHome.editMemberInformation(f, l, u, p, t, s);
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
		adminHome.setMember(log.logon(user, pass));
	}
	
	/**
	 * Runs the logoff method from the LogonController class
	 */
	public void logoff()
	{
		log.logoff();
		adminHome.setMember(null);
	}
}
