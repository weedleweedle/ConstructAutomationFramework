package constructAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;

/**<h1>Construct Method Library</h1>
 * A helper class for common Construct actions.
 * @author laserwolve
 */
public class ConstructMethodLibrary extends ConstructElementMap
{	
	static WebDriver driver = WebDriverManager.edgedriver().create();
	static Actions actions = new Actions(driver);
	
	/**<h1>Click</h1>
	 * Clicks the element specified in the By.
	 * @param by The By of the element to click.
	 * @author laserwolve
	 * @see {@link org.openqa.selenium.WebElement#click()}
	 */
	public static void click(By by)
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
	public static WebElement clickableElement(By by)
	{
		return clickableElement(by, 5);
	}
	
	/**<h1>Clickable Element</h1>
	 * Returns the element specified by the By, after it has become clickable.
	 * @param by The By of the element to click.
	 * @param seconds The length of time, in seconds, to wait for this element to become clickable.
	 * @return The clickable element.
	 * @author laserwolve
	 */
	public static WebElement clickableElement(By by, int seconds)
	{
		return stop(seconds).until(ExpectedConditions.elementToBeClickable(by)); // TODO: What happens if the element doesn't become clickable in time?
	}
	
	/**<h1>Double Click</h1>
	 * Double clicks the element specified in the By.
	 * @param by The By of the element to double click.
	 * @author laserwolve
	 * @see {@link org.openqa.selenium.interactions.Actions#doubleClick(WebElement)}
	 */
	public static void doubleClick(By by)
	{
		actions.doubleClick(clickableElement(by)).perform();
	}
	
	/** <h1>Import Images</h1>
	 * Imports images into the specified sprite from the specified archive. Must be inside a project with the Project Bar open.
	 * @param spriteName The name of the sprite to create, to which images will be added.
	 * @param archiveName The name of the {@value constructAutomation.Data#archiveFileExtension} archive containing images formatted for Construct.
	 * @throws AWTException in {@link #typeIntoFileExplorer}
	 * @author laserwolve
	 */
	public static void importImages(String spriteName, String archiveName) throws AWTException
	{
		rightClick(project.projectBar.projectFolder.objectTypes);
		
		click(project.projectBar.projectFolder.objectTypesContext.addNewObjectType);
		
		sendText(project.createNewObjectTypePopup.searchBar, objectTypes.sprite);
		
		sendText(project.createNewObjectTypePopup.name, spriteName + Keys.ENTER);
		
		doubleClick(project.projectBar.projectTreeItem(spriteName));
		
		rightClick(project.animationsEditor.animationsPane.animationsPaneBackground);
		
		click(project.animationsEditor.animationsPane.animationsPaneContext.importAnimations);
		
		click(project.animationsEditor.animationsPane.animationsPaneContext.importAnimationsContext.fromFiles);
		
		typeIntoFileExplorer(sourcePath + archiveName + archiveFileExtension);
	}
	
	/** <h1>Log In</h1>
	 * Logs in to the Construct Editor.
	 * @author laserwolve
	 */
	public static void logIn()
	{		
		click(userAccountButton.userAccountButton);
		
		click(accountDropdown.logIn);
		
		switchToIframe(iframe);
		
		sendText(logInDialog.usernameField, SensitiveData.username);
		
		sendText(logInDialog.passwordField, SensitiveData.password);
		
		click(logInDialog.logInButton);
		
		waitUntilElementIsGone(logInDialog.loginDialog);		
		
		switchToDefaultContent();
		
		waitUntilTextIs(userAccountButton.userAccountName, SensitiveData.username, 10);
	}
	
	/**<h1>Wait Until Text is</h1>
	 * Wait until the text of an element is the specified text.
	 * @param by The <code>By</code> of the element of which to check the text
	 * @param text The awaited text
	 * @param seconds How long to wait for the text
	 * @author laserwolve
	 */
	private static void waitUntilTextIs(By by, String text, int seconds) {
		stop(seconds).until(ExpectedConditions.textToBe(by, text));
		
	}

	/**<h1>Open a Project Folder</h1>
	 * Opens a Construct 3 project folder.
	 * @see {@link #openProjectFolder(int)}
	 * @throws AWTException in {@link #openProjectFolder}
	 * @author laserwolve
	 */
	public static void openProjectFolder() throws AWTException
	{		
		openProjectFolder(120);
	}
	
