package constructAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import java.time.Duration;
import java.util.Objects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;

/**<h1>Construct Method Library</h1>
 * A helper class for common Construct actions.
 * @author laserwolve
 */
class ConstructMethodLibrary extends ConstructElementMap
{	
	static EdgeOptions edgeOptions;
	static WebDriver driver;
	static Actions actions;
	static Robot robot;
	
	/**<h1>Start</h1>
	 * Initialize variables and browse to the Construct Editor.
	 * @author laserwolve
	 * @throws AWTException from {@link java.awt.Robot#Robot}
	 */
	static void start() throws AWTException
	{
		edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("start-maximized");
		edgeOptions.addArguments("user-data-dir=C:\\Users\\Andre\\AppData\\Local\\Microsoft\\Edge\\User Data\\Default");

		driver = WebDriverManager.edgedriver().capabilities(edgeOptions).create();
		actions = new Actions(driver);
		
		robot = new Robot();
		
		driver.get(editorURL);
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
	
	/**<h1>Is Element Clickable</h1>
	 * Uses {@link #clickableElement(By)} to determine if an element is clickable or not.
	 * @param by The <code>By</code> of the element to check.
	 * @return whether or not the element is clickable.
	 * @author laserwolve
	 * @see {@link #clickableElement(By)}
	 */
	boolean isElementClickable(By by)
	{
		return Objects.nonNull(clickableElement(by));
	}
	
	/**<h1>Validate Locators</h1>
	 * Loops through the <code>By</code> locators in a class, validating that they are clickable. Uses a try/catch block instead of a throws declaration to make all its calling
	 * methods cleaner.
	 * @param targetClass The class containing <code>By</code> locators to be validated as clickable.
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
	
	void confirmClickable(By by)
	{
		confirmTrue(by.toString() + " in " + by.getClass().getName() + " is clickable", isElementClickable(by));
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
	
	/**<h1>Refresh</h1>
	 * Refreshes the webpage.
	 * @author laserwolve
	 * @see {@link org.openqa.selenium.WebDriver.Navigation#refresh()}
	 */
	void refresh()
	{
		driver.navigate().refresh();
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
	
	static boolean elementIsPresent(By by)
	{
		return driver.findElements(by).size() != 0;
	}
	
	/**<h1>Double Click</h1>
	 * Double clicks the element specified in the By.
	 * @param by The By of the element to double click.
	 * @author laserwolve
	 * @see {@link org.openqa.selenium.interactions.Actions#doubleClick(WebElement)}
	 */
	void doubleClick(By by)
	{
		actions.doubleClick(clickableElement(by)).perform();
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
			
			sendText(LogInDialog.usernameField, SensitiveData.username);
			
			sendText(LogInDialog.passwordField, SensitiveData.password);
			
			click(LogInDialog.rememberCheckbox);
			
			click(LogInDialog.logInButton);
			
			waitUntilElementIsGone(LogInDialog.loginDialog);		
			
			switchToDefaultContent();
			
			waitUntilTextIs(UserAccountButton.userAccountName, SensitiveData.username, 10);
		}
	}
	
	static boolean isSignedOut()
	{	
		while(clickableElement(UserAccountButton.userAccountName).getText().equals("..."));

		return clickableElement(UserAccountButton.userAccountName).getText().equals("Guest");
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

	/**<h1>Open a Project Folder</h1>
	 * Opens a Construct 3 project folder.
	 * @see {@link #openProjectFolder(int)}
	 * @author laserwolve
	 */
	void openMostRecentProject()
	{		
		openMostRecentProject(600);
	}
	
	/** <h1>Open a Project Folder</h1> 
	 * Opens a Construct 3 project folder. Must be on the Start page. Throws an exception if the project takes longer to load than <Strong>MaximumProjectLoadTimeInSeconds</Strong>.
	 * The amount of time it takes a project to load is determined both by the project's size and speed of the computer.
	 * Uses keyboard commands to interact with the Chromium "Let site edit files?" popup.
	 * @param MaximumProjectLoadTimeInSeconds The maximum amount of time to wait (in seconds) for the project to load.
	 * @throws TimeoutException if the project doesn't load in time
	 * @author laserwolve
	 */
	void openMostRecentProject(int MaximumProjectLoadTimeInSeconds)
	{	
		click(StartPage.recentProject(1));
		
		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);		// Give "Edit files" focus
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);		// Select "Edit files"
		
		waitUntilElementIsPresent(Misc.progressDialog);
		
		waitUntilElementIsGone(Misc.progressDialog, MaximumProjectLoadTimeInSeconds);
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
	
	/**<h1>Right Click</h1>
	 * Right clicks the element specified in the By.
	 * @param by The By of the element to right click.
	 * @author laserwolve
	 * @see {@link org.openqa.selenium.interactions.Actions#contextClick(WebElement)}
	 */
	void rightClick(By by)
	{
		actions.contextClick(clickableElement(by)).perform();
	}
	
	/**<h1>Send Text</h1>
	 * Sends the specified text to elemented located in the By.
	 * @param by The By of the element to send text to.
	 * @param text The text to be inputted.
	 * @author laserwolve
	 */
	static void sendText(By by, String text)
	{
		clickableElement(by).sendKeys(text);
	}
	
	/**<h1>Dismiss Welcome Popup</h1>
	 * Dismisses the welcome popup, and waits for it to disappear.
	 * @author laserwolve
	 */
	static void dismissWelcomePopup()
	{
		if(elementIsPresent(welcomePopup))
		{
			click(WelcomePopup.noThanksLink);
			
			waitUntilElementIsGone(welcomePopup);
		}
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
	 * @param by The IFrame to which to switch.
	 * @author laserwolve
	 */
	static void switchToIframe(By by)
	{
		driver.switchTo().frame(clickableElement(by));
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
	
	static void waitUntilElementIsPresent(By by)
	{
		waitUntilElementIsPresent(by, 5);
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
}
