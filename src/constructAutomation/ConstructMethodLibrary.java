package constructAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Map;
import java.util.Objects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**<h1>Construct Method Library</h1>
 * A helper class for common Construct actions.
 * @author laserwolve
 */
class ConstructMethodLibrary extends ConstructElementMap
{	
	static EdgeOptions edgeOptions;
	static WebDriver driver;
	static JavascriptExecutor javascriptExecutor;
	static Actions actions;
	static Robot robot;
	static LocalTime expiryTime;
	static String userHome;
	static String fs;
	static String editorURL;
	
	/**<h1>Start</h1>
	 * Initialize variables and browses to the Construct Editor.
	 * @author laserwolve
	 * @throws AWTException from {@link java.awt.Robot#Robot}
	 */
	static void start() throws AWTException
	{
		edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("start-maximized");
		
		driver = WebDriverManager.edgedriver().capabilities(edgeOptions).create();
		javascriptExecutor = (JavascriptExecutor) driver;
		actions = new Actions(driver);
		robot = new Robot();
		userHome = System.getProperty("user.home");
		fs = File.separator;
		editorURL = "https://editor.construct.net/r339";
		
		driver.get(editorURL);
		
		dismissWelcomePopup();
		
		logIn();
	}
	
	/**<h1>Add Child Element</h1>
	 * Creates a new element with the specified attributes under the specified element.
	 * Locates and returns the newly created element with an XPath derived from its tag name and attribute values.
	 * @param by The locator for the element under which to create the new element.
	 * @param tagName The tag name of the new element.
	 * @param attributes Pairs of attributes and values for the new element.
	 * @return The new element.
	 * @author laserwolve
	 */
	static WebElement addChildElement(By by, String tagName, Map<String,String> attributes)
	{
		String setAttributes = "";
		String locatorXpath = "";
		WebElement webElement = presentElement(by);
		
		for(Map.Entry<String,String> entry : attributes.entrySet())
		{
			setAttributes += tagName + ".setAttribute('" + entry.getKey() + "', '" + entry.getValue() + "');";
			
			locatorXpath += "[@" + entry.getKey() + "='" + entry.getValue() + "']";
		}
		
		javascriptExecutor.executeScript("let " + tagName + " = document.createElement('" + tagName + "');" + setAttributes + "arguments[0].appendChild(document.createElement('" + tagName + "'));", webElement);
		
		return webElement.findElement(By.xpath("(./" + tagName + locatorXpath + ")[last()]"));
	}
	
	/**<h1>Click</h1>
	 * Clicks the element specified in the By.
	 * @param by The By of the element to click.
	 * @author laserwolve
	 * @see {@link org.openqa.selenium.WebElement#click()}
	 */
	static void click(By by)
	{
		clickableElement(by).click();
	}
	
	/**<h1>Clickable Element</h1>
	 * Returns the element specified by the By, after it has become clickable.
	 * @param by The By of the element to click.
	 * @see {@link #clickableElement(By, int)}
	 * @return The clickable element.
	 * @author laserwolve
	 */
	static WebElement clickableElement(By by)
	{
		return clickableElement(by, 5);
	}
	
	/**<h1>Clickable Element</h1>
	 * Returns the element specified by the By, after it has become clickable.
	 * @param by The <code>By</code> of the element to click.
	 * @param seconds The length of time, in seconds, to wait for this element to become clickable.
	 * @return The clickable element.
	 * @author laserwolve
	 * @throws TimeoutException if the element doesn't become clickable in time
	 */
	static WebElement clickableElement(By by, int seconds)
	{
		try
		{
			return stop(seconds).until(ExpectedConditions.elementToBeClickable(by));
		}
		catch (TimeoutException e)
		{
			return null;
		}
	}
	
	/**<h1>Dismiss Welcome Popup</h1>
	 * Dismisses the welcome popup, and waits for it to disappear.
	 * @author laserwolve
	 */
	static void dismissWelcomePopup()
	{
		click(WelcomePopup.noThanksLink);
			
		waitUntilElementIsGone(welcomePopup);
	}
	
