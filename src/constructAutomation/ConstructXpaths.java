package constructAutomation;

class ConstructXpaths {

	static class AboutPopup {
		static class PersistentStoragePopup {
			static String ok = "//*[@id='okDialog']//*[@class='okButton']";
			static String x = "//*[@id='okDialog']//ui-close-button";
		}

		static class PlatformInfoPopup {
			static String copy = "//button[@class='copy']";
			static String ok = "//*[@id='platformInfoDialog']//*[@class='okButton']";
			static String x = "//*[@id='platformInfoDialog']//ui-close-button";
		}

		static String aboutUs = "//a[text()='About us']";
		static String contributeTranslations = "//a[text()='Contribute translations']";
		static String eula = "//a[text()='End-user license agreement']";
		static String forums = "//a[text()='Forums']";
		static String getAddons = "//a[text()='Get addons']";
		static String help = "//*[@id='aboutDialog']//*[@class='helpLink']";
		static String legalInfo = "//a[text()='Legal information']";
		static String officialWebsite = "//a[text()='Construct.net']";
		static String ok = "//*[@id='aboutDialog']//*[@class='okButton']";
		static String platformInformation = "//a[text()='Platform information']";
		static String privacyPolicy = "//a[text()='Privacy policy']";
		static String releaseNotes = "//a[@class='viewReleaseNotes']";
		static String reportIssues = "//a[text()='Report issues']";
		static String requestPersistentStorage = "//a[text()='Request persistent storage']";
		static String storageCleanup = "//a[text()='Storage cleanup...']";
		static String suggestFeatures = "//a[text()='Suggest features']";
		static String tutorials = "//a[text()='Tutorials']";
		static String viewAccountInformation = "//a[text()='View account information']";
		static String x = "//*[@id='aboutDialog']//ui-close-button";
	}

	static class AccountDropdown {
		static String enterAccessCode = "//span[text()='Enter access code']/..";
		static String logIn = "//ui-menuitem//span[text()='Log in']/..";
		static String purchase = "//span[text()='Purchase...']/..";
		static String register = "//span[text()='Register...']/..";
		static String viewDetails = "//span[text()='View details']/..";
	}

	static class AccountInfoPopup {
		static String close = "//button[@class='okButton']";
		static String editProfile = "//a[text()='Edit profile']";
		static String help = "//a[text()='Help']";
		static String logInToExistingAccount = "//a[text()='Log in to existing account']";
		static String registerAccount = "//a[text()='Register a new account']";
		static String x = "//*[@id='accountInfoDialog']//ui-close-button";
		static String yourLicenses = "//a[text()='Your licenses']";
	}

	static class AddonManagerPopup {
		static class AddonContextMenu {
			static String downloadAddon = "//span[text()='Download .c3addon']";
			static String helpFor = "//span[contains(text(),'Help for')]";
			static String uninstall = "//span[text()='Uninstall']";
			static String visitWebsite = "//span[text()='Visit website']";
		}

		static class InstallAddonPopup {
			static class InstallFinishedPopup {
				static String ok = "//*[@id='okDialog']//*[@class='okButton']";
				static String x = "//*[@id='okDialog']//ui-close-button";
			}

			static String cancel = "//*[@id='addonConfirmInstallDialog']//*[@class='cancelButton']";
			static String documentation = "//a[@class='addonDocumentation']";
			static String install = "//*[@id='addonConfirmInstallDialog']//*[@class='okButton']";
			static String website = "//a[@class='addonWebsite']";
			static String x = "//*[@id='addonConfirmInstallDialog']//ui-close-button";
		}

		static class UninstallAddonPopup {
			static class UninstallFinishedPopup {
				static String ok = "//*[@id='okDialog']//*[@class='okButton']";
				static String x = "//*[@id='okDialog']//ui-close-button";
			}

			static String cancel = "//button[@class='cancelConfirmButton']";
			static String uninstall = "//*[@id='addonConfirmInstallDialog']//*[@class='confirmButton bold']";
			static String x = "//*[@id='confirmDialog']//ui-close-button";
		}

		static String getAddons = "//a[text()='Get addons']";
		static String installNewAddon = "//button[@class='installAddon']";
		static String ok = "//*[@id='addonManagerDialog']//*[@class='okButton']";
		static String x = "//*[@id='addonManagerDialog']//ui-close-button";

		static String addon(String addon) {
			return "//*[@columnname='name']/*[text()='" + addon + "']/../..";
		}
	}

	static class BuyNow {
		static class Page1 {
			static String fullRunDown = "//a[text()='full run down']";
			static String proceedToPaymentBottom = "//*[@class='c']//a[@class='openDemo']";
			static String proceedToPaymentMiddle = "//div[@class='proceedOverlay']//a[@class='openDemo']";
			static String visitOurPricingPages = "//a[text()='visit our pricing pages']";
		}

		static class Page2 {
			static String continueButton = "//*[@id='BtnContinue']";
			static String email = "//*[@id='Email']";
			static String generalTermsAndConditions = "//a[text()='general terms & conditions']";
			static String orYouCanLogin = "//a[text()='or you can login']";
			static String privacyPolicy = "//a[text()='privacy policy']";
			static String storeTermsAndConditions = "//a[text()='store terms & conditions']";
		}

		static class Page3 {
			static class CancellationTermsPopup {
				static String contactingUs = "//a[text()='contacting us']";
				static String ok = "//*[@id='CloseSubTermsOverlayLink']";
			}

			static String cancel = "//*[@class='cancel']";
			static String cardNumber = "//*[@name='cardnumber']";
			static String countryDropdown = "//*[@id='Country']";
			static String creditOrDebit = "//*[@id='pm1']";
			static String editEmail = "//a[@class='editEmail']";
			static String expDate = "//*[@name='exp-date']";
			static String firstName = "//*[@id='FirstName']";
			static String go = "//*[@class='go']";
			static String lastName = "//*[@id='LastName']";
			static String payPal = "//*[@id='pm2']";
			static String phoneNumber = "//*[@id='Phone']";
			static String placeOrder = "//*[@id='BtnPlaceOrder']";
			static String postCode = "//*[@id='Postcode']";
			static String subscriptionAndCancellationTerms = "//*[@id='SubTermsLink']";

