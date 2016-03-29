package CMCPackage;

/**
 * @author jcblomquist
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DatabaseControllerTest {
	DatabaseController db, db1;

	@Before
	public void setUp() throws Exception {
		db = new DatabaseController();
	}

	@Test
	public void testDatabaseController() {
		db1 = new DatabaseController();
		fail("Not yet implemented");
	}

	@Test
	public void testAddSchool() {
		String name = "TEST SCHOOL";
		String state = "MINNESOTA";
		String location = "SUBURBAN";
		String control = "PRIVATE";
		int numStudents = 10000;
		double perFemale = 51.8;
		double satVerbal = 750.66;
		double satMath = 730.23;
		double expenses = 63456.78;
		double perFinancial = 92.8;
		int numApplicants = 38000;
		double perAdmitted = 15.6;
		double perEnrolled = 7.8;
		int acadScale = 5;
		int socialScale = 4;
		int QOLScale = 5;
		int expResult = 1;
		assertEquals("A school is trying to be added. If it succeeds, a 1 will be returned",expResult,db.addSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}

	@Test
	public void testEditSchool() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddNewMember() {
		fail("Not yet implemented");
	}

	@Test
	public void testEditUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUsers() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSchools() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSchoolsWithEmphases() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveSchool() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveSchool() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddUniversityEmphasis() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUsernamesWithSavedSchools() {
		fail("Not yet implemented");
	}

}
