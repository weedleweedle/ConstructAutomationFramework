package constructAutomation;

import org.openqa.selenium.By;

public class ElementMap
{
	public static class welcomePopup
	{
		/*
		 * The popup that appears when you browse to editor.construct.net,
		 * and you're not logged in.
		 */
		public static final By noThanksLink = By.className("noThanksLink");
		public static final By tourButton = By.className("tourButton");
		public static final By closeX = By.xpath("//*[@id=\"welcomeTourDialog\"]/ui-dialog-caption/ui-close-button");
	}
	
	
	public static final By accountButton = By.id("userAccountWrap");
	
	public static class accountDropdown
	{
		public static final By register = By.xpath("//*[@role='menuitem']//span[text()='Register...']");
		public static final By logIn = By.xpath("//*[@role='menuitem']//span[text()='Log in']");
		public static final By purchase = By.xpath("//*[@role='menuitem']//span[text()='Purchase...']");
		public static final By enterAccessCode = By.xpath("//*[@role='menuitem']//span[text()='Enter access code']");
		public static final By viewDetails = By.xpath("//*[@role='menuitem']//span[text()='View details']");
	}
}
