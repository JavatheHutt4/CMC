package CMCPackage; 
import dblibrary.project.csci230.*; 


/**
 * This class is the DatabaseController class--the one that will be getting our data from our database.
 * For any method that is called by the controller classes that needs information from the database,
 * DatabaseController will retrieve that information and pass it along to the desired controller
 * 
 * @author jcblomquist
 * @version 3/10/2016
 *
 */
public class DatabaseController {

	/**
	 * the database library that will be used to retrieve, add, remove, and update information
	 */
	public UniversityDBLibrary databaseLibrary;
	/**
	 * a 2D array of all of the schools from the database
	 */
	public String[][] schoolsFromLibrary;
	/**
	 * a 2D array of all of the users from the database
	 */
	public String[][] usersFromLibrary;
	/**
	 * a 2D array of all of the schools from the database, with their emphasis
	 */
	public String[][] schoolsWithEmphasis;
	/**
	 * a 2D array of all of the usernames with their saved schools
	 */
	public String[][] usernamesWithSavedSchools;
	
	/**
	 * DatabaseController constructor
	 */
	public DatabaseController(){
		databaseLibrary = new UniversityDBLibrary("javathehut", "javathehut", "jjjt4");
	}
	
	/**
	 * addSchool allows a new school to be added to the UniversityDBLibrary. It first checks to see
	 * if there is already a school with that name. If there is, it returns an int value of -1,
	 * implying that the school was not added.
	 * 
	 * @param name
	 * @param state
	 * @param location
	 * @param control
	 * @param numStudents
	 * @param perFemale
	 * @param satVerbal
	 * @param satMath
	 * @param expenses
	 * @param perFinancial
	 * @param numApplicants
	 * @param perAdmitted
	 * @param perEnrolled
	 * @param acadScale
	 * @param socialScale
	 * @param QOLScale
	 * @return 1 if successful, -1 if unsuccessful
	 */
	public int addSchool(String name, String state, String location, String control, int numStudents, int perFemale, int satVerbal, int satMath, 
			int expenses, int perFinancial, int numApplicants, int perAdmitted, int perEnrolled, int acadScale, int socialScale, int QOLScale){
		schoolsFromLibrary = databaseLibrary.university_getUniversities();
		for(int i = 0; i < schoolsFromLibrary.length; i++){
			if(schoolsFromLibrary[i][0].equals(name))
				return -1;
			else
				continue;
		}
		databaseLibrary.university_addUniversity(name, state, location, control, numStudents, perFemale, satVerbal, satMath, expenses,
				perFinancial, numApplicants, perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		return 1;
	}
	/**
	 * editSchool checks to see that a school exists within the database, then updates its information when
	 * it is found. The parameters that will be updated are given by the user.
	 * 
	 * @param name
	 * @param state
	 * @param location
	 * @param control
	 * @param numStudents
	 * @param perFemale
	 * @param satVerbal
	 * @param satMath
	 * @param expenses
	 * @param perFinancial
	 * @param numApplicants
	 * @param perAdmitted
	 * @param perEnrolled
	 * @param acadScale
	 * @param socialScale
	 * @param QOLScale
	 * @return 1 if successful, -1 if unsuccessful
	 */
	public int editSchool(String name, String state, String location, String control, int numStudents, int perFemale, int satVerbal, int satMath, 
			int expenses, int perFinancial, int numApplicants, int perAdmitted, int perEnrolled, int acadScale, int socialScale, int QOLScale){
		schoolsFromLibrary = databaseLibrary.university_getUniversities();
		for(int i = 0; i < schoolsFromLibrary.length; i++){
			if(schoolsFromLibrary[i][0].equals(name)){
				databaseLibrary.university_editUniversity(name, state, location, control, numStudents, perFemale, satVerbal, satMath, expenses,
				perFinancial, numApplicants, perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
				return 1;
			}			
		}
		return -1;
	}
	/**
	 * addNewMember adds a new member to the CMC system. It checks to see if there is already a member
	 * with the desired username- if there is not, the new member is added to the system.
	 * 
	 * @param firstName
	 * @param lastName
	 * @param username
	 * @param password
	 * @param type
	 */
	public void addNewMember(String firstName, String lastName, String username, String password, char type){
		usersFromLibrary = databaseLibrary.user_getUsers();
		for(int i = 0; i < usersFromLibrary.length; i++){
			if(usersFromLibrary[i][2].equals(username))
				return;
			else
				continue;
		}
		databaseLibrary.user_addUser(firstName, lastName, username, password, type);
		
	}
	
	/**
	 * editUser takes information for as user as a parameter from an admin and attempts to update
	 * the information. It first searches for a user with the username, then updates the other information.
	 * It searches for the username because it is uneditable by the admin.
	 *
	 * @param firstName
	 * @param lastName
	 * @param username
	 * @param password
	 * @param type
	 * @param status
	 */
	public void editUser(String firstName, String lastName, String username, String password, char type, char status){
		usersFromLibrary = databaseLibrary.user_getUsers();
		for(int i = 0; i < usersFromLibrary.length; i++){
			if(usersFromLibrary[i][2].equals(username))
				databaseLibrary.user_editUser(username, firstName, lastName, password, type, status);
			else
				continue;
		}
				
	}
	
	/**
	 * getUsers fetches all of the users stored in the database and provides them to the user
	 * 
	 * @return all of the users in the library
	 */
	public String[][] getUsers(){
		usersFromLibrary = databaseLibrary.user_getUsers();
		return usersFromLibrary;
		
	}
	
	/**
	 * getSchools fetches all of the schools stored in the database and provides them to the user
	 * 
	 * @return all of the users in the library
	 */
	public String[][] getSchools(){
		schoolsFromLibrary = databaseLibrary.university_getUniversities();
		return schoolsFromLibrary;
	}
	
	/**
	 * findByName fetches the information for a user based on a userName parameter
	 * 
	 * @param user representing userName to search for
	 * @return Member object of the user found, or null if no member exists
	 */
	public Member findByName(String user){
		usersFromLibrary = databaseLibrary.user_getUsers();
		
		for(int i = 0; i < usersFromLibrary.length; i++){
			if(usersFromLibrary[i][2].equals(user)){
				if (usersFromLibrary[i][4].charAt(0) == 'a')
					return new Admin( usersFromLibrary[i][0], usersFromLibrary[i][1], usersFromLibrary[i][2], usersFromLibrary[i][3],'Y');
				else
					return new User( usersFromLibrary[i][0], usersFromLibrary[i][1],usersFromLibrary[i][2], usersFromLibrary[i][3],'Y');
			}
		}
		return null;
	}
	
	/**
	 * getSchoolsWithEmphases fetches the information for all schools and their emphases
	 * 
	 * @param user representing userName to search for
	 * @return 2D string array with the school emphases
	 */
	public String[][] getSchoolsWithEmphases(){
		schoolsWithEmphasis = databaseLibrary.university_getNamesWithEmphases();
		return schoolsWithEmphasis;
	}

	/**
	 * saveSchool calls the user_saveSchool method from the UniversityDBLibrary class
	 * 
	 * @param userName of the agent
	 * @param school name
	 * @return int representing number of schools added, -1 if the operation failed
	 */
	public int saveSchool(String userName, String school) {
		return databaseLibrary.user_saveSchool(userName,school);
	}

	/**
	 * removeSchool calls the user_removeSchool method from the UniversityDBLibrary class
	 * 
	 * @param userName of the agent
	 * @param school name
	 * @return int representing number of schools removed, -1 if the operation failed
	 */
	public int removeSchool(String userName, String school) {
		return databaseLibrary.user_removeSchool(userName, school);
	}
	
	/**
	 * addUniversityEmphasis adds an emphasis, paired with a school, to the database
	 * @param school
	 * @param emphasis 
	 * @return 1 if successful, -1 if the school/emphasis pair already existed
	 */
	public int addUniversityEmphasis(String school, String emphasis){
		schoolsWithEmphasis = databaseLibrary.university_getNamesWithEmphases();
		for(int i = 0; i < schoolsWithEmphasis.length; i++){
			if(schoolsWithEmphasis[i][0].equals(school) && schoolsWithEmphasis[i][1].equals(emphasis)){
				return -1;
			} 
		}
		databaseLibrary.university_addUniversityEmphasis(school, emphasis);
		return 1;
	}
	
	
	/**
	 * getUsernamesWithSavedSchools fetches a 2d array of the users with their saved schools from the database
	 * @return users with their saved schools
	 */
	 public String[][] getUsernamesWithSavedSchools(){
	 	usernamesWithSavedSchools = databaseLibrary.user_getUsernamesWithSavedSchools();
	 	return usernamesWithSavedSchools; 
	 }
}
