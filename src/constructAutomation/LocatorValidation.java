package constructAutomation;

import org.junit.jupiter.api.Test;

class LocatorValidation extends ConstructMethodLibrary
{

	@Test
	void validateLocators()
	{
		start();
		
		// Confirm everything in the welcome popup
		confirmClickable(WelcomePopup.closeX);
		confirmClickable(WelcomePopup.tourButton);
		
		// dismiss the welcome popup, that'll put us on the start page
		dismissWelcomePopup(); // Confirms WelcomePopup.noThanksLink
		
		// menu confirmation
		click(Menu.menuButton);
		click(Menu.project); // Confirms Menu.menuButton
		confirmClickable(Menu.ProjectPopout.newProject);
		confirmClickable(Menu.ProjectPopout.cloudOpen);
		confirmClickable(Menu.ProjectPopout.openLocalFile);
		confirmClickable(Menu.ProjectPopout.openLocalFolder);
//		confirmClickable(Menu.ProjectPopout.openRecent); // Confirm this after we have a recent project
		
		quit();
	}
}
