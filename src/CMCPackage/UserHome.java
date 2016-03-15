package CMCPackage;
import java.util.ArrayList;

/**
 * UserHome class used to control the USer class
 * @author jffritz, jrfolkerds
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
	 * @param the username for the specified user
	 * @param School object that is being searched for
	 */
	public void removeSavedSchool(String s){
		int i = db.removeSchool(user.getUserName(), s);
		if(i != -1){
			System.out.println("School was successfully removed");
		}
		else{
			System.out.println("School is not in saved school list");
		}
	}
	
	/**
	 * View the list of saved schools
	 * @return the list of saved schools
	 */
	public ArrayList<String> getSavedSchools(String username){
		ArrayList<String> schools = new ArrayList<String>();
		String[][] all = db.getUsernamesWithSavedSchools();
		for(int i=0;i<all.length;i++){
			if(all[i][0] == username){
				schools.add(all[i][1]);
			}
		}
		return schools;
	}
	
	/**
	 * Runs the saveSchool method from User class
	 * @param the username for the specified user
	 * @param School object that is being searched for
	 */
	public void saveSchool(String s){
		int i = db.saveSchool(user.getUserName(), s);
		if(i != -1){
			System.out.println("School was successfully saved");
		}
		else{
			System.out.println("School has already been saved");
		}
	}
}
