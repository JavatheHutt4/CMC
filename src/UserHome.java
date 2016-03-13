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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * Uses the databasecontroller to get all of the users and there information returned un a 2-D 
	 * array of strings 
	 */
	public String[][] getAllUsers()
	{
		return databasecontroller.user_getUsers();
	}
	/*
	 * Searches the database for a user by username and then returns all of its information
	 */
	public User findByName(String u)
	{
		String[][] index = databasecontroller.user_getUsers();
		
		for(int i = 0; i < index.length; i++)
		{
			for(int j = 0; j < index[i].length; i++)
			{
				if(index[i][j] == u)
				{
					return index[i];
				}
			}
		}
	}
	public void addNewUser()
	{
		/*
		 * 
		 *  TODO
		 */
	}
}
