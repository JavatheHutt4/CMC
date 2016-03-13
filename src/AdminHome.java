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
		databasecontroller.addNewMember(f, l, u, p, t);
	}
	/*
	 *  edits the members info in occordance to the information in the parameters
	 */
	public void editMemberInformation(String f, String l, String u, String p, char t, String s)
	{
		if(t != 'a' || t != 'u' && s != "N" || s != "A"){
			System.out.print("Invalid new member information");
		}
		databasecontroller.editUser(f, l, u, p, t, s);
	}
	}
}
