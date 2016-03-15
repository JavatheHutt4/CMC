package CMCPackage;

/**
 * UserUI class, accessed by the agent, used to control the UserHome class
 * @author jffritz
 * @version 3/13/16
 */
public class UserUI {
	
	private UserHome userHome;
	private LogonController log;
	
	public UserUI(){
		userHome = new UserHome();
		log = new LogonController();
	}
	
	/*
	 * updates the users info through the user object
	/**
	 * updates the users info through the user object
	 * @param first name
	 * @param last name
	 * @param password
	 */
	public void manageMyProfile(String f, String l, String p)
	{
		//userHome.updateInformation(f,l,p);
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
	/**
	 * save school
	 * @param string name of school to be saved
	 */
	public void saveSchool(String s)
	{
		userHome.saveSchool(s);
	}
	
//	public boolean confirmSave()
//	{
//		return confirm("Are you sure you want to save the School?")
//	}
	
	/**
	 * Views the specified school
	 * @param the string name of school to be viewed
	 */
	public String viewSpecificSchool(String n)
	{
		return n;
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
	
	/**
	 * removes saved school
	 * @param school to be removed
	 */
	public void removeSavedSchool(String s)
	{
		userHome.removeSavedSchool(s);
	}
	/**
	 * confirms if user wants to change selected
	 * @return a prompt what confirms the users decision
	 */
//	public boolean confirmChanges()
//	{
//		return confirm("Are you sure you want to remove School?")
//	}
	public void cancelChanges()
	{
		
	}
	public void requestConfirmation()
	{
		
	}
}
