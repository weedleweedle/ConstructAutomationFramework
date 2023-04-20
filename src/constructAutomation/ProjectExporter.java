package constructAutomation;

import java.awt.AWTException;

import org.junit.jupiter.api.Test;

class ProjectExporter extends ConstructMethodLibrary
{
	@Test
	void exportProject() throws AWTException, InterruptedException
	{
		start();
		
		dismissWelcomePopup();
		
		logIn();
		
		openProjectFolder(600);
		
		quit();
	}
}
