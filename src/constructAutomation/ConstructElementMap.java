package constructAutomation;

import org.openqa.selenium.By;

class ConstructElementMap extends SensitiveData
{
	/**<h1>BXP</h1>
	 * Abstracted shortener method for {@link org.openqa.selenium.By#xpath(String)}
	 * @param path The XPath locator.
	 * @return A <code>By</code> via XPath.
	 * @author laserwolve
	 */
	static By bxp(String path)
	{
		return By.xpath(path);
	}
	
	static class AboutPopup
	{
		static class PersistentStoragePopup
		{			
			static By x = bxp("//*[@id='okDialog']//ui-close-button");
			static By ok = bxp("//*[@id='okDialog']//*[@class='okButton']");
		}
		
		static class PlatformInfoPopup
		{
			static By x = bxp("//*[@id='platformInfoDialog']//ui-close-button");
			static By copy = bxp("//button[@class='copy']");
			static By ok = bxp("//*[@id='platformInfoDialog']//*[@class='okButton']");
		}
		
		static By aboutUs = bxp("//a[text()='About us']");
		static By viewAccountInformation = bxp("//a[text()='View account information']");
		static By x = bxp("//*[@id='aboutDialog']//ui-close-button");	
		static By contributeTranslations = bxp("//a[text()='Contribute translations']");	
		static By eula = bxp("//a[text()='End-user license agreement']");
		static By forums = bxp("//a[text()='Forums']");	
		static By getAddons = bxp("//a[text()='Get addons']");
		static By help = bxp("//*[@id='aboutDialog']//*[@class='helpLink']");
		static By legalInfo = bxp("//a[text()='Legal information']");
		static By officialWebsite = bxp("//a[text()='Construct.net']");
		static By ok = bxp("//*[@id='aboutDialog']//*[@class='okButton']");
		static By platformInformation = bxp("//a[text()='Platform information']");
		static By privacyPolicy = bxp("//a[text()='Privacy policy']");
		static By releaseNotes = bxp("//a[@class='viewReleaseNotes']");
		static By reportIssues = bxp("//a[text()='Report issues']");
		static By requestPersistentStorage = bxp("//a[text()='Request persistent storage']");
		static By storageCleanup = bxp("//a[text()='Storage cleanup...']");
		static By suggestFeatures = bxp("//a[text()='Suggest features']");
		static By tutorials = bxp("//a[text()='Tutorials']");
	}
	
	static class AccountDropdown
	{
		static By enterAccessCode = bxp("//span[text()='Enter access code']/..");
		static By logIn = bxp("//ui-menuitem//span[text()='Log in']/..");
		static By purchase = bxp("//span[text()='Purchase...']/..");
		static By register = bxp("//span[text()='Register...']/..");
		static By viewDetails = bxp("//span[text()='View details']/..");		
	}
	
	static class AccountInfoPopup
	{
		static By close = bxp("//button[@class='okButton']");
		static By x = bxp("//*[@id='accountInfoDialog']//ui-close-button");
		static By editProfile = bxp("//a[text()='Edit profile']");
		static By help = bxp("//a[text()='Help']");
		static By logInToExistingAccount = bxp("//a[text()='Log in to existing account']");
		static By registerAccount = bxp("//a[text()='Register a new account']");
		static By yourLicenses = bxp("//a[text()='Your licenses']");
	}
	
	static class AddonManagerPopup
	{
		static class AddonContextMenu
		{		
			static By downloadAddon = bxp("//span[text()='Download .c3addon']");
			static By helpFor = bxp("//span[contains(text(),'Help for')]");
			static By uninstall = bxp("//span[text()='Uninstall']");
			static By visitWebsite = bxp("//span[text()='Visit website']");		
		}
		
		static class InstallAddonPopup
		{
			static class InstallFinishedPopup
			{
				static By x = bxp("//*[@id='okDialog']//ui-close-button");
				static By ok = bxp("//*[@id='okDialog']//*[@class='okButton']");		
			}
			static By website = bxp("//a[@class='addonWebsite']");
			static By cancel = bxp("//*[@id='addonConfirmInstallDialog']//*[@class='cancelButton']");
			static By x = bxp("//*[@id='addonConfirmInstallDialog']//ui-close-button");
			static By documentation = bxp("//a[@class='addonDocumentation']");
			static By install = bxp("//*[@id='addonConfirmInstallDialog']//*[@class='okButton']");
		}
		
		static class UninstallAddonPopup
		{
			static class UninstallFinishedPopup
			{
				static By x = bxp("//*[@id='okDialog']//ui-close-button");
				static By ok = bxp("//*[@id='okDialog']//*[@class='okButton']");		
			}
			static By cancel = bxp("//button[@class='cancelConfirmButton']");
			static By x = bxp("//*[@id='confirmDialog']//ui-close-button");
			static By uninstall = bxp("//*[@id='addonConfirmInstallDialog']//*[@class='confirmButton bold']");
		}
		
		static By x = bxp("//*[@id='addonManagerDialog']//ui-close-button");
		static By getAddons = bxp("//a[text()='Get addons']");
		static By installNewAddon = bxp("//button[@class='installAddon']");
		static By ok = bxp("//*[@id='addonManagerDialog']//*[@class='okButton']");
		static By addon (String addon)
		{
			return bxp("//*[@columnname='name']/*[text()='" + addon + "']/../..");
		}
	}
	
	static class BuyNow
	{
		static By buyNow = bxp("//ui-tab/span[text()='Buy now']");
		
		static class Page1
		{
			static By fullRunDown = bxp("//a[text()='full run down']");
			static By visitOurPricingPages = bxp("//a[text()='visit our pricing pages']");
			static By proceedToPaymentBottom = bxp("//*[@class='c']//a[@class='openDemo']");
			static By proceedToPaymentMiddle = bxp("//div[@class='proceedOverlay']//a[@class='openDemo']");
		}
		