	/** <h1>Open a Project Folder</h1> 
	 * Opens a Construct 3 project folder. Must be on the Start page. Throws an exception if the project takes longer to load than <Strong>MaximumProjectLoadTimeInSeconds</Strong>. Uses keyboard commands to interact with the
	 * Chromium "Let site edit files?" popup.
	 * @param MaximumProjectLoadTimeInSeconds The maximum amount of time to wait (in seconds) for the project to load.
	 * @throws AWTException in {@link #typeIntoFileExplorer}
	 * @author laserwolve
	 */
	public static void openProjectFolder(int MaximumProjectLoadTimeInSeconds) throws AWTException // TODO: Update Javadoc with the exception that would be thrown if 'EstimatedProjectLoadTimeInSeconds' is exceeded
	{	
		Robot robot = new Robot();	// TODO: Can we reuse this robot in 'TypeIntoFileExplorer'?
		
		click(startPage.openButton);
		
		click(startPage.openButtonDropdown.projectFolder);
		
		typeIntoFileExplorer(projectPath);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);		// Select directory
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);		// Give "Edit files" focus
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);		// Select "Edit files"
		
		waitUntilElementIsGone(progressDialog, MaximumProjectLoadTimeInSeconds);
	}
	
	/**<h1>Quit</h1>
	 * Quits the script.
	 * @author laserwolve
	 * @see {@link org.openqa.selenium.WebDriver#quit()}
	 */
	public static void quit()
	{
		driver.quit();
	}
	
	/**<h1>Right Click</h1>
	 * Right clicks the element specified in the By.
	 * @param by The By of the element to right click.
	 * @author laserwolve
	 * @see {@link org.openqa.selenium.interactions.Actions#contextClick(WebElement)}
	 */
	public static void rightClick(By by)
	{
		actions.contextClick(clickableElement(by)).perform();
	}
	
	/**<h1>Send Text</h1>
	 * Sends the specified text to elemented located in the By.
	 * @param by The By of the element to send text to.
	 * @param text The text to be inputted.
	 * @author laserwolve
	 */
	public static void sendText(By by, String text)
	{
		clickableElement(by).sendKeys(text);
	}
	
	/**<h1>Start</h1>
	 *  Browse to the Construct Editor and dismiss the welcome popup.
	 * @author laserwolve
	 */
	public static void start()
	{
		driver.get(editorURL);
		click(welcomePopup.noThanksLink);
	}
	
	/**<h1>Stop</h1>
	 * Returns a wait of a fixed duration.
	 * @see {@link #stop(int)}
	 * @return A wait of the specified duration.
	 * @author laserwolve
	 */
	public static WebDriverWait stop()
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
	public static WebDriverWait stop(int seconds)
	{
		return new WebDriverWait(driver, Duration.ofSeconds(seconds));
	}
	
	/** <h1>Switch to Default Content</h1>
	 * Switches to the default content.
	 * @see {@link org.openqa.selenium.WebDriver.TargetLocator#defaultContent()}
	 * @author laserwolve
	 */
	public static void switchToDefaultContent()
	{
		driver.switchTo().defaultContent();
	}
	
	/** <h1>Switch to IFrame</h1>
	 * Switches to the specified IFrame.
	 * @param by The IFrame to which to switch.
	 * @author laserwolve
	 */
	public static void switchToIframe(By by)
	{
		driver.switchTo().frame(clickableElement(by));
	}

	/** <h1>Type into File Explorer</h1>
	 * Type text into a Windows File Explorer window. Use {@link #sendText} to type elsewhere. Requires window focus, so you can't do other things on the computer executing this method. This method sets the clipboard's contents
	 * to <strong>path</strong>, then pastes it into the File Explorer window.
	 * @param path The file path to type/paste into the File Explorer window.
	 * @throws AWTException from {@link java.awt.Robot#Robot}
	 * @author laserwolve
	 */
	private static void typeIntoFileExplorer(String path) throws AWTException //TODO: Will this work headless?
	{		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(path), null);
		
		Robot robot = new Robot();
		
		// This section won't work if the file explorer doesn't have focus
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);			// Paste
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);		// Open directory or file
	}
	
	/** <h1>Wait Until Element is Gone</h1>
	 * Waits until the specified element is no longer visible.
	 * @param The element for which to wait upon.
	 * @param seconds How long to wait, in seconds, for the element to no longer be visible.
	 * @author laserwolve
	 */
	public static void waitUntilElementIsGone(By by, int seconds)
	{
		stop(seconds).until(ExpectedConditions.invisibilityOfElementLocated(by));
	}
	
	/** <h1>Wait Until Element is Gone</h1>
	 * Waits until the specified element is no longer visible.
	 * @param The element for which to wait upon.
	 * @see {@link #waitUntilElementIsGone(by, int)}
	 * @author laserwolve
	 */
	public static void waitUntilElementIsGone(By by)
	{
		waitUntilElementIsGone(by, 10);
	}
}
