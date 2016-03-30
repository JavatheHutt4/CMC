/**
 * 
 */
package CMCPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author tdrichmond
 *
 */
public class LogonControllerTest {

	LogonController lc;
	LogonController lc2;
	LogonController lc3;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		lc = new LogonController();
		lc2 = new LogonController();
		lc3 = new LogonController();
		lc.logon("nadmin", "admin");
		lc3.logon("luser", "user");
	}
	
	@After
	public void tearDown() throws Exception {
		if (lc.getMember() == null){
			lc.logon("nadmin", "admin");
		}
		lc.changePassword("admin");
	}

//	/**
//	 * Test method for {@link CMCPackage.LogonController#LogonController()}.
//	 */
//	@Test
//	public void testLogonController() {
//		fail("Not yet implemented");
//	}

	/**
	 * Test method for {@link CMCPackage.LogonController#changePassword(java.lang.String)}.
	 */
	@Test
	public void testChangePassword() {
		lc.changePassword("newPassword");
		String expResult = "newPassword";
		String result = lc.getMember().getPassword();
		assertEquals("the changed password is " + expResult,expResult, result);
	}
	@Test(expected=NullPointerException.class)
	public void testChangePasswordFailsNullMember() {
		lc2.changePassword("newPassword");
	}

	/**
	 * Test method for {@link CMCPackage.LogonController#logon(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testLogon() {
		String expResult = "juser";
		String result = lc2.logon("juser", "user").getUserName();
		assertEquals("The logged in userName should be " + expResult,expResult, result);
	}
	@Test
	public void testLogonInvalidUserName() {
		Member expResult = null;
		Member result = lc2.logon("fake", "user");
		assertEquals("The logon should fail, member should be " + expResult,expResult, result);
	}
	@Test
	public void testLogonInvalidPassword() {
		Member expResult = null;
		Member result = lc2.logon("juser", "fake");
		assertEquals("The logon should fail, member should be " + expResult,expResult, result);
	}
	

	/**
	 * Test method for {@link CMCPackage.LogonController#logoff()}.
	 */
	@Test
	public void testLogoff() {
		lc.logoff();
		Member expResult = null;
		Member result = lc.getMember();
		assertEquals("member should be " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.LogonController#getMember()}.
	 */
	@Test
	public void testGetMember() {
		Member temp = lc.getMember();
		String expResult = "Noreen";
		String result = temp.getFirstName();
		assertEquals("First name is " + expResult,expResult, result);
	}
	@Test
	public void testGetMemberNotLoggedIn() {
		Member expResult = null;
		Member result = lc2.getMember();
		assertEquals("Member should be " + expResult,expResult, result);
	}

	/**
	 * Test method for {@link CMCPackage.LogonController#toString()}.
	 */
	@Test
	public void testToString() {
		String expResult = "The Member currently logged in is user " +lc.getMember().getUserName() + " of type admin.";
		String result = lc.toString();
		assertEquals("Return message should be: " + expResult,expResult, result);
		expResult = "No member is currently logged on.";
		result = lc2.toString();
		assertEquals("Return message should be: " + expResult,expResult, result);
		expResult = "The Member currently logged in is user " +lc3.getMember().getUserName() + " of type user.";;
		result = lc3.toString();
		assertEquals("Return message should be: " + expResult,expResult, result);
	}

}
