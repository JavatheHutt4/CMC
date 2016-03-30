/**
 * 
 */
package CMCPackage; 

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author tdrichmond
 * @version 3/30/2016
 */
public class UserTest {

	private User user1;
	private User user2;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		user1 = new User("first", "last", "user", "password", 'Y');
		user2 = new User("first2", "last2", "user2", "password2", 'N');
	}

//	/**
//	 * Test method for {@link CMCPackage.User#User(java.lang.String, java.lang.String, java.lang.String, java.lang.String, char)}.
//	 */
//	@Test
//	public void testUser() {
//		fail("Not yet implemented");
//	}

	/**
	 * Test method for {@link CMCPackage.User#updateInformation(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUpdateInformation() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link CMCPackage.User#getSavedSchools()}.
	 */
	@Test
	public void testGetSavedSchools() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link CMCPackage.User#viewSavedSchool(CMCPackage.School)}.
	 */
	@Test
	public void testViewSavedSchool() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link CMCPackage.Member#getFirstName()}.
	 */
	@Test
	public void testGetFirstName() {
		String expResult = "first";
		String result = user1.getFirstName();
		assertEquals("firstName is " + expResult,expResult, result);
		expResult = "first2";
		result = user2.getFirstName();
		assertEquals("firstName is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#setFirstName(java.lang.String)}.
	 */
	@Test
	public void testSetFirstName() {
		user1.setFirstName("newFirst");
		String expResult = "newFirst";
		String result = user1.getFirstName();
		assertEquals("firstName is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#getLastName()}.
	 */
	@Test
	public void testGetLastName() {
		String expResult = "last";
		String result = user1.getLastName();
		assertEquals("lastName is " + expResult,expResult, result);
		expResult = "last2";
		result = user2.getLastName();
		assertEquals("lastName is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#setLastName(java.lang.String)}.
	 */
	@Test
	public void testSetLastName() {
		user1.setLastName("newLast");
		String expResult = "newLast";
		String result = user1.getLastName();
		assertEquals("lastName is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#getUserName()}.
	 */
	@Test
	public void testGetUserName() {
		String expResult = "user";
		String result = user1.getUserName();
		assertEquals("userName is " + expResult,expResult, result);
		expResult = "user2";
		result = user2.getUserName();
		assertEquals("userName is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#setUserName(java.lang.String)}.
	 */
	@Test
	public void testSetUserName() {
		user1.setUserName("newUser");
		String expResult = "newUser";
		String result = user1.getUserName();
		assertEquals("userName is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#getPassword()}.
	 */
	@Test
	public void testGetPassword() {
		String expResult = "password";
		String result = user1.getPassword();
		assertEquals("password is " + expResult,expResult, result);
		expResult = "password2";
		result = user2.getPassword();
		assertEquals("password is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#setPassword(java.lang.String)}.
	 */
	@Test
	public void testSetPassword() {
		user1.setPassword("newPassword");
		String expResult = "newPassword";
		String result = user1.getPassword();
		assertEquals("password is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#getType()}.
	 */
	@Test
	public void testGetType() {
		char expResult = 'u';
		char result = user1.getType();
		assertEquals("type is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#setType(char)}.
	 */
	@Test
	public void testSetType() {
		user1.setType('a');
		char expResult = 'a';
		char result = user1.getType();
		assertEquals("type is " + expResult,expResult, result);
	}
	
	@Test (expected=UnsupportedOperationException.class)
	public void testSetTypeFails() {
		user1.setType('m');
	}

	/**
	 * Test method for {@link CMCPackage.Member#getStatus()}.
	 */
	@Test
	public void testGetStatus() {
		char expResult = 'Y';
		char result = user1.getStatus();
		assertEquals("status is " + expResult,expResult, result);
		expResult = 'N';
		result = user2.getStatus();
		assertEquals("status is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#setStatus(char)}.
	 */
	@Test
	public void testSetStatus() {
		user1.setStatus('N');
		char expResult = 'N';
		char result = user1.getStatus();
		assertEquals("firstName is " + expResult,expResult, result);
	}
	
	@Test (expected=UnsupportedOperationException.class)
	public void testSetStatusFails() {
		user1.setStatus('M');
	}

	/**
	 * Test method for {@link CMCPackage.Member#deactivateMember()}.
	 */
	@Test
	public void testDeactivateMember() {
		user1.deactivateMember();
		char expResult = 'N';
		char result = user1.getStatus();
		assertEquals("status is " + expResult,expResult, result);
		user2.deactivateMember();
		expResult = 'N';
		result = user2.getStatus();
		assertEquals("status is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#toString()}.
	 */
	@Test
	public void testToString() {
		String expResult = "First name: "+ user1.getFirstName() + "\nLast Name: "+ user1.getLastName()
					+ "\nUsername: "+ user1.getUserName() + "\nPassword: "+ user1.getPassword() 
					+ "\nType: " + user1.getType() + "\nStatus: " + user1.getStatus();
		String result = user1.toString();
		assertEquals("user1 toString is: " + expResult,expResult, result);
	}

}