			static String country(String country) {
				return "//*[@id='Country']/*[text()='" + country + "']";
			}
		}

		static String buyNow = "//ui-tab/span[text()='Buy now']";

	}

	static class CloudOpenPopup {
		static class Services {
			static String dropBox = "//*[@value='DROPBOX']";
			static String googleDrive = "//*[@value='GOOGLE DRIVE']";
			static String oneDrive = "//*[@value='ONE DRIVE']";
		}

		static String addFolder = "//*[@title='Add Folder']";
		static String fileNameBox = "//ui-dialog-footer//input";
		static String logOut = "//*[@title='Logout']";
		static String refresh = "//*[@title='Refresh']";
		static String searchBox = "//ui-toolbar-textbox/input";
		static String serviceSelector = "//select[@corners='default']";
		static String uploadFile = "//*[@title='Upload File']";
		static String upToParent = "//*[@title='Up to parent folder']";
		static String x = "//*[@id='fileListDialog']//ui-close-button";

		static String cloudFolder(String row) {
			return "//ui-table-row[@tabindex='-1'][" + row + "]";
		}
	}

	static class EnterAccessCodePopup {
		static String accessCode = "//input[@class='input']";
		static String cancel = "//*[@class='cancelButton']";
		static String ok = "//*[@class='okButton']";
		static String rememberThisAccessCode = "//*[@class='inputCheckbox']";
		static String x = "//*[@id='inputCheckDialog']//ui-close-button";
	}

	static class ExampleBrowser {
		static class Behaviors {
			static class Attributes {
				static String jumpThru = "//*[@class='section -behavior']/*[@data-tag='behavior-jumpthru']";
				static String persist = "//*[@class='section -behavior']/*[@data-tag='behavior-Persist']";
				static String shadowCaster = "//*[@class='section -behavior']/*[@data-tag='behavior-shadowcaster']";
				static String solid = "//*[@class='section -behavior']/*[@data-tag='behavior-solid']";
			}

			static class General {
				static String anchor = "//*[@class='section -behavior']/*[@data-tag='behavior-Anchor']";
				static String boundToLayout = "//*[@class='section -behavior']/*[@data-tag='behavior-bound']";
				static String destroyOutsideLayout = "//*[@class='section -behavior']/*[@data-tag='behavior-destroy']";
				static String dragNDrop = "//*[@class='section -behavior']/*[@data-tag='behavior-DragnDrop']";
				static String fade = "//*[@class='section -behavior']/*[@data-tag='behavior-Fade']";
				static String flash = "//*[@class='section -behavior']/*[@data-tag='behavior-Flash']";
				static String lineOfSight = "//*[@class='section -behavior']/*[@data-tag='behavior-LOS']";
				static String pin = "//*[@class='section -behavior']/*[@data-tag='behavior-Pin']";
				static String scrollTo = "//*[@class='section -behavior']/*[@data-tag='behavior-scrollto']";
				static String solid = "//*[@class='section -behavior']/*[@data-tag='behavior-solid']";
				static String timer = "//*[@class='section -behavior']/*[@data-tag='behavior-Timer']";
				static String tween = "//*[@class='section -behavior']/*[@data-tag='behavior-Tween']";
				static String wrap = "//*[@class='section -behavior']/*[@data-tag='behavior-Wrap']";
			}

			static class Movements {
				static String bullet = "//*[@class='section -behavior']/*[@data-tag='behavior-Bullet']";
				static String car = "//*[@class='section -behavior']/*[@data-tag='behavior-Car']";
				static String custom = "//*[@class='section -behavior']/*[@data-tag='behavior-custom']";
				static String eightDirection = "//*[@class='section -behavior']/*[@data-tag='behavior-EightDir']";
				static String moveTo = "//*[@class='section -behavior']/*[@data-tag='behavior-MoveTo']";
				static String orbit = "//*[@class='section -behavior']/*[@data-tag='behavior-Orbit']";
				static String pathFinding = "//*[@class='section -behavior']/*[@data-tag='behavior-Pathfinding']";
				static String physics = "//*[@class='section -behavior']/*[@data-tag='behavior-Physics']";
				static String platform = "//*[@class='section -behavior']/*[@data-tag='behavior-Platform']";
				static String rotate = "//*[@class='section -behavior']/*[@data-tag='behavior-Rotate']";
				static String sine = "//*[@class='section -behavior']/*[@data-tag='behavior-Sin']";
				static String tileMovement = "//*[@class='section -behavior']/*[@data-tag='behavior-TileMovement']";
				static String turret = "//*[@class='section -behavior']/*[@data-tag='behavior-Turret']";
			}

			static String attributesExpander = "//*[@class='titleSection -behavior'][text()='Attributes']";
			static String generalExpander = "//*[@class='titleSection -behavior'][text()='General']";
			static String movementsExpander = "//*[@class='titleSection -behavior'][text()='Movements']";
		}

		static class Categories {
			static String bareBonesTemplate = "//div[@class='section -category']/div[@data-tag='barebones-template']";
			static String demoGame = "//div[@class='section -category']/div[@data-tag='demo-game']";
			static String featureExample = "//div[@class='section -category']/div[@data-tag='feature-example']";
			static String gameplayMechanic = "//div[@class='section -category']/div[@data-tag='gameplay-mechanic']";
			static String gameTemplate = "//div[@class='section -category']/div[@data-tag='game-template']";
			static String guidedTour = "//div[@class='section -category']/div[@data-tag='guided-tour']";
			static String newFilter = "//div[@class='section -category']/div[@data-tag='new']";
			static String recommended = "//div[@class='section -category']/div[@data-tag='recommended']";
			static String scripting = "//div[@class='section -category']/div[@data-tag='scripting']";
			static String techDemo = "//div[@class='section -category']/div[@data-tag='techDemo']";
		}

