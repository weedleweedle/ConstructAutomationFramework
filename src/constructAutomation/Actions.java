package constructAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Actions
{
	WebDriver driver = new ChromeDriver();
	
	public WebElement clickableElement(By by)
	{
		return new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public void openEditor()
	{
		driver.get("https://editor.construct.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void quit() throws InterruptedException
	{
		Thread.sleep(5000);
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
		openEditor();
		click(ElementMap.welcomePopup.noThanksLink);
		Thread.sleep(5000);
		
		click(ElementMap.accountButton);
		Thread.sleep(5000);
		
		click(ElementMap.accountDropdown.logIn);
		
		switchToIframe(ElementMap.iframe);
		sendText(ElementMap.logInPopup.usernameField, username);
		sendText(ElementMap.logInPopup.passwordField, password);
		
		click(ElementMap.logInPopup.logInButton);
	}
}
