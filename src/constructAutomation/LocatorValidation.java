package constructAutomation;

import org.junit.jupiter.api.Test;


class LocatorValidation extends ConstructMethodLibrary
{
	@Test
	void validateLocators()
	{	
		start();
		
		// Welcome Popup
		{
			confirmClickable(WelcomePopup.closeX);
			
			confirmClickable(WelcomePopup.tourButton);
			
			dismissWelcomePopup(); // confirms WelcomePopup.noThanksLink
		}
		
		// Start Page
		{
			confirmClickable(StartPage.LearnColumn.class);
			
			confirmClickable(StartPage.ParticipateColumn.class);
			
			confirmClickable(StartPage.ExploreColumn.class);
			
			confirmClickable(StartPage.RecommendedExamples.class);
			
			confirmClickable(StartPage.SocialMedia.class);
			
			confirmClickable(StartPage.newButton);
			
			click(StartPage.openButton);
			
			confirmClickable(StartPage.OpenButtonDropdown.class);
			
			for (int row = 1; row <= 6; row++) confirmClickable(StartPage.recentProject(row));
		}
				
		quit();
	}
}