		static class Page2
		{
			static By continueButton = bxp("//*[@id='BtnContinue']");
			static By email = bxp("//*[@id='Email']");
			static By generalTermsAndConditions = bxp("//a[text()='general terms & conditions']");
			static By privacyPolicy = bxp("//a[text()='privacy policy']");
			static By storeTermsAndConditions = bxp("//a[text()='store terms & conditions']");
			static By orYouCanLogin = bxp("//a[text()='or you can login']");
		}
		
		static class Page3
		{
			static class CancellationTermsPopup
			{
				static By contactingUs = bxp("//a[text()='contacting us']");
				static By ok = bxp("//*[@id='CloseSubTermsOverlayLink']");
			}
			
			static By subscriptionAndCancellationTerms = bxp("//*[@id='SubTermsLink']");
			static By cancel = bxp("//*[@class='cancel']");
			static By cardNumber = bxp("//*[@name='cardnumber']");
			static By countryDropdown = bxp("//*[@id='Country']");
			static By creditOrDebit = bxp("//*[@id='pm1']");
			static By editEmail = bxp("//a[@class='editEmail']");
			static By expDate = bxp("//*[@name='exp-date']");
			static By firstName = bxp("//*[@id='FirstName']");
			static By go = bxp("//*[@class='go']");
			static By lastName = bxp("//*[@id='LastName']");
			static By payPal = bxp("//*[@id='pm2']");
			static By phoneNumber = bxp("//*[@id='Phone']");
			static By placeOrder = bxp("//*[@id='BtnPlaceOrder']");
			static By postCode = bxp("//*[@id='Postcode']");
			
			static By country(String country)
			{
				return bxp("//*[@id='Country']/*[text()='" + country + "']");
			}
		}

	}
	static class CloudOpenPopup
	{
		static class Services
		{
			static By dropBox = bxp("//*[@value='DROPBOX']");
			static By googleDrive = bxp("//*[@value='GOOGLE DRIVE']");
			static By oneDrive = bxp("//*[@value='ONE DRIVE']");
		}
		static By addFolder = bxp("//*[@title='Add Folder']");
		static By x = bxp("//*[@id='fileListDialog']//ui-close-button");
		static By fileNameBox = bxp("//ui-dialog-footer//input");
		static By logOut = bxp("//*[@title='Logout']");
		static By refresh = bxp("//*[@title='Refresh']");
		static By searchBox = bxp("//ui-toolbar-textbox/input");
		static By serviceSelector = bxp("//select[@corners='default']");
		static By uploadFile = bxp("//*[@title='Upload File']");
		static By upToParent = bxp("//*[@title='Up to parent folder']");
		static By cloudFolder(String row)
		{
			return bxp("//ui-table-row[@tabindex='-1'][" + row + "]");		
		}
	}
	
	static class EnterAccessCodePopup
	{
		static By accessCode = bxp("//input[@class='input']");
		static By cancel = bxp("//*[@class='cancelButton']");
		static By x = bxp("//*[@id='inputCheckDialog']//ui-close-button");
		static By ok = bxp("//*[@class='okButton']");
		static By rememberThisAccessCode = bxp("//*[@class='inputCheckbox']");
	}
	
	static class ExampleBrowser
	{
		static By exampleBrowserTab = bxp("//ui-tabbar//span[text()='Example browser']/..");
		static class Behaviors
		{
			static class Attributes
			{
				static By jumpThru = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-jumpthru']");
				static By persist = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Persist']");
				static By shadowCaster = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-shadowcaster']");
				static By solid = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-solid']");
			}
			static class General
			{
				static By anchor = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Anchor']");
				static By boundToLayout = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-bound']");
				static By destroyOutsideLayout = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-destroy']");
				static By dragNDrop = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-DragnDrop']");
				static By fade = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Fade']");
				static By flash = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Flash']");
				static By lineOfSight = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-LOS']");
				static By pin = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Pin']");
				static By scrollTo = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-scrollto']");
				static By solid = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-solid']");
				static By timer = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Timer']");
				static By tween = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Tween']");
				static By wrap = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Wrap']");
			}
			
			static class Movements
			{
				static By bullet = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Bullet']");
				static By car = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Car']");
				static By custom = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-custom']");
				static By eightDirection = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-EightDir']");
				static By moveTo = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-MoveTo']");
				static By orbit = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Orbit']");
				static By pathFinding = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Pathfinding']");
				static By physics = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Physics']");
				static By platform = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Platform']");
				static By rotate = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Rotate']");
				static By sine = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Sin']");
				static By tileMovement = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-TileMovement']");
				static By turret = bxp("//*[@class='section -behavior']/*[@data-tag='behavior-Turret']");
			}
			static By attributesExpander = bxp("//*[@class='titleSection -behavior'][text()='Attributes']");
			
			static By generalExpander = bxp("//*[@class='titleSection -behavior'][text()='General']");
			static By movementsExpander = bxp("//*[@class='titleSection -behavior'][text()='Movements']");
		}
		
		static class Categories
		{
			static By bareBonesTemplate = bxp("//div[@class='section -category']/div[@data-tag='barebones-template']");
			static By demoGame = bxp("//div[@class='section -category']/div[@data-tag='demo-game']");
			static By featureExample = bxp("//div[@class='section -category']/div[@data-tag='feature-example']");
			static By gameplayMechanic = bxp("//div[@class='section -category']/div[@data-tag='gameplay-mechanic']");
			static By gameTemplate = bxp("//div[@class='section -category']/div[@data-tag='game-template']");
			static By guidedTour = bxp("//div[@class='section -category']/div[@data-tag='guided-tour']");
			static By newFilter = bxp("//div[@class='section -category']/div[@data-tag='new']");
			static By recommended = bxp("//div[@class='section -category']/div[@data-tag='recommended']");
			static By scripting = bxp("//div[@class='section -category']/div[@data-tag='scripting']");
			static By techDemo = bxp("//div[@class='section -category']/div[@data-tag='techDemo']");
		}
		
