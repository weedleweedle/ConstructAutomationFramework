package constructAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Actions
{
	WebDriver driver = new ChromeDriver();
	
	public void openEditor()
	{
		driver.get("https://editor.construct.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void quit()
	{
		driver.quit();
	}
	public void click(By by)
	{
		// wait 5 seconds for element to be clickable
		click(by, 5);
	}
	public void click(By by, int seconds)
	{
		// wait specified duration for element to be clickable
		new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.elementToBeClickable(by)).click();
	}
}
