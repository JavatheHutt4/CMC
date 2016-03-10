/**
 * 
 */

/**
 * @author tdrichmond (Jon helped too)
 *
 */
public class School {
	
	private String name;
	private String state;
	private String location;
	private String control;
	private int numStudents;
	private int perFemale;
	private int satVerbal;
	private int satMath;
	private int expenses;
	private int perFinancial;
	private int numApplicants;
	private int perAdmitted;
	private int perEnrolled;
	private int acadScale;
	private int socialScale;
	private int QOLScale;
	private SchoolHome home;
	
	private School(String name, String state, String location, String control, int numStudents,
			int perFemale, int satVerbal, int satMath, int expenses, int perFinancial, int numApplicants,  
			int perAdmitted, int perEnrolled, int acadScale, int socialScale, int QOLScale){
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
	}
	
	public String viewSchoolDetails(School s){
		return "Name: " + name + "\tState:"+ state +"\tLocation"+location
	}
	
	
	
}