		static class Effects
		{
			static class Blend
			{
				static By darken = bxp("//*[@class='section -effect']/*[@data-tag='effect-darken']");
				static By dodge = bxp("//*[@class='section -effect']/*[@data-tag='effect-dodge']");
				static By exclusion = bxp("//*[@class='section -effect']/*[@data-tag='effect-exclusion']");
				static By lighten = bxp("//*[@class='section -effect']/*[@data-tag='effect-lighten']");
				static By multiply = bxp("//*[@class='section -effect']/*[@data-tag='effect-multiply']");
				static By overlay = bxp("//*[@class='section -effect']/*[@data-tag='effect-overlay']");
				static By screen = bxp("//*[@class='section -effect']/*[@data-tag='effect-screen']");
				static By softLight = bxp("//*[@class='section -effect']/*[@data-tag='effect-softlight']");
			}
			static class Color
			{
				static By adjustHsl = bxp("//*[@class='section -effect']/*[@data-tag='effect-hsladjust']");
				static By alphaClamp = bxp("//*[@class='section -effect']/*[@data-tag='effect-alphaclamp']");
				static By blurHorizontal = bxp("//*[@class='section -effect']/*[@data-tag='effect-blurhorizontal']");
				static By blurVertical = bxp("//*[@class='section -effect']/*[@data-tag='effect-blurvertical']");
				static By grayscale = bxp("//*[@class='section -effect']/*[@data-tag='effect-grayscale']");
				static By inverse = bxp("//*[@class='section -effect']/*[@data-tag='effect-inverse']");
				static By noise = bxp("//*[@class='section -effect']/*[@data-tag='effect-noise']");
				static By pixellate = bxp("//*[@class='section -effect']/*[@data-tag='effect-pixellate']");
				static By posterize = bxp("//*[@class='section -effect']/*[@data-tag='effect-posterize']");
				static By radialBlur = bxp("//*[@class='section -effect']/*[@data-tag='effect-radialblur']");
				static By replaceColor = bxp("//*[@class='section -effect']/*[@data-tag='effect-replacecolor']");
				static By replaceSolidColor = bxp("//*[@class='section -effect']/*[@data-tag='effect-replacesolidcolor']");
				static By setColor = bxp("//*[@class='section -effect']/*[@data-tag='effect-setcolor']");
				static By sharpen = bxp("//*[@class='section -effect']/*[@data-tag='effect-sharpen']");
				static By tint = bxp("//*[@class='section -effect']/*[@data-tag='effect-tint']");
				static By vignette = bxp("//*[@class='section -effect']/*[@data-tag='effect-vignette']");		
			}
			
			static class Distortion
			{
				static By bulge = bxp("//*[@class='section -effect']/*[@data-tag='effect-bulge']");
				static By glass = bxp("//*[@class='section -effect']/*[@data-tag='effect-glass']");
				static By pulse = bxp("//*[@class='section -effect']/*[@data-tag='effect-pulse']");
				static By stretch = bxp("//*[@class='section -effect']/*[@data-tag='effect-stretch']");
				static By swirl = bxp("//*[@class='section -effect']/*[@data-tag='effect-swirl']");
				static By warpLayout = bxp("//*[@class='section -effect']/*[@data-tag='effect-warplayout']");
				static By warpObject = bxp("//*[@class='section -effect']/*[@data-tag='effect-warpobject']");
				static By warpRipple = bxp("//*[@class='section -effect']/*[@data-tag='effect-warpripple']");
				static By water = bxp("//*[@class='section -effect']/*[@data-tag='effect-water']");
			}
			static class Mask
			{
				static By adjustHslMask = bxp("//*[@class='section -effect']/*[@data-tag='effect-hsladjustmask']");
				static By warpObjectMask = bxp("//*[@class='section -effect']/*[@data-tag='effect-warpobjectmask']");
			}
			
			static class MormalMapping
			{
				static By bumpMapping = bxp("//*[@class='section -effect']/*[@data-tag='effect-bumpmapping']");
			}
			static class ThreeD
			{
				static By fogExponential = bxp("//*[@class='section -effect']/*[@data-tag='effect-fogexponential']");
			}
	
			static By blendExpander = bxp("//*[@class='titleSection -effect'][text()='Blend']");
			static By colorExpander = bxp("//*[@class='titleSection -effect'][text()='Color']");
			
			static By distortionExpander = bxp("//*[@class='titleSection -effect'][text()='Distortion']");
			static By maskExpander = bxp("//*[@class='titleSection -effect'][text()='Mask']");
			
			static By normalMappingExpander = bxp("//*[@class='titleSection -effect'][text()='Normal mapping']");
			static By threeDExpander = bxp("//*[@class='titleSection -effect'][text()='3D']");
		}
		static class Genres
		{
			static By action = bxp("//div[@class='section -genre']/div[@data-tag='action']");
			static By adventure = bxp("//div[@class='section -genre']/div[@data-tag='adventure']");
			static By animation = bxp("//div[@class='section -genre']/div[@data-tag='animation']");
			static By arcade = bxp("//div[@class='section -genre']/div[@data-tag='arcade']");
			static By fighting = bxp("//div[@class='section -genre']/div[@data-tag='fighting']");
			static By multiplayer = bxp("//div[@class='section -genre']/div[@data-tag='multiplayer']");
			static By platformer = bxp("//div[@class='section -genre']/div[@data-tag='platformer']");
			static By puzzle = bxp("//div[@class='section -genre']/div[@data-tag='puzzle']");
			static By racing = bxp("//div[@class='section -genre']/div[@data-tag='racing']");
			static By rpg = bxp("//div[@class='section -genre']/div[@data-tag='rpg']");
			static By shooter = bxp("//div[@class='section -genre']/div[@data-tag='shooter']");
			static By strategy = bxp("//div[@class='section -genre']/div[@data-tag='strategy']");
		}
		
