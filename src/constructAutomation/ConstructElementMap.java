package constructAutomation;

import org.openqa.selenium.By;

/**<h1>Construct Element Map</h1>
 * <code>By</code> objects with locators for all the elements in the Construct Editor.
 * @author laserwolve
 */
class ConstructElementMap extends Data
{
	static class AboutPopup
	{
		/**<h1>Persistent Storage Popup</h1>
		 * Appears when persistent storage is requested, but denied.
		 * @author laserwolve
		 */
		static class PersistentStoragePopup
		{			
			static By closeX = By.xpath("//*[@id='okDialog']//ui-close-button");
			static By okButton = By.xpath("//*[@id='okDialog']//*[@class='okButton']");
		}
		
		static class PlatformInfoPopup
		{
			static By closeX = By.xpath("//*[@id='platformInfoDialog']//ui-close-button");
			static By copyButton = By.xpath("//button[@class='copy']");
			static By okButton = By.xpath("//*[@id='platformInfoDialog']//*[@class='okButton']");
		}
		
		static By aboutUs = By.xpath("//a[text()='About us']");
		static By viewAccountInformation = By.xpath("//a[text()='View account information']");
		static By closeX = By.xpath("//*[@id='aboutDialog']//ui-close-button");	
		static By contributeTranslations = By.xpath("//a[text()='Contribute translations']");	
		static By eula = By.xpath("//a[text()='End-user license agreement']");
		static By forums = By.xpath("//a[text()='Forums']");	
		static By getAddons = By.linkText("//a[text()='Get addons']");
		static By help = By.xpath("//*[@id='aboutDialog']//*[@class='helpLink']");
		static By legalInfo = By.xpath("//a[text()='Legal information']");
		static By officialWebsite = By.xpath("//a[text()='Construct.net']");
		static By okButton = By.xpath("//*[@id='aboutDialog']//*[@class='okButton']");
		static By platformInformation = By.xpath("//a[text()='Platform information']");
		static By privacyPolicy = By.xpath("//a[text()='Privacy policy']");
		static By releaseNotes = By.xpath("//a[@class='viewReleaseNotes']"); // Can't use text as it contains version number, i.e. "View r336 release notes"
		static By reportIssues = By.xpath("//a[text()='Report issues']");
		
		/**<h1>Request Persistent Storage</h1>
		 * If persistent storage has been granted, this link doesn't exist.
		 * @author laserwolve
		 */
		static By requestPersistentStorage = By.xpath("//a[text()='Request persistent storage']");
		static By storageCleanup = By.xpath("//a[text()='Storage cleanup...']");
		static By suggestFeatures = By.xpath("//a[text()='Suggest features']");
		static By tutorials = By.xpath("//a[text()='Tutorials']");
	}
	
	static class AccountDropdown
	{
		static By enterAccessCode = By.xpath("//span[text()='Enter access code']/..");
		static By logIn = By.xpath("//ui-menuitem//span[text()='Log in']/..");
		static By purchase = By.xpath("//span[text()='Purchase...']/..");
		static By register = By.xpath("//span[text()='Register...']/..");
		static By viewDetails = By.xpath("//span[text()='View details']/..");		
	}
	
	static class AccountInfoPopup
	{
		static By closeButton = By.xpath("//button[@class='okButton']");
		static By closeX = By.xpath("//*[@id='accountInfoDialog']//ui-close-button");
		static By editProfile = By.xpath("//a[text()='Edit profile']");
		static By help = By.xpath("//a[text()='Help']");
		static By logInToExistingAccount = By.xpath("//a[text()='Log in to existing account']");
		static By registerAccount = By.xpath("//a[text()='Register a new account']");
		static By yourLicenses = By.xpath("//a[text()='Your licenses']");
	}
	
	static class AddonManagerPopup
	{
		static class AddonContextMenu
		{		
			// These two options are only available on third party addons
			static By downloadAddon = By.xpath("//span[text()='Download .c3addon']");
			
			// This option is available on all addons that aren't Guided tours
			static By helpFor = By.xpath("//span[contains(text(),'Help for')]");
			static By uninstall = By.xpath("//span[text()='Uninstall']");
			
			// This is the only context menu option on built-in Guided tours
			static By visitWebsite = By.xpath("//span[text()='Visit website']");
			
		}
		static class InstallAddonPopup
		{
			static class InstallFinishedPopup
			{
				static By closeX = By.xpath("//*[@id='okDialog']//ui-close-button");
				static By okButton = By.xpath("//*[@id='okDialog']//*[@class='okButton']");		
			}
			static By addonWebsite = By.className("addonWebsite");
			static By cancelButton = By.xpath("//*[@id='addonConfirmInstallDialog']//*[@class='cancelButton']");
			static By closeX = By.xpath("//*[@id='addonConfirmInstallDialog']//ui-close-button");
			static By documentationWebsite = By.className("addonDocumentation");
			static By installButton = By.xpath("//*[@id='addonConfirmInstallDialog']//*[@class='okButton']");
		}
		static class UninstallAddonPopup
		{
			static class UninstallFinishedPopup
			{
				static By closeX = By.xpath("//*[@id='okDialog']//ui-close-button");
				static By okButton = By.xpath("//*[@id='okDialog']//*[@class='okButton']");		
			}
			static By cancelButton = By.className("cancelConfirmButton");
			static By closeX = By.xpath("//*[@id='confirmDialog']//ui-close-button");
			static By uninstallButton = By.xpath("//*[@id='addonConfirmInstallDialog']//*[@class='confirmButton bold']");
		}
		static By closeX = By.xpath("//*[@id='addonManagerDialog']//ui-close-button");
		static By getAddons = By.linkText("Get addons");
		static By installAddonButton = By.className("installAddon");
		static By okButton = By.xpath("//*[@id='addonManagerDialog']//*[@class='okButton']");
		static By addon (String addon)
		{
			return By.xpath("//*[@columnname='name']/*[text()='" + addon + "']/../..");
		}
	}
	static class BuyNow
	{
		static By buyNowTab = By.className("buyNowTab");
		static class Page2
		{
			static By continueButton = By.id("BtnContinue");
			static By emailBox = By.id("Email");
			static By generalTAndC = By.linkText("general terms & conditions");
			static By privacyPolicy = By.linkText("privacy policy");
			static By storeTAndC = By.linkText("store terms & conditions");
			static By youCanLogin = By.linkText("or you can login");
		}
		static class Page3
		{
			static class CancellationTermsPopup
			{
				static By contactingUs = By.linkText("contacting us");
				static By okButton = By.id("CloseSubTermsOverlayLink");
			}
			static By cancellationTerms = By.className("subTerms");
			static By cancelLink = By.className("cancel");
			// These two are only visible if "Credit or debit card" is ticked
			static By cardNumber = By.xpath("//*[@name='cardnumber']");
			
