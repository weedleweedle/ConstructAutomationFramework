package constructAutomation;

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
	
	public static void logIn() throws InterruptedException
	{		
		click(accountButton);
		
		click(accountDropdown.logIn);
		
		switchToIframe(iframe);
		
		sendText(logInPopup.usernameField, SensitiveData.username);
		
		sendText(logInPopup.passwordField, SensitiveData.password);
		
		click(logInPopup.logInButton);
	}
	
	public static void start()
	{
		System.setProperty(driverKey, driverValue);
		driver.get(editorURL);
		click(welcomePopup.noThanksLink);
	}
}
