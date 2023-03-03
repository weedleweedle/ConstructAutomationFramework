package constructAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ConstructMethodLibrary
{
	WebDriver driver = new EdgeDriver();
	
	public WebElement clickableElement(By by)
	{
		return clickableElement(by, 5);
	}
	
	public WebElement clickableElement(By by, int seconds)
	{
		return stop(seconds).until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public WebDriverWait stop(int seconds)
	{
		return new WebDriverWait(driver, Duration.ofSeconds(seconds));
	}
	
	public void quit()
	{
		driver.quit();
	}
	
	public void click(By by)
	{
		clickableElement(by).click();
	}
	
	public void sendText(By by, String text)
	{
		clickableElement(by).sendKeys(text);
	}
	
	public void switchToIframe(By by)
	{
		driver.switchTo().frame(clickableElement(by));
	}
	
	public void logIn(String username, String password) throws InterruptedException
	{		
		click(ConstructElementMap.accountButton);
		
		click(ConstructElementMap.accountDropdown.logIn);
		
		switchToIframe(ConstructElementMap.iframe);
		
		sendText(ConstructElementMap.logInPopup.usernameField, username);
		
		sendText(ConstructElementMap.logInPopup.passwordField, password);
		
		click(ConstructElementMap.logInPopup.logInButton);
	}
	
	public void start()
	{
		System.setProperty("webdriver.edge.driver", "C:\\driver\\msedgedriver.exe");
		driver.get("https://editor.construct.net/");
		click(ConstructElementMap.welcomePopup.noThanksLink);
	}
}
