package CMCPackage;

/**
 * SchoolHome class to control the Schools in the CMC system
 * @author jrfolkerds
 * @version 3/13/2016
 */
public class SchoolHome {
	
	public School school;
	//Access to the Database
	public DatabaseController db;

	/**
	 * Constructor method for SchoolHome
	 */
	public SchoolHome(){
		db = new DatabaseController();
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
		db.editSchool(name, state, location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, 
				numApplicants, perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
	}
	
	/**
	 * Method that constructs and returns a school object from the String name of the school
	 * @param the school name as a string
	 * @return the school as a School object
	 */
	public School findByName(String school){
		String[][] all = db.getSchools();
		String[] emphasis;
		for(int i=0;i<all.length();i++){
			if(all[i][0] == school){
				School s = new School(all[i][0], all[i][1], all[i][2], all[i][3], Integer.parseInt(all[i][4]), 
						Integer.parseInt(all[i][5]), Integer.parseInt(all[i][6]), Integer.parseInt(all[i][7]), 
						Integer.parseInt(all[i][8]), Integer.parseInt(all[i][9]), Integer.parseInt(all[i][10]), 
						Integer.parseInt(all[i][11]), Integer.parseInt(all[i][12]), Integer.parseInt(all[i][13]), 
						Integer.parseInt(all[i][14]), Integer.parseInt(all[i][15]), emphasis);
				return s;
			}
		}
	}
	
	/**
	 * Class to return array of all universities
	 * @return a 2d array of every school with all of the school's information
	 */
	public String[][] getAllUniversities(){
		return db.getSchools();
	}
	
}
