package CMCPackage;
import java.util.ArrayList;


/**
 * Class to represent a user in the CMC system
 * @author tdrichmond, jrfolkerds
 * @version 3/13/2016
 */
public class User extends Member{
	
	//Access to the UserHome class
	private UserHome uh;
	
	/**
	 * Constructor method for User
	 * @param firstName
	 * @param lastName
	 * @param userName
	 * @param password
	 * @param type
	 * @param status
	 */
	public User(String firstName, String lastName, String userName, String password, char status) {
		super(firstName, lastName, userName, password, 'u', status);
		uh = new UserHome();
	}
	
	/**
	 * Method to update the User's password, first and last name
	 * @param firstname
	 * @param lastname
	 * @param password
	 */
	public void updateInformation(String first, String last, String password){
		this.setFirstName(first);
		this.setLastName(last);
		this.setPassword(password);
	}
	
	/**
	 * Add the specified school to the User's list of saved schools
	 * @param school, the school to be saved
	 */
	public void saveSchool(School school){
		uh.saveSchool(this.getUserName(), school);
	}
	
	/**
	 * Remove a school from the User's list
	 * @param school, the school to be removed
	 */
	public void removeSavedSchool(School school){
		uh.removeSavedSchool(this.getUserName(), school);
	}
		
	/**
	 * View the list of saved schools
	 * @return the list of saved schools
	 */
	public ArrayList<String> getSavedSchools(){
		return uh.getSavedSchools();
	}
	
	/**
	 * View the details of a saved school
	 * @param the saved school
	 * @return the specified saved school
	 */
	public String viewSavedSchool(School school){
		return school.toString();
	}
}
