package constructAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.compress.utils.FileNameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * <h1>Construct Method Library</h1> A helper class for common Construct
 * actions.
 * 
 * @author laserwolve
 */
class ConstructMethods extends ConstructXpaths {
    static EdgeOptions edgeOptions;
    static WebDriver driver;
    static JavascriptExecutor javascriptExecutor;
    static Actions actions;
    static Robot robot;
    static LocalTime expiryTime;
    static String userHome;
    static String fs;
    static String editorURL;

    /**
     * <h1>Start</h1> Initialize variables and browses to the Construct Editor.
     * Launches 'inprivate' to prevent signing into the browser.
     * 
     * @author laserwolve
     * @throws AWTException from {@link java.awt.Robot#Robot}
     */
    static void start() {
	edgeOptions = new EdgeOptions();
	edgeOptions.addArguments("start-maximized");
	edgeOptions.addArguments("inprivate");

	driver = WebDriverManager.edgedriver().capabilities(edgeOptions).create();
	javascriptExecutor = (JavascriptExecutor) driver;
	actions = new Actions(driver);
	try {
	    robot = new Robot();
	} catch (AWTException ignored) {
	}
	userHome = System.getProperty("user.home");
	fs = File.separator;
	editorURL = "https://editor.construct.net/r339";

	driver.get(editorURL);

	dismissWelcomePopup();

	logIn();
    }

    /**
     * <h1>Add Child Element</h1> Creates a new element with the specified
     * attributes under the specified element. Locates and returns the newly created
     * element with an XPath derived from its tag name and attribute values.
     * 
     * @param by         The locator for the element under which to create the new
     *                   element.
     * @param tagName    The tag name of the new element.
     * @param attributes Pairs of attributes and values for the new element.
     * @return The new element.
     * @author laserwolve
     */
    WebElement addChildElement(String xpath, String tagName, Map<String, String> attributes) {
	String setAttributes = "";
	String locatorXpath = "";
	WebElement webElement = presentElement(xpath);

	for (Map.Entry<String, String> entry : attributes.entrySet()) {
	    setAttributes += tagName + ".setAttribute('" + entry.getKey() + "', '" + entry.getValue() + "');";

	    locatorXpath += "[@" + entry.getKey() + "='" + entry.getValue() + "']";
	}

	javascriptExecutor.executeScript("let " + tagName + " = document.createElement('" + tagName + "');"
		+ setAttributes + "arguments[0].appendChild(document.createElement('" + tagName + "'));", webElement);

	return webElement.findElement(By.xpath("(./" + tagName + locatorXpath + ")[last()]"));
    }

    /**
     * <h1>Click</h1> Clicks the element specified in the By.
     * 
     * @param by The By of the element to click.
     * @author laserwolve
     * @see {@link org.openqa.selenium.WebElement#click()}
     */
    static void click(String xpath) {
	clickableElement(xpath).click();
    }

    /**
     * <h1>Locate</h1> Turns an XPath string into a <code>By</code> locator.
     * 
     * @param xpath The XPath, as a string.
     * @return A <code>By</code> locator based upon the referenced XPath.
     */
    static By locate(String xpath) {
	return By.xpath(xpath);
    }

    /**
     * <h1>Clickable Element</h1> Returns the element specified by the By, after it
     * has become clickable.
     * 
     * @param by The By of the element to click.
     * @see {@link #clickableElement(By, int)}
     * @return The clickable element.
     * @author laserwolve
     */
    static WebElement clickableElement(String xpath) {
	return clickableElement(xpath, 5);
    }

    /**
     * <h1>Clickable Element</h1> Returns the element specified by the By, after it
     * has become clickable.
     * 
     * @param by      The locator of the element to click.
     * @param seconds The length of time, in seconds, to wait for this element to
     *                become clickable.
     * @return The clickable element.
     * @author laserwolve
     */
    static WebElement clickableElement(String xpath, int seconds) {
	return stop(seconds).until(ExpectedConditions.elementToBeClickable(locate(xpath)));
    }