		static class Effects {
			static class Blend {
				static String darken = "//*[@class='section -effect']/*[@data-tag='effect-darken']";
				static String dodge = "//*[@class='section -effect']/*[@data-tag='effect-dodge']";
				static String exclusion = "//*[@class='section -effect']/*[@data-tag='effect-exclusion']";
				static String lighten = "//*[@class='section -effect']/*[@data-tag='effect-lighten']";
				static String multiply = "//*[@class='section -effect']/*[@data-tag='effect-multiply']";
				static String overlay = "//*[@class='section -effect']/*[@data-tag='effect-overlay']";
				static String screen = "//*[@class='section -effect']/*[@data-tag='effect-screen']";
				static String softLight = "//*[@class='section -effect']/*[@data-tag='effect-softlight']";
			}

			static class Color {
				static String adjustHsl = "//*[@class='section -effect']/*[@data-tag='effect-hsladjust']";
				static String alphaClamp = "//*[@class='section -effect']/*[@data-tag='effect-alphaclamp']";
				static String blurHorizontal = "//*[@class='section -effect']/*[@data-tag='effect-blurhorizontal']";
				static String blurVertical = "//*[@class='section -effect']/*[@data-tag='effect-blurvertical']";
				static String grayscale = "//*[@class='section -effect']/*[@data-tag='effect-grayscale']";
				static String inverse = "//*[@class='section -effect']/*[@data-tag='effect-inverse']";
				static String noise = "//*[@class='section -effect']/*[@data-tag='effect-noise']";
				static String pixellate = "//*[@class='section -effect']/*[@data-tag='effect-pixellate']";
				static String posterize = "//*[@class='section -effect']/*[@data-tag='effect-posterize']";
				static String radialBlur = "//*[@class='section -effect']/*[@data-tag='effect-radialblur']";
				static String replaceColor = "//*[@class='section -effect']/*[@data-tag='effect-replacecolor']";
				static String replaceSolidColor = "//*[@class='section -effect']/*[@data-tag='effect-replacesolidcolor']";
				static String setColor = "//*[@class='section -effect']/*[@data-tag='effect-setcolor']";
				static String sharpen = "//*[@class='section -effect']/*[@data-tag='effect-sharpen']";
				static String tint = "//*[@class='section -effect']/*[@data-tag='effect-tint']";
				static String vignette = "//*[@class='section -effect']/*[@data-tag='effect-vignette']";
			}

			static class Distortion {
				static String bulge = "//*[@class='section -effect']/*[@data-tag='effect-bulge']";
				static String glass = "//*[@class='section -effect']/*[@data-tag='effect-glass']";
				static String pulse = "//*[@class='section -effect']/*[@data-tag='effect-pulse']";
				static String stretch = "//*[@class='section -effect']/*[@data-tag='effect-stretch']";
				static String swirl = "//*[@class='section -effect']/*[@data-tag='effect-swirl']";
				static String warpLayout = "//*[@class='section -effect']/*[@data-tag='effect-warplayout']";
				static String warpObject = "//*[@class='section -effect']/*[@data-tag='effect-warpobject']";
				static String warpRipple = "//*[@class='section -effect']/*[@data-tag='effect-warpripple']";
				static String water = "//*[@class='section -effect']/*[@data-tag='effect-water']";
			}

			static class Mask {
				static String adjustHslMask = "//*[@class='section -effect']/*[@data-tag='effect-hsladjustmask']";
				static String warpObjectMask = "//*[@class='section -effect']/*[@data-tag='effect-warpobjectmask']";
			}

			static class MormalMapping {
				static String bumpMapping = "//*[@class='section -effect']/*[@data-tag='effect-bumpmapping']";
			}

			static class ThreeD {
				static String fogExponential = "//*[@class='section -effect']/*[@data-tag='effect-fogexponential']";
			}

			static String blendExpander = "//*[@class='titleSection -effect'][text()='Blend']";
			static String colorExpander = "//*[@class='titleSection -effect'][text()='Color']";
			static String distortionExpander = "//*[@class='titleSection -effect'][text()='Distortion']";
			static String maskExpander = "//*[@class='titleSection -effect'][text()='Mask']";
			static String normalMappingExpander = "//*[@class='titleSection -effect'][text()='Normal mapping']";
			static String threeDExpander = "//*[@class='titleSection -effect'][text()='3D']";
		}

		static class Genres {
			static String action = "//div[@class='section -genre']/div[@data-tag='action']";
			static String adventure = "//div[@class='section -genre']/div[@data-tag='adventure']";
			static String animation = "//div[@class='section -genre']/div[@data-tag='animation']";
			static String arcade = "//div[@class='section -genre']/div[@data-tag='arcade']";
			static String fighting = "//div[@class='section -genre']/div[@data-tag='fighting']";
			static String multiplayer = "//div[@class='section -genre']/div[@data-tag='multiplayer']";
			static String platformer = "//div[@class='section -genre']/div[@data-tag='platformer']";
			static String puzzle = "//div[@class='section -genre']/div[@data-tag='puzzle']";
			static String racing = "//div[@class='section -genre']/div[@data-tag='racing']";
			static String rpg = "//div[@class='section -genre']/div[@data-tag='rpg']";
			static String shooter = "//div[@class='section -genre']/div[@data-tag='shooter']";
			static String strategy = "//div[@class='section -genre']/div[@data-tag='strategy']";
		}

		static class Levels {
			static String advanced = "//div[@class='section -level']/div[@data-tag='advanced']";
			static String beginner = "//div[@class='section -level']/div[@data-tag='beginner']";
			static String intermediate = "//div[@class='section -level']/div[@data-tag='intermediate']";
		}

