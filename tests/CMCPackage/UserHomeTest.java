
package CMCPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Ignore;
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

	@Test
	public void testGetAllUsers() {
		int numberOfUsers = uh.getAllUsers().length;
		int expResult = 5;
		assertEquals("The number of users should equal "+expResult,expResult,numberOfUsers);
	}

	@Test
	public void testFindByName() {
		Member member = uh.findByName("juser");
		char typeResult = member.getType();
		char expResult = 'u';
		assertEquals("juser is being searched for and a user object should be returned.",expResult,typeResult);
	}
	
	@Test
	public void testViewSavedSchool() {
		ArrayList<String> schools = uh.getSavedSchools("juser");
		String school = schools.get(1);
		School s = sh.findByName(school);
		String expResult = s.toString();
		String result = uh.viewSavedSchool(s);
		assertEquals("Viewed school is: " + school,expResult.equals(result));
	}
	
	@Test
	public void testRemoveSavedSchool() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetSavedSchools() {
		ArrayList<String> schools = uh.getSavedSchools("juser");
		ArrayList<String> expSchools = new ArrayList<String>();
		expSchools.add("ADELPHI");
		expSchools.add("BARD");
		expSchools.add("GEORGETOWN");
		assertTrue("juser's saved schools are: " + schools,schools.equals(expSchools));
	}
	
	@Test
	public void testSearch() {
		String[][] search = uh.search("AUGSBURG", "MINNESOTA", null, null, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, null, null, null, null, null);
		String[] expSchool = {"AUGSBURG","MINNESOTA","SMALL-CITY","PRIVATE","10000","43","420","490","29991","80","4000","85","50","1","3","4",null,null};
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(expSchool, search[0]));
	}
	
	@Ignore
	@Test
	public void testRecommendSchool() {
		School s = sh.findByName("BARD");
		String[][] schools = uh.recommendSchool(s);
		String[] names = new String[5];
		for(int i=0;i<schools.length;i++){
			names[i] = schools[i][0];
		}
		String[] expSchools = {"CLARKSON UNIVERSITY","UNIVERSITY OF ROCHESTER","COLLEGE OF NEWROCHELLE","SUNY ALBANY","TOURO"};
		assertTrue("Recommended schools are: " + Arrays.toString(names),Arrays.equals(expSchools,names));
	}
	
	@Test
	public void testSaveSchool() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetMember() {
		Member m = uh.findByName("juser");
		m = new User(m.getFirstName(),m.getLastName(),m.getUserName(),m.getPassword(),m.getStatus());
	}
	
	@Test
	public void testGetMember() {
		Member m = uh.findByName("juser");
		m = new User(m.getFirstName(),m.getLastName(),m.getUserName(),m.getPassword(),m.getStatus());
	}
	
	@Test
	public void testEditUserInfo() {
		Member m = uh.findByName("juser");
		m = new User(m.getFirstName(),m.getLastName(),m.getUserName(),m.getPassword(),m.getStatus());
		uh.editUserInfo("Jimmy",m.getLastName(),m.getPassword());
		String expFirst = "Jimmy";
		String first = m.getFirstName();
		assertTrue("User's first name is: " + expFirst,expFirst.equals(first));
	}
	
	
}
