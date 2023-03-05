package constructAutomation;

import org.openqa.selenium.By;

public class ConstructElementMap extends Data
{
	public static final By iframe = By.xpath("//ui-dialog-contents//iframe");
	public static final By exampleBrowserTab = By.xpath("//ui-tabbar//span[text()='Example browser']/..");
	public static final By progressDialog = By.id("progressDialog");
	public static final class exampleBrowser
	{
		public static final By searchBox = By.className("searchInputField");
		
		public static final By removeFilter(String tag)
		{
			return By.xpath("//div[@id='selectedTags']/div[@data-tag='" + tag.toLowerCase() + "']");
		}
		
		public static final By clearButton = By.className("buttonClear");
		public static final By clearButtonFooter = By.className("resultsFooterClearTags");
		
		public static final By levelsExpander = By.className("titleSection -level");
		public static final class levels
		{
			public static final By beginner = By.xpath("//div[@class='section -level']/div[@data-tag='beginner']");
			public static final By intermediate = By.xpath("//div[@class='section -level']/div[@data-tag='intermediate']");
			public static final By advanced = By.xpath("//div[@class='section -level']/div[@data-tag='advanced']");
		}
		
		public static final By categoriesExpander = By.className("titleSection -category");
		public static final class categories
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
		public static final class genres
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
		public static final class tags
		{
			public static final By threeD = By.xpath("//div[@class='section -tag']/div[@data-tag='3d']");
			public static final By meshDistortion = By.xpath("//div[@class='section -tag']/div[@data-tag='mesh-distortion']");
			public static final By mobile = By.xpath("//div[@class='section -tag']/div[@data-tag='mobile']");
			public static final By performance = By.xpath("//div[@class='section -tag']/div[@data-tag='performance']");
			public static final By sceneGraph = By.xpath("//div[@class='section -tag']/div[@data-tag='scene-graph']");
			public static final By timeline = By.xpath("//div[@class='section -tag']/div[@data-tag='timeline']");
		}
		
		public static final By pluginsExpander = By.className("titleSection -plugin");
		public static final class plugins
		{
			public static final By threeDExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'3D')]");
			public static final class threeD
			{
				public static final By threeDCamera = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Camera3D']");
				public static final By threeDShape = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Shape3D']");
			}
			
			public static final By dataAndStorageExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Data & storage')]");
			public static final class dataAndStorage
			{
				public static final By array = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Arr']");
				public static final By binaryData = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-BinaryData']");
				public static final By dictionary = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Dictionary']");
				public static final By json = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Json']");
				public static final By localStorage = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-LocalStorage']");
				public static final By xml = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-XML']");
			}
			
			public static final By formControls = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Form Controls')]");
			public static final class formControls
			{
				public static final By button = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Button']");
				public static final By htmlElement = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-HTMLElement']");
				public static final By iFrame = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-iframe']");
				public static final By list = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-list']");
				public static final By sliderBar = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-sliderbar']");
				public static final By textInput = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-textBox']");
			}
			