		static class Levels
		{
			static By advanced = bxp("//div[@class='section -level']/div[@data-tag='advanced']");
			static By beginner = bxp("//div[@class='section -level']/div[@data-tag='beginner']");
			static By intermediate = bxp("//div[@class='section -level']/div[@data-tag='intermediate']");
		}
		static class Plugins
		{
			static class DataAndStorage
			{
				static By array = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Arr']");
				static By binaryData = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-BinaryData']");
				static By dictionary = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Dictionary']");
				static By json = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Json']");
				static By localStorage = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-LocalStorage']");
				static By xml = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-XML']");
			}
			static class FormControls
			{
				static By button = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Button']");
				static By htmlElement = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-HTMLElement']");
				static By iFrame = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-iframe']");
				static By list = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-list']");
				static By sliderBar = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-sliderbar']");
				static By textInput = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-textBox']");
			}
			
			static class General
			{
				static By ninePatch = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-NinePatch']");
				static By particles = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Particles']");
				static By shadowLight = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-shadowlight']");
				static By sprite = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Sprite']");
				static By spriteFont = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Spritefont2']");
				static By text = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Text']");
				static By tiledBackground = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-TiledBg']");
				static By tileMap = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Tilemap']");
				static By timeLineController = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Timeline']");
			}
			static class Input
			{
				static By gamePad = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-gamepad']");
				static By keyBoard = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Keyboard']");
				static By mouse = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Mouse']");
				static By touch = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Touch']");
			}
			
			static class Media
			{
				static By audio = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Audio']");
				static By geolocation = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Geolocation']");
				static By speechRecognition = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-SpeechRecognition']");
				static By speechSynthesis = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-SpeechSynthesis']");
				static By userMedia = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-UserMedia']");
				static By videoRecorder = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-GameRecorder']");
			}
			static class Other
			{
				static By advancedRandom = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-AdvancedRandom']");
				static By blueTooth = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Bluetooth']");
				static By date = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Date']");
				static By drawingCanvas = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-DrawingCanvas']");
				static By platformInfo = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-PlatformInfo']");
				static By share = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Share']");
			}
			
			static class ThreeD
			{
				static By threeDCamera = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Camera3D']");
				static By threeDShape = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Shape3D']");
			}
			static class Web
			{
				static By ajax = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-AJAX']");
				static By browser = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Browser']");
				static By multiplayer = bxp("//*[@class='section -plugin']/*[@data-tag='plugin-Multiplayer']");
			}
			
			static By dataAndStorageExpander = bxp("//*[@class='titleSection -plugin'][contains(text(),'Data & storage')]");
			static By formControls = bxp("//*[@class='titleSection -plugin'][contains(text(),'Form Controls')]");
			
			static By generalExpander = bxp("//*[@class='titleSection -plugin'][contains(text(),'General')]");
			static By inputExpander = bxp("//*[@class='titleSection -plugin'][contains(text(),'Input')]");
			
			static By mediaExpander = bxp("//*[@class='titleSection -plugin'][contains(text(),'Media')]");
			static By otherExpander = bxp("//*[@class='titleSection -plugin'][contains(text(),'Other')]");
			
			static By threeDExpander = bxp("//*[@class='titleSection -plugin'][contains(text(),'3D')]");
			static By webExpander = bxp("//*[@class='titleSection -plugin'][contains(text(),'Web')]");
		}
		
		static class Tags
		{
			static By meshDistortion = bxp("//div[@class='section -tag']/div[@data-tag='mesh-distortion']");
			static By mobile = bxp("//div[@class='section -tag']/div[@data-tag='mobile']");
			static By performance = bxp("//div[@class='section -tag']/div[@data-tag='performance']");
			static By sceneGraph = bxp("//div[@class='section -tag']/div[@data-tag='scene-graph']");
			static By threeD = bxp("//div[@class='section -tag']/div[@data-tag='3d']");
			static By timeline = bxp("//div[@class='section -tag']/div[@data-tag='timeline']");
		}
		
		static By behaviors = bxp("//div[@class='listTags']/*[@class='titleSection -behavior']");
		static By categories = bxp("//div[@class='listTags']/*[@class='titleSection -category']");
		static By clear = bxp("buttonClear");
		static By clearButtonFooter = bxp("resultsFooterClearTags");
		static By effects = bxp("titleSection -effect");
		static By genres = bxp("titleSection -genre");
		static By levels = bxp("titleSection -level");
		static By plugins = bxp("titleSection -plugin");
		static By searchBox = bxp("searchInputField");
		static By tags = bxp("titleSection -tag");
		
