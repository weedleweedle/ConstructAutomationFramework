package constructAutomation;

import org.openqa.selenium.By;

public class ElementMap
{
	public static class welcomePopup
	{
		public static final By closeX = By.xpath("//*[@id='welcomeTourDialog']/ui-dialog-caption/ui-close-button");
		public static final By tourButton = By.className("tourButton");
		public static final By noThanksLink = By.className("noThanksLink");		
	}
	
	public static final By exampleBrowserTab = By.xpath("//ui-tabbar//span[text()='Example browser']/..");
	public static class exampleBrowser
	{
		public static final By searchBox = By.className("searchInputField");
		
		public By removeFilter(String tag)
		{
			return By.xpath("//div[@id='selectedTags']/div[@data-tag='" + tag.toLowerCase() + "']");
		}
		
		public static final By clearButton = By.className("buttonClear");
		public static final By clearButtonFooter = By.className("resultsFooterClearTags");
		
		public static final By levelsExpander = By.className("titleSection -level");
		public static class levels
		{
			public static final By beginner = By.xpath("//div[@class='section -level']/div[@data-tag='beginner']");
			public static final By intermediate = By.xpath("//div[@class='section -level']/div[@data-tag='intermediate']");
			public static final By advanced = By.xpath("//div[@class='section -level']/div[@data-tag='advanced']");
		}
		
		public static final By categoriesExpander = By.className("titleSection -category");
		public static class categories
		{
			public static final By newFilter = By.xpath("//div[@class='section -category']/div[@data-tag='new']");
			public static final By recommended = By.xpath("//div[@class='section -category']/div[@data-tag='recommended']");
			public static final By demoGame = By.xpath("//div[@class='section -category']/div[@data-tag='demo-game']");
			public static final By guidedTour = By.xpath("//div[@class='section -category']/div[@data-tag='guided-tour']");
			public static final By gameTemplate = By.xpath("//div[@class='section -category']/div[@data-tag='game-template']");
			public static final By bareBonesTemplate = By.xpath("//div[@class='section -category']/div[@data-tag='barebones-template']");
			public static final By gameplayMechanic = By.xpath("//div[@class='section -category']/div[@data-tag='gameplay-mechanic']");
			public static final By featureExample = By.xpath("//div[@class='section -category']/div[@data-tag='feature-example']");
			public static final By scripting = By.xpath("//div[@class='section -category']/div[@data-tag='scripting']");
			public static final By techDemo = By.xpath("//div[@class='section -category']/div[@data-tag='techDemo']");
		}
		
		public static final By genresExpander = By.className("titleSection -genre");
		public static class genres
		{
			public static final By action = By.xpath("//div[@class='section -genre']/div[@data-tag='action']");
			public static final By adventure = By.xpath("//div[@class='section -genre']/div[@data-tag='adventure']");
			public static final By animation = By.xpath("//div[@class='section -genre']/div[@data-tag='animation']");
			public static final By arcade = By.xpath("//div[@class='section -genre']/div[@data-tag='arcade']");
			public static final By fighting = By.xpath("//div[@class='section -genre']/div[@data-tag='fighting']");
			public static final By multiplayer = By.xpath("//div[@class='section -genre']/div[@data-tag='multiplayer']");
			public static final By platformer = By.xpath("//div[@class='section -genre']/div[@data-tag='platformer']");
			public static final By puzzle = By.xpath("//div[@class='section -genre']/div[@data-tag='puzzle']");
			public static final By rpg = By.xpath("//div[@class='section -genre']/div[@data-tag='rpg']");
			public static final By racing = By.xpath("//div[@class='section -genre']/div[@data-tag='racing']");
			public static final By shooter = By.xpath("//div[@class='section -genre']/div[@data-tag='shooter']");
			public static final By strategy = By.xpath("//div[@class='section -genre']/div[@data-tag='strategy']");
		}
		
