package constructAutomation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import java.time.Duration;
import java.util.logging.Logger;

import org.junit.Assert;
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
class ConstructMethodLibrary extends ConstructElementMap
{	
	 WebDriver driver = WebDriverManager.edgedriver().create();
	 Actions actions = new Actions(driver);
	 Logger logger = Logger.getLogger(this.getClass().getName());
	
	/**<h1>Click</h1>
	 * Clicks the element specified in the By.
	 * @param by The By of the element to click.
	 * @author laserwolve
	 * @see {@link org.openqa.selenium.WebElement#click()}
	 */
	void click(By by)
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
	WebElement clickableElement(By by)
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
		try
		{
			Assert.assertNotNull(clickableElement(by));
			return true;
		}
		catch (AssertionError e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	void validateLocators(Class<?> targetClass) throws IllegalArgumentException, IllegalAccessException
	{
		Field[] fields = targetClass.getDeclaredFields();
		
		for (Field f : fields) 
		{
			By by = (By) f.get(targetClass);
			if(isElementClickable(by)) System.out.println(f.getName() + " in " + targetClass.getName() + " is clickable");
			else System.out.println(f.getName() + " in " + targetClass.getName() + " is not clickable");
		}
	}
	
	/**<h1>Clickable Element</h1>
	 * Returns the element specified by the By, after it has become clickable.
	 * @param by The <code>By</code> of the element to click.
	 * @param seconds The length of time, in seconds, to wait for this element to become clickable.
	 * @return The clickable element.
	 * @author laserwolve
	 */
	WebElement clickableElement(By by, int seconds)
	{
		return stop(seconds).until(ExpectedConditions.elementToBeClickable(by)); // TODO: What happens if the element doesn't become clickable in time?
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
	
	/** <h1>Import Images</h1>
	 * Imports images into the specified sprite from the specified archive. Must be inside a project with the Project Bar open.
	 * @param spriteName The name of the sprite to create, to which images will be added.
	 * @param archiveName The name of the {@value constructAutomation.Data#archiveFileExtension} archive containing images formatted for Construct.
	 * @throws AWTException in {@link #typeIntoFileExplorer}
	 * @author laserwolve
	 * @throws InterruptedException in {@link #typeIntoFileExplorer}
	 */
	void importImages(String spriteName, String archiveName) throws AWTException, InterruptedException
	{
		rightClick(Project.ProjectBar.ProjectFolder.objectTypes);
		
		click(Project.ProjectBar.ProjectFolder.ObjectTypesContext.addNewObjectType);
		
		sendText(Project.CreateNewObjectTypePopup.searchBar, objectTypes.sprite);
		
		sendText(Project.CreateNewObjectTypePopup.name, spriteName + Keys.ENTER);
		
		doubleClick(Project.ProjectBar.projectTreeItem(spriteName));
		
		rightClick(Project.AnimationsEditor.AnimationsPane.animationsPaneBackground);
		
		click(Project.AnimationsEditor.AnimationsPane.AnimationsPaneContext.importAnimations);
		
		click(Project.AnimationsEditor.AnimationsPane.AnimationsPaneContext.ImportAnimationsContext.fromFiles);
		
		typeIntoFileExplorer(sourcePath + archiveName + archiveFileExtension);
	}
	
	/** <h1>Log In</h1>
	 * Logs in to the Construct Editor.
	 * @author laserwolve
	 */
	void logIn()
	{		
		click(UserAccountButton.userAccountButton);
		
		click(AccountDropdown.logIn);
		
		switchToIframe(Misc.iframe);
		
		sendText(LogInDialog.usernameField, SensitiveData.username);
		
		sendText(LogInDialog.passwordField, SensitiveData.password);
		
		click(LogInDialog.logInButton);
		
		waitUntilElementIsGone(LogInDialog.loginDialog);		
		
		switchToDefaultContent();
		
		waitUntilTextIs(UserAccountButton.userAccountName, SensitiveData.username, 10);
	}
	
	/**<h1>Wait Until Text is</h1>
	 * Wait until the text of an element is the specified text.
	 * @param by The <code>By</code> of the element of which to check the text
	 * @param text The awaited text
	 * @param seconds How long to wait for the text
	 * @author laserwolve
	 */
	private  void waitUntilTextIs(By by, String text, int seconds) {
		stop(seconds).until(ExpectedConditions.textToBe(by, text));
		
	}

	/**<h1>Open a Project Folder</h1>
	 * Opens a Construct 3 project folder.
	 * @see {@link #openProjectFolder(int)}
	 * @throws AWTException in {@link #openProjectFolder}
	 * @author laserwolve
	 * @throws InterruptedException in {@link #typeIntoFileExplorer}
	 */
	void openProjectFolder() throws AWTException, InterruptedException
	{		
		openProjectFolder(120);
	}
	
	/** <h1>Open a Project Folder</h1> 
	 * Opens a Construct 3 project folder. Must be on the Start page. Throws an exception if the project takes longer to load than <Strong>MaximumProjectLoadTimeInSeconds</Strong>. Uses keyboard commands to interact with the
	 * Chromium "Let site edit files?" popup.
	 * @param MaximumProjectLoadTimeInSeconds The maximum amount of time to wait (in seconds) for the project to load.
	 * @throws AWTException in {@link #typeIntoFileExplorer}
	 * @throws InterruptedException in {@link #typeIntoFileExplorer}
	 * @author laserwolve
	 */
	void openProjectFolder(int MaximumProjectLoadTimeInSeconds) throws AWTException, InterruptedException // TODO: Update Javadoc with the exception that would be thrown if 'EstimatedProjectLoadTimeInSeconds' is exceeded
	{	
		Robot robot = new Robot();	// TODO: Can we reuse this robot in 'TypeIntoFileExplorer'?
		
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
		
		waitUntilElementIsGone(Misc.progressDialog, MaximumProjectLoadTimeInSeconds);
	}
	
	/**<h1>Quit</h1>
	 * Quits the script.
	 * @author laserwolve
	 * @see {@link org.openqa.selenium.WebDriver#quit()}
	 */
	void quit()
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
	void sendText(By by, String text)
	{
		clickableElement(by).sendKeys(text);
	}
	
	/**<h1>Start</h1>
	 *  Browse to the Construct Editor.
	 * @author laserwolve
	 */
	void start()
	{
		driver.get(editorURL);
	}
	
	/**<h1>Dismiss Welcome Popup</h1>
	 * Dismisses the welcome popup.
	 * @author laserwolve
	 */
	void dismissWelcomePopup()
	{
		click(WelcomePopup.noThanksLink);
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
	WebDriverWait stop(int seconds)
	{
		return new WebDriverWait(driver, Duration.ofSeconds(seconds));
	}
	
	/** <h1>Switch to Default Content</h1>
	 * Switches to the default content.
	 * @see {@link org.openqa.selenium.WebDriver.TargetLocator#defaultContent()}
	 * @author laserwolve
	 */
	void switchToDefaultContent()
	{
		driver.switchTo().defaultContent();
	}
	
	/** <h1>Switch to IFrame</h1>
	 * Switches to the specified IFrame.
	 * @param by The IFrame to which to switch.
	 * @author laserwolve
	 */
	void switchToIframe(By by)
	{
		driver.switchTo().frame(clickableElement(by));
	}

	/** <h1>Type into File Explorer</h1>
	 * Type text into a Windows File Explorer window. Use {@link #sendText} to type elsewhere. Requires window focus, so you can't do other things on the computer executing this method. This method sets the clipboard's contents
	 * to <strong>path</strong>, then pastes it into the File Explorer window.
	 * @param path The file path to type/paste into the File Explorer window.
	 * @throws AWTException from {@link java.awt.Robot#Robot}
	 * @throws InterruptedException from {@link Thread#sleep}
	 * @author laserwolve 
	 */
	private  void typeIntoFileExplorer(String path) throws AWTException, InterruptedException //TODO: Will this work headless?
	{		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(path), null);
		
		Robot robot = new Robot();
		
		Thread.sleep(2000); // TODO: Find a way to determine if the file explorer has popped up
		
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_L);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_L);		// Focus path bar
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
	void waitUntilElementIsGone(By by, int seconds)
	{
		stop(seconds).until(ExpectedConditions.invisibilityOfElementLocated(by));
	}
	
	/** <h1>Wait Until Element is Gone</h1>
	 * Waits until the specified element is no longer visible.
	 * @param The element for which to wait upon.
	 * @see {@link #waitUntilElementIsGone(by, int)}
	 * @author laserwolve
	 */
	void waitUntilElementIsGone(By by)
	{
		waitUntilElementIsGone(by, 10);
	}
}
