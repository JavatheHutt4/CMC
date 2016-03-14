/**
 * 
 */

/**
 * @author jcblomquist
 *
 */
public class AdminUI {
	public AdminHome adminHome;
	public LogonController log;
	
	public void manageMyProfile()
	{
		/*
		 *  pulls up profile and is given the option to edit it 
		 */
	}
	public void manageUniversities()
	{
		/*
		 * pulls up saved universities and is given the option to view or edit them
		 */
	}
	public void manageUsers()
	{
		/*
		 * pulls up list of all users and is given the option to deactivate or edit them
		 */
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
	 * adds new member
	 */
	public void addMember(String f, String l, String u, String p, char s, char t){
		adminHome.addNewMember(u,f,l,p,t);
	}
	/**
	 * edits member
	 */
	public void editMember(String f, String l, String u, String p, char s, char t)
	{
		adminHome.editMemberInformation(f, l, u, p, s, t);
	}
	public void logoff()
	{
		log.logoff();
	}
}