		public static final By tagsExpander = By.className("titleSection -tag");
		public static class tags
		{
			public static final By threeD = By.xpath("//div[@class='section -tag']/div[@data-tag='3d']");
			public static final By meshDistortion = By.xpath("//div[@class='section -tag']/div[@data-tag='mesh-distortion']");
			public static final By mobile = By.xpath("//div[@class='section -tag']/div[@data-tag='mobile']");
			public static final By performance = By.xpath("//div[@class='section -tag']/div[@data-tag='performance']");
			public static final By sceneGraph = By.xpath("//div[@class='section -tag']/div[@data-tag='scene-graph']");
			public static final By timeline = By.xpath("//div[@class='section -tag']/div[@data-tag='timeline']");
		}
		
		public static final By pluginsExpander = By.className("titleSection -plugin");
		public static class plugins
		{
			public static final By threeDExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'3D')]");
			public static class threeD
			{
				public static final By threeDCamera = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Camera3D']");
				public static final By threeDShape = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Shape3D']");
			}
			
			public static final By dataAndStorageExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Data & storage')]");
			public static class dataAndStorage
			{
				public static final By array = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Arr']");
				public static final By binaryData = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-BinaryData']");
				public static final By dictionary = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Dictionary']");
				public static final By json = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Json']");
				public static final By localStorage = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-LocalStorage']");
				public static final By xml = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-XML']");
			}
			
			public static final By formControls = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Form Controls')]");
			public static class formControls
			{
				public static final By button = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Button']");
				public static final By htmlElement = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-HTMLElement']");
				public static final By iFrame = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-iframe']");
				public static final By list = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-list']");
				public static final By sliderBar = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-sliderbar']");
				public static final By textInput = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-textBox']");
			}
			
