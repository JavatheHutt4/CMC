/**
 * 
 */

/**
 * @author tdrichmond
 *
 */
public class UserUI {
	
	private UserHome user;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * updates the users info through the user opbject
	 */
	public void manageMyProfile(String f, String l, String p)
	{
		user.updateInformation(f,l,p);
	}
	public void search(String sn, String s, String l, String c, String ns, Sting pf, String satv, String satm, String e, String fa, String na, String pa, String pe, String ac, String ss, String qls, String em)
	{
		/*
		 * TODO implement search function
		 */
	}
	public School recommendSchool(School s)
	{
		/*
		 * TODO implement search Function
		 */
	}
	public void manageSavedSchools()
	{
		
	}
	/*
	 * save school
	 */
	public void saveSchool(String s)
	{
		user.saveSchool(s);
	}
	public void confirmSave()
	{
		/*
		 * Prompt?
		 */
	}
	public void viewSpecificSchool(String n)
	{
		user.viewSavedSchool(n);
	}
	public void logOff()
	{
		user.logOff()
	}
	/*
	 * removes saved school
	 */
	public void removeSavedSchool(String n)
	{
		user.removeSavedSchool();
	}
	public void confirmChanges()
	{
		
	}
	public void cancelChanges()
	{
		
	}
	public void requestConfirmation()
	{
		
	}
}
