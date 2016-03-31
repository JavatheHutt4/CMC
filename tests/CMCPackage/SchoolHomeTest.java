
package CMCPackage;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * @author jrfolkerds
 * @version 3/30/2016
 */
public class SchoolHomeTest {
	private SchoolHome sh;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		sh = new SchoolHome();
	}

	@Test
	public void testFindByNameSuccess() {
		String expResult = "Name: AUGSBURG" + "\tState: MINNESOTA" +"\tLocation: SMALL-CITY";
		School s = sh.findByName("AUGSBURG");
		String result = s.viewSchoolDetails();
		assertTrue("School details are: " + expResult, expResult.equals(result));
	}
	
	@Test
	public void testFindByNameFailure() {
		School s = sh.findByName("Augsburg");
		assertNull("School should be null: " + s, s);
	}
	
	@Test
	public void testGetSchoolEmphases() {
		String[] expResult = {"ART-HISTORY","BIOLOGY","ECONOMICS","LIBERAL-ARTS",null};
		String[] result = sh.getSchoolEmphases("BARNARD");
		assertTrue("Emphases are " + Arrays.toString(result),Arrays.equals(expResult,result));
	}
	
	@Test
	public void testGetAllUniversities() {
		String[][] result = sh.getAllUniversities();
		String[] expResult = {"ABILENE CHRISTIAN UNIVERSITY","TEXAS","SUBURBAN","PRIVATE","10000","50","-1","-1","12088","70","4000","90","80","2","3","3"};
		assertTrue("First school is " + Arrays.toString(result[0]), Arrays.equals(expResult,result[0]));
	}

}
