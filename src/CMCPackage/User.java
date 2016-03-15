package CMCPackage;
import java.util.ArrayList;


/**
 * Class to represent a user in the CMC system
 * @author tdrichmond, jrfolkerds
 * @version 3/13/2016
 */
public class User extends Member{
	
	//Access to the database controller
	private DatabaseController db;
	
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
		db = new DatabaseController();
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
	public void saveSchool(String school){
		int i = db.saveSchool(this.getUserName(), school);
		if(i != -1){
			System.out.println("School was successfully saved");
		}
		else{
			System.out.println("School has already been saved");
		}
	}
	
	/**
	 * Remove a school from the User's list
	 * @param school, the school to be removed
	 */
	public void removeSavedSchool(String school){
		int i = db.removeSchool(this.getUserName(), school);
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
	public ArrayList<String> getSavedSchools(){
		ArrayList<String> schools = new ArrayList<String>();
		String[][] all = db.getUsernamesWithSavedSchools();
		for(int i=0;i<all.length;i++){
			if(all[i][0] == this.getUserName()){
				schools.add(all[i][1]);
			}
		}
		return schools;
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