	/**<h1>Element is Present</h1>
	 * Determine whether or an element is present.
	 * @param by The locator of the element in question.
	 * @return Whether or not the element is present.
	 * @author laserwolve
	 */
	static boolean elementIsPresent(By by)
	{
		return driver.findElements(by).size() != 0;
	}
	
	/**<h1>Export Project</h1>
	 * Exports the currently open project.
	 * TODO: Get the project name of the open project. Parameterize the export settings.
	 * @param projectName The name of the project that's being exported.
	 * @throws InterruptedException
	 */
	static void exportProject(String projectName)
	{
		click(menuButton);
		
		click(MenuDropdown.project);
		
		click(MenuDropdown.ProjectPopout.export);
		
		click(ExportProjectPopup.nwjs);
		
		click(ExportProjectPopup.next);
		
		click(ExportProjectPopup.Page2.deduplicateImages);
		
		click(ExportProjectPopup.Page2.losslessFormat);
		
		click(ExportProjectPopup.Page2.LosslessFormatOptions.webp);
		
		click(ExportProjectPopup.Page2.lossyFormat);
		
		click(ExportProjectPopup.Page2.LossyFormatOptions.webp);
		
		click(ExportProjectPopup.Page2.minifyMode);
		
		click(ExportProjectPopup.Page2.MinifyModes.advanced);
		
		click(ExportProjectPopup.Page2.next);
		
		waitUntilElementIsGone(Misc.progressDialog, 10); // "Loading NW.js versions..."
		
		click(ExportProjectPopup.NwjsOptions.linux32); // Uncheck
		
		click(ExportProjectPopup.NwjsOptions.linux64); // Uncheck
		
		click(ExportProjectPopup.NwjsOptions.mac64); // Uncheck
		
		click(ExportProjectPopup.NwjsOptions.win32); // Uncheck
		
		click(ExportProjectPopup.NwjsOptions.windowFrame); // Uncheck
		
		click(ExportProjectPopup.NwjsOptions.resizableWindow); // Uncheck
		
		click(ExportProjectPopup.NwjsOptions.enableDevTools); // Uncheck
		
		click(ExportProjectPopup.NwjsOptions.exportForSteam); // Check
		
		click(ExportProjectPopup.NwjsOptions.next);
		
		waitUntilElementIsGone(Misc.progressDialog, 6000);
		
		click(ExportProjectPopup.ExportReport.downloadLink);
		
		setExpiryTime(30);
		
		// TODO: Set to browser default download location, instead of the download folder.
		// Is the downloads folder always the default on a new browser session?
		while(Files.notExists(Paths.get(userHome + fs + "Downloads" + fs + projectName + ".zip"), LinkOption.NOFOLLOW_LINKS))
			if(checkExpiry()) exceededExpiryTime("Unable to locate exported project");
	}
	
	/**<h1>Is Signed Out</h1>
	 * Check whether or not the user signed out.
	 * @return whether or not the user is signed out.
	 * @author laserwolve
	 */
	static boolean isSignedOut()
	{	
		setExpiryTime(10);
		
		while(clickableElement(UserAccountButton.userAccountName).getText().equals("..."))
			if(checkExpiry()) exceededExpiryTime("Unable to complete sign-in");

		return clickableElement(UserAccountButton.userAccountName).getText().equals("Guest");
	}
	
	/**<h1>Check Expiry</h1>
	 * Check if the expiry time has been exceeded.
	 * @return whether or not the current time is past the expiry time.
	 * @author laserwolve
	 */
	static boolean checkExpiry()
	{
		return LocalTime.now().isAfter(expiryTime);
	}
	
	/**<h1>Set Expiry Time</h1>
	 * Set the time that, when exceeded, will indicate a process has exceeded its normal boundaries.
	 * @param seconds The number of seconds to set.
	 * @author laserwolve
	 */
	static void setExpiryTime(int seconds)
	{
		expiryTime = LocalTime.now().plusSeconds(seconds);
	}
	
