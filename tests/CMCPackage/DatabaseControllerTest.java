package CMCPackage;

/**
 * @author jcblomquist
 */

import static org.junit.Assert.*;

import org.junit.Before;
//import org.junit.Ignore;
import org.junit.Test;

public class DatabaseControllerTest {
	DatabaseController db;

	@Before
	public void setUp() throws Exception {
		db = new DatabaseController();
	}

	//ADDSCHOOL TESTS ***DONE***
	
	@Test
	public void testAddSchoolSuccess() { //all fields must be valid
		String name = "AAATESTSCHOOL";
		String state = "MINNESOTA";
		String location = "SUBURBAN";
		String control = "STATE";
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
		int result = db.addSchool(name, state, location, control, numStudents, perFemale, satVerbal, satMath, 
				expenses, perFinancial, numApplicants, perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		db.databaseLibrary.university_deleteUniversity("AAATESTSCHOOL");
		assertEquals("A school is trying to be added. If it succeeds, a 1 will be returned",expResult,result);
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
	public void testAddSchoolStateFailure() {
		String name = "TEST SCHOOL";
		String state = "MANITOBA"; //school state is invalid
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
	public void testAddSchoolsatMathFailureFailure() {
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
	public void testAddSchoolExpensesFailure() {
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
	public void testAddSchoolPerFinancialFailure() {
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
	public void testAddSchoolNumApplicantsFailure() {
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
	public void testAddSchoolPerAdmittedFailure() {
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
	public void testAddSchoolPerEnrolledFailure() {
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
	public void testAddSchoolAcadScaleFailure() {
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
	public void testAddSchoolSocialScaleFailure() {
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
	public void testAddSchoolQOLScaleFailure() {
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

	//EDITSCHOOL TESTS
	
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
		int expResult = 1;
		//result is stored for testing
		int result = db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		//information is changed back
		state = "DISTRICT OF COLUMBIA";
		location = "URBAN";
		control = "PRIVATE";
		numStudents = 15000;
		perFemale = 45;
		satVerbal = 620;
		satMath = 635;
		expenses = 27951;
		perFinancial = 30;
		numApplicants = 8500;
		perAdmitted = 30;
		perEnrolled = 10;
		acadScale = 4;
		socialScale = 4;
		QOLScale = 4;
		db.editSchool(name, state, location, control, numStudents, perFemale, satVerbal, satMath, expenses,
				perFinancial, numApplicants, perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		assertEquals("A school is trying to be edited. If the name matches and entry and the paramenters are valid"
				+ ", a 1 will be returned",expResult,result);
		
				
	}

	
	@Test
	public void testEditSchoolStateFailure() {
		String name = "GEORGETOWN";
		String state = "MANITOBA"; //invalid state
		String location = "URBAN";
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
		int result = db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		assertEquals("A school is trying to be edited improperly--a -1 will be returned",expResult,result);
	}
	
	@Test
	public void testEditSchoolLocationFailure() {
		String name = "GEORGETOWN";
		String state = "MINNESOTA";
		String location = "UNDERWATER"; //invalid location
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
		int result = db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		assertEquals("A school is trying to be edited improperly--a -1 will be returned",expResult,result);
	}
	
	@Test
	public void testEditSchoolControlFailure() {
		String name = "GEORGETOWN";
		String state = "MINNESOTA";
		String location = "URBAN";
		String control = "RAHALCORP"; //invalid control
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
		int result = db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		assertEquals("A school is trying to be edited improperly--a -1 will be returned",expResult,result);
	}
	
	@Test
	public void testEditSchoolNumStudentsFailure() {
		String name = "GEORGETOWN";
		String state = "MINNESOTA";
		String location = "URBAN";
		String control = "PRIVATE";
		int numStudents = -2; //invalid number of students
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
		int result = db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		assertEquals("A school is trying to be edited improperly--a -1 will be returned",expResult,result);
	}
	
	@Test
	public void testEditSchoolPerFemaleFailure() {
		String name = "GEORGETOWN";
		String state = "MINNESOTA";
		String location = "URBAN";
		String control = "PRIVATE";
		int numStudents = 10000;
		double perFemale = 151.8; //invalid perFemale
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
		int result = db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		assertEquals("A school is trying to be edited improperly--a -1 will be returned",expResult,result);
	}
	
	@Test
	public void testEditSchoolsatVerbalFailure() {
		String name = "GEORGETOWN";
		String state = "MINNESOTA";
		String location = "URBAN";
		String control = "PRIVATE";
		int numStudents = 10000;
		double perFemale = 51.8;
		double satVerbal = 850.66; //invalid satVerbal score
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
		int result = db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		assertEquals("A school is trying to be edited improperly--a -1 will be returned",expResult,result);
	}
	
	@Test
	public void testEditSchoolsatMathFailure() {
		String name = "GEORGETOWN";
		String state = "MINNESOTA";
		String location = "URBAN";
		String control = "PRIVATE";
		int numStudents = 10000;
		double perFemale = 51.8;
		double satVerbal = 750.66;
		double satMath = -30.23; //invalid satMath score
		double expenses = 63456.78;
		double perFinancial = 92.8;
		int numApplicants = 38000;
		double perAdmitted = 15.6;
		double perEnrolled = 7.8;
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 4; 
		int expResult = -1;
		int result = db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		assertEquals("A school is trying to be edited improperly--a -1 will be returned",expResult,result);
	}
	
	@Test
	public void testEditSchoolExpensesFailure() {
		String name = "GEORGETOWN";
		String state = "MINNESOTA";
		String location = "URBAN";
		String control = "PRIVATE";
		int numStudents = 10000;
		double perFemale = 51.8;
		double satVerbal = 750.66;
		double satMath = 730.23;
		double expenses = -63456.78; //invalid expenses
		double perFinancial = 92.8;
		int numApplicants = 38000;
		double perAdmitted = 15.6;
		double perEnrolled = 7.8;
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 4; 
		int expResult = -1;
		int result = db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		assertEquals("A school is trying to be edited improperly--a -1 will be returned",expResult,result);
	}
	
	@Test
	public void testEditSchoolPerFinancialFailure() {
		String name = "GEORGETOWN";
		String state = "MINNESOTA";
		String location = "URBAN";
		String control = "PRIVATE";
		int numStudents = 10000;
		double perFemale = 51.8;
		double satVerbal = 750.66;
		double satMath = 730.23;
		double expenses = 63456.78;
		double perFinancial = 102.8; //invalid perFinancial
		int numApplicants = 38000;
		double perAdmitted = 15.6;
		double perEnrolled = 7.8;
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 4; 
		int expResult = -1;
		int result = db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		assertEquals("A school is trying to be edited improperly--a -1 will be returned",expResult,result);
	}
	
	@Test
	public void testEditSchoolNumberOfApplicantsFailure() {
		String name = "GEORGETOWN";
		String state = "MINNESOTA";
		String location = "URBAN";
		String control = "PRIVATE";
		int numStudents = 10000;
		double perFemale = 51.8;
		double satVerbal = 750.66;
		double satMath = 730.23;
		double expenses = 63456.78;
		double perFinancial = 92.8;
		int numApplicants = -38000; //invalid number of applicants
		double perAdmitted = 15.6;
		double perEnrolled = 7.8;
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 4; 
		int expResult = -1;
		int result = db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		assertEquals("A school is trying to be edited improperly--a -1 will be returned",expResult,result);
	}
	
	@Test
	public void testEditSchoolPerAdmittedFailure() { 
		String name = "GEORGETOWN";
		String state = "MINNESOTA";
		String location = "URBAN";
		String control = "PRIVATE";
		int numStudents = 10000;
		double perFemale = 51.8;
		double satVerbal = 750.66;
		double satMath = 730.23;
		double expenses = 63456.78;
		double perFinancial = 92.8;
		int numApplicants = 38000;
		double perAdmitted = 115.6; //invalid percent Admitted
		double perEnrolled = 7.8;
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 4; 
		int expResult = -1;
		int result = db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		assertEquals("A school is trying to be edited improperly--a -1 will be returned",expResult,result);
	}
	
	@Test
	public void testEditSchoolPerEnrolledFailure() {
		String name = "GEORGETOWN";
		String state = "MINNESOTA";
		String location = "URBAN";
		String control = "PRIVATE";
		int numStudents = 10000;
		double perFemale = 51.8;
		double satVerbal = 750.66;
		double satMath = 730.23;
		double expenses = 63456.78;
		double perFinancial = 92.8;
		int numApplicants = 38000;
		double perAdmitted = 15.6;
		double perEnrolled = -7.8; //invalid perEnrolled
		int acadScale = 4; 
		int socialScale = 4;
		int QOLScale = 4; 
		int expResult = -1;
		int result = db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		assertEquals("A school is trying to be edited improperly--a -1 will be returned",expResult,result);
	}
	
	@Test
	public void testEditSchoolAcadScaleFailure() {
		String name = "GEORGETOWN";
		String state = "MINNESOTA";
		String location = "URBAN";
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
		int acadScale = 0; //invalid acadScale score 
		int socialScale = 4;
		int QOLScale = 4; 
		int expResult = -1;
		int result = db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		assertEquals("A school is trying to be edited improperly--a -1 will be returned",expResult,result);
	}
	
	@Test
	public void testEditSchoolSocialScaleFailure() {
		String name = "GEORGETOWN";
		String state = "MINNESOTA";
		String location = "URBAN";
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
		int socialScale = -2; //invalid socialScale score
		int QOLScale = 4; 
		int expResult = -1;
		int result = db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		assertEquals("A school is trying to be edited improperly--a -1 will be returned",expResult,result);
	}
	
	@Test
	public void testEditSchoolQOLScaleFailure() {
		String name = "GEORGETOWN";
		String state = "MINNESOTA";
		String location = "URBAN";
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
		int QOLScale = 6; //invalid QOLScale score
		int expResult = -1;
		int result = db.editSchool(name, state,
				location, control, numStudents, perFemale, satVerbal, satMath, expenses, perFinancial, numApplicants,
				perAdmitted, perEnrolled, acadScale, socialScale, QOLScale);
		assertEquals("A school is trying to be edited improperly--a -1 will be returned",expResult,result);
	}
	
	//ADDNEWMEMBER TESTS
	
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
		db.databaseLibrary.user_deleteUser("jcblomquist");
		firstName = "Master";
		lastName = "Yoda";
		username = "jediYoda";
		password = "userYoda";
		type = 'u';
		assertEquals("Trying to be added, member is. 1 returned, if succeeds.",expResult,
				db.addNewMember(firstName, lastName, username, password, type));
		db.databaseLibrary.user_deleteUser("jediYoda");
		
	}
	
	@Test
	public void testAddNewMemberTypeFailure() {
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
	public void testAddNewMemberUsernameFailure() {
		String firstName = "Jon";
		String lastName = "Blomquist";
		String username = "juser";
		String password = "user";
		char type = 'a';
		int expResult = -1;
		assertEquals("A member is trying to be added. If the username is already taken, a -1 will be returned",expResult,
				db.addNewMember(firstName, lastName, username, password, type));
	}

	//EDITUSER TESTS
	
	@Test
	public void testEditUserSuccess() {
		String firstName = "Taco";
		String lastName = "Bell";
		String username = "juser";
		String password = "TACOSrGREAT";
		char type = 'u';
		char status = 'Y';
		int expResult = 1;
		int result = db.editUser(firstName, lastName, username, password, type, status);
		assertEquals("juser is being edited. A 1 should be returned.", expResult, result);
		firstName = "John";
		lastName = "User";
		password = "user";
		db.editUser(firstName, lastName, username, password, type, status);
	}
	
	@Test
	public void testEditUserUsernameNotFoundFailure() {
		String firstName = "Taco";
		String lastName = "Bell";
		String username = "21user";
		String password = "TACOSrGREAT";
		char type = 'u';
		char status = 'Y';
		int expResult = -1;
		int result = db.editUser(firstName, lastName, username, password, type, status);
		assertEquals("juser is being edited improperly. A -1 should be returned.", expResult, result);
	}
	
	@Test
	public void testEditUserTypeFailure() {
		String firstName = "Taco";
		String lastName = "Bell";
		String username = "juser";
		String password = "TACOSrGREAT";
		char type = 'v';
		char status = 'Y';
		int expResult = -1;
		int result = db.editUser(firstName, lastName, username, password, type, status);
		assertEquals("juser is being edited improperly. A -1 should be returned.", expResult, result);
	}
	
	@Test
	public void testEditUserStatusFailure() {
		String firstName = "Taco";
		String lastName = "Bell";
		String username = "juser";
		String password = "TACOSrGREAT";
		char type = 'u';
		char status = 'X';
		int expResult = -1;
		int result = db.editUser(firstName, lastName, username, password, type, status);
		assertEquals("juser is being edited improperly. A -1 should be returned.", expResult, result);
	}

	//GETUSER TEST ***DONE***
	
	@Test
	public void testGetUsers() {
		int numberOfUsers = db.getUsers().length;
		int expResult = 5;
		assertEquals("The number of users should equal "+expResult,expResult,numberOfUsers);
	}

	//GETSCHOOLS TEST ***DONE***
	
	@Test
	public void testGetSchools() {
		int numberOfSchools = db.getSchools().length;
		int expResult = 178;
		assertEquals("The number of schools should equal "+expResult,expResult,numberOfSchools);
	}

	//FINDBYNAME TESTS
	
	@Test
	public void testFindByNameSuccess() {
		String userName = "juser";
		Member member = db.findByName(userName);
		char typeResult = member.getType();
		char expResult = 'u';
		assertEquals("juser is being searched for and a user object should be returned.",expResult,typeResult);
		userName = "nadmin";
		member = db.findByName(userName);
		typeResult = member.getType();
		expResult = 'a';
		assertEquals("nadmin is being searched for and an admin object should be returned.",expResult,typeResult);
	}
	
	@Test
	public void testFindByNameFailure() {
		String userName = "auser";
		Member member = db.findByName(userName);
		Member expResult = null;
		assertEquals("auser is being searched and doesn't exist.",expResult,member);
	}

	//GETSCHOOLSWITHEMPHASES TEST ***DONE***
	
	@Test 
	public void testGetSchoolsWithEmphases() {
		int schoolsWithEmphases = db.getSchoolsWithEmphases().length;
		int expResult = 566;
		assertEquals("The number of pairs of schools with emphases should equal "+expResult,expResult,schoolsWithEmphases);
	}

	//SAVESCHOOL TESTS
	
	@Test
	public void testSaveSchoolSuccess() {
		db.removeSchool("juser", "GEORGETOWN");
		String username = "juser";
		String school = "GEORGETOWN";
		int expResult = 1;
		assertEquals("A school is being saved to juser's account. 1 should be returned",expResult,db.saveSchool(username, school));
	}
	
	@Test
	public void testSaveSchoolUsernameFailure() {
		String username = "apple";
		String school = "YALE";
		int expResult = -1;
		assertEquals("A school is being saved to apple's account. -1 should be returned",expResult,db.saveSchool(username, school));
	}
	
	@Test
	public void testSaveSchoolSchoolFailure() {
		String username = "nuser";
		String school = "PIZZA HUT";
		int expResult = -1;
		assertEquals("A school is being saved to nuser's account. -1 should be returned",expResult,db.saveSchool(username, school));
	}

	//REMOVESCHOOL TESTS
	
	@Test
	public void testRemoveSchoolSuccess() {
		String userName = "juser";
		String school = "YALE";
		db.saveSchool(userName, school);
		int result = db.removeSchool(userName, school);
		int expResult = 1;
		assertEquals("Yale is being removed from juser's saved schools.",expResult,result);	
	}
	
	@Test
	public void testRemoveSchoolUserFailure() {
		String userName = "auser";
		String school = "YALE";
		int result = db.removeSchool(userName, school);
		int expResult = 0; //0 entries were removed, so 0 is returned
		assertEquals("Yale is attempted to be removed from auser's saved schools.",expResult,result);
	}
	
	@Test
	public void testRemoveSchoolSchoolFailure() {
		String userName = "juser";
		String school = "GEORGE WASHINGTON";
		int result = db.removeSchool(userName, school);
		int expResult = 0; //0 entries were removed, so 0 is returned
		assertEquals("George Washington is attempted to be removed from juser's saved schools.",expResult,result);
	}

	//ADDUNIVERSITYEMPHASIS TESTS
	
	@Test
	public void testAddUniversityEmphasisSuccess() {
		String school = "ADELPHI";
		String emphasis = "COMPUTER SCIENCE";
		int expResult = 1;
		assertEquals("An emphasis is being added to Adelphi. 1 should be returned",expResult,db.addUniversityEmphasis(school, emphasis));
		db.databaseLibrary.university_removeUniversityEmphasis(school, emphasis);
	}
	
	@Test
	public void testAddUniversityEmphasisSchoolFailure() {
		String school = "DISNEYLAND"; //school does not exist
		String emphasis = "COMPUTER SCIENCE";
		int expResult = -1;
		assertEquals("An emphasis is being added to a school that does not exist. -1 should be returned",expResult,db.addUniversityEmphasis(school, emphasis));
	}
	
	@Test
	public void testAddUniversityEmphasisEmphasisFailure() {
		String school = "ADELPHI";
		String emphasis = "BIOLOGY"; //school already has this emphasis
		int expResult = -1;
		assertEquals("An emphasis is being added to Adelphi that already exists. -1 should be returned",expResult,db.addUniversityEmphasis(school, emphasis));
	}

	//GETUSERNAMESWITHSAVEDSCHOOLS TESTS ***DONE***
	
	@Test //DONE
	public void testGetUsernamesWithSavedSchools() {
		int usernamesWithSavedSchools = db.getUsernamesWithSavedSchools().length;
		int expResult = 4;
		assertEquals("The number of pairs of schools with emphases should equal "+expResult,expResult,usernamesWithSavedSchools);

	}

}
