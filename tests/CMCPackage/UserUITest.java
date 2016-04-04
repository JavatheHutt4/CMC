/**
 * 
 */
package CMCPackage;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jffritz
 *
 */
public class UserUITest {
	UserUI ui;
	UserHome uh;
	DatabaseController dc;
	SchoolHome sh;
	User u;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ui = new UserUI();
		uh = new UserHome();
		dc = new DatabaseController();
		sh = new SchoolHome();
		
	}

	
	/**
	 * Test method for {@link CMCPackage.UserUI#search(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testSearch() {
		String[][] search = ui.search("AUGSBURG", "MINNESOTA", "", "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, null, null, null, null, null);
		String[] expSchool = {"AUGSBURG","MINNESOTA","SMALL-CITY","PRIVATE","10000","43","420","490","29991","80","4000","85","50","1","3","4",null,null};
		assertNull("Search results are: " + Arrays.toString(search),search);
	}

	/**
	 * Test method for {@link CMCPackage.UserUI#recommendSchool(CMCPackage.School)}.
	 */
	@Test
	public void testRecommendSchool() {
		String[][] result = ui.recommendSchool(sh.findByName("BARD"));
		assertNotNull("Related Schools to BARD",result);
	}

	/**
	 * Test method for {@link CMCPackage.UserUI#manageMyProfile(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testManageMyProfile() {
		Member m = uh.findByName("juser");
		uh.setMember(m);
		String expResult = "jim";
		ui.manageMyProfile("jim", "user", "user");
		String result = uh.findByName("user").getFirstName();
		assertEquals("First name changed to" + result ,result,expResult);
		ui.manageMyProfile("john", "user", "user");
		
	}
	/**
	 * Test method for {@link CMCPackage.UserUI#viewSavedSchools()}.
	 */
	@Test
	public void testViewSavedSchools() {
		Member m = uh.findByName("juser");
		uh.setMember(m);
		ui.logon("juser", "password");
		ArrayList<String> result = ui.viewSavedSchools();
		assertNotNull("viewSavedSchools returns a not null value",result);
	}

	/**
	 * Test method for {@link CMCPackage.UserUI#saveSchool(java.lang.String)}.
	 */
	@Test
	public void testSaveSchool() {
		
	}

	/**
	 * Test method for {@link CMCPackage.UserUI#viewSpecificSchool(java.lang.String)}.
	 */
	@Test
	public void testViewSpecificSchool() {
		School result = ui.viewSpecificSchool("BARD");
		assertNotNull("It view specific school",result);
	}

	/**
	 * Test method for {@link CMCPackage.UserUI#logon(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testLogon() {
		Member m = uh.findByName("juser");
		uh.setMember(m);
		ui.logon("juser", "password");
		Member result = uh.getMember();
		assertNotNull("seabass",result);
		ui.logoff();
	}

	/**
	 * Test method for {@link CMCPackage.UserUI#logoff()}.
	 */
	@Test
	public void testLogoff() {
		
		ui.logon("juser", "password");
		Member result = uh.getMember();
		ui.logoff();
		assertNull("seabass",result);
		
	}

	/**
	 * Test method for {@link CMCPackage.UserUI#removeSavedSchool(java.lang.String)}.
	 */
	@Test
	public void testRemoveSavedSchool() {
		
	}

	/**
	 * Test method for {@link CMCPackage.UserUI#getLog()}.
	 */
	@Test
	public void testGetLog() {
		LogonController result = ui.getLog();
		assertNotNull("It got LogonController",result);
	}

	/**
	 * Test method for {@link CMCPackage.UserUI#getUserHome()}.
	 */
	@Test
	public void testGetUserHome() {
		UserHome result = ui.getUserHome();
		assertNotNull("It got user home", result);
	}

	/**
	 * Test method for {@link CMCPackage.UserUI#viewMemberInfo()}.
	 */
	@Test
	public void testViewMemberInfo() {
		Member m = uh.findByName("juser");
		uh.setMember(m);
		ui.logon("juser", "password");
		String result = ui.viewMemberInfo();
		assertNotNull("seabass",result);
	}
}


