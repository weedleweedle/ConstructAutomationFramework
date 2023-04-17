package constructAutomation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
class LocatorValidation extends ConstructMethodLibrary
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
		validateLocators(WelcomePopup.class);
		
		dismissWelcomePopup();
	}	
	@Test
	@Order(2)
	void validateLearnColumn()
	{
		validateLocators(StartPage.LearnColumn.class);
	}
}