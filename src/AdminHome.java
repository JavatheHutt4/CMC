/**
 * 
 */

/**
 * @author jcblomquist
 *
 */
public class AdminHome {
	public Admin admin;
	public DatabaseController databasecontroller;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Deactivates the member by setting its type to "N"
	 */
	public void deactivateMember(Member m)
	{
		m.deactivateMember();
	}
	/*
	 * adds a new member with all the information provided in the parameter
	 */
	public void addNewMember(String u, String f, String l, String p, char t,){
		if(t != 'a' && t != 'u'){
			System.out.print("Invalid new member information");
		}
		databasecontroller.user_addUser(f, l, u, p, t);
	}
	/*
	 *  edits the members info in occordance to the information in the parameters
	 */
	public void editMemberInformation(String f, String l, String u, String p, String t, String s){
		this.setFirstName(f);
		this.setLastName(l);
		this.setUserName(u);
		this.setPassword(p);
		this.setType(t);
		this.setStatus(s);
	}
}