			public static final By generalExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'General')]");
			public static class general
			{
				public static final By ninePatch = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-NinePatch']");
				public static final By particles = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Particles']");
				public static final By shadowLight = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-shadowlight']");
				public static final By sprite = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Sprite']");
				public static final By spriteFont = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Spritefont2']");
				public static final By text = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Text']");
				public static final By tiledBackground = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-TiledBg']");
				public static final By tileMap = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Tilemap']");
				public static final By timeLineController = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Timeline']");
			}
			
			public static final By inputExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Input')]");
			public static class input
			{
				public static final By gamePad = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-gamepad']");
				public static final By keyBoard = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Keyboard']");
				public static final By mouse = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Mouse']");
				public static final By touch = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Touch']");
			}
			
			public static final By mediaExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Media')]");
			public static class media
			{
				public static final By audio = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Audio']");
				public static final By geolocation = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Geolocation']");
				public static final By speechRecognition = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-SpeechRecognition']");
				public static final By speechSynthesis = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-SpeechSynthesis']");
				public static final By userMedia = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-UserMedia']");
				public static final By videoRecorder = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-GameRecorder']");
			}
			
			public static final By otherExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Other')]");
			public static class other
			{
				public static final By advancedRandom = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-AdvancedRandom']");
				public static final By blueTooth = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Bluetooth']");
				public static final By date = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Date']");
				public static final By drawingCanvas = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-DrawingCanvas']");
				public static final By platformInfo = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-PlatformInfo']");
				public static final By share = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Share']");
			}
			
			public static final By webExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Web')]");
			public static class web
			{
				public static final By ajax = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-AJAX']");
				public static final By browser = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Browser']");
				public static final By multiplayer = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Multiplayer']");
			}
		}
		
		public static final By behaviorsExpander = By.className("titleSection -behavior");
		public static class behaviors
		{
			public static final By attributesExpander = By.xpath("//*[@class='titleSection -behavior'][text()='Attributes']");
			public static class attributes
			{
				public static final By jumpThru = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-jumpthru']");
				public static final By persist = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Persist']");
				public static final By shadowCaster = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-shadowcaster']");
				public static final By solid = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-solid']");
			}
			
			public static final By generalExpander = By.xpath("//*[@class='titleSection -behavior'][text()='General']");
			public static class general
			{
				public static final By anchor = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Anchor']");
				public static final By boundToLayout = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-bound']");
				public static final By destroyOutsideLayout = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-destroy']");
				public static final By dragNDrop = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-DragnDrop']");
				public static final By fade = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Fade']");
				public static final By flash = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Flash']");
				public static final By lineOfSight = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-LOS']");
				public static final By solid = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-solid']");
				public static final By pin = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Pin']");
				public static final By scrollTo = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-scrollto']");
				public static final By timer = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Timer']");
				public static final By tween = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Tween']");
				public static final By wrap = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Wrap']");
			}
			
			public static final By movementsExpander = By.xpath("//*[@class='titleSection -behavior'][text()='Movements']");
			public static class movements
			{
				public static final By eightDirection = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-EightDir']");
				public static final By bullet = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Bullet']");
				public static final By car = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Car']");
				public static final By custom = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-custom']");
				public static final By moveTo = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-MoveTo']");
				public static final By orbit = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Orbit']");
				public static final By pathFinding = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Pathfinding']");
				public static final By physics = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Physics']");
				public static final By platform = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Platform']");
				public static final By rotate = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Rotate']");
				public static final By sine = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Sin']");
				public static final By tileMovement = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-TileMovement']");
				public static final By turret = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Turret']");
			}
		}
		
		public static final By effectsExpander = By.className("titleSection -effect");
		public static class effects
		{
			
		}
	}
	
	public static final By startPageTab = By.xpath("//ui-tabbar//span[text()='Start page']/..");
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
	
	public static final By buyNowTab = By.className("buyNowTab");
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
	
	public static final By accountButton = By.id("userAccountWrap");
	public static class accountDropdown
	{
		public static final By register = By.xpath("//span[text()='Register...']/..");
		public static final By logIn = By.xpath("//span[text()='Log in']/..");
		public static final By purchase = By.xpath("//span[text()='Purchase...']/..");
		public static final By enterAccessCode = By.xpath("//span[text()='Enter access code']/..");
		public static final By viewDetails = By.xpath("//span[text()='View details']/..");		
	}
	
	public static final By menuButton = By.id("mainMenuButton");
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
		public static class guidedToursPopup
		{
			public static final By menuDots = By.xpath("//ui-menu-dots-button");
			public static final By exitTour = By.xpath("//span[text()='Exit tour']/../..");
			public static final By nextButton = By.className("nextButton bold");
			public static class closeConfirmation
			{
				public static final By closeX = By.xpath("//*[@id='confirmDialog']//ui-close-button");
				public static final By exitButton = By.className("confirmButton bold");
				public static final By cancelButton = By.className("cancelConfirmButton");
			}
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
			/*
			 * Locators are the same as account Dropdown, however these two can't exist
			 * in the DOM together at the same time.
			 */
			public static final By register = By.xpath("//span[text()='Register...']/..");
			public static final By logIn = By.xpath("//span[text()='Log in']/..");
			public static final By purchase = By.xpath("//span[text()='Purchase...']/..");
			public static final By enterAccessCode = By.xpath("//span[text()='Enter access code']/..");
			public static final By viewDetails = By.xpath("//span[text()='View details']/..");
		}
		
		public static final By installAsApp = By.xpath("//span[text()='Install as app']/..");
		public static final By getAddons = By.xpath("//span[text()='Get addons']/..");
		public static final By assetStore = By.xpath("//span[text()='assetStore']/..");
		public static final By settings = By.xpath("//span[text()='Settings']/..");
		public static final By help = By.xpath("//span[text()='Help']/..");
		public static final By about = By.xpath("//span[text()='About']/..");
	}
	
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
	public static class accountInfoPopup
	{
		public static final By closeX = By.xpath("//*[@id='accountInfoDialog']//ui-close-button");
		public static final By help = By.linkText("Help");
		public static final By closeButton = By.className("okButton");
		
		// If logged out...
		public static final By registerAccount = By.linkText("Register a new account");
		public static final By logIn = By.linkText("Log in to existing account");
		
		// If logged in...
		public static final By yourLicenses = By.linkText("Your licenses");
		public static final By editProfile = By.linkText("Edit profile");
	}	
	public static class cloudOpenPopup
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