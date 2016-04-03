package CMCPackage;

/**
 * @author jcblomquist
 */

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
// import org.junit.Ignore;
import org.junit.Test;

public class SearchControllerTest {
	SearchController sc;
	SchoolHome sh;
	@Before
	public void setUp() throws Exception {
		sc = new SearchController();
		sh = new SchoolHome();
	}
 
	//SEARCH TESTS ***DONE***
	
	@Test
	public void testSearchOneSchool() {
		String[][] search = sc.search("AUGSBURG", "MINNESOTA", "", "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, null, null, null, null, null);
		String[] expSchool = {"AUGSBURG","MINNESOTA","SMALL-CITY","PRIVATE","10000","43","420","490","29991","80","4000","85","50","1","3","4",null,null};
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(expSchool, search[0]));
	}

	@Test
	public void testSearchMultipleSchools() {
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
	public void testSearchInvalidSearchParameters() {
		String[][] search = sc.search("", "", "", "", 20000, 15000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null);
		String[] expString = {"Invalid Search Parameters"};
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(expString, search[0]));
		search = sc.search("", "", "", "", 0, 0, 79.5, 64.2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null);
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(expString, search[0]));
		search = sc.search("", "", "", "", 0, 0, 0, 0, 750, 720, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null);
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(expString, search[0]));
		search = sc.search("", "", "", "", 0, 0, 0, 0, 0, 0, 250, 210, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null);
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(expString, search[0]));
		search = sc.search("", "", "", "", 0, 0, 0, 0, 0, 0, 0, 0, 30000, 25000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null);
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(expString, search[0]));
		search = sc.search("", "", "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 25.6, 10.2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null);
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(expString, search[0]));
		search = sc.search("", "", "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2400, 2300, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null);
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(expString, search[0]));
		search = sc.search("", "", "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 81.2, 70.8, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null);
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(expString, search[0]));
		search = sc.search("", "", "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 51.6, 20.2, 0, 0, 0, 0, 0, 0, null, null, null, null, null);
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(expString, search[0]));
		search = sc.search("", "", "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 0, 0, null, null, null, null, null);
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(expString, search[0]));
		search = sc.search("", "", "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 3, 0, 0, null, null, null, null, null);
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(expString, search[0]));
		search = sc.search("", "", "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 4, null, null, null, null, null);
		assertTrue("Search results are: " + Arrays.toString(search[0]),Arrays.equals(expString, search[0]));
	}
	
	//GETMAX TESTS ***DONE***
	
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
		result = sc.getMax(25);
		assertTrue(result==expResult);
	}

	//GETMIN TESTS ***DONE***
	
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
		result = sc.getMin(25);
		assertTrue(result==expResult);
	}

	//GETRECOMMENDEDSCHOOLS TEST 
	
	@Test
	public void testGetRecommendedSchools() {
		School s = sh.findByName("BARD");
		String[][] schools = sc.getRecommendedSchools(s);
		String[] names = new String[5];
		for(int i=0;i<schools.length;i++){
			names[i] = schools[i][0];
		}
		String[] expSchools = {"UNIVERSITY OF THE PACIFIC","CLARKSON UNIVERSITY","MONMOUTH COLLEGE","GEORGE WASHINGTON","BUTLER"};
		assertTrue("Recommended schools are: " + Arrays.toString(names),Arrays.equals(expSchools,names));
	}

}
