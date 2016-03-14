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
<<<<<<< HEAD
	public void deactivateMember(Member m)
=======
	/**
	 * deactivates member
	 * @param name of member to be deactivated
	 */
	public void deactivateMember(String n)
>>>>>>> branch 'master' of https://github.com/JavatheHutt4/CMC.git
	{
		adminHome.deactivateMember(m);
	}
<<<<<<< HEAD
	public void addMember(String f, String l, String u, String p, char s, char t)
=======
	/**
	 * adds new member
	 */
	public void addMember()
>>>>>>> branch 'master' of https://github.com/JavatheHutt4/CMC.git
	{
<<<<<<< HEAD
		adminHome.addNewMember(u,f,l,p,t);
=======
		adminHome.addNewMember(u,f,l,p,t)
	/**
	 * edits member
	 */
>>>>>>> branch 'master' of https://github.com/JavatheHutt4/CMC.git
	}
	public void editMember(String f, String l, String u, String p, char s, char t)
	{
		adminHome.editMemberInformation(f, l, u, p, s, t);
	}
	public void logoff()
	{
		log.logoff();
	}
}
