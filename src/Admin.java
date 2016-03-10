/**
 * The Admin class represents the Members of the systems that are administrators.
 * @author jcblomquist
 * @version 3/9/2016
 */

public class Admin extends Member {
	public Admin(String firstName, String lastName, String userName, String password, String status) {
		super(firstName, lastName, userName, password, "a", status);
		
	}

}
