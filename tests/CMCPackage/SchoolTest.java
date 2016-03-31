package CMCPackage;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * @author jrfolkerds
 * @version 3/30/2016
 */
public class SchoolTest {
	private School s;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		String[] emphasis = new String[] {"Science","Math"};
		s = new School("Test","MN","Urban","Private",5000,50.00,800.00,800.00,10000.00,75.00,5000,50.00,50.00,5,5,5,emphasis);
	}
	
	@Test
	public void testSetInformation() {
		String expResult = "Name";
		s.setInformation("Name",s.getState(),s.getLocation(),s.getControl(),s.getNumStudents(),
				s.getPerFemale(),s.getSatVerbal(),s.getSatMath(),s.getExpenses(),s.getPerFinancial(),s.getNumApplicants(),s.getPerAdmitted(),
				s.getPerEnrolled(),s.getAcadScale(),s.getSocialScale(),s.getQOLScale(),s.getEmphasis());
		String result = s.getName();
		assertEquals("Name is " + expResult,expResult, result);
	}
	
	@Test
	public void testGetName() {
		String expResult = "Test";
		String result = s.getName();
		assertEquals("Name is " + expResult,expResult, result);
	}
	
	@Test
	public void testGetState() {
		String expResult = "MN";
		String result = s.getState();
		assertEquals("State is " + expResult,expResult, result);
	}
	
	@Test
	public void testGetLocation() {
		String expResult = "Urban";
		String result = s.getLocation();
		assertEquals("Location is " + expResult,expResult, result);
	}

	@Test
	public void testGetControl() {
		String expResult = "Private";
		String result = s.getControl();
		assertEquals("Control is " + expResult,expResult, result);
	}
	
	@Test
	public void testGetNumStudents() {
		int expResult = 5000;
		int result = s.getNumStudents();
		assertEquals("Number of students is " + expResult,expResult, result);
	}
	
	@Test
	public void testGetPerFemale() {
		double expResult = 50.00;
		double result = s.getPerFemale();
		assertTrue("Percentage of female students is " + expResult,expResult==result);
	}
	
	@Test
	public void testGetSatVerbal() {
		double expResult = 800.00;
		double result = s.getSatVerbal();
		assertTrue("Average SAT Verbal score is " + expResult,expResult==result);
	}
	
	@Test
	public void testGetSatMath() {
		double expResult = 800.00;
		double result = s.getSatMath();
		assertTrue("Average SAT Math score is " + expResult,expResult==result);
	}
	
	@Test
	public void testGetExpenses() {
		double expResult = 10000.00;
		double result = s.getExpenses();
		assertTrue("Average tuition is " + expResult,expResult==result);
	}
	
	@Test
	public void testGetPerFinancial() {
		double expResult = 75.00;
		double result = s.getPerFinancial();
		assertTrue("Percent of students on financial aid is " + expResult,expResult==result);
	}
	
	@Test
	public void testGetNumApplicants() {
		int expResult = 5000;
		int result = s.getNumApplicants();
		assertEquals("Number of applicants is " + expResult,expResult, result);
	}
	
	@Test
	public void testGetPerAdmitted() {
		double expResult = 50.00;
		double result = s.getPerAdmitted();
		assertTrue("Percent of students admitted is " + expResult, expResult==result);
	}
	
	@Test
	public void testGetPerEnrolled() {
		double expResult = 50.00;
		double result = s.getPerEnrolled();
		assertTrue("Percent of students admitted that are enrolled is " + expResult,expResult==result);
	}
	
	@Test
	public void testGetAcadScale() {
		int expResult = 5;
		int result = s.getAcadScale();
		assertEquals("Academic scale is " + expResult,expResult, result);
	}
	
	@Test
	public void testGetSocialScale() {
		int expResult = 5;
		int result = s.getSocialScale();
		assertEquals("Social scale is " + expResult,expResult, result);
	}
	
	@Test
	public void testGetQOLScale() {
		int expResult = 5;
		int result = s.getQOLScale();
		assertEquals("Quality of Life scale is " + expResult,expResult, result);
	}
	
	@Test
	public void testGetEmphasis() {
		String[] expResult = {"Science","Math"};
		String[] result = s.getEmphasis();
		assertTrue("Emphasis is " + expResult,Arrays.equals(expResult,result));
	}
	
	@Test
	public void testViewSchoolDetails() {
		String expResult = "Name: Test" + "\tState: MN" +"\tLocation: Urban";
		String result = s.viewSchoolDetails();
		assertEquals("School details are " + expResult,expResult, result);
	}
	
	@Test
	public void testToString() {
		String expResult = "School [name=Test, state=MN, location=Urban, control=Private, numStudents=5000, "
				+ "perFemale=50.0, satVerbal=800.0, satMath=800.0, expenses=10000.0, perFinancial=75.0, numApplicants=5000, "
				+ "perAdmitted=50.0, perEnrolled=50.0, acadScale=5, socialScale=5, QOLScale=5, emphasis=[Science, Math]]";
		String result = s.toString();
		assertTrue("School toString is " + expResult,expResult.equals(result));
	}
	
	
}
