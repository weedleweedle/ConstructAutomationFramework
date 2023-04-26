package constructAutomation;

import java.awt.AWTException;

import org.junit.jupiter.api.Test;

class MethodTester extends ConstructMethodLibrary
{
	@Test
	void methodTester() throws AWTException, InterruptedException
	{
		String sprite = "man_chestDefault_gear";
		start(false);
		
		openRecentProject("DaggerQuest");
		
		sendText(Project.projectBar.searchBar, sprite);
		
		contextClick(Project.projectBar.searchResult(sprite));
		
		click(Project.projectBar.ContextMenu.editAnimations);
		
		contextClickUpperLeftCorner(Project.AnimationsEditor.AnimationsPane.animationsPaneBackground);
		
		
		
		quit();
	}
}
