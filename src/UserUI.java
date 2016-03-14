/**
 * 
 */

/**
 * @author tdrichmond
 *
 */
public class UserUI {
	
	private UserHome userHome;
	public LogonController log;
	
	/*
	 * updates the users info through the user object
	 */
	public void manageMyProfile(String f, String l, String p)
	{
		userHome.updateInformation(f,l,p);
	}
	public void search(String sn, String s, String l, String c, String ns, String pf, String satv, String satm, String e, String fa, String na, String pa, String pe, String ac, String ss, String qls, String em)
	{
		/*		 * TODO implement search function
		 */
	}
	public School recommendSchool(School s)
	{
		/*
		 * TODO implement search Function
		 */
		return null;
	}
	public void manageSavedSchools()
	{
		/*
		 * lists schools and user is given the option to view or remove the school
		 */
	}
	/*
	 * save school
	 */
	public void saveSchool(String s)
	{
		userHome.saveSchool(s);
	}
	
	public boolean confirmSave()
	{
		return confirm("Are you sure you want to save the School?")
	}
	
	public void viewSpecificSchool(String n)
	{
		userHome.viewSavedSchool(n);
	}
	
	public void logoff()
	{
		log.logoff();
	}
	/*
	 * removes saved school
	 */
	public void removeSavedSchool(School s)
	{
		userHome.removeSavedSchool(s);
	}
	public boolean confirmChanges()
	{
		return confirm("Are you sure you want to remove School?")
	}
	public void cancelChanges()
	{
		
	}
	public void requestConfirmation()
	{
		
	}
}