		static By removeFilter(String tag)
		{
			return bxp("//div[@id='selectedTags']/div[@data-tag='" + tag.toLowerCase() + "']");
		}
	}
	static class ExportManagerPopup
	{
		static By addArchive = bxp("//*[@title='Add archive']");
		static By buildApplication = bxp("//*[@title='Build Application']");
		static By x = bxp("//*[@id='archiveManagerDialog']//ui-close-button");
		static By deleteArchive = bxp("//*[@title='Delete archive']");
		static By downloadArchive = bxp("//*[@title='Download archive']");
		static By export (String export)
		{
			return bxp("//*[@columnname='project']/*[text()='" + export + "']/../..");
		}
	}
	static class FreeEditionPopup
	{
		static By cancelButton = bxp("//*[@id='addonManagerDialog']//*[@class='cancelButton']");
		static By x = bxp("//*[@id='freeEditionLimitDialog']//ui-close-button");
		static By learnMoreButton = bxp("//*[@id='addonManagerDialog']//*[@class='infoButton']");
		static By logInLink = bxp("log in to your account");
		static By purchaseButton = bxp("//*[@id='addonManagerDialog']//*[@class='okButton']");
	}	
	static class LogInDialog
	{
		static By loginDialog = bxp("loginDialog");
		static By cancelButton = bxp("cancel");
		static By x = bxp("//*[@id='loginDialog']//ui-close-button");
		static By facebookButton = bxp("oAuthLoginButton");
		static By googleButton = bxp("abcRioButtonContentWrapper");
		static By logInButton = bxp("login");
		static By passwordField = bxp("password");
		static By rememberCheckbox = bxp("remember");
		static By usernameField = bxp("username");
	}
	static class GuidedToursPopup
	{
		static class CloseConfirmation
		{
			static By cancelButton = bxp("//button[@class='cancelConfirmButton']");
			static By x = bxp("//*[@id='confirmDialog']//ui-close-button");
			static By exitButton = bxp("//button[@class='confirmButton bold']");
		}
		static By exitTour = bxp("//span[text()='Exit tour']/../..");
		static By menuDots = bxp("//ui-menu-dots-button");
		static By nextButton = bxp("//button[@class='nextButton bold']");
	}
	
	static class setUpBackupsPopup
	{
		static By x = bxp("//dialog[@id='confirmDialog']//ui-close-button");
		static By learnMore = bxp("//a[text()='Learn more']");
		static By openSettings = bxp("//button[@class='confirmButton bold']");
		static By saveAnyway = bxp("//button[@class='cancelConfirmButton']");
	}
	static By menuButton = bxp("mainMenuButton");
	
	static class MenuDropdown
	{
		static By project = bxp("//span[text()='Project'][@class='menu-item-text']/..");
		
		static class ProjectPopout
		{
			static By newProject = bxp("//span[text()='New']/..");
			static class OpenRecentPopout {

				static By recentProject (String name) {
					return bxp("(//span[contains(text(), '" + name + "')]/..)[1]");
				}
			}
			static By cloudOpen = bxp("//span[text()='Cloud open']/..");
			static By openLocalFile = bxp("//span[text()='Open local file']/..");
			static By openLocalFolder = bxp("//span[text()='Open local project folder']/..");
			static By openRecent = bxp("//span[text()='Open recent']/..");
			static By save = bxp("//span[text()='Save']/..");
			static By saveAs = bxp("//span[text()='Save as']/..");
			static class saveAsPopout
			{
				static By cloudSave = bxp("//span[text()='Cloud save']/..");
				static By saveAsSingleFile = bxp("//span[text()='Save as single file...']/..");
				static By saveAsProjectFolder = bxp("//span[text()='Save as project folder...']/..");
				static By downloadACopy = bxp("//span[text()='Download a copy']/..");
			}
			static By preview = bxp("//span[text()='Preview']/..");
			static By remotePreview = bxp("//span[text()='Remote preview']/..");
			static By debug = bxp("//span[text()='Debug']/..");
			static By export = bxp("//span[text()='Export']/..");
			static By closeProject = bxp("//span[text()='Close project']/..");
		}
		static class AccountPopout
		{
			static By enterAccessCode = bxp("//span[text()='Enter access code']/..");
			static By logIn = bxp("//span[text()='Log in']/..");
			static By purchase = bxp("//span[text()='Purchase...']/..");
			/*
			 * Locators are the same as account Dropdown, however these two can't exist
			 * in the DOM together at the same time.
			 */
			static By register = bxp("//span[text()='Register...']/..");
			static By viewDetails = bxp("//span[text()='View details']/..");
		}
		static class GuidedToursPopout
		{
			static By beginnersGuide = bxp("//span[contains(text(),'Beginner')]/..");
			static By platformGame = bxp("//span[text()='Make a platform game']/..");
			static By getStartedWithJavaScript = bxp("//span[text()='Get started with JavaScript']/..");
			static By getStartedWithTimelineAnimations = bxp("//span[text()='Get started with timeline animations']/..");
		}
		
		static class ViewPopout
		{
			static By addonManager = bxp("//span[text()='Addon manager']/..");
			static By exampleBrowser = bxp("//span[text()='Example browser']/..");
			static By exportManager = bxp("//span[text()='Export manager']/..");
			static By startPage = bxp("//span[text()='Start page'][@class='menu-item-text']/..");
			static By storageCleanup = bxp("//span[text()='Storage cleanup']/..");
		}

		static By about = bxp("//span[text()='About']/..");
		static By account = bxp("//span[text()='Account']/..");
		static By assetStore = bxp("//span[text()='Asset Store']/..");
		static By getAddons = bxp("//span[text()='Get addons']/..");	
		static By guidedTours = bxp("//span[text()='Guided tours']/..");
		static By help = bxp("//span[text()='Help']/..");
		static By installAsApp = bxp("//span[text()='Install as app']/..");
		static By settings = bxp("//span[text()='Settings']/..");
		static By view = bxp("//span[text()='View']/..");
	}
	
	static class Project
	{
		static By projectTab (String name)
		{
			return bxp("//ui-tab[starts-with(@title, 'Layout: " + name + "')]");
		}
		
