package constructAutomation;

import org.openqa.selenium.By;

public class ElementMap
{
	public static final By accountButton = By.id("userAccountWrap");
	public static final By buyNowTab = By.className("buyNowTab");
	public static final By startPageTab = By.xpath("//ui-tabbar//span[text()='Start page']/..");
	
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
		public static class recommendedExamples
		{
			public static final By browseExamples = By.id("buttonExamples");
			public static final By example1 = By.xpath("//*[@id='groupExamples']/div[1]");
			public static final By example2 = By.xpath("//*[@id='groupExamples']/div[2]");
			public static final By example3 = By.xpath("//*[@id='groupExamples']/div[3]");
		}
		public static class socialMedia
		{
			public static final By twitter = By.id("linkTwitter");
			public static final By reddit = By.id("linkReddit");
			public static final By youTube = By.id("linkYoutube");
			public static final By facebook = By.id("linkFacebook");
		}
		public By recentProject(String row) // there's a max limit of 5 recent projects
		{
			return By.xpath("//*[@class='cardProject'][" + row + "]");
		}
	}
	public static class buyNowPage
	{
		public static final By fullRunDownLink = By.linkText("full run down");
		public static final By proceedToPaymentMiddle = By.xpath("//div[@class='proceedOverlay']//a[@class='openDemo']");
		public static final By pricingPages = By.linkText("visit our pricing pages");
		public static final By proceedToPaymentBottom = By.xpath("//*[@class='c']//a[@class='openDemo']");
		public static class secondPage
		{
			public static final By emailBox = By.id("Email");
			public static final By youCanLogin = By.linkText("or you can login");
			public static final By generalTAndC = By.linkText("general terms & conditions");
			public static final By storeTAndC = By.linkText("store terms & conditions");
			public static final By privacyPolicy = By.linkText("privacy policy");
			public static final By continueButton = By.id("BtnContinue");
		}
		public static class thirdPage
		{
			public static final By creditOrDebit = By.id("pm1");
			public static final By payPal = By.id("pm2");
			public static final By firstNameBox = By.id("FirstName");
			public static final By lastNameBox = By.id("LastName");
			
			// These two are only visible if "Credit or debit card" is ticked
			public static final By cardNumber = By.xpath("//*[@name='cardnumber']");
			public static final By expDate = By.xpath("//*[@name='exp-date']");
			
			public static final By postCode = By.id("Postcode");
			public static final By countryDropdown = By.id("Country");
			public By country(String country)
			{
				return By.xpath("//*[@id='Country']/*[text()='" + country + "']");
			}
			
			// These two only appear if you select a country other than the default
			public static final By goButton = By.className("go");
			public static final By cancelLink = By.className("cancel");
			
			public static final By phoneNumberBox = By.id("Phone");
			public static final By editEmail = By.className("editEmail");
			public static final By cancellationTerms = By.className("subTerms");
			public static class cancellationTermsPopup
			{
				public static final By contactingUs = By.linkText("contacting us");
				public static final By okButton = By.id("CloseSubTermsOverlayLink");
			}
			public static final By placeOrderButton = By.id("BtnPlaceOrder");
		}
	}
	public static class accountDropdown
	{
		public static final By register = By.xpath("//span[text()='Register...']/..");
		public static final By logIn = By.xpath("//span[text()='Log in']/..");
		public static final By purchase = By.xpath("//span[text()='Purchase...']/..");
		public static final By enterAccessCode = By.xpath("//span[text()='Enter access code']/..");
		public static final By viewDetails = By.xpath("//span[text()='View details']/..");		
		public static class logInPopup
		{
			public static final By closeX = By.xpath("//*[@id='loginDialog']//ui-close-button");
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
			public static final By closeX = By.xpath("//*[id='inputCheckDialog']//ui-close-button");
			public static final By accessCodeField = By.className("input");
			public static final By rememberCheckbox = By.className("inputCheckbox");
			public static final By okButton = By.className("okButton");
			public static final By cancelButton = By.className("cancelButton");
		}
	}
	public static class menuDropdown
	{
		public static final By project = By.xpath("//span[text()='Project'][@class='menu-item-text']/..");
		public static class projectPopout
		{
			public static final By newProject = By.xpath("//span[text()='New']/..");
			public static final By cloudOpen = By.xpath("//span[text()='Cloud open']/..");
			public static final By openLocalFile = By.xpath("//span[text()='Open local file']/..");
			public static final By openLocalFolder = By.xpath("//span[text()='Open local project folder']/..");
		}
		
		public static final By guidedTours = By.xpath("//span[text()='Guided tours']/..");
		public static class guidedToursPopout
		{
			public static final By beginnersGuide = By.xpath("//span[contains(text(),'Beginner')]/..");
			public static final By platformGame = By.xpath("//span[text()='Make a platform game']/..");
			public static final By startedWithtimelineAnimations = By.xpath("//span[text()='Get started with timeline animations']/..");
			public static final By startedWithJavaScript = By.xpath("//span[text()='Get started with JavaScript']/..");
		}
		
		public static final By view = By.xpath("//span[text()='View']/..");
		public static class viewPopout
		{
			public static final By startPage = By.xpath("//span[text()='Start page'][@class='menu-item-text']/..");
			public static final By exampleBrowser = By.xpath("//span[text()='Example browser']/..");
			public static final By addonManager = By.xpath("//span[text()='Addon manager']/..");
			public static final By exportManager = By.xpath("//span[text()='Export manager']/..");
			public static final By storageCleanup = By.xpath("//span[text()='Storage cleanup']/..");
		}
		
		public static final By account = By.xpath("//span[text()='Account']/..");
		public static class accountPopout
		{
			// this has all the same options as the menuDropdown... hmm
		}
		public static final By installAsApp = By.xpath("//span[text()='Install as app']/..");
		public static final By getAddons = By.xpath("//span[text()='Get addons']/..");
		public static final By assetStore = By.xpath("//span[text()='assetStore']/..");
		public static final By settings = By.xpath("//span[text()='Settings']/..");
		public static final By help = By.xpath("//span[text()='Help']/..");
		public static final By about = By.xpath("//span[text()='About']/..");
	}
	public static class cloudOpen // Accessible from the start page, and from the menu
	{
		public static final By closeX = By.xpath("//*[@id='fileListDialog']//ui-close-button");
		public static final By refresh = By.xpath("//*[@title='Refresh']");
		public static final By addFolder = By.xpath("//*[@title='Add Folder']");
		public static final By uploadFile = By.xpath("//*[@title='Upload File']");
		public static final By upToParent = By.xpath("//*[@title='Up to parent folder']");
		public static final By serviceSelector = By.xpath("//select[@corners='default']");
		public static final By logOut = By.xpath("//*[@title='Logout']");
		public static final By searchBox = By.xpath("//ui-toolbar-textbox/input");
		public static final By fileNameBox = By.xpath("//ui-dialog-footer//input");
		public By cloudFolder(String row)
		{
			return By.xpath("//ui-table-row[@tabindex='-1'][" + row + "]");		
		}
		public static class services
		{
			public static final By dropBox = By.xpath("//*[@value='DROPBOX']");
			public static final By oneDrive = By.xpath("//*[@value='ONE DRIVE']");
			public static final By googleDrive = By.xpath("//*[@value='GOOGLE DRIVE']");
		}
	}
}