		static class Plugins {
			static class DataAndStorage {
				static String array = "//*[@class='section -plugin']/*[@data-tag='plugin-Arr']";
				static String binaryData = "//*[@class='section -plugin']/*[@data-tag='plugin-BinaryData']";
				static String dictionary = "//*[@class='section -plugin']/*[@data-tag='plugin-Dictionary']";
				static String json = "//*[@class='section -plugin']/*[@data-tag='plugin-Json']";
				static String localStorage = "//*[@class='section -plugin']/*[@data-tag='plugin-LocalStorage']";
				static String xml = "//*[@class='section -plugin']/*[@data-tag='plugin-XML']";
			}

			static class FormControls {
				static String button = "//*[@class='section -plugin']/*[@data-tag='plugin-Button']";
				static String htmlElement = "//*[@class='section -plugin']/*[@data-tag='plugin-HTMLElement']";
				static String iFrame = "//*[@class='section -plugin']/*[@data-tag='plugin-iframe']";
				static String list = "//*[@class='section -plugin']/*[@data-tag='plugin-list']";
				static String sliderBar = "//*[@class='section -plugin']/*[@data-tag='plugin-sliderbar']";
				static String textInput = "//*[@class='section -plugin']/*[@data-tag='plugin-textBox']";
			}

			static class General {
				static String ninePatch = "//*[@class='section -plugin']/*[@data-tag='plugin-NinePatch']";
				static String particles = "//*[@class='section -plugin']/*[@data-tag='plugin-Particles']";
				static String shadowLight = "//*[@class='section -plugin']/*[@data-tag='plugin-shadowlight']";
				static String sprite = "//*[@class='section -plugin']/*[@data-tag='plugin-Sprite']";
				static String spriteFont = "//*[@class='section -plugin']/*[@data-tag='plugin-Spritefont2']";
				static String text = "//*[@class='section -plugin']/*[@data-tag='plugin-Text']";
				static String tiledBackground = "//*[@class='section -plugin']/*[@data-tag='plugin-TiledBg']";
				static String tileMap = "//*[@class='section -plugin']/*[@data-tag='plugin-Tilemap']";
				static String timeLineController = "//*[@class='section -plugin']/*[@data-tag='plugin-Timeline']";
			}

			static class Input {
				static String gamePad = "//*[@class='section -plugin']/*[@data-tag='plugin-gamepad']";
				static String keyBoard = "//*[@class='section -plugin']/*[@data-tag='plugin-Keyboard']";
				static String mouse = "//*[@class='section -plugin']/*[@data-tag='plugin-Mouse']";
				static String touch = "//*[@class='section -plugin']/*[@data-tag='plugin-Touch']";
			}

			static class Media {
				static String audio = "//*[@class='section -plugin']/*[@data-tag='plugin-Audio']";
				static String geolocation = "//*[@class='section -plugin']/*[@data-tag='plugin-Geolocation']";
				static String speechRecognition = "//*[@class='section -plugin']/*[@data-tag='plugin-SpeechRecognition']";
				static String speechSynthesis = "//*[@class='section -plugin']/*[@data-tag='plugin-SpeechSynthesis']";
				static String userMedia = "//*[@class='section -plugin']/*[@data-tag='plugin-UserMedia']";
				static String videoRecorder = "//*[@class='section -plugin']/*[@data-tag='plugin-GameRecorder']";
			}

			static class Other {
				static String advancedRandom = "//*[@class='section -plugin']/*[@data-tag='plugin-AdvancedRandom']";
				static String blueTooth = "//*[@class='section -plugin']/*[@data-tag='plugin-Bluetooth']";
				static String date = "//*[@class='section -plugin']/*[@data-tag='plugin-Date']";
				static String drawingCanvas = "//*[@class='section -plugin']/*[@data-tag='plugin-DrawingCanvas']";
				static String platformInfo = "//*[@class='section -plugin']/*[@data-tag='plugin-PlatformInfo']";
				static String share = "//*[@class='section -plugin']/*[@data-tag='plugin-Share']";
			}

			static class ThreeD {
				static String threeDCamera = "//*[@class='section -plugin']/*[@data-tag='plugin-Camera3D']";
				static String threeDShape = "//*[@class='section -plugin']/*[@data-tag='plugin-Shape3D']";
			}

			static class Web {
				static String ajax = "//*[@class='section -plugin']/*[@data-tag='plugin-AJAX']";
				static String browser = "//*[@class='section -plugin']/*[@data-tag='plugin-Browser']";
				static String multiplayer = "//*[@class='section -plugin']/*[@data-tag='plugin-Multiplayer']";
			}

			static String dataAndStorageExpander = "//*[@class='titleSection -plugin'][contains(text(),'Data & storage')]";
			static String formControls = "//*[@class='titleSection -plugin'][contains(text(),'Form Controls')]";
			static String generalExpander = "//*[@class='titleSection -plugin'][contains(text(),'General')]";
			static String inputExpander = "//*[@class='titleSection -plugin'][contains(text(),'Input')]";
			static String mediaExpander = "//*[@class='titleSection -plugin'][contains(text(),'Media')]";
			static String otherExpander = "//*[@class='titleSection -plugin'][contains(text(),'Other')]";
			static String threeDExpander = "//*[@class='titleSection -plugin'][contains(text(),'3D')]";
			static String webExpander = "//*[@class='titleSection -plugin'][contains(text(),'Web')]";
		}

		static class Tags {
			static String meshDistortion = "//div[@class='section -tag']/div[@data-tag='mesh-distortion']";
			static String mobile = "//div[@class='section -tag']/div[@data-tag='mobile']";
			static String performance = "//div[@class='section -tag']/div[@data-tag='performance']";
			static String sceneGraph = "//div[@class='section -tag']/div[@data-tag='scene-graph']";
			static String threeD = "//div[@class='section -tag']/div[@data-tag='3d']";
			static String timeline = "//div[@class='section -tag']/div[@data-tag='timeline']";
		}

