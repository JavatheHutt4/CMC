package CMCPackage;

/**
 * @author jcblomquist
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DatabaseControllerTest {
	DatabaseController db;

	@Before
	public void setUp() throws Exception {
		db = new DatabaseController();
	}

	@Test
	public void testAddSchoolSuccess() { //all fields must be valid
		db.databaseLibrary.university_deleteUniversity("TEST_SCHOOL");
		String name = "TEST_SCHOOL";
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
	public void testAddSchoolNameFailure() {
		String name = "GEORGETOWN"; //school name is already used
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
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 5;
		int expResult = -1;
		assertEquals("A school is trying to be added. If it fails, a -1 will be returned",expResult,db.addSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}
	
	@Test
	public void testAddSchoolLocationFailure() {
		String name = "TEST SCHOOL";
		String state = "MINNESOTA";
		String location = "CHUCK_E_CHEESE"; //invalid location
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
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 5;
		int expResult = -1;
		assertEquals("A school is trying to be added. If it fails, a -1 will be returned",expResult,db.addSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}
	
	@Test
	public void testAddSchoolControlFailure() {
		String name = "TEST SCHOOL";
		String state = "MINNESOTA";
		String location = "SUBURBAN";
		String control = "TACOS"; //invalid control
		int numStudents = 10000;
		double perFemale = 51.8;
		double satVerbal = 750.66;
		double satMath = 730.23;
		double expenses = 63456.78;
		double perFinancial = 92.8;
		int numApplicants = 38000;
		double perAdmitted = 15.6;
		double perEnrolled = 7.8;
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 5;
		int expResult = -1;
		assertEquals("A school is trying to be added. If it fails, a -1 will be returned",expResult,db.addSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}
	
	@Test
	public void testAddSchoolNumStudentsFailure() {
		String name = "TEST SCHOOL";
		String state = "MINNESOTA";
		String location = "SUBURBAN";
		String control = "PRIVATE";
		int numStudents = -2; //invalid number of Students
		double perFemale = 51.8;
		double satVerbal = 750.66;
		double satMath = 730.23;
		double expenses = 63456.78;
		double perFinancial = 92.8;
		int numApplicants = 38000;
		double perAdmitted = 15.6;
		double perEnrolled = 7.8;
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 5;
		int expResult = -1;
		assertEquals("A school is trying to be added. If it fails, a -1 will be returned",expResult,db.addSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}
	
	@Test
	public void testAddSchoolPerFemaleFailure() {
		String name = "TEST SCHOOL";
		String state = "MINNESOTA";
		String location = "SUBURBAN";
		String control = "PRIVATE";
		int numStudents = 10000;
		double perFemale = 101.8; //invalid percent Female
		double satVerbal = 750.66;
		double satMath = 730.23;
		double expenses = 63456.78;
		double perFinancial = 92.8;
		int numApplicants = 38000;
		double perAdmitted = 15.6;
		double perEnrolled = 7.8;
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 5;
		int expResult = -1;
		assertEquals("A school is trying to be added. If it fails, a -1 will be returned",expResult,db.addSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}
	
	@Test
	public void testAddSchoolsatVerbalFailure() {
		String name = "TEST SCHOOL";
		String state = "MINNESOTA";
		String location = "SUBURBAN";
		String control = "PRIVATE";
		int numStudents = 10000;
		double perFemale = 51.8;
		double satVerbal = 880; // invalid satVerbal
		double satMath = 730.23;
		double expenses = 63456.78;
		double perFinancial = 92.8;
		int numApplicants = 38000;
		double perAdmitted = 15.6;
		double perEnrolled = 7.8;
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 5;
		int expResult = -1;
		assertEquals("A school is trying to be added. If it fails, a -1 will be returned",expResult,db.addSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}
	
	@Test
	public void testAddSchoolFailure7() {
		String name = "TEST SCHOOL";
		String state = "MINNESOTA";
		String location = "SUBURBAN";
		String control = "PRIVATE";
		int numStudents = 10000;
		double perFemale = 51.8;
		double satVerbal = 750.66;
		double satMath = 801; //invalid satMath
		double expenses = 63456.78;
		double perFinancial = 92.8;
		int numApplicants = 38000;
		double perAdmitted = 15.6;
		double perEnrolled = 7.8;
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 5;
		int expResult = -1;
		assertEquals("A school is trying to be added. If it fails, a -1 will be returned",expResult,db.addSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}
	
	@Test
	public void testAddSchoolFailure8() {
		String name = "TEST SCHOOL";
		String state = "MINNESOTA";
		String location = "SUBURBAN";
		String control = "PRIVATE";
		int numStudents = 10000;
		double perFemale = 51.8;
		double satVerbal = 750.66;
		double satMath = 730.23;
		double expenses = -4.5; //invalid expenses
		double perFinancial = 92.8;
		int numApplicants = 38000;
		double perAdmitted = 15.6;
		double perEnrolled = 7.8;
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 5;
		int expResult = -1;
		assertEquals("A school is trying to be added. If it fails, a -1 will be returned",expResult,db.addSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}
	
	@Test
	public void testAddSchoolFailure9() {
		String name = "TEST SCHOOL";
		String state = "MINNESOTA";
		String location = "SUBURBAN";
		String control = "PRIVATE";
		int numStudents = 10000;
		double perFemale = 51.8;
		double satVerbal = 750.66;
		double satMath = 730.23;
		double expenses = 63456.78;
		double perFinancial = 605.3; //invalid percent Financial aid
		int numApplicants = 38000;
		double perAdmitted = 15.6;
		double perEnrolled = 7.8;
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 5;
		int expResult = -1;
		assertEquals("A school is trying to be added. If it fails, a -1 will be returned",expResult,db.addSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}
	
	@Test
	public void testAddSchoolFailure10() {
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
		int numApplicants = -5; //invalid number of Applicants
		double perAdmitted = 15.6;
		double perEnrolled = 7.8;
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 5;
		int expResult = -1;
		assertEquals("A school is trying to be added. If it fails, a -1 will be returned",expResult,db.addSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}
	
	@Test
	public void testAddSchoolFailure11() {
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
		double perAdmitted = -18.6; //invalid percent admitted
		double perEnrolled = 7.8;
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 5;
		int expResult = -1;
		assertEquals("A school is trying to be added. If it fails, a -1 will be returned",expResult,db.addSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}
	
	@Test
	public void testAddSchoolFailure12() {
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
		double perEnrolled = 101.3; //invalid percent enrolled
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 5;
		int expResult = -1;
		assertEquals("A school is trying to be added. If it fails, a -1 will be returned",expResult,db.addSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}
	
	@Test
	public void testAddSchoolFailure13() {
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
		int acadScale = 6; //invalid academic scale
		int socialScale = 4;
		int QOLScale = 5;
		int expResult = -1;
		assertEquals("A school is trying to be added. If it fails, a -1 will be returned",expResult,db.addSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}
	
	@Test
	public void testAddSchoolFailure14() {
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
		int acadScale = 4; 
		int socialScale = 0; //invalid social scale
		int QOLScale = 5;
		int expResult = -1;
		assertEquals("A school is trying to be added. If it fails, a -1 will be returned",expResult,db.addSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}
	
	@Test
	public void testAddSchoolFailure15() {
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
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 8; //invalid QOL scale
		int expResult = -1;
		assertEquals("A school is trying to be added. If it fails, a -1 will be returned",expResult,db.addSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}


	@Test
	public void testEditSchoolSuccess() {
		String name = "GEORGETOWN";
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
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 4; 
		int expResult = -1;
		assertEquals("A school is trying to be edited. If the name matches and entry and the paramenters are valid"
				+ ", a 1 will be returned",expResult,db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale));
	}

	@Test
	public void testAddNewMemberSuccess() {
		String firstName = "Jon";
		String lastName = "Blomquist";
		String username = "jcblomquist";
		String password = "user";
		char type = 'a';
		int expResult = 1;
		assertEquals("A member is trying to be added. If it succeeds, a 1 will be returned",expResult,
				db.addNewMember(firstName, lastName, username, password, type));
		firstName = "Master";
		lastName = "Yoda";
		username = "jediYoda";
		password = "userYoda";
		type = 'u';
		assertEquals("Trying to be added, member is. 1 returned, if succeeds.",expResult,
				db.addNewMember(firstName, lastName, username, password, type));
	}
	
	@Test
	public void testAddNewMemberUsernameFailure() {
		String firstName = "Jon";
		String lastName = "Blomquist";
		String username = "jcblomquist";
		String password = "user";
		char type = 'v';
		int expResult = -1;
		assertEquals("A member is trying to be added. If the type is invalid, a -1 will be returned",expResult,
				db.addNewMember(firstName, lastName, username, password, type));
	}
	
	@Test
	public void testAddNewMemberTypeFailure() {
		String firstName = "Jon";
		String lastName = "Blomquist";
		String username = "juser";
		String password = "user";
		char type = 'a';
		int expResult = -1;
		assertEquals("A member is trying to be added. If the type is invalid, a -1 will be returned",expResult,
				db.addNewMember(firstName, lastName, username, password, type));
	}

	@Test
	public void testEditUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUsers() {
		int numberOfUsers = db.getUsers().length;
		int expResult = 5;
		assertEquals("The number of users should equal "+expResult,expResult,numberOfUsers);
	}

	@Test
	public void testGetSchools() {
		int numberOfSchools = db.getSchools().length;
		int expResult = 100;
		assertEquals("The number of schools should equal "+expResult,expResult,numberOfSchools);
	}

	@Test
	public void testFindByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSchoolsWithEmphases() {
		int schoolsWithEmphases = db.getSchoolsWithEmphases().length;
		int expResult = 200;
		assertEquals("The number of pairs of schools with emphases should equal "+expResult,expResult,schoolsWithEmphases);
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
