package CMCPackage;

/**
 * UserHome class used to control the USer class
 * @author jffritz
 * @version 3/13/16
 */
public class UserHome {
	
	/**
	 * User object representing the User using interface
	 */
	private User user;
	
	/**
	 * DatabaseController object to access the database
	 */
	public DatabaseController db;
	
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
	
	/**
	 * Runs the viewSavedSchool method from User class
	 * @param School object that is being searched for
	 */
	public void viewSavedSchool(School s)
	{
		user.viewSavedSchool(s);
	}
	
	/**
	 * Runs the removeSavedSchool method from User class
	 * @param School object that is being searched for
	 */
	public void removeSavedSchool(School s)
	{
		user.removeSavedSchool(s);
	}
	
	/**
	 * Runs the saveSchool method from User class
	 * @param School object that is being searched for
	 */
	public void saveSchool(School s)
	{
		user.saveSchool(s);
	}
}