		static class AnimationsEditor
		{			
			static class AnimationsPane
			{
				static By firstAnimation = bxp("(//ui-animation-editor-panel[@class='animationsEditorAnimations']//ui-treeitem//div)[1]");
				static By penultimateAnimation = bxp("(//ui-animation-editor-panel[@class='animationsEditorAnimations']//ui-treeitem//div)[last() - 1]");
				
				static class AnimationContextMenu
				{
					static class ImportAnimationsContext
					{
						static By fromFiles = bxp("//span[text()='From Files']");
					}
					static By importAnimations = bxp("//span[text()='Import Animation']");
					static By delete = bxp("//span[text()='Delete']/parent::*");
				}
				
				static By title = bxp("//ui-animation-editor-panel[@class='animationsEditorAnimations']/ui-animation-editor-panel-title");
				static By background = bxp("//ui-animation-editor-panel-content/ui-tree");
				
				static class PaneContextMenu
				{
					static By addAnimation = bxp("//span[text()='Add Animation']/parent::*");
					static By importAnimation = bxp("//span[text()='Import Animation']/parent::*");
					
					static class importAnimationPopout
					{
						static By fromFiles = bxp("//span[text()='From Files']/parent::*");
					}
				}
			}
		}
		static class CreateNewObjectTypePopup
		{
			static By name = bxp("crObjectTypeNameInput");
			static By searchBar = bxp("//dialog[@id='createNewObjectTypeDialog']//input[@type='search']");
		}
		
		static By save = bxp("//ui-toolbar-button[@title='Save project']");
		static By undo = bxp("//div[@title='Undo']");
		static By viewUndoStack = bxp("//div[@title='View undo stack']");
		static By undoStack (int number)
		{
			return bxp("(//span[@class='menu-item-text'])[" + number + "]");
		}		
		static By redo = bxp("//div[@title='Redo']");
		static By viewRedoStack = bxp("//div[@title='View redo stack']");
		static By redoStack (int number)
		{
			return bxp("(//span[@class='menu-item-text'])[" + number + "]");
		}	
		static By preview = bxp("//div[@title='Preview']");
		static By viewOtherPreviewOptions = bxp("//div[@title='Other preview options']");	
		static class OtherPreviewOptions
		{
			static By previewLayout = bxp("//span[@class='menu-item-text'][text()='Preview layout']");
			static By debugLayout = bxp("//span[@class='menu-item-text'][text()='Debug layout']");
			static By previewProject = bxp("//span[@class='menu-item-text'][text()='Preview project']");
			static By remotePreview = bxp("//span[@class='menu-item-text'][text()='Remote preview']");
		}
		static class ProjectBar
		{
			static By searchBar = bxp("//input[@class='search']");
			static By searchResult (String query)
			{
				return bxp("(//span[text()='" + query + "'])[1]");
			}
			
			static class ContextMenu
			{
				static By editAnimations = bxp("//span[text()='Edit animations']/parent::ui-menuitem");
			}
		}
	}
	static class SettingsPopup
	{
		static class BackupLocations
		{
			static By dropBox = bxp("//*[@class='defaultSaveLocation']/*[@value='DROPBOX']");
			static By googleDrive = bxp("//*[@class='defaultSaveLocation']/*[@value='GOOGLE DRIVE']");
			static By localFolder = bxp("//*[@class='defaultSaveLocation']/*[@value='WEBFS FOLDER']");
			static By localStorage = bxp("//*[@class='defaultSaveLocation']/*[@value='LOCAL STORAGE']");
			static By oneDrive = bxp("//*[@class='defaultSaveLocation']/*[@value='ONE DRIVE']");
			static By sameLocation = bxp("//*[@class='defaultSaveLocation']/*[@value='MATCH']");
		}
		
		static class GpuPreferences
		{
			static By defaultPreference = bxp("//*[@class='gpuPowerPreference']/*[@value='default']");
			static By highPerformance = bxp("//*[@class='gpuPowerPreference']/*[@value='high-performance']");
			static By lowPower = bxp("//*[@class='gpuPowerPreference']/*[@value='low-power']");
		}
		static class PreviewModes
		{
			static By browserTab = bxp("//*[@class='previewMode']/*[@value='browser-tab']");
			static By dialog = bxp("//*[@class='previewMode']/*[@value='iframe-dialog']");
			static By popupWindow = bxp("//*[@class='previewMode']/*[@value='popup-window']");
		}
		
		static class Releases
		{
			static By beta = bxp("//*[@class='updateChannel']/*[@value='beta']");
			static By stable = bxp("//*[@class='updateChannel']/*[@value='stable']");
		}
		static class SaveLocations
		{
			static By cloud = bxp("//*[@class='defaultSaveLocation']/*[@value='cloud']");
			static By download = bxp("//*[@class='defaultSaveLocation']/*[@value='download']");
			static By localBrowser = bxp("//*[@class='defaultSaveLocation']/*[@value='local-browser']");
			static By saveAs = bxp("//*[@class='defaultSaveLocation']/*[@value='save-as']");
		}
		
		static class Themes
		{
			static By dark = bxp("//*[@class='theme']/*[text()='Dark']");
			static By defaultTheme = bxp("//*[@class='theme']/*[text()='Default (no theme)']");
			static By light = bxp("//*[@class='theme']/*[text()='Light']");
		}
		static class UiModes
		{
			static By auto = bxp("//*[@class='uiMode']/*[@value='auto']");
			static By desktop = bxp("//*[@class='uiMode']/*[@value='desktop']");
			static By mobile = bxp("//*[@class='uiMode']/*[@value='mobile']");
		}
		static By autoHideStartPage = bxp("autoHideStartPage");
		
		static By autoSaveDuration = bxp("autosaveDuration");
		static By backupLocation = bxp("autosaveLocation");
		
