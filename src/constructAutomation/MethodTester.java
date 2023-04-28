package constructAutomation;

import java.awt.AWTException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

class MethodTester extends ConstructMethodLibrary
{
	@Test
	void methodTester() throws AWTException, InterruptedException
	{
		// Import images into a sprite in a project
		
		String sprite = "man_chestDefault_gear";
		start();
		
		openProjectFolder(6000, "C:" + fs + "DaggerQuest");
		
		sendText(Project.ProjectBar.searchBar, sprite);
		
		contextClick(Project.ProjectBar.searchResult(sprite));
		
		click(Project.ProjectBar.ContextMenu.editAnimations);
		
		contextClickUpperLeftCorner(Project.AnimationsEditor.AnimationsPane.animationsPaneBackground); // This will deselect the first animation.
		
		click(Project.AnimationsEditor.AnimationsPane.BackgroundContextMenu.addAnimation);
				
		click(Project.AnimationsEditor.AnimationsPane.firstAnimation); // Click the first animation.
		
		stop().until(ExpectedConditions.attributeToBe(Project.AnimationsEditor.AnimationsPane.firstAnimation, "selected", "true")); // Wait until the first animation is selected.
				
		scrollToElement(Project.AnimationsEditor.AnimationsPane.secondToLastAnimation);
		
		actions.keyDown(Keys.SHIFT).perform();
		
		click(Project.AnimationsEditor.AnimationsPane.secondToLastAnimation); // Select the second to last animation while holding the shift key down. This will select all animations between the first and second to last animation.
		
		actions.keyUp(Keys.SHIFT).perform();
		
		stop(10).until(ExpectedConditions.attributeToBe(Project.AnimationsEditor.AnimationsPane.secondToLastAnimation, "selected", "true")); // Wait until all the animations are selected.
		
		contextClick(Project.AnimationsEditor.AnimationsPane.secondToLastAnimation);
		
		click(Project.AnimationsEditor.AnimationsPane.AnimationsContextMenu.delete);
		
		contextClickUpperLeftCorner(Project.AnimationsEditor.AnimationsPane.animationsPaneBackground);
		
		click(Project.AnimationsEditor.AnimationsPane.BackgroundContextMenu.importAnimation);
		
		click(Project.AnimationsEditor.AnimationsPane.BackgroundContextMenu.importAnimationPopout.fromFiles);
		
		// and... we're back to working with file explorer
		
		quit();
	}
}
