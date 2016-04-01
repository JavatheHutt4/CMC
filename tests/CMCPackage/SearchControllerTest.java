package CMCPackage;

/**
 * @author jcblomquist
 */

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class SearchControllerTest {
	SearchController sc;
	@Before
	public void setUp() throws Exception {
		sc = new SearchController();
	}

	@Test
	public void testSearchOneSchool() {
		String[][] search = sc.search("AUGSBURG", "MINNESOTA", "", "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, null, null, null, null, null);
		String[] expSchool = {"AUGSBURG","MINNESOTA","SMALL-CITY","PRIVATE","10000","43","420","490","29991","80","4000","85","50","1","3","4",null,null};
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(expSchool, search[0]));
	}

	@Test
	public void testSearchMultipleSchool() {
		String[][] search = sc.search("", "", "", "", 10000, -1, 40, 50, -1, -1, -1, -1, -1, 30000, -1, -1,
				-1, -1, -1, -1, -1, -1, 4, -1, -1, 4, 3, -1, null, null, null, null, null);
		int expNumberOfSchools = 23;
		for(int i = 0; i < search.length; i++)
		{
			System.out.println(Arrays.toString(search[i]));
		}
		assertTrue("Search results are above. Expected Number of Schools: "+expNumberOfSchools+" Result: "+search.length ,expNumberOfSchools==search.length);
	}
	
	@Test
	public void testGetMaxSuccess() {
		double expResult = 40000;
		double result = sc.getMax(4);
		assertTrue("Maximum value of column: "+result+" Expected: "+expResult,expResult==result);
		expResult = 100;
		result = sc.getMax(5);
		assertTrue("Maximum value of column: "+result+" Expected: "+expResult,expResult==result);
		expResult = 780;
		result = sc.getMax(7);
		assertTrue("Maximum value of column: "+result+" Expected: "+expResult,expResult==result);
		expResult = 5;
		result = sc.getMax(14);
		assertTrue("Maximum value of column: "+result+" Expected: "+expResult,expResult==result);
		expResult = 5;
		result = sc.getMax(15);
		assertTrue("Maximum value of column: "+result+" Expected: "+expResult,expResult==result);
		
	}
	
	@Test
	public void testGetMaxFailure() {
		double expResult = -1.0;
		double result;
		result = sc.getMax(-10);
		assertTrue(result==expResult);
		result = sc.getMax(3);
		assertTrue(result==expResult);
		result = sc.getMax(16);
		assertTrue(result==expResult);
	}

	@Test
	public void testGetMinSuccess() {
		double expResult = 10000;
		double result = sc.getMin(4);
		assertTrue("Minimum value of column: "+result+" Expected: "+expResult,expResult==result);
		expResult = 1;
		result = sc.getMin(5);
		assertTrue("Minimum value of column: "+result+" Expected: "+expResult,expResult==result);
		expResult = 250;
		result = sc.getMin(7);
		assertTrue("Minimum value of column: "+result+" Expected: "+expResult,expResult==result);
		expResult = 1;
		result = sc.getMin(14);
		assertTrue("Minimum value of column: "+result+" Expected: "+expResult,expResult==result);
		expResult = 1;
		result = sc.getMin(15);
		assertTrue("Minimum value of column: "+result+" Expected: "+expResult,expResult==result);
		
	}
	
	@Test
	public void testGetMinFailure() {
		double expResult = -1.0;
		double result;
		result = sc.getMin(-10);
		assertTrue(result==expResult);
		result = sc.getMin(3);
		assertTrue(result==expResult);
		result = sc.getMin(16);
		assertTrue(result==expResult);
	}

	@Test
	public void testGetRecommendedSchools() {
		fail("Not yet implemented");
	}

}