		static By cacheCloudMetadata = bxp("cacheCloudMetadata");
		static By chooseLocalBackupButton = bxp("localBackupFolderChoose");
		static By closeButton = bxp("//*[@id='settingsDialog']//*[@class='okButton']");
		static By x = bxp("//*[@id='settingsDialog']//ui-close-button");
		static By defaultAnimationSpeed = bxp("defaultAnimationSpeed");
		static By defaultProjectAuthor = bxp("defaultProjectAuthor");
		static By defaultProjectEmail = bxp("defaultProjectEmail");
		static By defaultProjectWebsite = bxp("defaultProjectWebsite");
		
		static By enableAutoSave = bxp("enableAutosave");
		static By enableExperimentalFeatures = bxp("experimentalFeatures");
		
		static By enableNotifications = bxp("enableNotifications");
		
		static By enableTakeABreakReminders = bxp("showTakeBreakReminders");
		static By enableUiAnimations = bxp("enableUIAnims");
		static By enableUiEffects = bxp("enableUIEffects");
		static By gpuPreference = bxp("gpuPowerPreference");
		
		static By help = bxp("Help");
		static By hideAddActionRows = bxp("hideAddActionRows");
		static By iconColor = bxp("iconColor");
		static By languageSetting = bxp("languageSetting");
		
		static By previewSelector = bxp("previewMode");
		static By releaseNotifications = bxp("updateChannel");
		
		static By resetButton = bxp("resetLayout");
		static By saveLocation = bxp("defaultSaveLocation");
		
		static By showInProgressLanguages = bxp("inProgressLanguages");
		static By showStartPage = bxp("showStartPage");
		static By showStartPageMessageBanners = bxp("showStartPageMessageBanners");
		static By simplifiedMode = bxp("useSimplifiedMode");
		static By textEditorAutoIndent = bxp("textEditorAutoIndent");
		static By textEditorFontSize = bxp("textEditorFontSize");
		static By theme = bxp("theme");
		static By translateExpressions = bxp("translateExpressions");
		static By uiMode = bxp("uiMode");
		
		static By useDefaultIconColor = bxp("useDefaultIconColor");
		static By useInAppClipboard = bxp("useFakeClipboard");
		
		static By zoomMouseWheelOnly = bxp("zoomMouseWheelOnly");
		static By language (String languageCode)
		{
			return bxp("//*[@class='languageSetting']/*[@value='" + languageCode + "']");
		}
	}
	static class ShortBreakPopup
	{
		static By x = bxp("//*[@id='okDialog']//ui-close-button");
		static By okButton = bxp("//*[@id='okDialog']//*[@class='okButton']");		
	}
	static class StartPage
	{
		static By startPageTab = bxp("//ui-tabbar//span[text()='Start page']/..");
		static By startPageClose = bxp("//ui-tabbar//span[text()='Start page']/following-sibling::ui-close-button");
		static class ExploreColumn
		{
			static By assetStore = bxp("//a[@data-campaign-content='AssetStore']");
			static By constructNet = bxp("//a[@data-campaign-content='ConstructNet']");
			static By whatsNew = bxp("//a[@class='whatsnewlinkbox cardLink -turquoise']");
		}
		static class LearnColumn
		{
			static By beginnersGuide = bxp("//a[@data-campaign-content='BeginnersGuide']");
			static By manual = bxp("//a[@data-campaign-content='Manual']");
			static By tutorials = bxp("//a[@data-campaign-content='Tutorials']");
		}
		static class OpenButtonDropdown
		{
			static By cloud = bxp("//div[@class='option fromCloud']");
			static By file = bxp("//div[@class='option fromFile']");
			static By projectFolder = bxp("//div[@class='option fromFolder']");
		}
		static class ParticipateColumn
		{
			static By arcade = bxp("//a[@data-campaign-content='Arcade']");
			static By blogs = bxp("//a[@data-campaign-content='Blogs']");
			static By forum = bxp("//a[@data-campaign-content='Forum']");
		}
		static class RecommendedExamples
		{
			static By browseExamples = bxp("buttonExamples");
			static By example1 = bxp("//*[@id='groupExamples']/div[1]");
			static By example2 = bxp("//*[@id='groupExamples']/div[2]");
			static By example3 = bxp("//*[@id='groupExamples']/div[3]");
		}
		static class SocialMedia
		{
			static By facebook = bxp("linkFacebook");
			static By reddit = bxp("linkReddit");
			static By twitter = bxp("linkTwitter");
			static By youTube = bxp("linkYoutube");
		}
		static class GetMoreEventsBanner
		{
			static By x = bxp("//div[@id='banner']//div[@class='buttonClose']");
			static By registerAnAccount = bxp("//a[text()='Register an account']");
			static By logIn = bxp("//a[text()='log in']");
		}	
		static By newButton = bxp("buttonNew");
		static By openButton = bxp("buttonOpen");	
		static By recentProject(int row)
		{
			return bxp("//*[@class='cardProject'][" + row + "]");
		}
	}
	static class StorageCleanupPopup
	{
		static By cancelButton = bxp("//*[@id='storageCleanupDialog']//*[@class='cancelButton']");
		static By clearStorageButton = bxp("//*[@id='storageCleanupDialog']//*[@class='okButton bold']");
		static By x = bxp("//*[@id='storageCleanupDialog']//ui-close-button");
		static By exampleProjects = bxp("clearExampleProjectsStorage");
		static By exportedProjects = bxp("clearExportManagerStorage");
		static By help = bxp("//*[@id='storageCleanupDialog']//*[@class='helpLink']");
		static By nwjsStorage = bxp("clearNwjsStorage");
		static By savedVersions = bxp("clearC3Storage");
	}
	
	static By welcomePopup = bxp("welcomeTourDialog");
	
