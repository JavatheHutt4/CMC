/**
 * 
 */

/**
 * @author jffritz
 * @version 3/13/16
 */
public class UserHome {
	public DatabaseController databasecontroller;
	private User user;
	/**
	 * Uses the databasecontroller to get all of the users and there information returned un a 2-D 
	 * array of strings 
	 * @return 2-d array of the user and there info
	 */
	public String[][] getAllUsers()
	{
		return databasecontroller.getUsers();
	}
	/*
	 * Searches the database for a user by userName and then returns all of its information
=======
	/**
	 * Searches the database for a user by username and then returns all of its information
	 * @param the username of the user you are searching for
	 * @return the user you searched for
	 */
	public String findByName(String u)
	{
		String[][] index = null; //databasecontroller.user_getUsers();
		
		for(int i = 0; i < index.length; i++)
		{
			for(int j = 0; j < index[i].length; i++)
			{
				if(index[i][j] == u)
				{
					return index[i][1];
				}
			}
		}
		return null;
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