		static String behaviors = "//div[@class='listTags']/*[@class='titleSection -behavior']";
		static String categories = "//div[@class='listTags']/*[@class='titleSection -category']";
		static String clear = "//*[@id='selectedTags']/div[@class='buttonClear']";
		static String clearFilters = "//div[@class='resultsFooterClearTags']";
		static String effects = "//*[@id='listTags']/div[@class='titleSection -effect']";
		static String exampleBrowserTab = "//ui-tabbar//span[text()='Example browser']/..";
		static String genres = "//*[@id='listTags']/div[@class='titleSection -genre']";
		static String levels = "//*[@id='listTags']/div[@class='titleSection -level']";
		static String plugins = "//*[@id='listTags']/div[@class='titleSection -plugin']";
		static String searchBox = "//input[@class='searchInputField']";
		static String tags = "//*[@id='listTags']/div[@class='titleSection -tag']";

		static String removeFilter(String tag) {
			return "//div[@id='selectedTags']/div[@data-tag='" + tag.toLowerCase() + "']";
		}
	}

	static class ExportManagerPopup {
		static String addArchive = "//*[@title='Add archive']";
		static String buildApplication = "//*[@title='Build Application']";
		static String deleteArchive = "//*[@title='Delete archive']";
		static String downloadArchive = "//*[@title='Download archive']";
		static String x = "//*[@id='archiveManagerDialog']//ui-close-button";

		static String export(String export) {
			return "//*[@columnname='project']/*[text()='" + export + "']/../..";
		}
	}

	static class ExportProjectPopup {
		static class ExportReport {
			static String downloadLink = "//a[@class='downloadExportedProject']";
			static String ok = "//button[@class='okButton']";
		}

		static class NwjsOptions {
			static String compressFinalZip = "//*[@id='nwjsCompressFinalZip']";
			static String enableDevTools = "//*[@id='nwjsEnableDevTools']";
			static String exportForSteam = "//*[@id='nwjsSteamMode']";
			static String ignoreGpuBlacklist = "//*[@id='nwjsIgnoreGPUBlacklist']";
			static String kioskMode = "//*[@id='nwjsKioskMode']";
			static String linux32 = "//*[@id='nwjsPlatformLinux32']";
			static String linux64 = "//*[@id='nwjsPlatformLinux64']";
			static String mac64 = "//*[@id='nwjsPlatformMac64']";
			static String next = "//button[@class='nextButton']";
			static String packageAssets = "//*[@id='nwjsPackageAssets']";
			static String resizableWindow = "//*[@id='nwjsResizableWindow']";
			static String win32 = "//*[@id='nwjsPlatformWin32']";
			static String win64 = "//*[@id='nwjsPlatformWin64']";
			static String windowFrame = "//*[@id='nwjsWindowFrame']";
		}

		static class Page2 {
			static class LosslessFormatOptions {
				static String png = "//option[@value='png']";
				static String webp = "//*[@id='exportLosslessImageFormat']//option[@value='webp']";
			}

			static class LossyFormatOptions {
				static String jpg = "//option[@value='jpg']";
				static String webp = "//*[@id='exportLossyImageFormat']//option[@value='webp']";
			}

			static class MinifyModes {
				static String advanced = "//option[@value='advanced']";
				static String none = "//option[@value='none']";
				static String simple = "//option[@value='simple']";
			}

			static String deduplicateImages = "//*[@id='exportDeduplicateImages']";
			static String losslessFormat = "//*[@id='exportLosslessImageFormat']";
			static String lossyFormat = "//*[@id='exportLossyImageFormat']";
			static String minifyMode = "//select[@class='exportMinifyScript']";
			static String next = "//button[@class='nextButton']";
			static String recompressImages = "//*[@id='exportRecompressImages']";
		}

		static String next = "//button[@class='nextButton']";
		static String nwjs = "//span[text()='NW.js']/ancestor::ui-iconviewitem";
	}

	static class FreeEditionPopup {
		static String cancel = "//*[@id='addonManagerDialog']//*[@class='cancelButton']";
		static String learnMore = "//*[@id='addonManagerDialog']//*[@class='infoButton']";
		static String logInLink = "//a[text()='log in to your account']";
		static String purchase = "//*[@id='addonManagerDialog']//*[@class='okButton']";
		static String x = "//*[@id='freeEditionLimitDialog']//ui-close-button";
	}

	static class GuidedToursPopup {
		static class CloseConfirmation {
			static String cancel = "//button[@class='cancelConfirmButton']";
			static String exit = "//button[@class='confirmButton bold']";
			static String x = "//*[@id='confirmDialog']//ui-close-button";
		}

		static String exitTour = "//span[text()='Exit tour']/../..";
		static String menuDots = "//ui-menu-dots-button";
		static String next = "//button[@class='nextButton bold']";
	}

	static class LogInDialog {
		static String cancel = "//*[@id='cancel']";
		static String facebook = "//*[@id='FacebookOAuthLoginButton']";
		static String keepMeLoggedIn = "//*[@id='remember']";
		static String logIn = "//*[@id='login']";
		static String loginDialog = "//*[@id='loginDialog']";
		static String password = "//*[@id='password']";
		static String signInWithGoogle = "//div[@class='g_id_signin']";
		static String username = "//*[@id='username']";
		static String x = "//*[@id='loginDialog']//ui-close-button";
	}

	static class MenuDropdown {
		static class AccountPopout {
			static String enterAccessCode = "//span[text()='Enter access code']/..";
			static String logIn = "//span[text()='Log in']/..";
			static String purchase = "//span[text()='Purchase...']/..";
			static String register = "//span[text()='Register...']/..";
			static String viewDetails = "//span[text()='View details']/..";
		}

		static class GuidedToursPopout {
			static String beginnersGuide = "//span[contains(text(),'Beginner')]/..";
			static String getStartedWithJavaScript = "//span[text()='Get started with JavaScript']/..";
			static String getStartedWithTimelineAnimations = "//span[text()='Get started with timeline animations']/..";
			static String platformGame = "//span[text()='Make a platform game']/..";
		}

		static class ProjectPopout {
			static class OpenRecentPopout {

