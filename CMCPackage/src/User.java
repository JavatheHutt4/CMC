import java.util.ArrayList;


/**
 * @author tdrichmond, jrfolkerds
 *
 */
public class User extends Member{
	
	//Arraylist containing the User's saved schools
	ArrayList<School> schools = new ArrayList();
	
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
	 * 
	 */
	public void saveSchool(School school){
		schools.add(school);
	}
	
	/**
	 * 
	 */
	public void removeSavedSchool(School school){
		schools.remove(school);
	}
	
		
	/**
	 * 
	 */
	public ArrayList<School> getSavedSchools(){
		return schools;
	}
	
	/**
	 * 
	 */
	public School viewSavedSchool(School school){
		school.viewSchoolDetails();
		return school;
	}
}
