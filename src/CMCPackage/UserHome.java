package CMCPackage;
/**
 * 
 */

/**
 * @author jffritz
 * @version 3/13/16
 */
public class UserHome {
	public DatabaseController db;
	private User user;
	/**
	 * Uses the db to get all of the users and there information returned un a 2-D 
	 * array of strings 
	 * @return 2-d array of the user and there info
	 */
	public String[][] getAllUsers()
	{
		return db.getUsers();
	}
	/**
	 * Runs the findByName method on db
	 * @param the username of the user you are searching for
	 * @return the user you searched for
	 */
	public Member findByName(String u)
	{
		return db.findByName(u);
	}
	public void viewSavedSchool(School s)
	{
		user.viewSavedSchool(s);
	}
	public void removeSavedSchool(School s)
	{
		user.removeSavedSchool(s);
	}
	
}
