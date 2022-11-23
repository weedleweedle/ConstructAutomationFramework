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
		public static final By openButton = By.className("buttonOpen");
		
		public static class openButtonDropdown
		{
			public static final By cloud = By.className("option fromCloud");
			public static final By file = By.className("option fromFile");
			public static final By projectFolder = By.className("option fromFolder");
		}
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
	public static class learnColumn
	{
		public static final By beginnersGuide = By.xpath("//a[@data-campaign-content='BeginnersGuide']");
		public static final By manual = By.xpath("//a[@data-campaign-content='Manual']");
		public static final By tutorials = By.xpath("//a[@data-campaign-content='Tutorials']");
	}
	public static class participateColumn
	{
		public static final By arcade = By.xpath("//a[@data-campaign-content='Arcade']");
		public static final By blogs = By.xpath("//a[@data-campaign-content='Blogs']");
		public static final By forum = By.xpath("//a[@data-campaign-content='Forum']");
	}
	public static class exploreColumn
	{
		public static final By assetStore = By.xpath("//a[@data-campaign-content='AssetStore']");
		public static final By whatsNew = By.className("whatsnewlinkbox cardLink -turquoise");
		public static final By constructNet = By.xpath("//a[@data-campaign-content='ConstructNet']");
	}
}