			static By countryDropdown = By.id("Country");
			static By creditOrDebit = By.id("pm1");
			
			static By editEmail = By.className("editEmail");
			static By expDate = By.xpath("//*[@name='exp-date']");
			static By firstNameBox = By.id("FirstName");
			
			// These two only appear if you select a country other than the default
			static By goButton = By.className("go");
			static By lastNameBox = By.id("LastName");
			
			static By payPal = By.id("pm2");
			static By phoneNumberBox = By.id("Phone");
			static By placeOrderButton = By.id("BtnPlaceOrder");
			static By postCode = By.id("Postcode");
			static By country(String country)
			{
				return By.xpath("//*[@id='Country']/*[text()='" + country + "']");
			}
		}
		static By fullRunDownLink = By.linkText("full run down");
		static By pricingPages = By.linkText("visit our pricing pages");
		static By proceedToPaymentBottom = By.xpath("//*[@class='c']//a[@class='openDemo']");
		static By proceedToPaymentMiddle = By.xpath("//div[@class='proceedOverlay']//a[@class='openDemo']");
	}
	static class CloudOpenPopup
	{
		static class Services
		{
			static By dropBox = By.xpath("//*[@value='DROPBOX']");
			static By googleDrive = By.xpath("//*[@value='GOOGLE DRIVE']");
			static By oneDrive = By.xpath("//*[@value='ONE DRIVE']");
		}
		static By addFolder = By.xpath("//*[@title='Add Folder']");
		static By closeX = By.xpath("//*[@id='fileListDialog']//ui-close-button");
		static By fileNameBox = By.xpath("//ui-dialog-footer//input");
		static By logOut = By.xpath("//*[@title='Logout']");
		static By refresh = By.xpath("//*[@title='Refresh']");
		static By searchBox = By.xpath("//ui-toolbar-textbox/input");
		static By serviceSelector = By.xpath("//select[@corners='default']");
		static By uploadFile = By.xpath("//*[@title='Upload File']");
		static By upToParent = By.xpath("//*[@title='Up to parent folder']");
		static By cloudFolder(String row)
		{
			return By.xpath("//ui-table-row[@tabindex='-1'][" + row + "]");		
		}
	}
	static class EnterAccessCodePopup
	{
		static By accessCodeField = By.className("input");
		static By cancelButton = By.className("cancelButton");
		static By closeX = By.xpath("//*[id='inputCheckDialog']//ui-close-button");
		static By okButton = By.className("okButton");
		static By rememberCheckbox = By.className("inputCheckbox");
	}
	static class ExampleBrowser
	{
		static By exampleBrowserTab = By.xpath("//ui-tabbar//span[text()='Example browser']/..");
		static class Behaviors
		{
			static class Attributes
			{
				static By jumpThru = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-jumpthru']");
				static By persist = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Persist']");
				static By shadowCaster = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-shadowcaster']");
				static By solid = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-solid']");
			}
			static class General
			{
				static By anchor = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Anchor']");
				static By boundToLayout = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-bound']");
				static By destroyOutsideLayout = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-destroy']");
				static By dragNDrop = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-DragnDrop']");
				static By fade = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Fade']");
				static By flash = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Flash']");
				static By lineOfSight = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-LOS']");
				static By pin = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Pin']");
				static By scrollTo = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-scrollto']");
				static By solid = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-solid']");
				static By timer = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Timer']");
				static By tween = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Tween']");
				static By wrap = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Wrap']");
			}
			
			static class Movements
			{
				static By bullet = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Bullet']");
				static By car = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Car']");
				static By custom = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-custom']");
				static By eightDirection = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-EightDir']");
				static By moveTo = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-MoveTo']");
				static By orbit = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Orbit']");
				static By pathFinding = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Pathfinding']");
				static By physics = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Physics']");
				static By platform = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Platform']");
				static By rotate = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Rotate']");
				static By sine = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Sin']");
				static By tileMovement = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-TileMovement']");
				static By turret = By.xpath("//*[@class='section -behavior']/*[@data-tag='behavior-Turret']");
			}
			static By attributesExpander = By.xpath("//*[@class='titleSection -behavior'][text()='Attributes']");
			
			static By generalExpander = By.xpath("//*[@class='titleSection -behavior'][text()='General']");
			static By movementsExpander = By.xpath("//*[@class='titleSection -behavior'][text()='Movements']");
		}
		
		static class Categories
		{
			static By bareBonesTemplate = By.xpath("//div[@class='section -category']/div[@data-tag='barebones-template']");
			static By demoGame = By.xpath("//div[@class='section -category']/div[@data-tag='demo-game']");
			static By featureExample = By.xpath("//div[@class='section -category']/div[@data-tag='feature-example']");
			static By gameplayMechanic = By.xpath("//div[@class='section -category']/div[@data-tag='gameplay-mechanic']");
			static By gameTemplate = By.xpath("//div[@class='section -category']/div[@data-tag='game-template']");
			static By guidedTour = By.xpath("//div[@class='section -category']/div[@data-tag='guided-tour']");
			static By newFilter = By.xpath("//div[@class='section -category']/div[@data-tag='new']");
			static By recommended = By.xpath("//div[@class='section -category']/div[@data-tag='recommended']");
			static By scripting = By.xpath("//div[@class='section -category']/div[@data-tag='scripting']");
			static By techDemo = By.xpath("//div[@class='section -category']/div[@data-tag='techDemo']");
		}
		
