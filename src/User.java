import java.util.ArrayList;


/**
 * @author tdrichmond, jrfolkerds
 *
 */
public class User extends Member{
	
	//Arraylist containing the User's saved schools
	ArrayList<School> schools = new ArrayList();
	//First name
	String firstName;
	//Last name
	String lastName;
	//User password
	String password;
	
	
	/**
	 * Constructor method for User
	 * @param firstName
	 * @param lastName
	 * @param userName
	 * @param password
	 * @param type
	 * @param status
	 */
	public User(String firstName, String lastName, String userName, String password, String type, String status) {
		super(firstName, lastName, userName, password, "u", status);
	}
	
	/**
	 * Method to update the User's password, first and last name
	 * 
	 */
	public void updateInformation(String first, String last, String password){
		firstName = first;
		lastName = last;
		password = password;
	}
	
	/**
	 * 
	 */
	public void logOn(String username, String password){
		
	}
	
	/**
	 * 
	 */
	public void logOff()
		
	}	
	
	/**
	 * 
	 */
	public String getFirst(){
		return firstName;
	}
	
	/**
	 * 
	 */
	public String getLast(){
		return lastName;
	}
	
	/**
	 * 
	 */
	public String getPassword(){
		return password;
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
		schools.remove(School);
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
	}
}
