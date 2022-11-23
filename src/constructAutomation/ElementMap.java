package constructAutomation;

import org.openqa.selenium.By;

public class ElementMap
{
	public static final By accountButton = By.id("userAccountWrap");
	public static final By buyNowTab = By.className("buyNowTab");
	public static final By startPageTab = By.xpath("//span[text()='Start page']/..");
	
	public static class welcomePopup
	{
		public static final By closeX = By.xpath("//*[@id='welcomeTourDialog']/ui-dialog-caption/ui-close-button");
		public static final By tourButton = By.className("tourButton");
		public static final By noThanksLink = By.className("noThanksLink");		
	}	
	public static class startPage
	{
		public static final By newButton = By.className("buttonNew");
	}
	public static class buyNowPage
	{
		public static final By fullRunDownLink = By.linkText("full run down");
		public static final By proceedToPaymentMiddle = By.linkText("//div[@class='proceedOverlay']//div//div//a[@class='openDemo']");
		public static final By pricingPages = By.linkText("visit our pricing pages");
		public static final By proceedToPaymentBottom = By.xpath("//div[@class='c']//a[@class='openDemo']");
	}
	public static class accountDropdown
	{
		public static final By register = By.xpath("//*[@role='menuitem']//span[text()='Register...']");
		public static final By logIn = By.xpath("//*[@role='menuitem']//span[text()='Log in']");
		public static final By purchase = By.xpath("//*[@role='menuitem']//span[text()='Purchase...']");
		public static final By enterAccessCode = By.xpath("//*[@role='menuitem']//span[text()='Enter access code']");
		public static final By viewDetails = By.xpath("//*[@role='menuitem']//span[text()='View details']");
	}
	public static class logInPopup
	{
		public static final By closeX = By.xpath("//*[@id='loginDialog']/ui-dialog-caption/ui-close-button");
		public static final By googleButton = By.className("abcRioButtonContentWrapper");
		public static final By facebookButton = By.className("oAuthLoginButton");
		public static final By usernameField = By.id("username");
		public static final By passwordField = By.id("password");
		public static final By rememberCheckbox = By.id("remember");
		public static final By cancelButton = By.id("cancel");
		public static final By logInButton = By.id("login");
	}
	public static class enterAccessCodePopup
	{
		public static final By closeX = By.xpath("//*[id='inputCheckDialog']/ui-dialog-caption/ui-close-button");
		public static final By accessCodeField = By.className("input");
		public static final By rememberCheckbox = By.className("inputCheckbox");
		public static final By okButton = By.className("okButton");
		public static final By cancelButton = By.className("cancelButton");
	}
}