    /**
     * <h1>Dismiss Welcome Popup</h1> Dismisses the welcome popup, and waits for it
     * to disappear.
     * 
     * @author laserwolve
     */
    static void dismissWelcomePopup() {
	click(WelcomePopup.noThanksNotNow);

	waitUntilElementIsGone(welcomePopup);
    }

    /**
     * <h1>Element is Present</h1> Determine whether or an element is present.
     * 
     * @param by The locator of the element in question.
     * @return Whether or not the element is present.
     * @author laserwolve
     */
    boolean elementIsPresent(By by) {
	return driver.findElements(by).size() != 0;
    }

    /**
     * <h1>Export Project</h1> Exports the currently open project. TODO: Get the
     * project name of the open project. Parameterize the export settings.
     * 
     * @param projectName The name of the project that's being exported.
     * @throws InterruptedException
     */
    static void exportProject(String projectName) {
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

	// TODO: Set to browser default download location, instead of the download
	// folder.
	// Is the downloads folder always the default on a new browser session?
	while (Files.notExists(Paths.get(userHome + fs + "Downloads" + fs + projectName + ".zip"),
		LinkOption.NOFOLLOW_LINKS))
	    if (checkExpiry())
		exceededExpiryTime("Unable to locate exported project");
    }

    /**
     * <h1>Is Signed Out</h1> Check whether or not the user signed out.
     * 
     * @return whether or not the user is signed out.
     * @author laserwolve
     */
    static boolean isSignedOut() {
	setExpiryTime(10);

	while (clickableElement(UserAccountButton.userAccountName).getText().equals("..."))
	    if (checkExpiry())
		exceededExpiryTime("Unable to complete sign-in");

	return clickableElement(UserAccountButton.userAccountName).getText().equals("Guest");
    }

    /**
     * <h1>Check Expiry</h1> Check if the expiry time has been exceeded.
     * 
     * @return whether or not the current time is past the expiry time.
     * @author laserwolve
     */
    static boolean checkExpiry() {
	return LocalTime.now().isAfter(expiryTime);
    }

    /**
     * <h1>Set Expiry Time</h1> Set the time that, when exceeded, will indicate a
     * process has exceeded its normal boundaries.
     * 
     * @param seconds The number of seconds to set.
     * @author laserwolve
     */
    static void setExpiryTime(int seconds) {
	expiryTime = LocalTime.now().plusSeconds(seconds);
    }

    /**
     * <h1>Exceeded Expiry Time</h1> Throws a {@link TimeoutException}, with a
     * message.
     * 
     * @param message The message to include with the exception.
     * @author laserwolve
     */
    static void exceededExpiryTime(String message) {
	throw new TimeoutException(message);
    }

    /**
     * <h1>Log In</h1> Logs in to the Construct Editor.
     * 
     * @author laserwolve
     */
    static void logIn() {
	if (isSignedOut()) {
	    click(UserAccountButton.userAccountButton);

	    click(AccountDropdown.logIn);

	    switchToIframe(Misc.iframe);

	    sendText(LogInDialog.username, SensitiveData.username);

	    sendText(LogInDialog.password, SensitiveData.password);

	    click(LogInDialog.logInButton);

	    waitUntilElementIsGone(LogInDialog.loginDialog);

	    switchToDefaultContent();

	    waitUntilTextIs(UserAccountButton.userAccountName, SensitiveData.username, 10);
	}
    }

    /**
     * <h1>Open a Project Folder</h1> Opens a Construct 3 project folder. The amount
     * of time it takes a project to load is determined both by the project's size
     * and speed of the computer. Uses keyboard commands to interact with the
     * Chromium "Let site edit files?" popup.
     * 
     * @param projectName A string which is contained by the name of the project to
     *                    open.
     * @author laserwolve
     * @throws InterruptedException from {@link Thread#sleep(long)}
     */
    static void openRecentProject(String projectName) {
	click(menuButton);

	click(MenuDropdown.project);

	click(MenuDropdown.ProjectPopout.openRecent);

	click(MenuDropdown.ProjectPopout.OpenRecentPopout.recentProject(projectName));

	robot.delay(1000); // TODO: Replace this. I can't find a chrome flag to allow file editing.

	robot.keyPress(KeyEvent.VK_LEFT);
	robot.keyRelease(KeyEvent.VK_LEFT); // Give "Edit files" focus
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER); // Select "Edit files"