		static class Effects
		{
			static class Blend
			{
				static By darken = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-darken']");
				static By dodge = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-dodge']");
				static By exclusion = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-exclusion']");
				static By lighten = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-lighten']");
				static By multiply = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-multiply']");
				static By overlay = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-overlay']");
				static By screen = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-screen']");
				static By softLight = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-softlight']");
			}
			static class Color
			{
				static By adjustHsl = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-hsladjust']");
				static By alphaClamp = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-alphaclamp']");
				static By blurHorizontal = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-blurhorizontal']");
				static By blurVertical = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-blurvertical']");
				static By grayscale = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-grayscale']");
				static By inverse = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-inverse']");
				static By noise = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-noise']");
				static By pixellate = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-pixellate']");
				static By posterize = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-posterize']");
				static By radialBlur = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-radialblur']");
				static By replaceColor = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-replacecolor']");
				static By replaceSolidColor = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-replacesolidcolor']");
				static By setColor = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-setcolor']");
				static By sharpen = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-sharpen']");
				static By tint = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-tint']");
				static By vignette = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-vignette']");		
			}
			
			static class Distortion
			{
				static By bulge = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-bulge']");
				static By glass = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-glass']");
				static By pulse = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-pulse']");
				static By stretch = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-stretch']");
				static By swirl = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-swirl']");
				static By warpLayout = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-warplayout']");
				static By warpObject = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-warpobject']");
				static By warpRipple = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-warpripple']");
				static By water = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-water']");
			}
			static class Mask
			{
				static By adjustHslMask = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-hsladjustmask']");
				static By warpObjectMask = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-warpobjectmask']");
			}
			
			static class MormalMapping
			{
				static By bumpMapping = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-bumpmapping']");
			}
			static class ThreeD
			{
				static By fogExponential = By.xpath("//*[@class='section -effect']/*[@data-tag='effect-fogexponential']");
			}
	
			static By blendExpander = By.xpath("//*[@class='titleSection -effect'][text()='Blend']");
			static By colorExpander = By.xpath("//*[@class='titleSection -effect'][text()='Color']");
			
			static By distortionExpander = By.xpath("//*[@class='titleSection -effect'][text()='Distortion']");
			static By maskExpander = By.xpath("//*[@class='titleSection -effect'][text()='Mask']");
			
			static By normalMappingExpander = By.xpath("//*[@class='titleSection -effect'][text()='Normal mapping']");
			static By threeDExpander = By.xpath("//*[@class='titleSection -effect'][text()='3D']");
		}
		static class Genres
		{
			static By action = By.xpath("//div[@class='section -genre']/div[@data-tag='action']");
			static By adventure = By.xpath("//div[@class='section -genre']/div[@data-tag='adventure']");
			static By animation = By.xpath("//div[@class='section -genre']/div[@data-tag='animation']");
			static By arcade = By.xpath("//div[@class='section -genre']/div[@data-tag='arcade']");
			static By fighting = By.xpath("//div[@class='section -genre']/div[@data-tag='fighting']");
			static By multiplayer = By.xpath("//div[@class='section -genre']/div[@data-tag='multiplayer']");
			static By platformer = By.xpath("//div[@class='section -genre']/div[@data-tag='platformer']");
			static By puzzle = By.xpath("//div[@class='section -genre']/div[@data-tag='puzzle']");
			static By racing = By.xpath("//div[@class='section -genre']/div[@data-tag='racing']");
			static By rpg = By.xpath("//div[@class='section -genre']/div[@data-tag='rpg']");
			static By shooter = By.xpath("//div[@class='section -genre']/div[@data-tag='shooter']");
			static By strategy = By.xpath("//div[@class='section -genre']/div[@data-tag='strategy']");
		}
		
		static class Levels
		{
			static By advanced = By.xpath("//div[@class='section -level']/div[@data-tag='advanced']");
			static By beginner = By.xpath("//div[@class='section -level']/div[@data-tag='beginner']");
			static By intermediate = By.xpath("//div[@class='section -level']/div[@data-tag='intermediate']");
		}
		static class Plugins
		{
			static class DataAndStorage
			{
				static By array = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Arr']");
				static By binaryData = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-BinaryData']");
				static By dictionary = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Dictionary']");
				static By json = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Json']");
				static By localStorage = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-LocalStorage']");
				static By xml = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-XML']");
			}
			static class FormControls
			{
				static By button = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Button']");
				static By htmlElement = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-HTMLElement']");
				static By iFrame = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-iframe']");
				static By list = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-list']");
				static By sliderBar = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-sliderbar']");
				static By textInput = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-textBox']");
			}
			
			static class General
			{
				static By ninePatch = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-NinePatch']");
				static By particles = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Particles']");
				static By shadowLight = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-shadowlight']");
				static By sprite = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Sprite']");
				static By spriteFont = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Spritefont2']");
				static By text = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Text']");
				static By tiledBackground = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-TiledBg']");
				static By tileMap = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Tilemap']");
				static By timeLineController = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Timeline']");
			}
			static class Input
			{
				static By gamePad = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-gamepad']");
				static By keyBoard = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Keyboard']");
				static By mouse = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Mouse']");
				static By touch = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Touch']");
			}
			
			static class Media
			{
				static By audio = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Audio']");
				static By geolocation = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Geolocation']");
				static By speechRecognition = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-SpeechRecognition']");
				static By speechSynthesis = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-SpeechSynthesis']");
				static By userMedia = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-UserMedia']");
				static By videoRecorder = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-GameRecorder']");
			}
			static class Other
			{
				static By advancedRandom = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-AdvancedRandom']");
				static By blueTooth = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Bluetooth']");
				static By date = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Date']");
				static By drawingCanvas = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-DrawingCanvas']");
				static By platformInfo = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-PlatformInfo']");
				static By share = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Share']");
			}
			