				static String recentProject(String name) {
					return "(//span[contains(text(), '" + name + "')]/..)[1]";
				}
			}

			static class saveAsPopout {
				static String cloudSave = "//span[text()='Cloud save']/..";
				static String downloadACopy = "//span[text()='Download a copy']/..";
				static String saveAsProjectFolder = "//span[text()='Save as project folder...']/..";
				static String saveAsSingleFile = "//span[text()='Save as single file...']/..";
			}

			static String closeProject = "//span[text()='Close project']/..";
			static String cloudOpen = "//span[text()='Cloud open']/..";
			static String debug = "//span[text()='Debug']/..";
			static String export = "//span[text()='Export']/..";
			static String newProject = "//span[text()='New']/..";
			static String openLocalFile = "//span[text()='Open local file']/..";
			static String openLocalFolder = "//span[text()='Open local project folder']/..";
			static String openRecent = "//span[text()='Open recent']/..";
			static String preview = "//span[text()='Preview']/..";
			static String remotePreview = "//span[text()='Remote preview']/..";
			static String save = "//span[text()='Save']/..";
			static String saveAs = "//span[text()='Save as']/..";
		}

		static class ViewPopout {
			static String addonManager = "//span[text()='Addon manager']/..";
			static String exampleBrowser = "//span[text()='Example browser']/..";
			static String exportManager = "//span[text()='Export manager']/..";
			static String startPage = "//span[text()='Start page'][@class='menu-item-text']/..";
			static String storageCleanup = "//span[text()='Storage cleanup']/..";
		}

		static String about = "//span[text()='About']/..";
		static String account = "//span[text()='Account']/..";
		static String assetStore = "//span[text()='Asset Store']/..";
		static String getAddons = "//span[text()='Get addons']/..";
		static String guidedTours = "//span[text()='Guided tours']/..";
		static String help = "//span[text()='Help']/..";
		static String installAsApp = "//span[text()='Install as app']/..";
		static String project = "//span[text()='Project'][@class='menu-item-text']/..";
		static String settings = "//span[text()='Settings']/..";
		static String view = "//span[text()='View']/..";
	}

	static class Misc {
		static String application = "//body[@role='application']";
		static String dimmer = "//div[@class='c3-dimmer']";
		static String html = "//html[@desktop]";
		static String iframe = "//ui-dialog-contents//iframe";
		static String main = "//*[@id='main']";
		static String progressDialog = "//*[@id='progressDialog']";
	}

	static class NewProjectPopup {
		static class Orientations {
			static String any = "//option[@value='any']";
			static String landscape = "//option[@value='landscape']";
			static String portrait = "//option[@value='portrait']";
		}

		static class Presets {
			static String landscape1080p = "//option[@value='1080p-landscape']";
			static String landscape4k = "//option[@value='4k-landscape']";
			static String landscape720p = "//option[@value='720p-landscape']";
			static String portrait1080p = "//option[@value='1080p-portrait']";
			static String portrait4k = "//option[@value='1080p-portait']";
			static String portrait720p = "//option[@value='720p-portrait']";
			static String retroStyle = "//option[@value='retro-style']";
			static String sdLandscape169 = "//option[@value='sd-landscape-16-9']";
			static String sdLandscape43 = "//option[@value='sd-landscape-4-3']";
			static String sdPortrait169 = "//option[@value='sd-portrait-16-9']";
			static String sdPortrait34 = "//option[@value='sd-portrait-4-3']";
		}

		static class StartWith {
			static String eventSheet = "//option[@value='event-sheet']";
			static String script = "//option[@value='script']";
		}

		static String cancel = "//*[@class='cancelButton']";
		static String choosePreset = "//*[id='npPresetSelect']";
		static String create = "//button[text()='Create']";
		static String help = "//a[@class='helpLink']";
		static String name = "//*[id='npProjectNameInput']";
		static String optimizeForPixelArt = "//*[id='npPixelArtCheck']";
		static String orientations = "//*[id='npOrientationSelect']";
		static String startWith = "//*[id='npStartWithSelect']";
		static String viewportSizeHeight = "//*[id='npViewportHeightInput']";
		static String viewportSizeWidth = "//*[id='npViewportWidthInput']";
		static String x = "//dialog[@id='newProjectDialog']//ui-close-button[@title='Close']";
	}

	static class OpenSecondProjectPopup {
		static String closePreviousProject = "//button[@class='confirmButton bold']";
		static String dontAskAgain = "//label[@class='confirmCheckWrap']/input";
		static String openBothProjects = "//button[@class='cancelConfirmButton']";
		static String x = "//dialog[@id='confirmCheckDialog']//ui-close-button";
	}

	static class Project {
		static class AnimationsEditor {
			static class AnimationsPane {
				static class AnimationContextMenu {
					static class ImportAnimationsContext {
						static String fromFiles = "//span[text()='From Files']";
					}

					static String delete = "//span[text()='Delete']/parent::*";
					static String importAnimations = "//span[text()='Import Animation']";
				}

				static class PaneContextMenu {
					static class importAnimationPopout {
						static String fromFiles = "//span[text()='From Files']/parent::*";
					}

					static String addAnimation = "//span[text()='Add Animation']/parent::*";
					static String importAnimation = "//span[text()='Import Animation']/parent::*";
				}

				static String animations = "//ui-animation-editor-panel[@class='animationsEditorAnimations']//ui-treeitem//div";
				static String background = "//ui-animation-editor-panel-content/ui-tree";
				static String title = "//ui-animation-editor-panel[@class='animationsEditorAnimations']/ui-animation-editor-panel-title";

				static String animation(int number) {
					return "(//ui-animation-editor-panel[@class='animationsEditorAnimations']//ui-treeitem//div)["
							+ number + "]";
				}

				static String animation(String name) {
					return "//ui-animation-editor-panel[@class='animationsEditorAnimations']//ui-treeitem//span[text()='"
							+ name + "']";
				}
			}

			static class ImagePoints {
				static class ImagePointsContextMenu {
					static String applyToAllAnimations = "//span[text()='Apply to all animations']";
				}

