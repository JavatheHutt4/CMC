/**
 * 
 */

/**
 * @author jcblomquist
 *
 */
public class AdminUI {
	public AdminHome adminHome;
	
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
	public void deactivateMember(String n)
	{
		adminHome.deactivateMember(n);
	}
	public void addMember()
	{
		adminHome.addNewMember(u,f,l,p,t)
	}
	public void editMember()
	{
		
		adminHome.editMemberInformation()
	}
	public void logOff()
	{
		
	}
}
