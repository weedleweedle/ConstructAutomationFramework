package constructAutomation;

import java.awt.AWTException;

import org.junit.jupiter.api.Test;

class MethodTester extends ConstructMethodLibrary
{
	@Test
	void methodTester() throws AWTException, InterruptedException
	{
		// Import images into a sprite in a project
		
		String sprite = "man_chestDefault_gear";
		start(false);
		
		openRecentProject("DaggerQuest");
		
		sendText(Project.projectBar.searchBar, sprite);
		
		contextClick(Project.projectBar.searchResult(sprite));
		
		click(Project.projectBar.ContextMenu.editAnimations);
		
		contextClickUpperLeftCorner(Project.AnimationsEditor.AnimationsPane.animationsPaneBackground);
		
		waitUntilElementIsPresent(Project.AnimationsEditor.AnimationsPane.BackgroundContextMenu.addAnimation);
		
		click(Project.AnimationsEditor.AnimationsPane.BackgroundContextMenu.addAnimation);
		
		// Shift-click first animation
		
		scrollToElement(Project.AnimationsEditor.AnimationsPane.lastAnimation);
		
		// Shift click second to last animation
		
		// right click on any selected animation, click delete
		
		quit();
	}
}
