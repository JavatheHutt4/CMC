package CMCPackage;
import dblibrary.project.csci230.UniversityDBLibrary;


/**
 * This class is the DatabaseController class--the one that will be getting our data from our database.
 * @author jcblomquist
 * @version 3/10/2016
 *
 */
public class DatabaseController {

	public UniversityDBLibrary databaseLibrary;
	public School[][] matchingSchools;
	public String[][] schoolsFromLibrary;
	public String[][] usersFromLibrary;
	
	/**
	 * DatabaseController constructor
	 */
	public DatabaseController(){
		databaseLibrary = new UniversityDBLibrary("javathehut", "javathehut", "jjjt4");
	}
	
	/**
	 * search finds schools that match the desired values of the parameters and returns them to the user
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
	 * @return Schools that matched the search
	 */
	public School[][] search(String name, String state, String location, String control, int numStudents, int perFemale, int satVerbal, int satMath, 
			int expenses, int perFinancial, int numApplicants, int perAdmitted, int perEnrolled, int acadScale, int socialScale, int QOLScale){
		schoolsFromLibrary = databaseLibrary.university_getUniversities();
		for(int i = 0; i < schoolsFromLibrary.length; i++){
		}
		return matchingSchools;
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
	 */
	public int addSchool(String name, String state, String location, String control, int numStudents, int perFemale, int satVerbal, int satMath, 
			int expenses, int perFinancial, int numApplicants, int perAdmitted, int perEnrolled, int acadScale, int socialScale, int QOLScale){
		schoolsFromLibrary = databaseLibrary.university_getUniversities();
		for(int i = 0; i < schoolsFromLibrary.length ; i++){
			if(schoolsFromLibrary[i][0] == name)
				return -1;
			else
				continue;
		}
		databaseLibrary.university_addUniversity(name, state, location, control, numStudents, perFemale, satVerbal, satMath, expenses,
				perFinancial, numApplicants, perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		return 1;
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
			if(usersFromLibrary[i][2] == username)
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
			if(usersFromLibrary[i][2] == username)
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
	
	public String[][] getSchools(){
		schoolsFromLibrary = databaseLibrary.university_getUniversities();
		return schoolsFromLibrary;
	}
	
	public Member findByName(String user){
		for(int i = 0; i < usersFromLibrary.length; i++){
			if(usersFromLibrary[i][2] == user){
				if (usersFromLibrary[i][4].charAt(0) == 'a')
					return new Admin(usersFromLibrary[i][2], usersFromLibrary[i][0], usersFromLibrary[i][1], usersFromLibrary[i][3],'Y');
				else
					return new User(usersFromLibrary[i][2], usersFromLibrary[i][0], usersFromLibrary[i][1], usersFromLibrary[i][3],'Y');
			}
		}
		return null;
	}
}