

/**
 * @author jrfolkerds
 *
 */
public class SchoolHome {
	
	public School school;
	
	public DatabaseController db;

	/**
	 * Constructor method for SchoolHome
	 */
	public SchoolHome(){
		
	}

	/**
	 * Method to add a new university to the system
	 */
	public void addNewUniversity(String name, String state, String location, String control, int numStudents,
			int perFemale, int satVerbal, int satMath, int expenses, int perFinancial, int numApplicants,  
			int perAdmitted, int perEnrolled, int acadScale, int socialScale, int QOLScale){
		db.addSchool(name, state, location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, 
				numApplicants, perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
	}
	
	/**
	 * Method to edit an existing university
	 */
	public void editUniversity(String name, String state, String location, String control, int numStudents,
			int perFemale, int satVerbal, int satMath, int expenses, int perFinancial, int numApplicants,  
			int perAdmitted, int perEnrolled, int acadScale, int socialScale, int QOLScale){
		//db.editSchool(name, state, location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, 
		//		numApplicants, perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
	}
	
	/**
	 * 
	 */
	public School findByName(){
		return school;
	}
	
	/**
	 * Class to return array of all universities
	 */
	public void getAllUniversities(){
		
	}
	
}
