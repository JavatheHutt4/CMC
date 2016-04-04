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
public class AdminTest {

	private Admin admin1;
	private Admin admin2;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		admin1 = new Admin("first", "last", "user", "password", 'Y');
		admin2 = new Admin("first2", "last2", "user2", "password2", 'N');
	}

	/**
	 * Test method for {@link CMCPackage.Member#getFirstName()}.
	 */
	@Test
	public void testGetFirstName() {
		String expResult = "first";
		String result = admin1.getFirstName();
		assertEquals("firstName is " + expResult,expResult, result);
		expResult = "first2";
		result = admin2.getFirstName();
		assertEquals("firstName is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#setFirstName(java.lang.String)}.
	 */
	@Test
	public void testSetFirstName() {
		admin1.setFirstName("newFirst");
		String expResult = "newFirst";
		String result = admin1.getFirstName();
		assertEquals("firstName is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#getLastName()}.
	 */
	@Test
	public void testGetLastName() {
		String expResult = "last";
		String result = admin1.getLastName();
		assertEquals("lastName is " + expResult,expResult, result);
		expResult = "last2";
		result = admin2.getLastName();
		assertEquals("lastName is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#setLastName(java.lang.String)}.
	 */
	@Test
	public void testSetLastName() {
		admin1.setLastName("newLast");
		String expResult = "newLast";
		String result = admin1.getLastName();
		assertEquals("lastName is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#getUserName()}.
	 */
	@Test
	public void testGetUserName() {
		String expResult = "user";
		String result = admin1.getUserName();
		assertEquals("userName is " + expResult,expResult, result);
		expResult = "user2";
		result = admin2.getUserName();
		assertEquals("userName is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#setUserName(java.lang.String)}.
	 */
	@Test
	public void testSetUserName() {
		admin1.setUserName("newUser");
		String expResult = "newUser";
		String result = admin1.getUserName();
		assertEquals("userName is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#getPassword()}.
	 */
	@Test
	public void testGetPassword() {
		String expResult = "password";
		String result = admin1.getPassword();
		assertEquals("password is " + expResult,expResult, result);
		expResult = "password2";
		result = admin2.getPassword();
		assertEquals("password is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#setPassword(java.lang.String)}.
	 */
	@Test
	public void testSetPassword() {
		admin1.setPassword("newPassword");
		String expResult = "newPassword";
		String result = admin1.getPassword();
		assertEquals("password is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#getType()}.
	 */
	@Test
	public void testGetType() {
		char expResult = 'a';
		char result = admin1.getType();
		assertEquals("type is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#setType(char)}.
	 */
	@Test
	public void testSetType() {
		admin1.setType('u');
		char expResult = 'u';
		char result = admin1.getType();
		assertEquals("type is " + expResult,expResult, result);
	}
	
	@Test (expected=UnsupportedOperationException.class)
	public void testSetTypeFails() {
		admin1.setType('m');
	}

	/**
	 * Test method for {@link CMCPackage.Member#getStatus()}.
	 */
	@Test
	public void testGetStatus() {
		char expResult = 'Y';
		char result = admin1.getStatus();
		assertEquals("status is " + expResult,expResult, result);
		expResult = 'N';
		result = admin2.getStatus();
		assertEquals("status is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#setStatus(char)}.
	 */
	@Test
	public void testSetStatus() {
		admin1.setStatus('N');
		char expResult = 'N';
		char result = admin1.getStatus();
		assertEquals("firstName is " + expResult,expResult, result);
	}
	
	@Test (expected=UnsupportedOperationException.class)
	public void testSetStatusFails() {
		admin1.setStatus('M');
	}

	/**
	 * Test method for {@link CMCPackage.Member#deactivateMember()}.
	 */
	@Test
	public void testDeactivateMember() {
		admin1.deactivateMember();
		char expResult = 'N';
		char result = admin1.getStatus();
		assertEquals("status is " + expResult,expResult, result);
		admin2.deactivateMember();
		expResult = 'N';
		result = admin2.getStatus();
		assertEquals("status is " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.Member#toString()}.
	 */
	@Test
	public void testToString() {
		String expResult = "First name: "+ admin1.getFirstName() + "\nLast Name: "+ admin1.getLastName()
				+ "\nUsername: "+ admin1.getUserName() + "\nPassword: "+ admin1.getPassword() 
				+ "\nType: " + admin1.getType() + "\nStatus: " + admin1.getStatus();
		String result = admin1.toString();
		assertEquals("admin1 toString is: " + expResult,expResult, result);
	}

}
