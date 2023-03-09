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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ConstructMethodLibrary extends ConstructElementMap
{
	static WebDriver driver = new EdgeDriver();
	static Actions actions = new Actions(driver);
	
	public static WebElement clickableElement(By by)
	{
		return clickableElement(by, 5);
	}
	
	public static WebElement clickableElement(By by, int seconds)
	{
		return stop(seconds).until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public static WebDriverWait stop(int seconds)
	{
		return new WebDriverWait(driver, Duration.ofSeconds(seconds));
	}
	
	public static WebDriverWait stop()
	{
		return stop(5);
	}
	
	public static void quit()
	{
		driver.quit();
	}
	
	public static void click(By by)
	{
		clickableElement(by).click();
	}
	
	public static void rightClick(By by)
	{
		actions.contextClick(clickableElement(by)).perform();
	}
	
	public static void doubleClick(By by)
	{
		actions.doubleClick(clickableElement(by)).perform();
	}
	
	public static void sendText(By by, String text)
	{
		clickableElement(by).sendKeys(text);
	}
	
	public static void switchToIframe(By by)
	{
		driver.switchTo().frame(clickableElement(by));
	}
	
	public static void switchToDefaultContent()
	{
		driver.switchTo().defaultContent();
	}
	
	public static void logIn() throws InterruptedException
	{		
		click(accountButton);
		
		click(accountDropdown.logIn);
		
		switchToIframe(iframe);
		
		sendText(logInPopup.usernameField, SensitiveData.username);
		
		sendText(logInPopup.passwordField, SensitiveData.password);
		
		click(logInPopup.logInButton);
		
		switchToDefaultContent();
	}
	
	public static void waitUntilElementIsGone(By by, int seconds)
	{
		stop(seconds).until(ExpectedConditions.invisibilityOfElementLocated(by));
	}
	
	public static void openProjectFolder(int EstimatedProjectLoadTimeInSeconds) throws InterruptedException, AWTException
	{		
		Robot robot = new Robot();
		
		// Alternate path. Less clicks but only usable from the Start Page.
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
		
		waitUntilElementIsGone(progressDialog, EstimatedProjectLoadTimeInSeconds);
	}
	
	public static void openProjectFolder() throws InterruptedException, AWTException
	{		
		openProjectFolder(120);
	}
	
	private static void typeIntoFileExplorer(String path) throws AWTException
	{
		// If aren't typing into file explorer, use sendText() instead
		
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

	public static void start()
	{
		System.setProperty(driverKey, driverValue);
		driver.get(editorURL);
		click(welcomePopup.noThanksLink);
	}
	
	public static void importImages(String spriteName) throws AWTException
	{
		rightClick(project.projectPane.projectFolder.objectTypes);
		
		click(project.projectPane.projectFolder.objectTypesContext.addNewObjectType);
		
		sendText(project.createNewObjectTypePopup.searchBar, objectTypes.sprite);
		
		sendText(project.createNewObjectTypePopup.name, spriteName + Keys.ENTER);
		
		doubleClick(project.projectPane.projectTreeItem(spriteName));
		
		rightClick(project.animationsEditor.animationsPane.animationsPaneBackground);
		
		click(project.animationsEditor.animationsPane.animationsPaneContext.importAnimations);
		
		click(project.animationsEditor.animationsPane.animationsPaneContext.importAnimationsContext.fromFiles);
		
		typeIntoFileExplorer(sourcePath + spriteName + archiveFileExtension);
	}
}