			static class ThreeD
			{
				static By threeDCamera = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Camera3D']");
				static By threeDShape = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Shape3D']");
			}
			static class Web
			{
				static By ajax = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-AJAX']");
				static By browser = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Browser']");
				static By multiplayer = By.xpath("//*[@class='section -plugin']/*[@data-tag='plugin-Multiplayer']");
			}
			
			static By dataAndStorageExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Data & storage')]");
			static By formControls = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Form Controls')]");
			
			static By generalExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'General')]");
			static By inputExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Input')]");
			
			static By mediaExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Media')]");
			static By otherExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Other')]");
			
			static By threeDExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'3D')]");
			static By webExpander = By.xpath("//*[@class='titleSection -plugin'][contains(text(),'Web')]");
		}
		
		static class Tags
		{
			static By meshDistortion = By.xpath("//div[@class='section -tag']/div[@data-tag='mesh-distortion']");
			static By mobile = By.xpath("//div[@class='section -tag']/div[@data-tag='mobile']");
			static By performance = By.xpath("//div[@class='section -tag']/div[@data-tag='performance']");
			static By sceneGraph = By.xpath("//div[@class='section -tag']/div[@data-tag='scene-graph']");
			static By threeD = By.xpath("//div[@class='section -tag']/div[@data-tag='3d']");
			static By timeline = By.xpath("//div[@class='section -tag']/div[@data-tag='timeline']");
		}
		static By behaviorsExpander = By.className("titleSection -behavior");
		
		static By categoriesExpander = By.className("titleSection -category");
		static By clearButton = By.className("buttonClear");
		
		static By clearButtonFooter = By.className("resultsFooterClearTags");
		static By effectsExpander = By.className("titleSection -effect");
		
		static By genresExpander = By.className("titleSection -genre");
		static By levelsExpander = By.className("titleSection -level");
		
		static By pluginsExpander = By.className("titleSection -plugin");
		static By searchBox = By.className("searchInputField");
		
		static By tagsExpander = By.className("titleSection -tag");
		static By removeFilter(String tag)
		{
			return By.xpath("//div[@id='selectedTags']/div[@data-tag='" + tag.toLowerCase() + "']");
		}
	}
	static class ExportManagerPopup
	{
		static By addArchive = By.xpath("//*[@title='Add archive']");
		static By buildApplication = By.xpath("//*[@title='Build Application']");
		static By closeX = By.xpath("//*[@id='archiveManagerDialog']//ui-close-button");
		static By deleteArchive = By.xpath("//*[@title='Delete archive']");
		static By downloadArchive = By.xpath("//*[@title='Download archive']");
		static By export (String export)
		{
			return By.xpath("//*[@columnname='project']/*[text()='" + export + "']/../..");
		}
	}
	static class FreeEditionPopup
	{
		static By cancelButton = By.xpath("//*[@id='addonManagerDialog']//*[@class='cancelButton']");
		static By closeX = By.xpath("//*[@id='freeEditionLimitDialog']//ui-close-button");
		static By learnMoreButton = By.xpath("//*[@id='addonManagerDialog']//*[@class='infoButton']");
		static By logInLink = By.linkText("log in to your account");
		static By purchaseButton = By.xpath("//*[@id='addonManagerDialog']//*[@class='okButton']");
	}	
	static class LogInDialog
	{
		static By loginDialog = By.id("loginDialog");
		static By cancelButton = By.id("cancel");
		static By closeX = By.xpath("//*[@id='loginDialog']//ui-close-button");
		static By facebookButton = By.className("oAuthLoginButton");
		static By googleButton = By.className("abcRioButtonContentWrapper");
		static By logInButton = By.id("login");
		static By passwordField = By.id("password");
		static By rememberCheckbox = By.id("remember");
		static By usernameField = By.id("username");
	}
	static class GuidedToursPopup
	{
		static class CloseConfirmation // This window is titled "Account logged out", regardless of login status. That's probably a bug
		{
			static By cancelButton = By.xpath("//button[@class='cancelConfirmButton']");
			static By closeX = By.xpath("//*[@id='confirmDialog']//ui-close-button");
			static By exitButton = By.xpath("//button[@class='confirmButton bold']");
		}
		static By exitTour = By.xpath("//span[text()='Exit tour']/../..");
		static By menuDots = By.xpath("//ui-menu-dots-button");
		static By nextButton = By.xpath("//button[@class='nextButton bold']");
	}
	
	static class setUpBackupsPopup
	{
		static By closeX = By.xpath("//dialog[@id='confirmDialog']//ui-close-button");
		static By learnMore = By.xpath("//a[text()='Learn more']");
		static By openSettings = By.xpath("//button[@class='confirmButton bold']");
		static By saveAnyway = By.xpath("//button[@class='cancelConfirmButton']");
	}
	static By menuButton = By.id("mainMenuButton");
	
	/**<h1>Menu Dropdown</h1>
	 * Like other menus, the menu will wholly populate instantaneously, but the icon images for the menu items will populate individually, presumably
	 * as they load.
	 * @author laserwolve
	 */
	static class MenuDropdown
	{
		static By project = By.xpath("//span[text()='Project'][@class='menu-item-text']/..");
		
		/**<h1>Project Popout</h1>
		 * This popout has different contents depending on various conditions.
		 * @author laserwolve
		 */
		static class ProjectPopout
		{
			/**<h1>New</h1>
			 * We can't name this variable just "new" because that's a Java keyword. "New" is the first option when a project isn't open.
			 * It's the 3rd from the bottom if a project is open, and there are recent projects. It's the 2nd from the bottom if a project is open,
			 * and there are no recent projects.
			 * @author laserwolve
			 */
			static By newProject = By.xpath("//span[text()='New']/..");
			static class OpenRecentPopout {
				
				/** The element for a recent project under "Open recent". Neither these elements or the "Open recent" element will be present
				 * if there's no recent projects. You'll need to match the project name almost exactly if it's named similarly to the other UI menu items.
				 * @author laserwolve
				 * @param name The name of the project for which to search.
				 * @return The first recent project that contains 'name'.
				 */
				static By recentProject (String name) {
					return By.xpath("(//span[contains(text(), '" + name + "')]/..)[1]");
				}
			}
			static By cloudOpen = By.xpath("//span[text()='Cloud open']/..");
			static By openLocalFile = By.xpath("//span[text()='Open local file']/..");
			static By openLocalFolder = By.xpath("//span[text()='Open local project folder']/..");
			static By openRecent = By.xpath("//span[text()='Open recent']/..");
			static By save = By.xpath("//span[text()='Save']/..");
			static By saveAs = By.xpath("//span[text()='Save as']/..");
			static class saveAsPopout
			{
				static By cloudSave = By.xpath("//span[text()='Cloud save']/..");
				static By saveAsSingleFile = By.xpath("//span[text()='Save as single file...']/..");
				static By saveAsProjectFolder = By.xpath("//span[text()='Save as project folder...']/..");
				static By downloadACopy = By.xpath("//span[text()='Download a copy']/..");
			}
			static By preview = By.xpath("//span[text()='Preview']/..");
			static By remotePreview = By.xpath("//span[text()='Remote preview']/..");
			static By debug = By.xpath("//span[text()='Debug']/..");
			static By export = By.xpath("//span[text()='Export']/..");
			static By closeProject = By.xpath("//span[text()='Close project']/..");
		}
		static class AccountPopout
		{
			static By enterAccessCode = By.xpath("//span[text()='Enter access code']/..");
			static By logIn = By.xpath("//span[text()='Log in']/..");
			static By purchase = By.xpath("//span[text()='Purchase...']/..");
			/*
			 * Locators are the same as account Dropdown, however these two can't exist
			 * in the DOM together at the same time.
			 */
			static By register = By.xpath("//span[text()='Register...']/..");
			static By viewDetails = By.xpath("//span[text()='View details']/..");
		}
		static class GuidedToursPopout
		{
			static By beginnersGuide = By.xpath("//span[contains(text(),'Beginner')]/..");
			static By platformGame = By.xpath("//span[text()='Make a platform game']/..");
			static By getStartedWithJavaScript = By.xpath("//span[text()='Get started with JavaScript']/..");
			static By getStartedWithTimelineAnimations = By.xpath("//span[text()='Get started with timeline animations']/..");
		}
		
		static class ViewPopout
		{
			static By addonManager = By.xpath("//span[text()='Addon manager']/..");
			static By exampleBrowser = By.xpath("//span[text()='Example browser']/..");
			static By exportManager = By.xpath("//span[text()='Export manager']/..");
			static By startPage = By.xpath("//span[text()='Start page'][@class='menu-item-text']/..");
			static By storageCleanup = By.xpath("//span[text()='Storage cleanup']/..");
		}
		
		static By about = By.xpath("//span[text()='About']/..");
		static By account = By.xpath("//span[text()='Account']/..");
		
		static By assetStore = By.xpath("//span[text()='Asset Store']/..");
		static By getAddons = By.xpath("//span[text()='Get addons']/..");
		
		static By guidedTours = By.xpath("//span[text()='Guided tours']/..");
		static By help = By.xpath("//span[text()='Help']/..");
		
		/**<h1>Install as app</h1>
		 * This menu item is not present in incognito/InPrivate browsing sessions.
		 * @author laserwolve
		 */
		static By installAsApp = By.xpath("//span[text()='Install as app']/..");
		static By settings = By.xpath("//span[text()='Settings']/..");
		static By view = By.xpath("//span[text()='View']/..");
	}
	static class Project
	{
		static By projectTab (String name)
		{
			return By.xpath("//ui-tab[starts-with(@title, 'Layout: " + name + "')]");
		}
		
		static class AnimationsEditor
		{			
			static class AnimationsPane
			{
				static By lastAnimation = By.xpath("(//ui-animation-editor-panel[@class='animationsEditorAnimations']//ui-treeitem//div)[last()]");
				
				static class AnimationsContextMenu
				{
					static class ImportAnimationsContext
					{
						static By fromFiles = By.xpath("//span[text()='From Files']");
					}
					static By importAnimations = By.xpath("//span[text()='Import Animation']");
				}
				// Used to bring up the context menu
				static By animationsPaneBackground = By.xpath("//ui-animation-editor-panel-content/ui-tree");
				
				/**<h1>Animations Pane Background Context Menu</h1>
				 * This is the context menu that's brought up when performing a context click on the animations pane's background.
				 * It is not the same as the context menu that's brought up when performing a context click on an individual animation.
				 * The context click must be performed very close to the edges of the animations pane's background to sucessfully bring up the desired context menu if many animations are already present.
				 * @author laserwolve
				 */
				static class BackgroundContextMenu
				{
					static By addAnimation = By.xpath("//span[text()='Add Animation']/parent::*");
				}
			}
		}
		static class CreateNewObjectTypePopup
		{
			static By name = By.id("crObjectTypeNameInput");
			static By searchBar = By.xpath("//dialog[@id='createNewObjectTypeDialog']//input[@type='search']");
		}
		static class ProjectBar
		{
			static class ProjectFolder
			{
				static class ObjectTypesContext
				{
					static By addNewObjectType = By.xpath("//span[text()='Add new object type']");
				}
				static By objectTypes = By.xpath("//span[text()='Object types']");
			}
			static By projectTreeItem (String name) {
				return By.xpath("(//span[@class='tree-item-name' and text()='" + name + "'])[1]");
			}
		}
		
		static By save = By.xpath("//ui-toolbar-button[@title='Save project']");
		static By undo = By.xpath("//div[@title='Undo']");
		static By viewUndoStack = By.xpath("//div[@title='View undo stack']");
		
		/**<h1>Undo Stack</h1>
		 * Gets a <code>By</code> for an undo action in the stack, specified by a number. This method is 0-based but Construct's undo stack is 1-based,
		 * at least in the UI. This is a very weak locator so it might break in the future.
		 * @param number The (0-based) number of the desired undo action
		 * @return A <code>By</code> with a locator for the element of the desired undo action
		 * @author laserwolve
		 */
		static By undoStack (int number)
		{
			return By.xpath("(//span[@class='menu-item-text'])[" + number + "]");
		}
		
		static By redo = By.xpath("//div[@title='Redo']");
		static By viewRedoStack = By.xpath("//div[@title='View redo stack']");
		
		/**<h1>Redo Stack</h1>
		 * Uses the same locators as {@link #undoStack(int)}, but these two menu items can't be open at the same time.
		 * @param number The (0-based) number of the desired undo action
		 * @return A <code>By</code> with a locator for the element of the desired undo action
		 * @author laserwolve
		 * @see {@link #undoStack(int)}
		 */
		static By redoStack (int number)
		{
			return By.xpath("(//span[@class='menu-item-text'])[" + number + "]");
		}
		
		static By preview = By.xpath("//div[@title='Preview']");
		static By viewOtherPreviewOptions = By.xpath("//div[@title='Other preview options']");
		
		static class OtherPreviewOptions
		{
			static By previewLayout = By.xpath("//span[@class='menu-item-text'][text()='Preview layout']");
			static By debugLayout = By.xpath("//span[@class='menu-item-text'][text()='Debug layout']");
			static By previewProject = By.xpath("//span[@class='menu-item-text'][text()='Preview project']");
			static By remotePreview = By.xpath("//span[@class='menu-item-text'][text()='Remote preview']");
		}
		
		static class projectBar
		{
			static By searchBar = By.xpath("//input[@class='search']");
			
			/**<h1>Search Result</h1>
			 * The desired result after searching in the Project Bar. The object will be the first result, which is the one returned by this method.
			 * The following results are the references of the object in its respective families, if any.
			 * @param query The exact name of the object.
			 * @return A <code>By</code> for this object in the Project Bar.
			 * @author laserwolve
			 */
			static By searchResult (String query)
			{
				return By.xpath("(//span[text()='" + query + "'])[1]");
			}
			
			static class ContextMenu
			{
				static By editAnimations = By.xpath("//span[text()='Edit animations']/parent::ui-menuitem");
			}
		}
	}
	
	static class SettingsPopup
	{
		static class BackupLocations
		{
			static By dropBox = By.xpath("//*[@class='defaultSaveLocation']/*[@value='DROPBOX']");
			static By googleDrive = By.xpath("//*[@class='defaultSaveLocation']/*[@value='GOOGLE DRIVE']");
			static By localFolder = By.xpath("//*[@class='defaultSaveLocation']/*[@value='WEBFS FOLDER']");
			static By localStorage = By.xpath("//*[@class='defaultSaveLocation']/*[@value='LOCAL STORAGE']");
			static By oneDrive = By.xpath("//*[@class='defaultSaveLocation']/*[@value='ONE DRIVE']");
			static By sameLocation = By.xpath("//*[@class='defaultSaveLocation']/*[@value='MATCH']");
		}
		
		static class GpuPreferences
		{
			static By defaultPreference = By.xpath("//*[@class='gpuPowerPreference']/*[@value='default']");
			static By highPerformance = By.xpath("//*[@class='gpuPowerPreference']/*[@value='high-performance']");
			static By lowPower = By.xpath("//*[@class='gpuPowerPreference']/*[@value='low-power']");
		}
		static class PreviewModes
		{
			static By browserTab = By.xpath("//*[@class='previewMode']/*[@value='browser-tab']");
			static By dialog = By.xpath("//*[@class='previewMode']/*[@value='iframe-dialog']");
			static By popupWindow = By.xpath("//*[@class='previewMode']/*[@value='popup-window']");
		}
		
		static class Releases
		{
			static By beta = By.xpath("//*[@class='updateChannel']/*[@value='beta']");
			static By stable = By.xpath("//*[@class='updateChannel']/*[@value='stable']");
		}
		static class SaveLocations
		{
			static By cloud = By.xpath("//*[@class='defaultSaveLocation']/*[@value='cloud']");
			static By download = By.xpath("//*[@class='defaultSaveLocation']/*[@value='download']");
			static By localBrowser = By.xpath("//*[@class='defaultSaveLocation']/*[@value='local-browser']");
			static By saveAs = By.xpath("//*[@class='defaultSaveLocation']/*[@value='save-as']");
		}
		
		static class Themes
		{
			static By dark = By.xpath("//*[@class='theme']/*[text()='Dark']");
			static By defaultTheme = By.xpath("//*[@class='theme']/*[text()='Default (no theme)']");
			static By light = By.xpath("//*[@class='theme']/*[text()='Light']");
		}
		static class UiModes
		{
			static By auto = By.xpath("//*[@class='uiMode']/*[@value='auto']");
			static By desktop = By.xpath("//*[@class='uiMode']/*[@value='desktop']");
			static By mobile = By.xpath("//*[@class='uiMode']/*[@value='mobile']");
		}
		static By autoHideStartPage = By.className("autoHideStartPage");
		
		static By autoSaveDuration = By.className("autosaveDuration");
		static By backupLocation = By.className("autosaveLocation");
		
		static By cacheCloudMetadata = By.className("cacheCloudMetadata");
		static By chooseLocalBackupButton = By.className("localBackupFolderChoose");
		static By closeButton = By.xpath("//*[@id='settingsDialog']//*[@class='okButton']");
		static By closeX = By.xpath("//*[@id='settingsDialog']//ui-close-button");
		static By defaultAnimationSpeed = By.className("defaultAnimationSpeed");
		static By defaultProjectAuthor = By.className("defaultProjectAuthor");
		static By defaultProjectEmail = By.className("defaultProjectEmail");
		static By defaultProjectWebsite = By.className("defaultProjectWebsite");
		
		static By enableAutoSave = By.className("enableAutosave");
		static By enableExperimentalFeatures = By.className("experimentalFeatures");
		
		static By enableNotifications = By.className("enableNotifications");
		
		static By enableTakeABreakReminders = By.className("showTakeBreakReminders");
		static By enableUiAnimations = By.className("enableUIAnims");
		static By enableUiEffects = By.className("enableUIEffects");
		static By gpuPreference = By.className("gpuPowerPreference");
		
		static By help = By.linkText("Help");
		static By hideAddActionRows = By.className("hideAddActionRows");
		static By iconColor = By.className("iconColor");
		static By languageSetting = By.className("languageSetting");
		
		static By previewSelector = By.className("previewMode");
		static By releaseNotifications = By.className("updateChannel");
		
		static By resetButton = By.className("resetLayout");
		static By saveLocation = By.className("defaultSaveLocation");
		
		static By showInProgressLanguages = By.className("inProgressLanguages");
		static By showStartPage = By.className("showStartPage");
		static By showStartPageMessageBanners = By.className("showStartPageMessageBanners");
		static By simplifiedMode = By.className("useSimplifiedMode");
		static By textEditorAutoIndent = By.className("textEditorAutoIndent");
		static By textEditorFontSize = By.className("textEditorFontSize");
		static By theme = By.className("theme");
		static By translateExpressions = By.className("translateExpressions");
		static By uiMode = By.className("uiMode");
		
		static By useDefaultIconColor = By.className("useDefaultIconColor");
		static By useInAppClipboard = By.className("useFakeClipboard");
		
		static By zoomMouseWheelOnly = By.className("zoomMouseWheelOnly");
		static By language (String languageCode)
		{
			return By.xpath("//*[@class='languageSetting']/*[@value='" + languageCode + "']");
		}
	}
	static class ShortBreakPopup
	{
		static By closeX = By.xpath("//*[@id='okDialog']//ui-close-button");
		static By okButton = By.xpath("//*[@id='okDialog']//*[@class='okButton']");		
	}
	static class StartPage
	{
		static By startPageTab = By.xpath("//ui-tabbar//span[text()='Start page']/..");
		static By startPageClose = By.xpath("//ui-tabbar//span[text()='Start page']/following-sibling::ui-close-button");
		static class ExploreColumn
		{
			static By assetStore = By.xpath("//a[@data-campaign-content='AssetStore']");
			static By constructNet = By.xpath("//a[@data-campaign-content='ConstructNet']");
			static By whatsNew = By.xpath("//a[@class='whatsnewlinkbox cardLink -turquoise']");
		}
		static class LearnColumn
		{
			static By beginnersGuide = By.xpath("//a[@data-campaign-content='BeginnersGuide']");
			static By manual = By.xpath("//a[@data-campaign-content='Manual']");
			static By tutorials = By.xpath("//a[@data-campaign-content='Tutorials']");
		}
		static class OpenButtonDropdown
		{
			static By cloud = By.xpath("//div[@class='option fromCloud']");
			static By file = By.xpath("//div[@class='option fromFile']");
			static By projectFolder = By.xpath("//div[@class='option fromFolder']");
		}
		static class ParticipateColumn
		{
			static By arcade = By.xpath("//a[@data-campaign-content='Arcade']");
			static By blogs = By.xpath("//a[@data-campaign-content='Blogs']");
			static By forum = By.xpath("//a[@data-campaign-content='Forum']");
		}
		static class RecommendedExamples
		{
			static By browseExamples = By.id("buttonExamples");
			static By example1 = By.xpath("//*[@id='groupExamples']/div[1]");
			static By example2 = By.xpath("//*[@id='groupExamples']/div[2]");
			static By example3 = By.xpath("//*[@id='groupExamples']/div[3]");
		}
		static class SocialMedia
		{
			static By facebook = By.id("linkFacebook");
			static By reddit = By.id("linkReddit");
			static By twitter = By.id("linkTwitter");
			static By youTube = By.id("linkYoutube");
		}
		
		/**<h1>"Get More Events" Banner</h1>
		 * This banner only pops up while not logged in and it's not the first time per session visiting <a href="https://editor.construct.net/">editor.construct.net</a>.
		 * If closed, the banner will not appear on subsequent visits.
		 * @author laserwolve
		 */
		static class GetMoreEventsBanner
		{
			static By closeX = By.xpath("//div[@id='banner']//div[@class='buttonClose']");
			static By registerAnAccount = By.xpath("//a[text()='Register an account']");
			static By logIn = By.xpath("//a[text()='log in']");
		}
		static By newButton = By.id("buttonNew");
		static By openButton = By.id("buttonOpen");
		static By recentProject(int row) // there's a max limit of 6 recent projects
		{
			return By.xpath("//*[@class='cardProject'][" + row + "]");
		}
	}
	static class StorageCleanupPopup
	{
		static By cancelButton = By.xpath("//*[@id='storageCleanupDialog']//*[@class='cancelButton']");
		static By clearStorageButton = By.xpath("//*[@id='storageCleanupDialog']//*[@class='okButton bold']");
		static By closeX = By.xpath("//*[@id='storageCleanupDialog']//ui-close-button");
		static By exampleProjects = By.className("clearExampleProjectsStorage");
		static By exportedProjects = By.className("clearExportManagerStorage");
		static By help = By.xpath("//*[@id='storageCleanupDialog']//*[@class='helpLink']");
		static By nwjsStorage = By.className("clearNwjsStorage");
		static By savedVersions = By.className("clearC3Storage");
	}
	static By welcomePopup = By.id("welcomeTourDialog");
	static class WelcomePopup
	{
		// Clicking any button on the popup will dismiss it for the remainder of that browser session.
		static By closeX = By.xpath("//*[@id='welcomeTourDialog']/ui-dialog-caption/ui-close-button");
		static By noThanksLink = By.className("noThanksLink");
		static By tourButton = By.className("tourButton");		
	}	
	static class UserAccountButton
	{
		static By userAccountButton = By.id("userAccountWrap");
		
		/**<h1>User License Type</h1>
		 * The text of this element is always "Free edition". If the license type of the account that's signed in is not "Free edition", this element is hidden.
		 * @author laserwolve
		 */
		static By userLicenseType = By.id("userLicenseType");
		
		/**<h1>User Account Name</h1>
		 * Defaults to "Guest" while signed out, and the username "Guest" is not permitted when creating a Construct account. However, an account by this name does actually exist, ableit lower case.
		 * @see <a href="https://www.construct.net/en/users/42941/guest">User named "guest"</a>
		 * @author laserwolve
		 */
		static By userAccountName = By.id("userAccountName");
	}
	static class NewProjectPopup
	{
		static By name = By.id("npProjectNameInput");
		static By choosePreset = By.id("npPresetSelect");
		static class Presets
		{
			static By retroStyle = By.xpath("//option[@value='retro-style']");
			static By sdLandscape43 = By.xpath("//option[@value='sd-landscape-4-3']");
			// The value attribute for this preset says "4-3", that might be a typo
			static By sdPortrait34 = By.xpath("//option[@value='sd-portrait-4-3']");
			static By sdLandscape169 = By.xpath("//option[@value='sd-landscape-16-9']");
			static By sdPortrait169 = By.xpath("//option[@value='sd-portrait-16-9']");
			// variable names can't start with numbers
			static By landscape720p = By.xpath("//option[@value='720p-landscape']");
			static By portrait720p = By.xpath("//option[@value='720p-portrait']");
			static By landscape1080p = By.xpath("//option[@value='1080p-landscape']");
			static By portrait1080p = By.xpath("//option[@value='1080p-portrait']");
			static By landscape4k = By.xpath("//option[@value='4k-landscape']");
			static By portrait4k = By.xpath("//option[@value='1080p-portait']");
		}
		static By viewportSizeWidth = By.id("npViewportWidthInput");
		static By viewportSizeHeight = By.id("npViewportHeightInput");
		static By orientations = By.id("npOrientationSelect");
		static class Orientations 
		{
			static By any = By.xpath("//option[@value='any']");
			static By portrait = By.xpath("//option[@value='portrait']");
			static By landscape = By.xpath("//option[@value='landscape']");
		}
		static By startWith = By.id("npStartWithSelect");
		static class StartWith
		{
			static By eventSheet = By.xpath("//option[@value='event-sheet']");
			static By script = By.xpath("//option[@value='script']");
		}
		static By optimizeForPixelArt = By.id("npPixelArtCheck");
		static By closeX = By.xpath("//dialog[@id='newProjectDialog']//ui-close-button[@title='Close']");
		static By help = By.linkText("Help");
		static By create = By.className("okButton");
		static By cancel = By.className("cancelButton");
	}	
	static class OpenSecondProjectPopup
	{
		static By dontAskAgain = By.xpath("//label[@class='confirmCheckWrap']/input");
		static By closePreviousProject = By.xpath("//button[@class='confirmButton bold']");
		static By openBothProjects = By.xpath("//button[@class='cancelConfirmButton']");
		static By closeX = By.xpath("//dialog[@id='confirmCheckDialog']//ui-close-button");
	}
	static class ExportProjectPopup
	{
		static By nwjs = By.xpath("//span[text()='NW.js']/ancestor::ui-iconviewitem");
		static By next = By.xpath("//button[@class='nextButton']");
		
		static class Page2
		{
			static By deduplicateImages = By.xpath("//*[@id='exportDeduplicateImages']");
			static By losslessFormat = By.xpath("//*[@id='exportLosslessImageFormat']");
			static By lossyFormat = By.xpath("//*[@id='exportLossyImageFormat']");
			static By recompressImages = By.xpath("//*[@id='exportRecompressImages']");
			static By minifyMode = By.xpath("//select[@class='exportMinifyScript']");
			static By next = By.xpath("//button[@class='nextButton']");
			
			static class LosslessFormatOptions
			{
				static By png = By.xpath("//option[@value='png']");
				static By webp = By.xpath("//*[@id='exportLosslessImageFormat']//option[@value='webp']");
			}
			
			static class LossyFormatOptions
			{
				static By jpg = By.xpath("//option[@value='jpg']");
				static By webp = By.xpath("//*[@id='exportLossyImageFormat']//option[@value='webp']");
			}
			
			static class MinifyModes
			{
				static By none = By.xpath("//option[@value='none']");
				static By simple = By.xpath("//option[@value='simple']");
				static By advanced = By.xpath("//option[@value='advanced']");
			}
		}
		
		static class NwjsOptions
		{
			static By linux32 = By.xpath("//*[@id='nwjsPlatformLinux32']"); // Checked by default
			static By linux64 = By.xpath("//*[@id='nwjsPlatformLinux64']"); // Checked by default
			static By mac64 = By.xpath("//*[@id='nwjsPlatformMac64']"); // Checked by default
			static By win32 = By.xpath("//*[@id='nwjsPlatformWin32']"); // Checked by default
			static By win64 = By.xpath("//*[@id='nwjsPlatformWin64']"); // Checked by default
			static By packageAssets = By.xpath("//*[@id='nwjsPackageAssets']"); // Checked by default
			static By compressFinalZip = By.xpath("//*[@id='nwjsCompressFinalZip']"); // Checked by default
			static By windowFrame = By.xpath("//*[@id='nwjsWindowFrame']"); // Checked by default
			static By resizableWindow = By.xpath("//*[@id='nwjsResizableWindow']"); // Checked by default
			static By kioskMode = By.xpath("//*[@id='nwjsKioskMode']");// Unchecked by default
			static By ignoreGpuBlacklist = By.xpath("//*[@id='nwjsIgnoreGPUBlacklist']"); // Checked by default
			static By enableDevTools = By.xpath("//*[@id='nwjsEnableDevTools']"); // Checked by default
			static By exportForSteam = By.xpath("//*[@id='nwjsSteamMode']"); // Unchecked by default
			static By next = By.xpath("//button[@class='nextButton']");
		}
		
		static class ExportReport
		{
			static By downloadLink = By.xpath("//a[@class='downloadExportedProject']");
			static By ok = By.xpath("//button[@class='okButton']");
		}
	}
	static class Misc
	{
		static By iframe = By.xpath("//ui-dialog-contents//iframe");
		static By progressDialog = By.id("progressDialog");
	}
}