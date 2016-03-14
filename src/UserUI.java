/**
 * 
 */

/**
 * @author jffritz
 * @verson 3/13/16
 */
public class UserUI {
	
	private UserHome userhome;
	private User user;
	/**
	 * updates the users info through the user opbject
	 * @param first name
	 * @param last name
	 * @param password
	 */
	public void manageMyProfile(String f, String l, String p)
	{
		user.updateInformation(f,l,p);
	}
	public void search(String sn, String s, String l, String c, String ns, Sting pf, String satv, String satm, String e, String fa, String na, String pa, String pe, String ac, String ss, String qls, String em)
	{
		/*		 * TODO implement search function
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
		/*
		 * lists schools and user is given the option to view or remove the school
		 */
	}
	/**
	 * save school
	 * @param string name of school to be saved
	 */
	public void saveSchool(String s)
	{	
		if(confirmSave())
		{
			user.saveSchool(s);
		}
		else
		{
			System.out.print("Confirmation denied");
		}
	}
	public boolean confirmSave()
	{
		return confirm("Are you sure you want to save the School?")
	}
	/**
	 * Views the specified school
	 * @param the string name of school to be viewed
	 */
	public void viewSpecificSchool(String n)
	{
		user.viewSavedSchool(n);
	}
	public void logOff()
	{
		user.logOff()
	}
	/**
	 * removes saved school
	 * @param school to be removed
	 */
	public void removeSavedSchool(School s)
	{
		if(confirmChanges())
		{ 
			user.removeSavedSchool(s);
		}
		else
		{
			System.out.print("Confirmation denied");
		}
	}
	/**
	 * confirms if user wants to change selected
	 * @return a prompt what confirms the users decision
	 */
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
