package constructAutomation;

import java.awt.AWTException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.io.Files;

class MethodTester extends ConstructMethodLibrary
{
	
	@BeforeEach
	void setUp() throws AWTException
	{
		start();
	}
	
	@AfterEach
	void tearDown()
	{
		quit();
	}
	
	@Test
	@DisplayName("Import Sprites")
	void methodTester() throws AWTException
	{
		String path = "C:" + fs + "assets" + fs + "output" + fs + "man_chestDefault_gear.zip";
		String sprite = Files.getNameWithoutExtension(path);
		
		openProjectFolder(6000, "C:" + fs + "DaggerQuest");
		
		sendText(Project.ProjectBar.searchBar, sprite);
		
		contextClick(Project.ProjectBar.searchResult(sprite));
		
		click(Project.ProjectBar.ContextMenu.editAnimations);
		
		contextClickUpperLeftCorner(Project.AnimationsEditor.AnimationsPane.animationsPaneBackground); // This will deselect the first animation.
		
		click(Project.AnimationsEditor.AnimationsPane.BackgroundContextMenu.addAnimation);
				
		click(Project.AnimationsEditor.AnimationsPane.firstAnimation); // Click the first animation.
		
		waitForElementToBeSelected(Project.AnimationsEditor.AnimationsPane.firstAnimation, 5);
				
		scrollToElement(Project.AnimationsEditor.AnimationsPane.secondToLastAnimation);
		
		actions.keyDown(Keys.SHIFT).perform();
		
		click(Project.AnimationsEditor.AnimationsPane.secondToLastAnimation); // Select the second to last animation while holding the shift key down. This will select all animations between the first and second to last animation.
		
		actions.keyUp(Keys.SHIFT).perform();
		
		waitForElementToBeSelected(Project.AnimationsEditor.AnimationsPane.secondToLastAnimation, 5);
		
		contextClick(Project.AnimationsEditor.AnimationsPane.secondToLastAnimation);
		
		click(Project.AnimationsEditor.AnimationsPane.AnimationsContextMenu.delete);
		
		contextClickUpperLeftCorner(Project.AnimationsEditor.AnimationsPane.animationsPaneBackground);
		
		click(Project.AnimationsEditor.AnimationsPane.BackgroundContextMenu.importAnimation);
		
		click(Project.AnimationsEditor.AnimationsPane.BackgroundContextMenu.importAnimationPopout.fromFiles);
		
		typeIntoFileExplorer(path.toString());
	}
}
