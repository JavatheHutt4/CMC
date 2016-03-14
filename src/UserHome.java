/**
 * 
 */

/**
 * @author tdrichmond
 *
 */
public class UserHome {
	public DatabaseController databasecontroller;
	private User user;
	/*
	 * Uses the databasecontroller to get all of the users and there information returned un a 2-D 
	 * array of strings 
	 */
	public String[][] getAllUsers()
	{
		return databasecontroller.getUsers();
	}
	/*
	 * Searches the database for a user by userName and then returns all of its information
	 */
	public String findByName(String u)
	{
		String[][] index = databasecontroller.user_getUsers();
		
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
