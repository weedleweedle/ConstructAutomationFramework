package constructAutomation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
class StartPageLocatorValidation extends ConstructMethodLibrary
{
	@BeforeAll
	static void setUp()
	{
		start();
	}	
	@AfterAll
	static void tearDown()
	{
		quit();
	}	
	@Test
	@Order(1)
	void validateWelcomeMessage()
	{	
		confirmClickable(WelcomePopup.class);
		
		dismissWelcomePopup();
	}	
	@Test
	@Order(2)
	void validateColumns()
	{
		confirmClickable(StartPage.LearnColumn.class);
		
		confirmClickable(StartPage.ParticipateColumn.class);
		
		confirmClickable(StartPage.ExploreColumn.class);
	}
	@Test
	@Order(3)
	void validateStartPageExamples()
	{
		confirmClickable(StartPage.RecommendedExamples.class);
	}
	@Test
	@Order(4)
	void validateSocialMediaLinks()
	{
		confirmClickable(StartPage.SocialMedia.class);
	}
	@Test
	@Order(5)
	void validateStartPageMisc()
	{
		confirmClickable(StartPage.startPageClose);
		
		confirmClickable(StartPage.newButton);
		
		confirmClickable(StartPage.openButton);
		
		click(StartPage.openButton);
		
		confirmClickable(StartPage.OpenButtonDropdown.cloud);
		
		confirmClickable(StartPage.OpenButtonDropdown.file);
		
		confirmClickable(StartPage.OpenButtonDropdown.projectFolder);
	}
}