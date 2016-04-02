
package CMCPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * @author jrfolkerds
 * @version 3/30/2016
 */
public class UserHomeTest {
	private UserHome uh;
	private SchoolHome sh;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		uh = new UserHome();
		sh = new SchoolHome();
	}

	/**
	 * Test method for {@link CMCPackage.UserHome#getAllUsers()}.
	 */
	@Test
	public void testGetAllUsers() {
		int numberOfUsers = uh.getAllUsers().length;
		int expResult = 5;
		assertEquals("The number of users should equal "+expResult,expResult,numberOfUsers);
	}

	/**
	 * Test method for {@link CMCPackage.UserHome#findByName(java.lang.String)}.
	 */
	@Test
	public void testFindByName() {
		Member member = uh.findByName("juser");
		char typeResult = member.getType();
		char expResult = 'u';
		assertEquals("juser is being searched for and a user object should be returned.",expResult,typeResult);
	}
	
	/**
	 * Test method for {@link CMCPackage.UserHome#viewSavedSchool(School)}.
	 */
	@Test
	public void testViewSavedSchool() {
		ArrayList<String> schools = uh.getSavedSchools("juser");
		Member m = uh.findByName("juser");
		uh.setMember(m);
		String school = schools.get(1);
		School s = sh.findByName(school);
		String expResult = s.toString();
		String result = uh.viewSavedSchool(s);
		assertTrue("Viewed school is: " + school,expResult.equals(result));
	}
	
	/**
	 * Test method for {@link CMCPackage.UserHome#removeSavedSchool(java.lang.String)}.
	 */
	@Test
	public void testRemoveSavedSchool() {
		Member m = uh.findByName("juser");
		uh.setMember(m);
		String school = "BARD";
		uh.removeSavedSchool(school);
		ArrayList<String> updatedSchools = uh.getSavedSchools("juser");
		assertFalse("Updated school list is " + updatedSchools,updatedSchools.contains(school));
		uh.saveSchool("BARD");
	}
	
	/**
	 * Test method for {@link CMCPackage.UserHome#getSavedSchools(java.lang.String)}.
	 */
	@Test
	public void testGetSavedSchools() {
		ArrayList<String> schools = uh.getSavedSchools("juser");
		ArrayList<String> expSchools = new ArrayList<String>();
		expSchools.add("ADELPHI");
		expSchools.add("BARD");
		expSchools.add("GEORGETOWN");
		assertTrue("juser's saved schools are: " + schools,schools.equals(expSchools));
	}
	
	/**
	 * Test method for {@link CMCPackage.UserHome#search(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, double, 
	 * double, double, double, double, int, double, double, int, java.lang.Array)}.
	 */
	@Test
	public void testSearch() {
		String[][] search = uh.search("AUGSBURG", "MINNESOTA", "", "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, null, null, null, null, null);
		String[] expSchool = {"AUGSBURG","MINNESOTA","SMALL-CITY","PRIVATE","10000","43","420","490","29991","80","4000","85","50","1","3","4",null,null};
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(expSchool, search[0]));
	}
	
	/**
	 * Test method for {@link CMCPackage.UserHome#recommendSchool(School)}.
	 */
	@Test
	public void testRecommendSchool() {
		School s = sh.findByName("BARD");
		String[][] schools = uh.recommendSchool(s);
		String[] names = new String[5];
		for(int i=0;i<schools.length;i++){
			names[i] = schools[i][0];
		}
		String[] expSchools = {"UNIVERSITY OF THE PACIFIC","CLARKSON UNIVERSITY","MONMOUTH COLLEGE","GEORGE WASHINGTON","BUTLER"};
		assertTrue("Recommended schools are: " + Arrays.toString(names),Arrays.equals(expSchools,names));
	}
	
	/**
	 * Test method for {@link CMCPackage.UserHome#savedSchool(java.lang.String)}.
	 */
	@Test
	public void testSaveSchool() {
		Member m = uh.findByName("juser");
		uh.setMember(m);
		uh.saveSchool("AUGSBURG");
		ArrayList<String> schools = uh.getSavedSchools("juser");
		ArrayList<String> expSchools = new ArrayList<String>();
		expSchools.add("ADELPHI");
		expSchools.add("AUGSBURG");
		expSchools.add("BARD");
		expSchools.add("GEORGETOWN");
		assertTrue("Saved schools are: " + schools, schools.equals(expSchools));
		uh.removeSavedSchool("AUGSBURG");
	}
	
	/**
	 * Test method for {@link CMCPackage.UserHome#setMember(Member)}.
	 */
	@Test
	public void testSetMember() {
		Member m = uh.findByName("juser");
		uh.setMember(m);
		String result = m.toString();
		String expResult = "First name: John\nLast Name: User\nUsername: juser\nPassword: user\nType: u\nStatus: Y";
		assertTrue("Member is: " + result, result.equals(expResult));
	}
	
	/**
	 * Test method for {@link CMCPackage.UserHome#getMember(Member)}.
	 */
	@Test
	public void testGetMember() {
		Member m = uh.findByName("juser");
		uh.setMember(m);
		String result = m.toString();
		String expResult = "First name: John\nLast Name: User\nUsername: juser\nPassword: user\nType: u\nStatus: Y";
		assertTrue("Member is: " + result, result.equals(expResult));
	}
	
	/**
	 * Test method for {@link CMCPackage.UserHome#editUserInfo(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testEditUserInfo() {
		Member m = uh.findByName("juser");
		uh.setMember(m);
		uh.editUserInfo("Jimmy",m.getLastName(),m.getPassword());
		String expFirst = "Jimmy";
		String first = m.getFirstName();
		assertTrue("User's first name is: " + expFirst,expFirst.equals(first));
		uh.editUserInfo("John",m.getLastName(),m.getPassword());
	}
	
	
}