	/**<h1>Exceeded Expiry Time</h1>
	 * Throws a {@link TimeoutException}, with a message.
	 * @param message The message to include with the exception.
	 * @author laserwolve
	 */
	static void exceededExpiryTime(String message)
	{
		throw new TimeoutException(message);
	}
	
	/** <h1>Log In</h1>
	 * Logs in to the Construct Editor.
	 * @author laserwolve
	 */
	static void logIn()
	{	
		if(isSignedOut())
		{
			click(UserAccountButton.userAccountButton);
			
			click(AccountDropdown.logIn);
			
			switchToIframe(Misc.iframe);
			
			sendText(LogInDialog.usernameField, username);
			
			sendText(LogInDialog.passwordField, password);
			
			click(LogInDialog.rememberCheckbox);
			
			click(LogInDialog.logInButton);
			
			waitUntilElementIsGone(LogInDialog.loginDialog);		
			
			switchToDefaultContent();
			
			waitUntilTextIs(UserAccountButton.userAccountName, username, 10);
		}
	}
	/** <h1>Open a Project Folder</h1> 
	 * Opens a Construct 3 project folder. The amount of time it takes a project to load is determined both by the project's size and speed of the computer.
	 * Uses keyboard commands to interact with the Chromium "Let site edit files?" popup.
	 * @param projectName A string which is contained by the name of the project to open.
	 * @author laserwolve
	 * @throws InterruptedException from {@link Thread#sleep(long)}
	 */
	static void openRecentProject(String projectName)
	{	
		click(menuButton);
		
		click(MenuDropdown.project);
		
		click(MenuDropdown.ProjectPopout.openRecent);
		
		click(MenuDropdown.ProjectPopout.OpenRecentPopout.recentProject(projectName));
		
		robot.delay(1000); // TODO: Replace this. I can't find a chrome flag to allow file editing.
		
		robot.keyPress(KeyEvent.VK_LEFT);
		robot.keyRelease(KeyEvent.VK_LEFT);		// Give "Edit files" focus	
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);		// Select "Edit files"
		
		waitUntilElementIsPresent(Misc.progressDialog);
		
