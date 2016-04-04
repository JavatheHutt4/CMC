package CMCPackage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdminHomeTest {
	AdminHome ah;
	Admin a;
	SchoolHome sh;
	DatabaseController dc;

	@Before
	public void setUp() throws Exception {
		ah = new AdminHome();
		a = new Admin("first", "last", "user", "password", 'Y');
		sh = new SchoolHome();
		dc = new DatabaseController();
	}

	@Test
	public void testDeactivateMember() {
		ah.addNewMember("user", "first", "last", "password", 'u');
		ah.deactivateMember(ah.findByName("user"));
		char expResult = 'N';
		char result = ah.findByName("user").getStatus();
		assertEquals("Member type is " + expResult, expResult, result);
		dc.databaseLibrary.user_deleteUser("user");
	}

	
	@Test
	public void testAddNewMember() {
		String expResult = "f";
		ah.addNewMember("user", "first", "last", "password", 'u');
		ah.editMemberInformation("f", "last", "user", "password", 'u', 'Y');
		String result = ah.findByName("user").getFirstName();
		assertEquals("First name changed to "+ expResult, result, expResult);
		dc.databaseLibrary.user_deleteUser("user");
	}
	@Test
	public void testEditMemberInformationInvalid() {
		char expResult = 'd';
		ah.addNewMember("user", "first", "last", "password", 'u');
		ah.editMemberInformation("f", "last", "user", "password", 'd', 'o');
		char result = ah.findByName("user").getType();
		assertFalse("First name changed to "+ expResult, result==expResult);
		dc.databaseLibrary.user_deleteUser("user");
	}

	
	@Test
	public void testEditUniversity() {
		ah.addUniversity("name", "MINNESOTA", "URBAN", "PRIVATE", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
		ah.editUniversity("name", "OREGON", "URBAN", "PRIVATE", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
		String expResult = "OREGON";
		School s = sh.findByName("name");
		String result = s.getState();
		assertEquals("School state equals" + expResult, result, expResult);
		dc.databaseLibrary.university_deleteUniversity("name");
	}

	@Test
	public void testSetMember() {
		ah.setMember(a);
		Admin expResult = a;
		Admin result = ah.getMember();
		assertEquals("Member is set", result,expResult);
		
	}

	@Test
	public void testGetMember() {
		Admin expResult = null;
		Admin result = ah.getMember();
		assertEquals("It got member", result, expResult);
	}

	@Test
	public void testFindByName() {
		ah.addNewMember("user", "first", "last", "password", 'u');
		Member result = ah.findByName("user");
		assertNotNull("Member was found by name", result);
		dc.databaseLibrary.user_deleteUser("user");
	}

}
