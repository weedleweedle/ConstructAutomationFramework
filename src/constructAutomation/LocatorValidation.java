package constructAutomation;

import org.junit.jupiter.api.Test;

class LocatorValidation extends ConstructMethodLibrary
{
	@Test
	void validateLocators() throws IllegalArgumentException, IllegalAccessException
	{
		start();
		
		validateLocators(WelcomePopup.class);
		
		// dismiss the welcome popup, that'll put us on the start page
		dismissWelcomePopup();

		validateLocators(StartPage.LearnColumn.class);
		
		quit();
	}
}
