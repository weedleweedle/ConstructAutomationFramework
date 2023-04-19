package constructAutomation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Locator Validation")
class LocatorValidation extends constructAutomation.ConstructMethodLibrary
{
	@BeforeAll
	static void setUp()
	{
		start();
		
		dismissWelcomePopup();
		
		logIn();
		
		createRecentProjects(6);
	}
	
	@AfterAll
	static void tearDown()
	{
		quit();
	}
	
	@Nested
	@TestMethodOrder(OrderAnnotation.class)
	@Order(1)
	@DisplayName("Start Page Locator Validation")
	class StartPageValidation
	{
		/**<h1>Validate Welcome Message</h1>
		 * Before we dismiss the Welcome Message, we need to validate its locators. That can't be done because {@link ConstructMethodLibrary#dismissWelcomePopup()} is required for {@link #setUp()}.
		 * We're better off manually verifying these locators.
		 * @author laserwolve
		 */
		@Disabled
		@Test
		@Order(1)
		@DisplayName("Validate Welcome Message")
		void validateWelcomeMessage()
		{	
			confirmClickable(WelcomePopup.class);
		}
		
		@Test
		@Order(2)
		@DisplayName("Validate Columns")
		void validateColumns()
		{
			confirmClickable(StartPage.LearnColumn.class);
			
			confirmClickable(StartPage.ParticipateColumn.class);
			
			confirmClickable(StartPage.ExploreColumn.class);
		}
		
		@Test
		@Order(3)
		@DisplayName("Validate Start Page Examples")
		void validateStartPageExamples()
		{
			confirmClickable(StartPage.RecommendedExamples.class);
		}
		
		@Test
		@Order(4)
		@DisplayName("Validate Social Media Links")
		void validateSocialMediaLinks()
		{
			confirmClickable(StartPage.SocialMedia.class);
		}
		
		@Test
		@Order(5)
		@DisplayName("Validate Start Page Project Buttons")
		void validateStartPageProjectButtons()
		{	
			confirmClickable(StartPage.newButton);
			
			click(StartPage.openButton);
			
			confirmClickable(StartPage.OpenButtonDropdown.class);
			
			click(StartPage.openButton); // Close the dropdown
		}
		
		@Test
		@Order(6)
		@DisplayName("Validate Start Page Recent Projects")
		void validateStartPageRecentProjects()
		{
			for (int row = 1; row <= 6; row++) confirmClickable(StartPage.recentProject(row));
		}
		
		@Test
		@Disabled
		@Order(7)
		@DisplayName("Validate 'Get More Events' Banner")
		void validateGetMoreEventsBanner()
		{
			refresh();
			
			confirmClickable(StartPage.GetMoreEventsBanner.class);
		}
	}
}