			public static final By generalExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'General')]");
			public static final class general
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
			public static final class input
			{
				public static final By gamePad = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-gamepad']");
				public static final By keyBoard = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Keyboard']");
				public static final By mouse = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Mouse']");
				public static final By touch = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Touch']");
			}
			
			public static final By mediaExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Media')]");
			public static final class media
			{
				public static final By audio = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Audio']");
				public static final By geolocation = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Geolocation']");
				public static final By speechRecognition = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-SpeechRecognition']");
				public static final By speechSynthesis = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-SpeechSynthesis']");
				public static final By userMedia = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-UserMedia']");
				public static final By videoRecorder = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-GameRecorder']");
			}
			
			public static final By otherExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Other')]");
			public static final class other
			{
				public static final By advancedRandom = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-AdvancedRandom']");
				public static final By blueTooth = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Bluetooth']");
				public static final By date = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Date']");
				public static final By drawingCanvas = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-DrawingCanvas']");
				public static final By platformInfo = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-PlatformInfo']");
				public static final By share = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Share']");
			}
			
			public static final By webExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Web')]");
			public static final class web
			{
				public static final By ajax = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-AJAX']");
				public static final By browser = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Browser']");
				public static final By multiplayer = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Multiplayer']");
			}
		}
		
		public static final By behaviorsExpander = By.className("titleSection -behavior");
		public static final class behaviors
		{
			public static final By attributesExpander = By.xpath("//*[@class='titleSection -behavior'][text()='Attributes']");
			public static final class attributes
			{
				public static final By jumpThru = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-jumpthru']");
				public static final By persist = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Persist']");
				public static final By shadowCaster = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-shadowcaster']");
				public static final By solid = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-solid']");
			}
			
			public static final By generalExpander = By.xpath("//*[@class='titleSection -behavior'][text()='General']");
			public static final class general
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
			public static final class movements
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
		public static final class effects
		{
			public static final By threeDExpander = By.xpath("//*[@class='titleSection -effect'][text()='3D']");
			public static final class threeD
			{
				public static final By fogExponential = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-fogexponential']");
			}
			
			public static final By blendExpander = By.xpath("//*[@class='titleSection -effect'][text()='Blend']");
			public static final class blend
			{
				public static final By darken = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-darken']");
				public static final By dodge = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-dodge']");
				public static final By exclusion = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-exclusion']");
				public static final By lighten = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-lighten']");
				public static final By multiply = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-multiply']");
				public static final By overlay = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-overlay']");
				public static final By screen = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-screen']");
				public static final By softLight = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-softlight']");
			}
			
			public static final By colorExpander = By.xpath("//*[@class='titleSection -effect'][text()='Color']");
			public static final class color
			{
				public static final By adjustHsl = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-hsladjust']");
				public static final By alphaClamp = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-alphaclamp']");
				public static final By blurHorizontal = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-blurhorizontal']");
				public static final By blurVertical = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-blurvertical']");
				public static final By grayscale = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-grayscale']");
				public static final By inverse = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-inverse']");
				public static final By noise = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-noise']");
				public static final By pixellate = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-pixellate']");
				public static final By posterize = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-posterize']");
				public static final By radialBlur = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-radialblur']");
				public static final By replaceColor = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-replacecolor']");
				public static final By replaceSolidColor = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-replacesolidcolor']");
				public static final By setColor = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-setcolor']");
				public static final By sharpen = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-sharpen']");
				public static final By tint = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-tint']");
				public static final By vignette = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-vignette']");		
			}
	
			public static final By distortionExpander = By.xpath("//*[@class='titleSection -effect'][text()='Distortion']");
			public static final class distortion
			{
				public static final By bulge = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-bulge']");
				public static final By glass = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-glass']");
				public static final By pulse = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-pulse']");
				public static final By stretch = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-stretch']");
				public static final By swirl = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-swirl']");
				public static final By warpLayout = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-warplayout']");
				public static final By warpObject = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-warpobject']");
				public static final By warpRipple = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-warpripple']");
				public static final By water = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-water']");
			}
			
			public static final By maskExpander = By.xpath("//*[@class='titleSection -effect'][text()='Mask']");
			public static final class mask
			{
				public static final By adjustHslMask = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-hsladjustmask']");
				public static final By warpObjectMask = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-warpobjectmask']");
			}
			
			public static final By normalMappingExpander = By.xpath("//*[@class='titleSection -effect'][text()='Normal mapping']");
			public static final class normalMapping
			{
				public static final By bumpMapping = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-bumpmapping']");
			}
		}
	}
	
	public static final By startPageTab = By.xpath("//ui-tabbar//span[text()='Start page']/..");
	public static final class startPage
	{
		public static final By newButton = By.id("buttonNew");
		public static final By openButton = By.id("buttonOpen");
		public static final class openButtonDropdown
		{
			public static final By cloud = By.xpath("//div[@class='option fromCloud']");
			public static final By file = By.xpath("//div[@class='option fromFile']");
			public static final By projectFolder = By.xpath("//div[@class='option fromFolder']");
		}
		public static final class learnColumn
		{
			public static final By beginnersGuide = By.xpath("//a[@data-campaign-content='BeginnersGuide']");
			public static final By manual = By.xpath("//a[@data-campaign-content='Manual']");
			public static final By tutorials = By.xpath("//a[@data-campaign-content='Tutorials']");
		}
		public static final class participateColumn
		{
			public static final By arcade = By.xpath("//a[@data-campaign-content='Arcade']");
			public static final By blogs = By.xpath("//a[@data-campaign-content='Blogs']");
			public static final By forum = By.xpath("//a[@data-campaign-content='Forum']");
		}
		public static final class exploreColumn
		{
			public static final By assetStore = By.xpath("//a[@data-campaign-content='AssetStore']");
			public static final By whatsNew = By.className("whatsnewlinkbox cardLink -turquoise");
			public static final By constructNet = By.xpath("//a[@data-campaign-content='ConstructNet']");
		}
		public static final class recommendedExamples
		{
			public static final By browseExamples = By.id("buttonExamples");
			public static final By example1 = By.xpath("//*[@id='groupExamples']/div[1]");
			public static final By example2 = By.xpath("//*[@id='groupExamples']/div[2]");
			public static final By example3 = By.xpath("//*[@id='groupExamples']/div[3]");
		}
		public static final class socialMedia
		{
			public static final By twitter = By.id("linkTwitter");
			public static final By reddit = By.id("linkReddit");
			public static final By youTube = By.id("linkYoutube");
			public static final By facebook = By.id("linkFacebook");
		}
		public static final By recentProject(String row) // there's a max limit of 5 recent projects
		{
			return By.xpath("//*[@class='cardProject'][" + row + "]");
		}
	}
	
	public static final By buyNowTab = By.className("buyNowTab");
	public static final class buyNowPage
	{
		public static final By fullRunDownLink = By.linkText("full run down");
		public static final By proceedToPaymentMiddle = By.xpath("//div[@class='proceedOverlay']//a[@class='openDemo']");
		public static final By pricingPages = By.linkText("visit our pricing pages");
		public static final By proceedToPaymentBottom = By.xpath("//*[@class='c']//a[@class='openDemo']");
		public static final class secondPage
		{
			public static final By emailBox = By.id("Email");
			public static final By youCanLogin = By.linkText("or you can login");
			public static final By generalTAndC = By.linkText("general terms & conditions");
			public static final By storeTAndC = By.linkText("store terms & conditions");
			public static final By privacyPolicy = By.linkText("privacy policy");
			public static final By continueButton = By.id("BtnContinue");
		}
		public static final class thirdPage
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
			public static final By country(String country)
			{
				return By.xpath("//*[@id='Country']/*[text()='" + country + "']");
			}
			
			// These two only appear if you select a country other than the default
			public static final By goButton = By.className("go");
			public static final By cancelLink = By.className("cancel");
			
			public static final By phoneNumberBox = By.id("Phone");
			public static final By editEmail = By.className("editEmail");
			public static final By cancellationTerms = By.className("subTerms");
			public static final class cancellationTermsPopup
			{
				public static final By contactingUs = By.linkText("contacting us");
				public static final By okButton = By.id("CloseSubTermsOverlayLink");
			}
			public static final By placeOrderButton = By.id("BtnPlaceOrder");
		}
	}
	
	public static final By accountButton = By.id("userAccountWrap");
	public static final class accountDropdown
	{
		public static final By register = By.xpath("//span[text()='Register...']/..");
		public static final By logIn = By.xpath("//ui-menuitem//span[text()='Log in']/..");
		public static final By purchase = By.xpath("//span[text()='Purchase...']/..");
		public static final By enterAccessCode = By.xpath("//span[text()='Enter access code']/..");
		public static final By viewDetails = By.xpath("//span[text()='View details']/..");		
	}
	
	public static final By menuButton = By.id("mainMenuButton");
	public static final class menuDropdown
	{
		public static final By project = By.xpath("//span[text()='Project'][@class='menu-item-text']/..");
		public static final class projectPopout
		{
			public static final By newProject = By.xpath("//span[text()='New']/..");
			public static final By cloudOpen = By.xpath("//span[text()='Cloud open']/..");
			public static final By openLocalFile = By.xpath("//span[text()='Open local file']/..");
			public static final By openLocalFolder = By.xpath("//span[text()='Open local project folder']/..");
		}
		
		public static final By guidedTours = By.xpath("//span[text()='Guided tours']/..");
		public static final class guidedToursPopout
		{
			public static final By beginnersGuide = By.xpath("//span[contains(text(),'Beginner')]/..");
			public static final By platformGame = By.xpath("//span[text()='Make a platform game']/..");
			public static final By startedWithtimelineAnimations = By.xpath("//span[text()='Get started with timeline animations']/..");
			public static final By startedWithJavaScript = By.xpath("//span[text()='Get started with JavaScript']/..");
		}
		public static final class guidedToursPopup
		{
			public static final By menuDots = By.xpath("//ui-menu-dots-button");
			public static final By exitTour = By.xpath("//span[text()='Exit tour']/../..");
			public static final By nextButton = By.className("nextButton bold");
			public static final class closeConfirmation
			{
				public static final By closeX = By.xpath("//*[@id='confirmDialog']//ui-close-button");
				public static final By exitButton = By.className("confirmButton bold");
				public static final By cancelButton = By.className("cancelConfirmButton");
			}
		}
		
		public static final By view = By.xpath("//span[text()='View']/..");
		public static final class viewPopout
		{
			public static final By startPage = By.xpath("//span[text()='Start page'][@class='menu-item-text']/..");
			public static final By exampleBrowser = By.xpath("//span[text()='Example browser']/..");
			public static final By addonManager = By.xpath("//span[text()='Addon manager']/..");
			public static final By exportManager = By.xpath("//span[text()='Export manager']/..");
			public static final By storageCleanup = By.xpath("//span[text()='Storage cleanup']/..");
		}
		
		public static final By account = By.xpath("//span[text()='Account']/..");
		public static final class accountPopout
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
	
	public static final class welcomePopup
	{
		public static final By closeX = By.xpath("//*[@id='welcomeTourDialog']/ui-dialog-caption/ui-close-button");
		public static final By tourButton = By.className("tourButton");
		public static final By noThanksLink = By.className("noThanksLink");		
	}
	public static final class logInPopup
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
	public static final class enterAccessCodePopup
	{
		public static final By closeX = By.xpath("//*[id='inputCheckDialog']//ui-close-button");
		public static final By accessCodeField = By.className("input");
		public static final By rememberCheckbox = By.className("inputCheckbox");
		public static final By okButton = By.className("okButton");
		public static final By cancelButton = By.className("cancelButton");
	}
	public static final class accountInfoPopup
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
	public static final class aboutPopup
	{
		public static final By closeX = By.xpath("//*[@id='aboutDialog']//ui-close-button");
		public static final By releaseNotes = By.className("viewReleaseNotes");
		
		public static final By platformInformation = By.linkText("Platform information");
		public static final class platformInfoPopup
		{
			public static final By closeX = By.xpath("//*[@id='platformInfoDialog']//ui-close-button");
			public static final By copyButton = By.className("copy");
			public static final By okButton = By.xpath("//*[@id='platformInfoDialog']//*[@class='okButton']");
		}
	
		public static final By accountInfo = By.linkText("View account information");
		
		public static final By storageCleanup = By.linkText("Storage cleanup...");
		
		/*
		 * If persistent storage has been granted, this link doesn't exist.
		 * If persistent storage is requested but not granted, the following error
		 * popup shows. I don't have a way to find out what happens if persisent
		 * storage is requested and approved.
		 */
		public static final By requestPersistentStorage = By.linkText("Request persistent storage");
		public static final class persistentStoragePopup
		{			
			public static final By closeX = By.xpath("//*[@id='okDialog']//ui-close-button");
			public static final By okButton = By.xpath("//*[@id='okDialog']//*[@class='okButton']");
		}
		
		public static final By officialWebsite = By.linkText("Construct.net");
		public static final By aboutUs = By.linkText("About us");
		public static final By help = By.xpath("//*[@id='aboutDialog']//*[@class='helpLink']");
		public static final By forums = By.linkText("Forums");
		public static final By tutorials = By.linkText("Tutorials");
		public static final By getAddons = By.linkText("Get addons");
		public static final By suggestFeatures = By.linkText("Suggest features");
		public static final By reportIssues = By.linkText("Report issues");
		public static final By contributeTranslations = By.linkText("Contribute translations");
		public static final By eula = By.linkText("End-user license agreement");
		public static final By privacyPolicy = By.linkText("Privacy policy");
		public static final By legalInfo = By.linkText("Legal information");
		public static final By okButton = By.xpath("//*[@id='aboutDialog']//*[@class='okButton']");
	}
	public static final class storageCleanupPopup
	{
		public static final By closeX = By.xpath("//*[@id='storageCleanupDialog']//ui-close-button");
		public static final By exportedProjects = By.className("clearExportManagerStorage");
		public static final By nwjsStorage = By.className("clearNwjsStorage");
		public static final By exampleProjects = By.className("clearExampleProjectsStorage");
		public static final By savedVersions = By.className("clearC3Storage");
		public static final By help = By.xpath("//*[@id='storageCleanupDialog']//*[@class='helpLink']");
		public static final By clearStorageButton = By.xpath("//*[@id='storageCleanupDialog']//*[@class='okButton bold']");
		public static final By cancelButton = By.xpath("//*[@id='storageCleanupDialog']//*[@class='cancelButton']");
	}
	public static final class shortBreakPopup
	{
		public static final By closeX = By.xpath("//*[@id='okDialog']//ui-close-button");
		public static final By okButton = By.xpath("//*[@id='okDialog']//*[@class='okButton']");		
	}
	public static final class addonManagerPopup
	{
		public static final By closeX = By.xpath("//*[@id='addonManagerDialog']//ui-close-button");
		public static final By installAddonButton = By.className("installAddon");
		public static final By getAddons = By.linkText("Get addons");
		public static final By okButton = By.xpath("//*[@id='addonManagerDialog']//*[@class='okButton']");
		public static final By addon (String addon)
		{
			return By.xpath("//*[@columnname='name']/*[text()='" + addon + "']/../..");
		}
		public static final class addonContextMenu
		{		
			// This option is available on all addons that aren't Guided tours
			public static final By helpFor = By.xpath("//span[contains(text(),'Help for')]");
			
			// These two options are only available on third party addons
			public static final By downloadAddon = By.xpath("//span[text()='Download .c3addon']");
			public static final By uninstall = By.xpath("//span[text()='Uninstall']");
			
			// This is the only context menu option on built-in Guided tours
			public static final By visitWebsite = By.xpath("//span[text()='Visit website']");
			
		}
		public static final class installAddonPopup
		{
			public static final By closeX = By.xpath("//*[@id='addonConfirmInstallDialog']//ui-close-button");
			public static final By addonWebsite = By.className("addonWebsite");
			public static final By documentationWebsite = By.className("addonDocumentation");
			public static final By cancelButton = By.xpath("//*[@id='addonConfirmInstallDialog']//*[@class='cancelButton']");
			public static final By installButton = By.xpath("//*[@id='addonConfirmInstallDialog']//*[@class='okButton']");
			public static final class installFinishedPopup
			{
				public static final By closeX = By.xpath("//*[@id='okDialog']//ui-close-button");
				public static final By okButton = By.xpath("//*[@id='okDialog']//*[@class='okButton']");		
			}
		}
		public static final class uninstallAddonPopup
		{
			public static final By closeX = By.xpath("//*[@id='confirmDialog']//ui-close-button");
			public static final By uninstallButton = By.xpath("//*[@id='addonConfirmInstallDialog']//*[@class='confirmButton bold']");
			public static final By cancelButton = By.className("cancelConfirmButton");
			public static final class uninstallFinishedPopup
			{
				public static final By closeX = By.xpath("//*[@id='okDialog']//ui-close-button");
				public static final By okButton = By.xpath("//*[@id='okDialog']//*[@class='okButton']");		
			}
		}
	}
	public static final class freeEditionPopup
	{
		public static final By closeX = By.xpath("//*[@id='freeEditionLimitDialog']//ui-close-button");
		public static final By logInLink = By.linkText("log in to your account");
		public static final By purchaseButton = By.xpath("//*[@id='addonManagerDialog']//*[@class='okButton']");
		public static final By learnMoreButton = By.xpath("//*[@id='addonManagerDialog']//*[@class='infoButton']");
		public static final By cancelButton = By.xpath("//*[@id='addonManagerDialog']//*[@class='cancelButton']");
	}
	public static final class exportManagerPopup
	{
		public static final By closeX = By.xpath("//*[@id='archiveManagerDialog']//ui-close-button");
		public static final By addArchive = By.xpath("//*[@title='Add archive']");
		public static final By downloadArchive = By.xpath("//*[@title='Download archive']");
		public static final By deleteArchive = By.xpath("//*[@title='Delete archive']");
		public static final By buildApplication = By.xpath("//*[@title='Build Application']");
		public static final By export (String export)
		{
			return By.xpath("//*[@columnname='project']/*[text()='" + export + "']/../..");
		}
	}
	public static final class settingsPopup
	{
		public static final By closeX = By.xpath("//*[@id='settingsDialog']//ui-close-button");
		
		public static final By languageSetting = By.className("languageSetting");
		public static final By language (String languageCode)
		{
			return By.xpath("//*[@class='languageSetting']/*[@value='" + languageCode + "']");
		}
		
		public static final By uiMode = By.className("uiMode");
		public static final class uiModes
		{
			public static final By auto = By.xpath("//*[@class='uiMode']/*[@value='auto']");
			public static final By mobile = By.xpath("//*[@class='uiMode']/*[@value='mobile']");
			public static final By desktop = By.xpath("//*[@class='uiMode']/*[@value='desktop']");
		}
		
		public static final By simplifiedMode = By.className("useSimplifiedMode");
		public static final By textEditorFontSize = By.className("textEditorFontSize");
		public static final By textEditorAutoIndent = By.className("textEditorAutoIndent");
		
		public static final By theme = By.className("theme");
		public static final class themes
		{
			public static final By defaultTheme = By.xpath("//*[@class='theme']/*[text()='Default (no theme)']");
			public static final By dark = By.xpath("//*[@class='theme']/*[text()='Dark']");
			public static final By light = By.xpath("//*[@class='theme']/*[text()='Light']");
		}
		
		public static final By enableUiAnimations = By.className("enableUIAnims");
		public static final By enableUiEffects = By.className("enableUIEffects");
		public static final By enableNotifications = By.className("enableNotifications");
		public static final By enableTakeABreakReminders = By.className("showTakeBreakReminders");
		public static final By zoomMouseWheelOnly = By.className("zoomMouseWheelOnly");
		public static final By useDefaultIconColor = By.className("useDefaultIconColor");
		public static final By iconColor = By.className("iconColor");
		public static final By resetButton = By.className("resetLayout");
		
		public static final By saveLocation = By.className("defaultSaveLocation");
		public static final class saveLocations
		{
			public static final By cloud = By.xpath("//*[@class='defaultSaveLocation']/*[@value='cloud']");
			public static final By localBrowser = By.xpath("//*[@class='defaultSaveLocation']/*[@value='local-browser']");
			public static final By download = By.xpath("//*[@class='defaultSaveLocation']/*[@value='download']");
			public static final By saveAs = By.xpath("//*[@class='defaultSaveLocation']/*[@value='save-as']");
		}
		
		public static final By enableAutoSave = By.className("enableAutosave");
		
		public static final By backupLocation = By.className("autosaveLocation");
		public static final class backupLocations
		{
			public static final By localStorage = By.xpath("//*[@class='defaultSaveLocation']/*[@value='LOCAL STORAGE']");
			public static final By googleDrive = By.xpath("//*[@class='defaultSaveLocation']/*[@value='GOOGLE DRIVE']");
			public static final By dropBox = By.xpath("//*[@class='defaultSaveLocation']/*[@value='DROPBOX']");
			public static final By oneDrive = By.xpath("//*[@class='defaultSaveLocation']/*[@value='ONE DRIVE']");
			public static final By sameLocation = By.xpath("//*[@class='defaultSaveLocation']/*[@value='MATCH']");
			public static final By localFolder = By.xpath("//*[@class='defaultSaveLocation']/*[@value='WEBFS FOLDER']");
		}
		public static final By chooseLocalBackupButton = By.className("localBackupFolderChoose");
		public static final By autoSaveDuration = By.className("autosaveDuration");
		
		public static final By defaultProjectAuthor = By.className("defaultProjectAuthor");
		public static final By defaultProjectEmail = By.className("defaultProjectEmail");
		public static final By defaultProjectWebsite = By.className("defaultProjectWebsite");
		public static final By defaultAnimationSpeed = By.className("defaultAnimationSpeed");
		
		public static final By releaseNotifications = By.className("updateChannel");
		public static final class releases
		{
			public static final By stable = By.xpath("//*[@class='updateChannel']/*[@value='stable']");
			public static final By beta = By.xpath("//*[@class='updateChannel']/*[@value='beta']");
		}
		
		public static final By previewSelector = By.className("previewMode");
		public static final class previewModes
		{
			public static final By popupWindow = By.xpath("//*[@class='previewMode']/*[@value='popup-window']");
			public static final By browserTab = By.xpath("//*[@class='previewMode']/*[@value='browser-tab']");
			public static final By dialog = By.xpath("//*[@class='previewMode']/*[@value='iframe-dialog']");
		}
		
		public static final By showStartPage = By.className("showStartPage");
		public static final By autoHideStartPage = By.className("autoHideStartPage");
		public static final By showStartPageMessageBanners = By.className("showStartPageMessageBanners");
		public static final By hideAddActionRows = By.className("hideAddActionRows");
		public static final By translateExpressions = By.className("translateExpressions");
		public static final By useInAppClipboard = By.className("useFakeClipboard");
		public static final By cacheCloudMetadata = By.className("cacheCloudMetadata");
		public static final By showInProgressLanguages = By.className("inProgressLanguages");
		public static final By enableExperimentalFeatures = By.className("experimentalFeatures");
		
		public static final By gpuPreference = By.className("gpuPowerPreference");
		public static final class gpuPreferences
		{
			public static final By highPerformance = By.xpath("//*[@class='gpuPowerPreference']/*[@value='high-performance']");
			public static final By defaultPreference = By.xpath("//*[@class='gpuPowerPreference']/*[@value='default']");
			public static final By lowPower = By.xpath("//*[@class='gpuPowerPreference']/*[@value='low-power']");
		}
		
		public static final By help = By.linkText("Help");
		public static final By closeButton = By.xpath("//*[@id='settingsDialog']//*[@class='okButton']");
	}
	public static final class cloudOpenPopup
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
		public static final By cloudFolder(String row)
		{
			return By.xpath("//ui-table-row[@tabindex='-1'][" + row + "]");		
		}
		public static final class services
		{
			public static final By dropBox = By.xpath("//*[@value='DROPBOX']");
			public static final By oneDrive = By.xpath("//*[@value='ONE DRIVE']");
			public static final By googleDrive = By.xpath("//*[@value='GOOGLE DRIVE']");
		}
	}
}