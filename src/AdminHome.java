/**
 * 
 */

/**
 * @author jcblomquist
 *
 */
public class AdminHome {
	public Admin admin;
	
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
	public void addNewMember(String u, String f, String l, String p, String t, String s){
		if(t != "a" && t != "u" && s != "Y" && s != "N"){
			System.out.print("Invalid new member information");
		}
			Member member = new Member(f, l, u, p, t, s);
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