	waitUntilElementIsPresent(Misc.progressDialog);

	waitUntilElementIsGone(Misc.progressDialog, 600);
    }

    /** @See {@link #presentElement(By, int)} */
    static WebElement presentElement(String xpath) {
	return presentElement(xpath, 5);
    }

    /**
     * <h1>Present Element</h1> Gets the element specified, as long as it is present
     * with the time limit specified.
     * 
     * @param by      The locator of the element to find.
     * @param Seconds The number of seconds to wait for the element to be present.
     * @return The present element, or null if it can't be located.
     * @author laserwolve
     */
    static WebElement presentElement(String xpath, int seconds) {
	return stop(seconds).until(ExpectedConditions.presenceOfElementLocated(locate(xpath)));

    }

    /**
     * <h1>Quit</h1> Quits the script.
     * 
     * @author laserwolve
     * @see {@link org.openqa.selenium.WebDriver#quit()}
     */
    static void quit() {
	driver.quit();
    }

    /**
     * <h1>Scroll to Element</h1> Scrolls to the specified element, using
     * JavaScript.
     * 
     * @param by The locator of the element to scroll to.
     * @author laserwolve
     */
    static void scrollToElement(String xpath) {
	javascriptExecutor.executeScript("arguments[0].scrollIntoView();", presentElement(xpath));
    }

    /**
     * <h1>Send Text</h1> Sends the specified text to specified element.
     * 
     * @param by   The locator of the element which will recieve the text.
     * @param text The text to be inputted.
     * @author laserwolve
     */
    static void sendText(String xpath, String text) {
	clickableElement(xpath).sendKeys(text);
    }

    /**
     * <h1>Stop</h1> Returns a wait of the specified duration in seconds.
     * 
     * @param seconds The duration (in seconds) of this wait.
     * @return A wait of the specified duration.
     * @author laserwolve
     * @see {@link org.openqa.selenium.support.ui.WebDriverWait#WebDriverWait(WebDriver, Duration)}
     */
    static WebDriverWait stop(int seconds) {
	return new WebDriverWait(driver, Duration.ofSeconds(seconds));
    }

    /**
     * <h1>Switch to Default Content</h1> Switches to the default content.
     * 
     * @see {@link org.openqa.selenium.WebDriver.TargetLocator#defaultContent()}
     * @author laserwolve
     */
    static void switchToDefaultContent() {
	driver.switchTo().defaultContent();
    }

    /**
     * <h1>Switch to IFrame</h1> Switches to the specified IFrame.
     * 
     * @param by The IFrame to switch to.
     * @author laserwolve
     */
    static void switchToIframe(String xpath) {
	driver.switchTo().frame(clickableElement(xpath));
    }

    /**
     * <h1>Type into File Explorer</h1> Type text into a Windows File Explorer
     * window. Use {@link #sendText} to type elsewhere. Requires window focus, so
     * you can't do other things on the computer executing this method. This method
     * sets the clipboard's contents to <strong>path</strong>, then pastes it into
     * the File Explorer window.
     * 
     * @param path The file path to type/paste into the File Explorer window.
     * @throws InterruptedException from {@link Thread#sleep}
     * @author laserwolve
     */
    static void typeIntoFileExplorer(String path) {
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(path), null);

	robot.delay(2000); // TODO: Find a way to determine if the file explorer has popped up

	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V); // Paste
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER); // Open directory or file
    }

    /**
     * <h1>Wait Until Element is Gone</h1> Waits until the specified element is no
     * longer visible.
     * 
     * @param By The element for which to wait upon.
     * @see {@link #waitUntilElementIsGone(by, int)}
     * @author laserwolve
     */
    static void waitUntilElementIsGone(String xpath) {
	waitUntilElementIsGone(xpath, 10);
    }

    /**
     * <h1>Wait Until Element is Gone</h1> Waits until the specified element is no
     * longer visible.
     * 
     * @param The     element for which to wait upon.
     * @param seconds How long to wait, in seconds, for the element to no longer be
     *                visible.
     * @author laserwolve
     */
    static void waitUntilElementIsGone(String xpath, int seconds) {
	stop(seconds).until(ExpectedConditions.invisibilityOfElementLocated(locate(xpath)));
    }

    /** @see #waitUntilElementIsPresent(By, int) */
    static void waitUntilElementIsPresent(String xpath) {
	waitUntilElementIsPresent(xpath, 5);
    }

    /**
     * <h1>Wait Until Element is Visible</h1> Waits until the specified element is
     * visible.
     * 
     * @param The     element for which to wait upon.
     * @param seconds How long to wait, in seconds, for the element to be visible.
     * @author laserwolve
     */
    static void waitUntilElementIsPresent(String xpath, int seconds) {
	stop(seconds).until(ExpectedConditions.visibilityOfElementLocated(locate(xpath)));
    }

    /**
     * <h1>Wait Until Text is</h1> Wait until the text of an element is the
     * specified text.
     * 
     * @param by      The <code>By</code> of the element of which to check the text
     * @param text    The awaited text
     * @param seconds How long to wait for the text
     * @author laserwolve
     */
    static void waitUntilTextIs(String xpath, String text, int seconds) {
	stop(seconds).until(ExpectedConditions.textToBe(locate(xpath), text));

    }

    /**
     * <h1>Context Click</h1> Performs a context click on the element specified in
     * the By.
     * 
     * @param by The By of the element on which to perform a context click.
     * @author laserwolve
     * @see {@link org.openqa.selenium.interactions.Actions#contextClick(WebElement)}
     */
    static void contextClick(String xpath) {
	actions.contextClick(clickableElement(xpath)).perform();
    }

    /**
     * <h1>Context Click Upper Left Corner</h1> Performs a context click that's 1
     * pixel down and to the right of the specified element.
     * 
     * @param by The element on which to perform the context click.
     * @author laserwolve
     */
    static void contextClickUpperLeftCorner(String xpath) {
	WebElement webElement = clickableElement(xpath);

	Dimension dimension = webElement.getSize();

	actions.moveToElement(webElement, dimension.width / -2 + 1, dimension.height / -2 + 1).contextClick().perform();
    }

    /**
     * <h1>Double Click</h1> Double clicks the element specified in the locator.
     * 
     * @param by The locator of the element to double click.
     * @author laserwolve
     * @see {@link org.openqa.selenium.interactions.Actions#doubleClick(WebElement)}
     */
    static void doubleClick(String xpath) {
	actions.doubleClick(clickableElement(xpath)).perform();
    }

    /**
     * <h1>Is Element Clickable</h1> Uses {@link #clickableElement(By)} to determine
     * if an element is clickable or not.
     * 
     * @param by The locator of the element to check.
     * @return whether or not the element is clickable.
     * @author laserwolve
     * @see {@link #clickableElement(By)}
     */
    static boolean isElementClickable(String xpath) {
	return Objects.nonNull(clickableElement(xpath));
    }

    /**
     * <h1>Open a Project Folder</h1> Opens a Construct 3 project folder. Must be on
     * the Start page. The amount of time a project takes to load is determined both
     * by the project's size and speed of the computer. Uses keyboard commands to
     * interact with the Chromium "Let site edit files?" popup.
     * 
     * @param MaximumProjectLoadTimeInSeconds The maximum amount of time to wait (in
     *                                        seconds) for the project to load.
     * @throws InterruptedException in {@link #typeIntoFileExplorer}
     * @throws TimeoutException     if the project doesn't load in time
     * @author laserwolve
     */
    static void openProjectFolder(int MaximumProjectLoadTimeInSeconds, String projectPath) {
	click(StartPage.openButton);

	click(StartPage.OpenButtonDropdown.projectFolder);

	typeIntoFileExplorer(projectPath);

	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER); // Select directory
	robot.delay(1000);
	robot.keyPress(KeyEvent.VK_RIGHT);
	robot.keyRelease(KeyEvent.VK_RIGHT); // Give "Edit files" focus
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER); // Select "Edit files"

	waitUntilElementIsPresent(Misc.progressDialog);

	waitUntilElementIsGone(Misc.progressDialog, MaximumProjectLoadTimeInSeconds);
    }

    /**
     * <h1>Refresh</h1> Refreshes the webpage.
     * 
     * @author laserwolve
     * @see {@link org.openqa.selenium.WebDriver.Navigation#refresh()}
     */
    static void refresh() {
	driver.navigate().refresh();
    }

    /**
     * <h1>Stop</h1> Returns a wait of a fixed duration.
     * 
     * @see {@link #stop(int)}
     * @return A wait of the specified duration.
     * @author laserwolve
     */
    static WebDriverWait stop() {
	return stop(5);
    }

    /**
     * <h1>Wait for Element to Be Selected</h1> Waits a specified amount of seconds
     * for the <code>selected</code> attribute to appear in the element.
     * 
     * @param by      The locator of the element to wait upon.
     * @param seconds How many seconds to wait.
     * @author laserwolve
     */
    static void waitForElementToBeSelected(String xpath, int seconds) {
	stop(seconds).until(ExpectedConditions.presenceOfElementLocated(locate(xpath + "/self::*[@selected]")));
    }

    static void importImages(String path, String projectFolder) {
	String sprite = FileNameUtils.getBaseName(path);

	openProjectFolder(6000, projectFolder);

	sendText(Project.ProjectBar.searchBar, sprite);

	contextClick(Project.ProjectBar.searchResult(sprite));

	click(Project.ProjectBar.ContextMenu.editAnimations);

	// Add an animation, because we can't delete all animations.
	addAnimation();

	// Select the first animation.
	// This deselects the animation that was created previously.
	click(Project.AnimationsEditor.AnimationsPane.firstAnimation);

	waitForElementToBeSelected(Project.AnimationsEditor.AnimationsPane.firstAnimation, 5);

	scrollToElement(Project.AnimationsEditor.AnimationsPane.penultimateAnimation);

	actions.keyDown(Keys.SHIFT).perform();

	// Select the second to last animation while holding the shift key down.
	// This will select all animations between the first and the penultimate
	// animation.
	click(Project.AnimationsEditor.AnimationsPane.penultimateAnimation);

	actions.keyUp(Keys.SHIFT).perform();

	waitForElementToBeSelected(Project.AnimationsEditor.AnimationsPane.penultimateAnimation, 5);

	contextClick(Project.AnimationsEditor.AnimationsPane.penultimateAnimation);

	click(Project.AnimationsEditor.AnimationsPane.AnimationContextMenu.delete);

	contextClick(Project.AnimationsEditor.AnimationsPane.title);

	click(Project.AnimationsEditor.AnimationsPane.PaneContextMenu.importAnimation);

	click(Project.AnimationsEditor.AnimationsPane.PaneContextMenu.importAnimationPopout.fromFiles);

	typeIntoFileExplorer(path.toString());
    }

    /**
     * <h1>Add Animation</h1> Adds a new animation, called "Animation X", where X is
     * the next available number. (i.e. If "Animation 1" and "Animation 2" already
     * exist, this method will create "Animation 3".) Must be in the Animations
     * Editor. Waits until the animatiom is created to continue. This deselects all
     * currently selected animations and selects the newly created animation.
     * 
     * @author laserwolve
     * 
     */
    static void addAnimation() {

	int numberOfAnimationsBefore = numberOfAnimations();

	contextClick(Project.AnimationsEditor.AnimationsPane.title);

	click(Project.AnimationsEditor.AnimationsPane.PaneContextMenu.addAnimation);

	setExpiryTime(5);

	while (numberOfAnimationsBefore == numberOfAnimations())
	    if (checkExpiry())
		exceededExpiryTime("Animation was never created");
    }

    /**
     * <h1>Number of Animations</h1> Gets how many animations this sprite has. Must
     * be in the Animations Editor.
     * 
     * @return The number of animations of the sprite.
     * @author laserwolve
     */
    static int numberOfAnimations() {
	return driver.findElements(locate(Project.AnimationsEditor.AnimationsPane.animations)).size();
    }
}
