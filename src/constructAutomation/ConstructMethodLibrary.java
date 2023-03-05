package constructAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ConstructMethodLibrary extends ConstructElementMap
{
	static WebDriver driver = new EdgeDriver();
	
	
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
	
	public static void openProject(int EstimatedProjectLoadTimeInSeconds) throws InterruptedException, AWTException
	{		
		click(startPage.openButton);
		
		click(startPage.openButtonDropdown.projectFolder);
		
		TypeIntoFileExplorer(projectPath);
		
		waitUntilElementIsGone(progressDialog, EstimatedProjectLoadTimeInSeconds);
	}
	
	public static void openProject() throws InterruptedException, AWTException
	{		
		openProject(120);
	}
	
	private static void TypeIntoFileExplorer(String path) throws AWTException
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
		robot.keyRelease(KeyEvent.VK_ENTER);		// Open directory
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);		// Select directory
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);		// Give "Edit files" focus
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);		// Select "Edit files"
	}

	public static void start()
	{
		System.setProperty(driverKey, driverValue);
		driver.get(editorURL);
		click(welcomePopup.noThanksLink);
	}
}
