package constructAutomation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LocatorValidation extends ConstructMethodLibrary
{
	@BeforeEach
	void setUp()
	{
		start();
	}
	
	@AfterEach
	void tearDown()
	{
		quit();
	}
	
	@Test
	void validateLocators() throws IllegalAccessException
	{	
		validateLocators(WelcomePopup.class);
	}
	
	@Test
	void validateLearnColumn() throws IllegalAccessException
	{
		dismissWelcomePopup();

		validateLocators(StartPage.LearnColumn.class);
	}
}
