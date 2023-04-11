package constructAutomation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class LocatorValidation extends ConstructMethodLibrary
{

	@Test
	void test()
	{
		driver.get(editorURL);
		
		assertEquals(driver.getCurrentUrl(), editorURL);
	}
	
	@AfterAll
	static void tearDownAfterClass()
	{
		quit();
	}

}
