package constructAutomation;

import org.junit.jupiter.api.Test;

class LocatorValidation extends ConstructMethodLibrary
{

	@Test
	void test()
	{
		start();
		
		confirmTrue(isElementClickable(WelcomePopup.closeX));
		
		confirmTrue(isElementClickable(WelcomePopup.noThanksLink));
		
		confirmTrue(isElementClickable(WelcomePopup.tourButton));
		
		quit();
	}
}