		waitUntilElementIsGone(Misc.progressDialog, 600);
	}
	
	/**@See {@link #presentElement(By, int)}*/
	static WebElement presentElement(By by)
	{
		return presentElement(by, 5);
	}
	
	/**<h1>Present Element</h1>
	 * Gets the element specified, as long as it is present with the time limit specified. 
	 * @param by The locator of the element to find.
	 * @param Seconds the number of seconds to wait for the element to be present.
	 * @return The present element, or null if it can't be located.
	 * @author laserwolve
	 */
	static WebElement presentElement(By by, int seconds)
	{
		try
		{
			return stop(seconds).until(ExpectedConditions.presenceOfElementLocated(by));
		}
		catch (TimeoutException e)
		{
			return null;
		}
	}
	
	/**<h1>Quit</h1>
	 * Quits the script.
	 * @author laserwolve
	 * @see {@link org.openqa.selenium.WebDriver#quit()}
	 */
	static void quit()
	{
		driver.quit();
	}
	
	/**<h1>Scroll to Element</h1>
	 * Scrolls to the specified element, using JavaScript.
	 * @param by The locator of the element to scroll to.
	 * @author laserwolve
	 */
	static void scrollToElement(By by)
	{
		javascriptExecutor.executeScript("arguments[0].scrollIntoView();", presentElement(by));
	}
	
	/**<h1>Send Text</h1>
	 * Sends the specified text to specified element.
	 * @param by The locator of the element which will recieve the text.
	 * @param text The text to be inputted.
	 * @author laserwolve
	 */
	static void sendText(By by, String text)
	{
		clickableElement(by).sendKeys(text);
	}
	
	/**<h1>Stop</h1>
	 * Returns a wait of the specified duration in seconds.
	 * @param seconds The duration (in seconds) of this wait.
	 * @return A wait of the specified duration.
	 * @author laserwolve
	 * @see {@link org.openqa.selenium.support.ui.WebDriverWait#WebDriverWait(WebDriver, Duration)}
	 */
	static WebDriverWait stop(int seconds)
	{
		return new WebDriverWait(driver, Duration.ofSeconds(seconds));
	}
	
	/** <h1>Switch to Default Content</h1>
	 * Switches to the default content.
	 * @see {@link org.openqa.selenium.WebDriver.TargetLocator#defaultContent()}
	 * @author laserwolve
	 */
	static void switchToDefaultContent()
	{
		driver.switchTo().defaultContent();
	}
	
	/** <h1>Switch to IFrame</h1>
	 * Switches to the specified IFrame.
	 * @param by The IFrame to switch to.
	 * @author laserwolve
	 */
	static void switchToIframe(By by)
	{
		driver.switchTo().frame(clickableElement(by));
	}
	
	/** <h1>Type into File Explorer</h1>
	 * Type text into a Windows File Explorer window. Use {@link #sendText} to type elsewhere.
	 * Requires window focus, so you can't do other things on the computer executing this method.
	 * This method sets the clipboard's contents to <strong>path</strong>, then pastes it into the File Explorer window.
	 * @param path The file path to type/paste into the File Explorer window.
	 * @throws InterruptedException from {@link Thread#sleep}
	 * @author laserwolve 
	 */
	static void typeIntoFileExplorer(String path)
	{			
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(path), null);

		robot.delay(2000); // TODO: Find a way to determine if the file explorer has popped up

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);			// Paste
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);		// Open directory or file
	}
	
	/** <h1>Wait Until Element is Gone</h1>
	 * Waits until the specified element is no longer visible.
	 * @param By The element for which to wait upon.
	 * @see {@link #waitUntilElementIsGone(by, int)}
	 * @author laserwolve
	 */
	static void waitUntilElementIsGone(By by)
	{
		waitUntilElementIsGone(by, 10);
	}
	
	/** <h1>Wait Until Element is Gone</h1>
	 * Waits until the specified element is no longer visible.
	 * @param The element for which to wait upon.
	 * @param seconds How long to wait, in seconds, for the element to no longer be visible.
	 * @author laserwolve
	 */
	static void waitUntilElementIsGone(By by, int seconds)
	{
		stop(seconds).until(ExpectedConditions.invisibilityOfElementLocated(by));
	}
	
	/**@see #waitUntilElementIsPresent(By, int)*/
	static void waitUntilElementIsPresent(By by)
	{
		waitUntilElementIsPresent(by, 5);
	}
	
	/** <h1>Wait Until Element is Visible</h1>
	 * Waits until the specified element is visible.
	 * @param The element for which to wait upon.
	 * @param seconds How long to wait, in seconds, for the element to be visible.
	 * @author laserwolve
	 */
	static void waitUntilElementIsPresent(By by, int seconds)
	{
		stop(seconds).until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	/**<h1>Wait Until Text is</h1>
	 * Wait until the text of an element is the specified text.
	 * @param by The <code>By</code> of the element of which to check the text
	 * @param text The awaited text
	 * @param seconds How long to wait for the text
	 * @author laserwolve
	 */
	static void waitUntilTextIs(By by, String text, int seconds) {
		stop(seconds).until(ExpectedConditions.textToBe(by, text));
		
	}
	
	/**<h1>Confirm Clickable</h1>
	 * Confrim the clickability of an element.
	 * @param by The locator of the element to determine the clickability of.
	 * @author laserwolve
	 */
	void confirmClickable(By by)
	{
		confirmTrue(by.toString() + " in " + by.getClass().getName() + " is clickable", isElementClickable(by));
	}
	
	/**<h1>Validate Locators</h1>
	 * Loops through the locators in a class, validating that they are clickable.
	 * Uses a try/catch block instead of a throws declaration to make all its calling methods cleaner.
	 * @param targetClass The class containing the locators to be validated as clickable.
	 * @author laserwolve
	 */
	void confirmClickable(Class<?> targetClass)
	{	
		for (Field f : targetClass.getDeclaredFields()) 
		{
			By by = null;
			try
			{
				by = (By) f.get(targetClass);
			}
			catch (IllegalAccessException e)
			{
			}
			confirmTrue(f.getName() + " in " + targetClass.getName() + " is clickable", isElementClickable(by));
		}
	}
	
	/**<h1>Confirm True</h1>
	 * Basic wrapper for {@link org.junit.Assert#assertTrue(String, boolean)} 
	 * @param message The identifying message
	 * @param condition The condition to be checked
	 * @author laserwolve
	 * @see {@link org.junit.Assert#assertTrue(String, boolean)
	 */
	void confirmTrue(String message, boolean condition)
	{
		Assert.assertTrue(message, condition);
	}
	
	/**<h1>Context Click</h1>
	 * Performs a context click on the element specified in the By.
	 * @param by The By of the element on which to perform a context click.
	 * @author laserwolve
	 * @see {@link org.openqa.selenium.interactions.Actions#contextClick(WebElement)}
	 */
	void contextClick(By by)
	{
		actions.contextClick(clickableElement(by)).perform();
	}
	
	/**<h1>Context Click Upper Left Corner</h1>
	 * Performs a context click that's 1 pixel down and to the right of the specified element.
	 * @param by The element on which to perform the context click.
	 * @author laserwolve
	 */
	void contextClickUpperLeftCorner(By by)
	{
		WebElement webElement = clickableElement(by);
		
		Dimension dimension = webElement.getSize();
		
		actions.moveToElement(webElement, dimension.width / -2 + 1, dimension.height / -2 + 1).perform();
		
		actions.contextClick().perform();
	}
	
	/**<h1>Double Click</h1>
	 * Double clicks the element specified in the locator.
	 * @param by The locator of the element to double click.
	 * @author laserwolve
	 * @see {@link org.openqa.selenium.interactions.Actions#doubleClick(WebElement)}
	 */
	void doubleClick(By by)
	{
		actions.doubleClick(clickableElement(by)).perform();
	}
	
	/**<h1>Is Element Clickable</h1>
	 * Uses {@link #clickableElement(By)} to determine if an element is clickable or not.
	 * @param by The locator of the element to check.
	 * @return whether or not the element is clickable.
	 * @author laserwolve
	 * @see {@link #clickableElement(By)}
	 */
	boolean isElementClickable(By by)
	{
		return Objects.nonNull(clickableElement(by));
	}
	
	/** <h1>Open a Project Folder</h1> 
	 * Opens a Construct 3 project folder. Must be on the Start page.
	 * The amount of time a project takes to load is determined both by the project's size and speed of the computer.
	 * Uses keyboard commands to interact with the Chromium "Let site edit files?" popup.
	 * @param MaximumProjectLoadTimeInSeconds The maximum amount of time to wait (in seconds) for the project to load.
	 * @throws InterruptedException in {@link #typeIntoFileExplorer}
	 * @throws TimeoutException if the project doesn't load in time
	 * @author laserwolve
	 */
	void openProjectFolder(int MaximumProjectLoadTimeInSeconds, String projectPath) throws InterruptedException
	{	
		click(StartPage.openButton);
		
		click(StartPage.OpenButtonDropdown.projectFolder);
		
		typeIntoFileExplorer(projectPath);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);		// Select directory
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);		// Give "Edit files" focus
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);		// Select "Edit files"
		
		waitUntilElementIsPresent(Misc.progressDialog);
		
		waitUntilElementIsGone(Misc.progressDialog, MaximumProjectLoadTimeInSeconds);
	}
	
	/**<h1>Refresh</h1>
	 * Refreshes the webpage.
	 * @author laserwolve
	 * @see {@link org.openqa.selenium.WebDriver.Navigation#refresh()}
	 */
	void refresh()
	{
		driver.navigate().refresh();
	}
	
	/**<h1>Stop</h1>
	 * Returns a wait of a fixed duration.
	 * @see {@link #stop(int)}
	 * @return A wait of the specified duration.
	 * @author laserwolve
	 */
	WebDriverWait stop()
	{
		return stop(5);
	}
}
