/**
 * 
 */
package CMCPackage;
import static org.junit.Assert.*;
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
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(search[0], expSchool));
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


}


