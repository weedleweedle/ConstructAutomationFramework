package constructAutomation;



import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddonTester
{
	Actions actions = new Actions();

	@Before
	public void setUp() throws Exception
	{
		actions.setUp();
	}

	@After
	public void tearDown() throws Exception
	{
		actions.quit();
	}

	@Test
	public void test()
	{
		fail("Not yet implemented");
	}

}
