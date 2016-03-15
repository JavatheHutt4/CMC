package CMCPackage;
/**
 * AdminHome class used to control the Admin class
 * @author jffritz
 * @version 3/13/3
 */
public class AdminHome {
	
	/**
	 * Admin object representing the admin using interface
	 */
	public Admin admin;

	/**
	 * DatabaseController object to access the database
	 */
	public DatabaseController db;

	
	public AdminHome(){
		db = new DatabaseController();
	}
	/**
	 * Deactivates the member by setting its type to "N"
	 * @param member to be deactivated
	 */
	public void deactivateMember(Member m)
	{
		db.editUser(m.getFirstName(), m.getLastName(), m.getUserName(), m.getPassword(), m.getType(), 'N');
	}
	/**
	 * adds a new member with all the information provided in the parameter
	 * @param username
	 * @param first name
	 * @param last name
	 * @param password
	 * @param type
	 */
	public void addNewMember(String u, String f, String l, String p, char t)
	{
		if(t != 'a' && t != 'u'){
			System.out.print("Invalid new member information");
		}
		db.addNewMember(f, l, u, p, t);
	}
	
	/**
	 * edits the members info in accordance to the information in the parameters
	 *  @param first name
	 *  @param last name
	 *  @param username
	 *  @param password
	 *  @param type
	 *  @param status
	 */
	public void editMemberInformation(String f, String l, String u, String p, char t, char s)
	{
		if((t != 'a' && t != 'u') || (s != 'N' && s != 'Y')){
			System.out.print("Invalid new member information");
		}
		db.editUser(f, l, u, p, t, s);
	}
	
	public void addUniversity(String name, String state, String location, String control, int numStudents, int perFemale, int satVerbal, int satMath, 
			int expenses, int perFinancial, int numApplicants, int perAdmitted, int perEnrolled, int acadScale, int socialScale, int QOLScale)
	{
		db.addSchool(name, state, location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants, perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
	}
	
	public void editUniversity(String name, String state, String location, String control, int numStudents, int perFemale, int satVerbal, int satMath, 
			int expenses, int perFinancial, int numApplicants, int perAdmitted, int perEnrolled, int acadScale, int socialScale, int QOLScale)
	{
		db.editSchool(name, state, location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants, perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
	}
	/**
	 * sets the instance of the Admin to the logged on user
	 */
	public void setMember(Member member) {
		this.admin = (Admin) member;
	}
	
	public Admin getMember(){
		return admin;
	}
	
	/**
	 * Runs the findByName method on db
	 * @param the username of the user you are searching for
	 * @return the user you searched for
	 */
	public Member findByName(String u)
	{
		return db.findByName(u);
	}
}