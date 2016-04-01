package CMCPackage;

/**
 * @author jcblomquist
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SearchControllerTest {
	SearchController sc;
	@Before
	public void setUp() throws Exception {
		sc = new SearchController();
	}

	@Test
	public void testSearch() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMaxSuccess() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetMaxFailure() {
		double expResult = -1.0;
		double result;
		result = sc.getMax(-10);
		assertTrue(result==expResult);
		result = sc.getMax(3);
		assertTrue(result==expResult);
		result = sc.getMax(15);
		assertTrue(result==expResult);
	}

	@Test
	public void testGetMinSuccess() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetMinFailure() {
		double expResult = -1.0;
		double result;
		result = sc.getMin(-10);
		assertTrue(result==expResult);
		result = sc.getMin(3);
		assertTrue(result==expResult);
		result = sc.getMin(15);
		assertTrue(result==expResult);
	}

	@Test
	public void testGetRecommendedSchools() {
		fail("Not yet implemented");
	}

}
