import java.util.Arrays;

/**
 * 
 */

/**
 * @author tdrichmond (Jon helped too), jrfolkerds
 *
 */
public class School {
	
	//School name
	private String name;
	//State where the school is located
	private String state;
	//Type of location(urban, rural)
	private String location;
	//Public or private
	private String control;
	//Number of students
	private int numStudents;
	//Percent of female students
	private int perFemale;
	//Average SAT Verbal score
	private int satVerbal;
	//Average SAT Math score
	private int satMath;
	//Tuition
	private int expenses;
	//Percent of students receiving financial aid
	private int perFinancial;
	//Number of applicants annually
	private int numApplicants;
	//Percent of applicants admitted
	private int perAdmitted;
	//Percent of applicants enrolled
	private int perEnrolled;
	//Academic scale 1-5 (5 is best)
	private int acadScale;
	//Social life scale 1-5
	private int socialScale;
	//Quality of life scale 1-5
	private int QOLScale;
	//String array containing the School's emphasis
	private String[] emphasis;
	//Access to the SchoolHome class
	private SchoolHome home;
	
	/**
	 * Constructor method for School
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
	 * @param emphasis
	 */
	public School(String name, String state, String location, String control, int numStudents,
			int perFemale, int satVerbal, int satMath, int expenses, int perFinancial, int numApplicants,  
			int perAdmitted, int perEnrolled, int acadScale, int socialScale, int QOLScale, String[] emphasis){
		this.name = name;
		this.state = state;
		this.location = location;
		this.control = control;
		this.numStudents = numStudents;
		this.perFemale = perFemale;
		this.satVerbal = satVerbal;
		this.satMath = satMath;
		this.expenses = expenses;
		this.perFinancial = perFinancial;
		this.numApplicants = numApplicants;
		this.perEnrolled = perEnrolled;
		this.acadScale = acadScale;
		this.socialScale = socialScale;
		this.QOLScale = QOLScale;
		this.emphasis = emphasis;
	}
	
	/**
	 * Method to set information of existing school
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
	 * @param emphasis
	 */
	public void setInformation(String name, String state, String location, String control, int numStudents,
			int perFemale, int satVerbal, int satMath, int expenses, int perFinancial, int numApplicants,  
			int perAdmitted, int perEnrolled, int acadScale, int socialScale, int QOLScale, String[] emphasis){
		this.name = name;
		this.state = state;
		this.location = location;
		this.control = control;
		this.numStudents = numStudents;
		this.perFemale = perFemale;
		this.satVerbal = satVerbal;
		this.satMath = satMath;
		this.expenses = expenses;
		this.perFinancial = perFinancial;
		this.numApplicants = numApplicants;
		this.perEnrolled = perEnrolled;
		this.acadScale = acadScale;
		this.socialScale = socialScale;
		this.QOLScale = QOLScale;
		this.emphasis = emphasis;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @return the control
	 */
	public String getControl() {
		return control;
	}

	/**
	 * @return the numStudents
	 */
	public int getNumStudents() {
		return numStudents;
	}

	/**
	 * @return the perFemale
	 */
	public int getPerFemale() {
		return perFemale;
	}

	/**
	 * @return the satVerbal
	 */
	public int getSatVerbal() {
		return satVerbal;
	}

	/**
	 * @return the satMath
	 */
	public int getSatMath() {
		return satMath;
	}

	/**
	 * @return the expenses
	 */
	public int getExpenses() {
		return expenses;
	}

	/**
	 * @return the perFinancial
	 */
	public int getPerFinancial() {
		return perFinancial;
	}

	/**
	 * @return the numApplicants
	 */
	public int getNumApplicants() {
		return numApplicants;
	}

	/**
	 * @return the perAdmitted
	 */
	public int getPerAdmitted() {
		return perAdmitted;
	}

	/**
	 * @return the perEnrolled
	 */
	public int getPerEnrolled() {
		return perEnrolled;
	}

	/**
	 * @return the acadScale
	 */
	public int getAcadScale() {
		return acadScale;
	}

	/**
	 * @return the socialScale
	 */
	public int getSocialScale() {
		return socialScale;
	}

	/**
	 * @return the qOLScale
	 */
	public int getQOLScale() {
		return QOLScale;
	}
	
	/**
	 * @return the String array of emphasis'
	 */
	public String[] getEmphasis(){
		return emphasis;
	}

	/**
	 * @return the home
	 */
	public SchoolHome getHome() {
		return home;
	}

	
	/**
	 * Method that returns a String with the School name, state, and location.
	 * @return the school name, date, and location
	 */
	public String viewSchoolDetails(){
		return "Name: " + name + "\tState:"+ state +"\tLocation"+location;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "School [name=" + name + ", state=" + state + ", location=" + location + ", control=" + control
				+ ", numStudents=" + numStudents + ", perFemale=" + perFemale + ", satVerbal=" + satVerbal
				+ ", satMath=" + satMath + ", expenses=" + expenses + ", perFinancial=" + perFinancial
				+ ", numApplicants=" + numApplicants + ", perAdmitted=" + perAdmitted + ", perEnrolled=" + perEnrolled
				+ ", acadScale=" + acadScale + ", socialScale=" + socialScale + ", QOLScale=" + QOLScale + ", emphasis="
				+ Arrays.toString(emphasis) + ", home=" + home + "]";
	}
	
	
	
}