	static class WelcomePopup
	{
		static By x = bxp("//*[@id='welcomeTourDialog']/ui-dialog-caption/ui-close-button");
		static By noThanksLink = bxp("noThanksLink");
		static By tourButton = bxp("tourButton");		
	}	
	static class UserAccountButton
	{
		static By userAccountButton = bxp("userAccountWrap");
		static By userLicenseType = bxp("userLicenseType");
		static By userAccountName = bxp("userAccountName");
	}
	static class NewProjectPopup
	{
		static By name = bxp("npProjectNameInput");
		static By choosePreset = bxp("npPresetSelect");
		static class Presets
		{
			static By retroStyle = bxp("//option[@value='retro-style']");
			static By sdLandscape43 = bxp("//option[@value='sd-landscape-4-3']");
			static By sdPortrait34 = bxp("//option[@value='sd-portrait-4-3']");
			static By sdLandscape169 = bxp("//option[@value='sd-landscape-16-9']");
			static By sdPortrait169 = bxp("//option[@value='sd-portrait-16-9']");
			static By landscape720p = bxp("//option[@value='720p-landscape']");
			static By portrait720p = bxp("//option[@value='720p-portrait']");
			static By landscape1080p = bxp("//option[@value='1080p-landscape']");
			static By portrait1080p = bxp("//option[@value='1080p-portrait']");
			static By landscape4k = bxp("//option[@value='4k-landscape']");
			static By portrait4k = bxp("//option[@value='1080p-portait']");
		}
		static By viewportSizeWidth = bxp("npViewportWidthInput");
		static By viewportSizeHeight = bxp("npViewportHeightInput");
		static By orientations = bxp("npOrientationSelect");
		static class Orientations 
		{
			static By any = bxp("//option[@value='any']");
			static By portrait = bxp("//option[@value='portrait']");
			static By landscape = bxp("//option[@value='landscape']");
		}
		static By startWith = bxp("npStartWithSelect");
		static class StartWith
		{
			static By eventSheet = bxp("//option[@value='event-sheet']");
			static By script = bxp("//option[@value='script']");
		}
		static By optimizeForPixelArt = bxp("npPixelArtCheck");
		static By x = bxp("//dialog[@id='newProjectDialog']//ui-close-button[@title='Close']");
		static By help = bxp("Help");
		static By create = bxp("okButton");
		static By cancel = bxp("cancelButton");
	}	
	static class OpenSecondProjectPopup
	{
		static By dontAskAgain = bxp("//label[@class='confirmCheckWrap']/input");
		static By closePreviousProject = bxp("//button[@class='confirmButton bold']");
		static By openBothProjects = bxp("//button[@class='cancelConfirmButton']");
		static By x = bxp("//dialog[@id='confirmCheckDialog']//ui-close-button");
	}
	static class ExportProjectPopup
	{
		static By nwjs = bxp("//span[text()='NW.js']/ancestor::ui-iconviewitem");
		static By next = bxp("//button[@class='nextButton']");
		
		static class Page2
		{
			static By deduplicateImages = bxp("//*[@id='exportDeduplicateImages']");
			static By losslessFormat = bxp("//*[@id='exportLosslessImageFormat']");
			static By lossyFormat = bxp("//*[@id='exportLossyImageFormat']");
			static By recompressImages = bxp("//*[@id='exportRecompressImages']");
			static By minifyMode = bxp("//select[@class='exportMinifyScript']");
			static By next = bxp("//button[@class='nextButton']");
			
			static class LosslessFormatOptions
			{
				static By png = bxp("//option[@value='png']");
				static By webp = bxp("//*[@id='exportLosslessImageFormat']//option[@value='webp']");
			}
			
			static class LossyFormatOptions
			{
				static By jpg = bxp("//option[@value='jpg']");
				static By webp = bxp("//*[@id='exportLossyImageFormat']//option[@value='webp']");
			}
			
			static class MinifyModes
			{
				static By none = bxp("//option[@value='none']");
				static By simple = bxp("//option[@value='simple']");
				static By advanced = bxp("//option[@value='advanced']");
			}
		}
		
		static class NwjsOptions
		{
			static By linux32 = bxp("//*[@id='nwjsPlatformLinux32']");
			static By linux64 = bxp("//*[@id='nwjsPlatformLinux64']");
			static By mac64 = bxp("//*[@id='nwjsPlatformMac64']");
			static By win32 = bxp("//*[@id='nwjsPlatformWin32']");
			static By win64 = bxp("//*[@id='nwjsPlatformWin64']");
			static By packageAssets = bxp("//*[@id='nwjsPackageAssets']");
			static By compressFinalZip = bxp("//*[@id='nwjsCompressFinalZip']");
			static By windowFrame = bxp("//*[@id='nwjsWindowFrame']");
			static By resizableWindow = bxp("//*[@id='nwjsResizableWindow']");
			static By kioskMode = bxp("//*[@id='nwjsKioskMode']");
			static By ignoreGpuBlacklist = bxp("//*[@id='nwjsIgnoreGPUBlacklist']");
			static By enableDevTools = bxp("//*[@id='nwjsEnableDevTools']");
			static By exportForSteam = bxp("//*[@id='nwjsSteamMode']");
			static By next = bxp("//button[@class='nextButton']");
		}
		
		static class ExportReport
		{
			static By downloadLink = bxp("//a[@class='downloadExportedProject']");
			static By ok = bxp("//button[@class='okButton']");
		}
	}
	static class Misc
	{
		static By iframe = bxp("//ui-dialog-contents//iframe");
		static By progressDialog = bxp("progressDialog");
		static By application = bxp("//body[@role='application']");
		static By main = bxp("//*[@id='main']");
		static By html = bxp("//html[@desktop]");
	}
}