				static String origin = "//div[text()='Origin']";
			}

			static class Toolbar {
				static class CropDropdown {
					static String applyToAllAnimations = "//span[text()='Apply to all animations']";
				}

				static String cropDropdownArrow = "//div[contains(@title, 'Crop transparent edges')]/following-sibling::div";
				static String editImagePoints = "//ui-toolbar-button[contains(@title, 'Edit the image points')]";
				static String y = "//*[@id='spinnerEditInput']";
				static String ySpinner = "//span[text()='Y']/following-sibling::input[@type='number']";
			}

			static String blocker = "//div[@class='blocker']";
			static String x = "//*[@id='animationsEditorDialog']//ui-close-button";
		}

		static class CreateNewObjectTypePopup {
			static String name = "//*[@id='crObjectTypeNameInput']";
			static String searchBar = "//dialog[@id='createNewObjectTypeDialog']//input[@type='search']";
		}

		static class OtherPreviewOptions {
			static String debugLayout = "//span[@class='menu-item-text'][text()='Debug layout']";
			static String previewLayout = "//span[@class='menu-item-text'][text()='Preview layout']";
			static String previewProject = "//span[@class='menu-item-text'][text()='Preview project']";
			static String remotePreview = "//span[@class='menu-item-text'][text()='Remote preview']";
		}

		static class ProjectBar {
			static class ContextMenu {
				static String editAnimations = "//span[text()='Edit animations']/parent::ui-menuitem";
			}

			static String searchBar = "//input[@class='search']";

			static String searchResult(String query) {
				return "(//span[text()='" + query + "'])[1]";
			}
		}

		static String preview = "//div[@title='Preview']";
		static String redo = "//div[@title='Redo']";
		static String save = "//ui-toolbar-button[@title='Save project']";
		static String undo = "//div[@title='Undo']";
		static String viewOtherPreviewOptions = "//div[@title='Other preview options']";
		static String viewRedoStack = "//div[@title='View redo stack']";
		static String viewUndoStack = "//div[@title='View undo stack']";

		static String projectTab(String name) {
			return "//ui-tab[starts-with(@title, 'Layout: " + name + "')]";
		}

		static String redoStack(int number) {
			return "(//span[@class='menu-item-text'])[" + number + "]";
		}

		static String undoStack(int number) {
			return "(//span[@class='menu-item-text'])[" + number + "]";
		}
	}

	static class SettingsPopup {
		static class BackupLocations {
			static String dropBox = "//*[@class='defaultSaveLocation']/*[@value='DROPBOX']";
			static String googleDrive = "//*[@class='defaultSaveLocation']/*[@value='GOOGLE DRIVE']";
			static String localFolder = "//*[@class='defaultSaveLocation']/*[@value='WEBFS FOLDER']";
			static String localStorage = "//*[@class='defaultSaveLocation']/*[@value='LOCAL STORAGE']";
			static String oneDrive = "//*[@class='defaultSaveLocation']/*[@value='ONE DRIVE']";
			static String sameLocation = "//*[@class='defaultSaveLocation']/*[@value='MATCH']";
		}

		static class GpuPreferences {
			static String defaultPreference = "//*[@class='gpuPowerPreference']/*[@value='default']";
			static String highPerformance = "//*[@class='gpuPowerPreference']/*[@value='high-performance']";
			static String lowPower = "//*[@class='gpuPowerPreference']/*[@value='low-power']";
		}

		static class PreviewModes {
			static String browserTab = "//*[@class='previewMode']/*[@value='browser-tab']";
			static String dialog = "//*[@class='previewMode']/*[@value='iframe-dialog']";
			static String popupWindow = "//*[@class='previewMode']/*[@value='popup-window']";
		}

		static class Releases {
			static String beta = "//*[@class='updateChannel']/*[@value='beta']";
			static String stable = "//*[@class='updateChannel']/*[@value='stable']";
		}

		static class SaveLocations {
			static String cloud = "//*[@class='defaultSaveLocation']/*[@value='cloud']";
			static String download = "//*[@class='defaultSaveLocation']/*[@value='download']";
			static String localBrowser = "//*[@class='defaultSaveLocation']/*[@value='local-browser']";
			static String saveAs = "//*[@class='defaultSaveLocation']/*[@value='save-as']";
		}

		static class Themes {
			static String dark = "//*[@class='theme']/*[text()='Dark']";
			static String defaultTheme = "//*[@class='theme']/*[text()='Default (no theme)']";
			static String light = "//*[@class='theme']/*[text()='Light']";
		}

		static class UiModes {
			static String auto = "//*[@class='uiMode']/*[@value='auto']";
			static String desktop = "//*[@class='uiMode']/*[@value='desktop']";
			static String mobile = "//*[@class='uiMode']/*[@value='mobile']";
		}

		static String backupInterval = "//*[@class='autosaveDuration']";
		static String backupLocation = "//*[@class='autosaveLocation']";
		static String cacheCloudMetadata = "//*[@class='cacheCloudMetadata']";
		static String choose = "//button[@class='localBackupFolderChoose']";
		static String close = "//*[@id='settingsDialog']//*[@class='okButton']";
		static String defaultAnimationSpeed = "//*[@class='defaultAnimationSpeed']";
		static String defaultProjectAuthor = "//*[@class='defaultProjectAuthor']";
		static String defaultProjectEmail = "//*[@class='defaultProjectEmail']";
		static String defaultProjectWebsite = "//*[@class='defaultProjectWebsite']";
		static String defaultSaveLocation = "//*[@class='defaultSaveLocation']";
		static String enableExperimentalFeatures = "//*[@class='experimentalFeatures']";
		static String enableNotifications = "//*[@class='enableNotifications']";
		static String enableUiAnimations = "//*[@class='enableUIAnims']";
		static String enableUiEffects = "//*[@class='enableUIEffects']";
		static String gpuPreference = "//*[@class='gpuPowerPreference']";
		static String help = "//*[@class='helpLink']";
		static String hideAddActionRows = "//*[@class='hideAddActionRows']";
		static String hideTheStartPageWhenOpeningAProject = "//*[@class='autoHideStartPage']";
		static String iconColor = "//*[@class='iconColor']";
		static String languageSetting = "//*[@class='languageSetting']";
		static String occasionallyShowMessageBannersFromTheConstructTeamOnTheStartPage = "//*[@class='showStartPageMessageBanners']";
		static String periodicallyBackUpActiveProject = "//*[@class='enableAutosave']";
		static String previewSelector = "//*[@class='previewMode']";
		static String releaseNotifications = "//*[@class='updateChannel']";
		static String resetBarsAndDialogs = "//*[@class='resetLayout']";
		static String showInProgressLanguages = "//*[@class='inProgressLanguages']";
		static String showTakeABreakReminderEvery2Hours = "//*[@class='showTakeBreakReminders']";
		static String showTheStartPageOnStartup = "//*[@class='showStartPage']";
		static String simplifiedMode = "//*[@class='useSimplifiedMode']";
		static String textEditorAutomaticIndentation = "//*[@class='textEditorAutoIndent']";
		static String textEditorFontSize = "//*[@class='textEditorFontSize']";
		static String theme = "//*[@class='theme']";
		static String translateExpressions = "//*[@class='translateExpressions']";
		static String uiMode = "//*[@class='uiMode']";
		static String useDefaultIconColor = "//*[@class='useDefaultIconColor']";
		static String useInAppClipboard = "//*[@class='useFakeClipboard']";
		static String x = "//*[@id='settingsDialog']//ui-close-button";
		static String zoomWithMouseWheelOnly = "//*[@class='zoomMouseWheelOnly']";

		static String language(String languageCode) {
			return "//*[@class='languageSetting']/*[@value='" + languageCode + "']";
		}
	}

	static class setUpBackupsPopup {
		static String learnMore = "//a[text()='Learn more']";
		static String openSettings = "//button[@class='confirmButton bold']";
		static String saveAnyway = "//button[@class='cancelConfirmButton']";
		static String x = "//dialog[@id='confirmDialog']//ui-close-button";
	}

	static class ShortBreakPopup {
		static String ok = "//*[@id='okDialog']//*[@class='okButton']";
		static String x = "//*[@id='okDialog']//ui-close-button";
	}

	static class StartPage {
		static class ExploreColumn {
			static String assetStore = "//a[@data-campaign-content='AssetStore']";
			static String constructNet = "//a[@data-campaign-content='ConstructNet']";
			static String whatsNew = "//a[@class='whatsnewlinkbox cardLink -turquoise']";
		}

		static class GetMoreEventsBanner {
			static String logIn = "//a[text()='log in']";
			static String registerAnAccount = "//a[text()='Register an account']";
			static String x = "//div[@id='banner']//div[@class='buttonClose']";
		}

		static class LearnColumn {
			static String beginnersGuide = "//a[@data-campaign-content='BeginnersGuide']";
			static String manual = "//a[@data-campaign-content='Manual']";
			static String tutorials = "//a[@data-campaign-content='Tutorials']";
		}

		static class OpenButtonDropdown {
			static String cloud = "//div[@class='option fromCloud']";
			static String file = "//div[@class='option fromFile']";
			static String projectFolder = "//div[@class='option fromFolder']";
		}

		static class ParticipateColumn {
			static String arcade = "//a[@data-campaign-content='Arcade']";
			static String blogs = "//a[@data-campaign-content='Blogs']";
			static String forum = "//a[@data-campaign-content='Forum']";
		}

		static class RecommendedExamples {
			static String browseExamples = "//*[@id='buttonExamples']";
			static String example1 = "//*[@id='groupExamples']/div[1]";
			static String example2 = "//*[@id='groupExamples']/div[2]";
			static String example3 = "//*[@id='groupExamples']/div[3]";
		}

		static class SocialMedia {
			static String facebook = "//*[@id='linkFacebook']";
			static String reddit = "//*[@id='linkReddit']";
			static String twitter = "//*[@id='linkTwitter']";
			static String youTube = "//*[@id='linkYoutube']";
		}

		static String newButton = "//*[@id='buttonNew']";
		static String open = "//*[@id='buttonOpen']";
		static String startPageClose = "//ui-tabbar//span[text()='Start page']/following-sibling::ui-close-button";
		static String startPageTab = "//ui-tabbar//span[text()='Start page']/..";

		static String recentProject(int row) {
			return "//*[@class='cardProject'][" + row + "]";
		}
	}

	static class StorageCleanupPopup {
		static String cancel = "//*[@id='storageCleanupDialog']//*[@class='cancelButton']";
		static String clearStorage = "//*[@id='storageCleanupDialog']//*[@class='okButton bold']";
		static String deleteDownloadedNwjsVersions = "//input[@class='clearNwjsStorage']";
		static String deleteExampleProjects = "//input[@class='clearExampleProjectsStorage']";
		static String deleteExportedProjects = "//input[@class='clearExportManagerStorage']";
		static String deleteSavedVersionsOfConstruct = "//input[@class='clearC3Storage']";
		static String help = "//*[@id='storageCleanupDialog']//*[@class='helpLink']";
		static String x = "//*[@id='storageCleanupDialog']//ui-close-button";
	}

	static class UserAccount {
		static String userAccountName = "//*[@id='userAccountName']";
		static String userLicenseType = "//*[@id='userLicenseType']";
	}

	static class WelcomePopup {
		static String noThanksNotNow = "//a[text()='No thanks, not now']";
		static String takeAGuidedTour = "//button[@class='tourButton']";
		static String x = "//*[@id='welcomeTourDialog']/ui-dialog-caption/ui-close-button";
	}

	static String menu = "//*[@id='mainMenuButton']";
	static String userAccount = "//*[@id='userAccountWrap']";
	static String welcomePopup = "//*[@id='welcomeTourDialog']";
}